package com.example.studentdetail.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.studentdetail.entity.details;
import com.example.studentdetail.repository.StudentRespository;
@RestController
public class student {
	@Autowired
	StudentRespository repos;
	
	
	
	 @PostMapping("/allstudent")
     public details add(@RequestBody details d)
     {
		 
    	 
    	 return repos.save(d);
     }
	 
	 @GetMapping("/allstudent")
	 public List<details> getStudents()
	 {
		return repos.findAll();
	 }
	 @GetMapping("/allstudent/{stuid}")
	 public details getstudentbyid(@PathVariable Integer stuid)
	 {
		 return repos.findById(stuid).get();
	 }
	 @DeleteMapping("/allstudent/{stuid}")
	 public void deletestudent(@PathVariable Integer stuid)
	 {
		 repos.deleteById(stuid);
	 }
	 @PutMapping("/allstudent/{stuid}")
	 public details updatestudent(@PathVariable Integer stuid,@RequestBody details d)
	 {
		 d.setStuid(stuid);
		 return repos.save(d);
	 }
}
 