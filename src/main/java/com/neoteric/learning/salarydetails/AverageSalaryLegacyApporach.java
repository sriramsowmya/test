package com.neoteric.learning.salarydetails;

import java.util.*;

public class AverageSalaryLegacyApporach {
    public static void main(String[] args) {
        Department testingDepartment = new Department();
        testingDepartment.setName("Testing Department");

        Employee ravi = new Employee();
        ravi.setEmployeeName("ravi");
        ravi.setSalary(10000.0);
        ravi.setEmployeeId(1455);

        Employee ravi1 = new Employee();
        ravi1.setEmployeeName("ravi1");
        ravi1.setSalary(5000.0);
        ravi1.setEmployeeId(45632);

        Employee reethi = new Employee();
        reethi.setEmployeeName("reethi");
        reethi.setSalary(40000.0);
        reethi.setEmployeeId(26788);

        testingDepartment.add(ravi);
        testingDepartment.add(ravi1);
        testingDepartment.add(reethi);

        Department hrDepartment = new Department();
        hrDepartment.setName("HR Department");

        Employee babu = new Employee();
        babu.setEmployeeName("babu");
        babu.setSalary(12000.0);
        babu.setEmployeeId(3585);

        Employee swathi = new Employee();
        swathi.setEmployeeName("swathi");
        swathi.setSalary(16000.0);
        swathi.setEmployeeId(3088);

        Employee bunny = new Employee();
        bunny.setEmployeeName("bunny");
        bunny.setSalary(30000.0);
        bunny.setEmployeeId(436868);

        hrDepartment.add(babu);
        hrDepartment.add(swathi);
        hrDepartment.add(bunny);

        Department financeDepartment = new Department();
        financeDepartment.setName("Finance Department");

        Employee ammu = new Employee();
        ammu.setEmployeeName("ammu");
        ammu.setSalary(85000);
        ammu.setEmployeeId(508765);

        Employee yesh = new Employee();
        yesh.setEmployeeName("yesh");
        yesh.setSalary(95000);
        yesh.setEmployeeId(5087);

        Employee vijaya = new Employee();
        vijaya.setEmployeeName("vijaya");
        vijaya.setSalary(90000);
        vijaya.setEmployeeId(60986);

        financeDepartment.add(ammu);
        financeDepartment.add(yesh);
        financeDepartment.add(vijaya);

        List<Department> departments = new ArrayList<>();
        departments.add(testingDepartment);
        departments.add(hrDepartment);
        departments.add(financeDepartment);

        Map<String, Double> deptAvgSalaryMap = new HashMap<>();
        Map<String, Integer> deptEmpCountMap = new HashMap<>();


        Iterator<Employee> employeeIterator = financeDepartment.getEmployeeList().iterator();
        while (employeeIterator.hasNext()){
            Employee emp = employeeIterator.next();
            if (deptAvgSalaryMap.containsKey(emp.getEmployeeName())){
                Double d = deptAvgSalaryMap.get(emp.getEmployeeName());
                Double total = d+emp.getSalary();
                deptAvgSalaryMap.put(emp.getEmployeeName(),total);

                int count =  deptEmpCountMap.get(emp.getEmployeeName());
                int totalCount = count+1;
                deptEmpCountMap.put(emp.getEmployeeName(),totalCount);
            }else {
                deptAvgSalaryMap.put(emp.getEmployeeName(),emp.getSalary());
                deptEmpCountMap.put(emp.getEmployeeName  (),1);
            }
        }

        System.out.println("total salary "+deptAvgSalaryMap);

        System.out.println("total count "+deptEmpCountMap);

        Iterator<String> deptIterator =  deptAvgSalaryMap.keySet().iterator();

        while(deptIterator.hasNext()){
            String dept = deptIterator.next();

            Double totalSalary =   deptAvgSalaryMap.get(dept);
            double totalCount  =    deptEmpCountMap.get(dept);

            System.out.println(" Avg salary by dept" +totalSalary/totalCount);
        }

    }
}