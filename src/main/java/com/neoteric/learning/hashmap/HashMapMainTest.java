package com.neoteric.learning.hashmap;

public class HashMapMainTest {

        public static void main(String[] args) {

            StudentManager manager = new StudentManager();


            manager.addStudent(101, new Student("Alice", "Computer Science", 88.5));
            manager.addStudent(102, new Student("Bob", "Mathematics", 92.0));
            manager.addStudent(103, new Student("Charlie", "Physics", 79.5));


            manager.getStudent(102);

            manager.removeStudent(103);


            manager.getStudent(103);

            manager.displayAllStudents();
        }
    }
