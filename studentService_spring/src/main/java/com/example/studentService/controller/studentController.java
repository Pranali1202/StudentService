package com.example.studentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentService.Service.studentService;
import com.example.studentService.entity.student;

@RestController
public class studentController {
	
	@Autowired
	studentService service;
	
	@PostMapping("saveStudent")
	public ResponseEntity<student> saveStudent(@RequestBody student student)
	{
	 student stu=service.saveStudent(student);
	 if(stu!=null)
	 {
		return new ResponseEntity<student>(stu,HttpStatus.CREATED);
	 }
	 else
	 {
		 return new ResponseEntity<student>(HttpStatus.INTERNAL_SERVER_ERROR);
	 }
	
	}
	@GetMapping("getAllStudent")
	public ResponseEntity<List<student>> getAllStudent()
	{
		List<student> list=service.getAllStudent();
		if(list.isEmpty())
		{
			 return new ResponseEntity<List<student>>(HttpStatus.NO_CONTENT);
		}
		else
		{
			return new ResponseEntity<List<student>>(list,HttpStatus.CREATED);
		}
		
		
	}
	
	@GetMapping("getStudentById/{studentId}")
	public ResponseEntity<student> getStudentById(@PathVariable String studentId)
	{
		student stu1=service.getStudentById(studentId);
		
		 if(stu1!=null)
		 {
			return new ResponseEntity<student>(stu1,HttpStatus.OK);
		 }
		 else
		 {
			 return new ResponseEntity<student>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
	}
	
	@DeleteMapping("deleteStudentById/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable String studentId)
	{
	boolean b=false;
	if(b==true)
	{
		String msg="record inserted";

		 return new ResponseEntity<String>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	else
	{
		 return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
}
	}
}
