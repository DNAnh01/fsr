package com.dnanh01.service;

import java.util.Objects;

import com.dnanh01.dao.EmployeeDao;
import com.dnanh01.dao.JdbcEmployeeDao;
import com.dnanh01.persistence.Employee;

public class EmployeeServiceImplement implements EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeServiceImplement() {
        employeeDao = new JdbcEmployeeDao();
    }

    @Override
    public void save(Employee employee) {
        Objects.requireNonNull(employee);
        employeeDao.save(employee);
    }

    @Override
    public Employee login(String email, String password) {
        Objects.requireNonNull(email, "email can not be null");
        Objects.requireNonNull(password, "password can not be null");
        return employeeDao.login(email, password);
    }
}
