package com.dnanh01.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dnanh01.connection.DbConnection;
import com.dnanh01.persistence.Item;
import com.dnanh01.persistence.ItemGroup;
import com.dnanh01.utils.SqlUtils;

public class JdbcItemDao implements ItemDao {

    private Connection connection;
    private Statement statement;
    // private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    /**
     * @connection
     *             - Đại diện cho kết nối với cơ sở dữ liệu.
     *             - Được sử dụng để thực thi các câu lệnh SQL và truy vấn dữ liệu.
     *             - Kết nối được lấy từ lớp DbConnection trong constructor.
     * 
     * @statement
     *            - Đại diện cho một câu lệnh SQL không tham số.
     *            - Được sử dụng để thực thi các câu lệnh SQL đơn giản không có
     *            biến.
     * @preparedStatement
     *                    - Đại diện cho một câu lệnh SQL tham số hóa.
     *                    - Được sử dụng để thực thi các câu lệnh SQL có biến, giúp
     *                    chống lại tấn công SQL injection.
     * @resultSet
     *            -Đại diện cho tập hợp các kết quả thu được sau khi thực thi một
     *            câu lệnh SQL truy vấn.
     *            - Cho phép duyệt qua các dòng kết quả và lấy ra các giá trị dữ
     *            liệu.
     */

    public JdbcItemDao() {
        connection = DbConnection.getConnection();
    }

    @Override
    public List<Item> getAll() {
        List<Item> result = new ArrayList<>();
        String sql = "" +
                "SELECT lh.MaLH, lh.TenLH, mh.MaMH, mh.TenMH, mh.MauSac " +
                "FROM loaihang lh " +
                "JOIN mathang mh " +
                "ON lh.MaLH = mh.MaLH;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                ItemGroup itemGroup = new ItemGroup(
                        resultSet.getInt("MaLH"),
                        resultSet.getString("TenLH"));

                Item item = new Item(
                        resultSet.getInt("MaMH"),
                        resultSet.getString("TenMH"),
                        resultSet.getString("MauSac"),
                        itemGroup);
                result.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(resultSet, statement);
        }
        return result;
    }

    @Override
    public List<Item> getItems(String itemGroupName) {

        return null;
    }
}
