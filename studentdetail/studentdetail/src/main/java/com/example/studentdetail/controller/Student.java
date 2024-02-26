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

import com.example.studentdetail.entity.Details;

import com.example.studentdetail.repository.StudentRespository;
@RestController
public class Student {
	@Autowired
	StudentRespository repos;
	
	
	
	 @PostMapping("/allstudent")
     public Details add(@RequestBody Details d)
     {
		 
    	 //return new Details("abi","yuu@gmail.com","56789","act street");
    	 return repos.save(d);
     }
	 
	 @GetMapping("/allstudent")
	 public List<Details> getStudents()
	 {
		return repos.findAll();
	 }
	 @GetMapping("/allstudent/{stuId}")
	 public Details getstudentbyid(@PathVariable Integer stuId)
	 {
		 return repos.findById(stuId).get();
	 }
	 @DeleteMapping("/allstudent/{stuId}")
	 public void Deletestudent(@PathVariable Integer stuId)
	 {
		 repos.deleteById(stuId);
	 }
	 @PutMapping("/allstudent/{stuId}")
	 public Details Updatestudent(@PathVariable Integer stuId,@RequestBody Details d)
	 {
		 d.setStuid(stuId);
		 return repos.save(d);
	 }
}
 