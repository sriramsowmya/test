package com.neoteric.learning.hashmap;


    public class Student {

        private String name;
        private String course;
        private double grade;


        public Student(String name, String course, double grade) {
            this.name = name;
            this.course = course;
            this.grade = grade;
        }


        public String getName() {
            return name;
        }

        public String getCourse() {
            return course;
        }

        public double getGrade() {
            return grade;
        }


        @Override
        public String toString() {
            return "Name: " + name + ", Course: " + course + ", Grade: " + grade;
        }
    }
