package com.dnanh01.dao;

import com.dnanh01.persistence.Employee;

public interface EmployeeDao {
    void save(Employee employee);

    Employee login(String email, String password);
}
