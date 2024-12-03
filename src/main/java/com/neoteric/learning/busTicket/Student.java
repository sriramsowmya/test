package com.neoteric.learning.busTicket;

public class Student {
    private String name;
      private String subject;
      private int marks;
      private boolean status;


    public Student(String name,String subject, int marks, boolean status){
        this.marks=marks;
        this.subject=subject;
        this.name=name;
        this.status=status;

    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    public boolean isStatus() {
        return status;
    }
}
