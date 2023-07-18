package com.sprng.webApp.services;

import java.util.List;

import com.sprng.webApp.entity.Student;

public interface DataService {
 public String acceptData(String data);
 public String addStudent(Student s);
 public Student getStudent(String roll);
 public List<Student> getAllStudents();
 public String updateStudent(Student s);
 public String deleteStudent(String id);
}
