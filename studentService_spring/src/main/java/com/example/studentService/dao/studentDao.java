package com.example.studentService.dao;

import java.util.List;

import com.example.studentService.entity.student;

public interface studentDao {

	public student saveStudent(student student);
	public List<student> getAllStudent();
	
	public student getStudentById(String student);
	public boolean deleteStudentId(String id);

}
