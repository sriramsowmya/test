package com.neoteric.learning.busTicket;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student>students= Arrays.asList(
                new Student("sowmi","bio",45,true),
                new Student("saipriya","phy",65,true),
                new Student("laxman","eng",30,true),
                new Student("saritha","phy",20,false));
        List<Student>filterStudents=students.stream().filter(student -> student.isStatus()).collect(Collectors.toList());
        System.out.println(filterStudents.size());
        System.out.println(filterStudents.get(1).getMarks());
        System.out.println(filterStudents.get(2).getSubject());

    }
}
