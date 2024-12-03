package com.neoteric.learning.salarydetails;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private  String name;
    private List<Employee> employeeList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Employee employee) {
        this.employeeList.add(employee);
    }

    public  List<Employee> getEmployeeList(){
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

