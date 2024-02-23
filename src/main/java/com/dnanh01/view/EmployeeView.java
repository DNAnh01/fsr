package com.dnanh01.view;

import java.util.Scanner;

import com.dnanh01.persistence.Employee;
import com.dnanh01.persistence.Title;
import com.dnanh01.service.EmployeeService;
import com.dnanh01.service.EmployeeServiceImplement;

public class EmployeeView {
    private static final EmployeeService employeeService;

    static {
        employeeService = new EmployeeServiceImplement();
    }

    public static void main(String[] args) {
        System.out.println("save employee");
        employeeService.save(
                new Employee()
                        .builder()
                        .Id(8)
                        .Name("Nguyễn Văn Tèo")
                        .Email("nguyenvanteo@gmail.com")
                        .Phone("0123456789")
                        .Address("Quang Nam")
                        .Password("teone")
                        .Title(new Title(2))
                        .build());

        Employee employee = employeeService.login("nguyenvanteo@gmail.com", "teone");

        if (employee == null) {
            System.out.println("wrong username or password !!!");
        } else {
            System.out.println("login successfully ...");
            System.out.println("welcome " + employee.getName() + " to the page ... ");
        }
    }
}
