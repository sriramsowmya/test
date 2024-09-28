package com.neoteric.learning;

public class Service {
    public Employee employee;
    public DepertmentDetails depertmentDetails;
    public  static  void main (String []args){
        Employee employee1= new Employee();
        employee1.name="sowmya";
        employee1.id="1234";
        employee1.mobileno="88676532";
        employee1.salary="30000";

        DepertmentDetails depertmentDetails1=new DepertmentDetails();
        depertmentDetails1.demtName="HR";
        depertmentDetails1.demtId=20;


        Employee employee2=new Employee();
        employee2.name="saritha";
        employee2.id="456";
        employee2.mobileno="324516782";
        employee2.salary="50000";



        DepertmentDetails depertmentDetails2 = new DepertmentDetails();
        depertmentDetails2.demtName="manager";
        depertmentDetails2.demtId=30;


        System.out.println(employee1.name);
        System.out.println(employee1.mobileno);
        System.out.println(employee1.id);
        System.out.println(employee1.salary);
        System.out.println(employee2.name);
        System.out.println(employee2.mobileno);
        System.out.println(employee2.id);
        System.out.println(employee2.salary);



    }
}
