package com.dnanh01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dnanh01.connection.DbConnection;
import com.dnanh01.persistence.Employee;
import com.dnanh01.persistence.Title;
import com.dnanh01.utils.SqlUtils;

public class JdbcEmployeeDao implements EmployeeDao {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public JdbcEmployeeDao() {
        connection = DbConnection.getConnection();
    }

    @Override
    public void save(Employee employee) {
        String sql = "" +
                "INSERT INTO nhanvien(MaNV, TenNV, Email, SDT, DiaChi, MaCV, MatKhau)\r\n" + //
                "VALUES(?, ?, ?, ?, ?, ?, ?);";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setString(4, employee.getPhone());
            preparedStatement.setString(5, employee.getAddress());
            preparedStatement.setInt(6, employee.getTitle().getId());
            preparedStatement.setString(7, SqlUtils.md5Hex(employee.getPassword()));
            preparedStatement.executeUpdate();

            // System.out.println("the row count for SQL DML: " +
            // preparedStatement.executeUpdate());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(preparedStatement);
        }
    }

    @Override
    public Employee login(String email, String password) {
        Employee employee = null;
        final String sql = "" +
                "SELECT  " +
                "nv.MaNV " + Employee.PROP_ID + ", " +
                "nv.TenNV " + Employee.PROP_NAME + ", " +
                "nv.Email " + Employee.PROP_EMAIL + ", " +
                "nv.SDT " + Employee.PROP_PHONE + ",  " +
                "nv.DiaChi " + Employee.PROP_ADDRESS + ",  " +
                "nv.MaCV " + Employee.PROP_TITLE_ID + " " +
                "FROM nhanvien nv  " +
                "WHERE nv.Email = ? " +
                "AND nv.MatKhau = ?;";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, SqlUtils.md5Hex(password));
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                employee = new Employee()
                        .builder()
                        .Id(resultSet.getInt(Employee.PROP_ID))
                        .Name(resultSet.getString(Employee.PROP_NAME))
                        .Email(resultSet.getString(Employee.PROP_EMAIL))
                        .Phone(resultSet.getString(Employee.PROP_PHONE))
                        .Address(resultSet.getString(Employee.PROP_ADDRESS))
                        .Title(new Title(resultSet.getInt(Employee.PROP_TITLE_ID)))
                        .build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            SqlUtils.close(preparedStatement);
        }
        return employee;
    }
}
