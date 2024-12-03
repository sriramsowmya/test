package com.neoteric.learning.salarydetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SalaryTest {
    public static void main(String[] args) {
        Department testingDepartment = new Department();
        testingDepartment.setName("testingDepartment ");

        Employee laxman = new Employee();
        laxman.setEmployeeName("laxman");
        laxman.setSalary(10000.0);
        laxman.setEmployeeId(1655);
        Employee laxman1  = new Employee();
        laxman1.setEmployeeName("laxman");
        laxman1.setSalary(5500.0);
        laxman1.setEmployeeId(45632);

        Employee nihal = new Employee();
        nihal.setEmployeeName("nihal");
        nihal.setSalary(60000.0);
        nihal.setEmployeeId(28788);

        testingDepartment.add(laxman);
        testingDepartment.add(laxman1);
        testingDepartment.add(nihal);

        Department hrDeaprtment = new Department();
        hrDeaprtment.setName(" hrDeaprtment ");

        Employee vihan = new Employee();
        vihan.setEmployeeName("vihan");
        vihan.setSalary(17000.0);
        vihan.setEmployeeId(9885);

        Employee shrivi = new Employee();
        shrivi.setEmployeeName("shrivi");
        shrivi.setSalary(18000.0);
        shrivi.setEmployeeId(9438);


        Employee chinnu = new Employee();
        chinnu.setEmployeeName("chinnu");
        chinnu.setSalary(40000.0);
        chinnu.setEmployeeId(487868);

        hrDeaprtment.add(vihan);
        hrDeaprtment.add(shrivi);
        hrDeaprtment.add(chinnu);


        Department financeDeaprtment = new Department();
        financeDeaprtment.setName("Finance Department");

        Employee manu = new Employee();
        manu.setEmployeeName("manu");
        manu.setSalary(78000);
        manu.setEmployeeId(598765);

        Employee sai = new Employee();
        sai.setEmployeeName("sai");
        sai.setSalary(75000);
        sai.setEmployeeId(87087);

        Employee sowju = new Employee();
        sowju.setEmployeeName("sowju");
        sowju.setSalary(97600);
        sowju.setEmployeeId(76586);

        financeDeaprtment.add(manu);
        financeDeaprtment.add(sai);
        financeDeaprtment.add(sowju);

        List<Department> departments = new ArrayList<>();
        departments.add(testingDepartment);
        departments.add(hrDeaprtment);
        departments.add(financeDeaprtment);




        Optional<Employee> companyMaxSalaryEmployee = departments.stream()
                .flatMap(department -> department.getEmployeeList().stream())
                .max((o1, o2) -> o1.compareTo(o2));

        companyMaxSalaryEmployee.ifPresent(employee ->
                System.out.println("Company-wide Max Salary: " + employee));


        departments.forEach(department -> {
            Optional<Employee> maxSalaryEmployee = department.getEmployeeList().stream()
                    .max((o1, o2) -> o1.compareTo(o2));

            maxSalaryEmployee.ifPresent(employee -> {
                System.out.println("Department: " + department.getName());
                System.out.println("  Max Salary Employee: " + employee);
            });
        });



        Optional<Employee> companyMaxSalaryEmployee1 = departments.stream()
                .flatMap(department -> department.getEmployeeList().stream())
                .min((o1, o2) -> o1.compareTo(o2));

        companyMaxSalaryEmployee1.ifPresent(employee ->
                System.out.println("Company minimum  Salary: " + employee));

        departments.forEach(department -> {
            Optional<Employee> maxSalaryEmployee = department.getEmployeeList().stream()
                    .min((o1, o2) -> o1.compareTo(o2));

            maxSalaryEmployee.ifPresent(employee -> {
                System.out.println("Department: " + department.getName());
                System.out.println("  minimum Salary Employee: " + employee);
            });
        });
    }
}


