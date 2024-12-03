package com.neoteric.learning.salarydetails;

import java.util.ArrayList;
import java.util.List;

public class NormalMethodTest {

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

            // Find the company-wide maximum salary employee
            Employee companyMaxSalaryEmployee = null;
            for (Department department : departments) {
                for (Employee employee : department.getEmployeeList()) {
                    if (companyMaxSalaryEmployee == null || employee.compareTo(companyMaxSalaryEmployee) > 0) {
                        companyMaxSalaryEmployee = employee;
                    }
                }
            }
            if (companyMaxSalaryEmployee != null) {
                System.out.println("Company-wide Max Salary: " + companyMaxSalaryEmployee);
            }

            // Find maximum salary employee in each department
            for (Department department : departments) {
                Employee maxSalaryEmployee = null;
                for (Employee employee : department.getEmployeeList()) {
                    if (maxSalaryEmployee == null || employee.compareTo(maxSalaryEmployee) > 0) {
                        maxSalaryEmployee = employee;
                    }
                }
                if (maxSalaryEmployee != null) {
                    System.out.println("Department: " + department.getName());
                    System.out.println("  Max Salary Employee: " + maxSalaryEmployee);
                }
            }

            // Find the company-wide minimum salary employee
            Employee companyMinSalaryEmployee = null;
            for (Department department : departments) {
                for (Employee employee : department.getEmployeeList()) {
                    if (companyMinSalaryEmployee == null || employee.compareTo(companyMinSalaryEmployee) < 0) {
                        companyMinSalaryEmployee = employee;
                    }
                }
            }
            if (companyMinSalaryEmployee != null) {
                System.out.println("Company-wide Minimum Salary: " + companyMinSalaryEmployee);
            }

            // Find minimum salary employee in each department
            for (Department department : departments) {
                Employee minSalaryEmployee = null;
                for (Employee employee : department.getEmployeeList()) {
                    if (minSalaryEmployee == null || employee.compareTo(minSalaryEmployee) < 0) {
                        minSalaryEmployee = employee;
                    }
                }
                if (minSalaryEmployee != null) {
                    System.out.println("Department: " + department.getName());
                    System.out.println("  Minimum Salary Employee: " + minSalaryEmployee);
                }
            }

            for (Department department : departments) {
                List<Employee> employeeList = department.getEmployeeList();
                double totalSalary = 0.0;
                for (Employee employee : employeeList) {
                    totalSalary += employee.getSalary();
                }
                double averageSalary = employeeList.size() > 0 ? totalSalary / employeeList.size() : 0.0;
                System.out.println("Department: " + department.getName());
                System.out.println("  Average Salary: " + averageSalary);
            }
        }
    }

