package com.sprng.webApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprng.webApp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
