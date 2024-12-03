package com.neoteric.learning.school;

public class Main {
    public static void main(String[] args) {

          Student  student = new Student("saritha",5,"surya","space");
          student.name="saritha";
          student.fatherName="surya";
          student.rollNo=6;
          student.sec="spark";
        Address address=new Address();
          student.address=address;
          address.area="jntu";
          address.houseNo="65-7";
          address.street="patel nagar";

        System.out.println(student);
        System.out.println(address);
    }
}
