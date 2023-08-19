package com.example.studentService.Service;

import java.util.List;

import com.example.studentService.entity.student;

public interface studentService {
	public student saveStudent(student student);
public List<student> getAllStudent();
	
	public student getStudentById(String student);
	public boolean deleteStudentById(String studentId);


}
