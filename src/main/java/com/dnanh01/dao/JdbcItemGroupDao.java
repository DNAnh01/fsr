package com.dnanh01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dnanh01.connection.DbConnection;
import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.persistence.ItemGroupDto;
import com.dnanh01.persistence.transformer.ItemGroupTransformer;
import com.dnanh01.utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {

    private final Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public JdbcItemGroupDao() {
        connection = DbConnection.getConnection();
    }

    private static final String GET_ITEM_GROUPS = "" +
            "WITH ThongTinMatHang AS\r\n" + //
            "(SELECT mh.MaMH, \r\n" + //
            "        mh.TenMH, \r\n" + //
            "        SUM(ctmh.SoLuong) SoLuong, \r\n" + //
            "        lh.MaLH, \r\n" + //
            "        lh.TenLH\r\n" + //
            "FROM loaihang lh\r\n" + //
            "JOIN mathang mh\r\n" + //
            "ON lh.MaLH = mh.MaLH\r\n" + //
            "JOIN chitietmathang ctmh\r\n" + //
            "ON mh.MaMH = ctmh.MaMH\r\n" + //
            "GROUP BY mh.MaMH)\r\n" + //
            "SELECT ttmh.MaLH,\r\n" + //
            "ttmh.TenLH,\r\n" + //
            "SUM(ttmh.SoLuong) SoLuong,\r\n" + //
            "GROUP_CONCAT(CONCAT(ttmh.MaMH, \"-\", ttmh.TenMH, \"-\", ttmh.SoLuong)) DanhSachMatHang\r\n" + //
            "FROM ThongTinMatHang ttmh\r\n" + //
            "GROUP BY ttmh.MaLH;";

    @Override
    public List<ItemGroup> getAll() {
        List<ItemGroup> result = new ArrayList<>();
        String sql = "SELECT * FROM loaihang;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                ItemGroup itemGroup = new ItemGroup(
                        resultSet.getInt("MaLH"),
                        resultSet.getString("TenLH"));
                result.add(itemGroup);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(statement, resultSet);
        }
        return result;
    }

    @Override
    public ItemGroup getItemGroupById(Integer itemGroupId) {
        ItemGroup result = null;
        String sql = "SELECT * FROM loaihang WHERE MaLH = ? ;";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, itemGroupId);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                result = new ItemGroup(
                        resultSet.getInt("MaLH"),
                        resultSet.getString("TenLH"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(preparedStatement, resultSet);
        }
        return result;
    }

    @Override
    public List<ItemGroupDto> getItemGroups() {
        List<ItemGroupDto> result = new ArrayList<>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(GET_ITEM_GROUPS);
            while (resultSet.next()) {
                System.out.println("DanhSachMatHang: " + resultSet.getString("DanhSachMatHang"));
                result.add(ItemGroupTransformer.transform(resultSet));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(statement, resultSet);
        }
        return result;
    }

    @Override
    public void save(ItemGroup itemGroup) {
        /**
         * lưu một đối tượng loại hàng vào db
         */
        String sql = "INSERT INTO loaihang(MaLH, TenLH) VALUES(?, ?);";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, itemGroup.getId());
            preparedStatement.setString(2, itemGroup.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(preparedStatement);
        }
    }

    @Override
    public void save(List<ItemGroup> itemGroups) {
        /**
         * trong trường hợp lưu hàng loạt đối tượng loại hàng vào db
         */

        String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n"
                + "VALUES(?, ?)";
        int batchCount = 0;

        try {
            preparedStatement = connection.prepareStatement(sql);
            for (ItemGroup itemGroup : itemGroups) {
                preparedStatement.setInt(1, itemGroup.getId());
                preparedStatement.setString(2, itemGroup.getName());
                preparedStatement.addBatch();

                // Nếu số lượng câu lệnh trong batch đạt tới 100, thực thi batch
                if (++batchCount % 100 == 0) {
                    preparedStatement.executeBatch();
                }

                // Thực thi batch cho các câu lệnh còn lại
                int[] affectedRows = preparedStatement.executeBatch();
                System.out.println(">>> affectedRows >>> " + Arrays.toString(affectedRows));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(preparedStatement);
        }
    }

    @Override
    public void update(ItemGroup itemGroup) {
        String sql = "" +
                "UPDATE loaihang SET TenLH = ? WHERE MaLH = ?;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, itemGroup.getName());
            preparedStatement.setInt(2, itemGroup.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(preparedStatement);
        }

    }

    @Override
    public List<ItemGroup> search(String name) {
        List<ItemGroup> results = new ArrayList<>();
        // injection

        // String sql = "SELECT * FROM LoaiHang WHERE TenLH = '" + name + "'";
        String sql = "SELECT * FROM LoaiHang WHERE TenLH LIKE ?";
        try {

            // st = conn.createStatement();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            // rs = st.executeQuery(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ItemGroup itemGroup = new ItemGroup(
                        resultSet.getInt("MaLH"),
                        resultSet.getString("TenLH"));
                results.add(itemGroup);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(resultSet, preparedStatement);
        }
        return results;
    }
}
