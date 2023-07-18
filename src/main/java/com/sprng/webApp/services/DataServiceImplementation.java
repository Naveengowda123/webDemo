package com.sprng.webApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sprng.webApp.entity.Student;
import com.sprng.webApp.repository.StudentRepository;

@Service
public class DataServiceImplementation implements DataService{
    StudentRepository sr;
    
    
	public DataServiceImplementation(StudentRepository sr) {
		super();
		this.sr = sr;
	}

	@Override
	public String acceptData(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addStudent(Student s) {
		sr.save(s);
		return null;
	}

	@Override
	public Student getStudent(String roll) {
		Student s=sr.findById(roll).get();
		return s;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> sList=sr.findAll();
		return sList;
	}

	@Override
	public String updateStudent(Student s) {
		sr.save(s);
		return null;
	}

	@Override
	public String deleteStudent(String roll) {
		sr.deleteById(roll);
		return null;
	}
	
	

}
