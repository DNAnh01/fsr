package com.dnanh01.service;

import com.dnanh01.persistence.Employee;

public interface EmployeeService {
    void save(Employee employee);

    Employee login(String email, String password);
}
