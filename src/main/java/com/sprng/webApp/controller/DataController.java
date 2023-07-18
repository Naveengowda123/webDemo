package com.sprng.webApp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprng.webApp.entity.Student;
import com.sprng.webApp.services.DataService;

@Controller
public class DataController {
	
	DataService ds;
	
	public DataController(DataService ds) {
		super();
		this.ds = ds;
	}
 
	@GetMapping("/view")
 public String mapViewInfo1() {
	 return "viewInfo";
 }
	
	@GetMapping("/ind")
	 public String mapIndex() {
		 return "index";
	 }
	
	@GetMapping("/reg")
	 public String mapRegister() {
		 return "register";
	 }
	
	@GetMapping("/upd")
	 public String mapUpdateInfo() {
		 return "updateInfo";
	 }
	
	@GetMapping("/rem")
	 public String mapRemove() {
		 return "remove";
	 }
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////	
	@GetMapping("getStu")
	public String getStudent(@RequestParam("rollno")String roll,Model model) {
		Student st=ds.getStudent(roll);
		model.addAttribute("stud",st);
		return "showInfo";
	}
	@PostMapping("regis")
	public String createStudent(@RequestParam("rollno")String roll,@RequestParam("nameS")String name,@RequestParam("bran")String branch) {
		Student s=new Student(roll,name,branch);
		ds.addStudent(s);
		return "index";
	}
	@PutMapping("updS")
	public String updStudent(@RequestParam("rollno")String roll,@RequestParam("nameS")String name,@RequestParam("bran")String branch) {
		Student s=ds.getStudent(roll);
		s.setName(name);
		s.setBranch(branch);
		ds.addStudent(s);
		return "index";
	}
	//pending in showAllInfo.html file
	@GetMapping("/showAll")
	public String getAllStudnt(Model model) {
		List<Student> ls=ds.getAllStudents();
	    model.addAttribute("list", ls);
		return "showAllInfo";
	}
	@DeleteMapping("remo")
	public String removeStudent(@RequestParam("rollno")String roll) {
		ds.deleteStudent(roll);
		return "index";
	}
	
}
