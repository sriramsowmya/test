package com.neoteric.learning.hashmap;

import java.util.HashMap;

public class StudentManager {

        private HashMap<Integer, Student> studentMap;


        public StudentManager() {
            studentMap = new HashMap<>();
        }

        // Add a new student
        public void addStudent(int id, Student student) {
            if (studentMap.containsKey(id)) {
                System.out.println("Student ID " + id + " already exists!");
            } else {
                studentMap.put(id, student);
                System.out.println("Student added: " + student);
            }
        }

        // Retrieve student details by ID
        public void getStudent(int id) {
            Student student = studentMap.get(id);
            if (student != null) {
                System.out.println("Student ID " + id + ": " + student);
            } else {
                System.out.println("Student ID " + id + " not found!");
            }
        }

        // Remove a student by ID
        public void removeStudent(int id) {
            if (studentMap.containsKey(id)) {
                Student removedStudent = studentMap.remove(id);
                System.out.println("Removed Student: " + removedStudent);
            } else {
                System.out.println("Student ID " + id + " not found!");
            }
        }


        public void displayAllStudents() {
            if (studentMap.isEmpty()) {
                System.out.println("No students found!");
            } else {
                System.out.println("All Students:");
                for (int id : studentMap.keySet()) {
                    System.out.println("ID: " + id + ", " + studentMap.get(id));
                }
            }
        }
    }
