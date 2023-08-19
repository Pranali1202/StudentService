package com.example.studentService.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentService.dao.studentDao;
import com.example.studentService.entity.student;
@Service
public class studentService_impl implements studentService {

	@Autowired
	studentDao dao;
	
	
	@Override
	public student saveStudent(student student) {
		
		String studentId=new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());
		student.setStudentId(studentId);
		student stu= dao.saveStudent(student);
	return stu;
		
		
	}


	@Override
	public List<student> getAllStudent() {
		
		List<student>list=dao.getAllStudent();
		return list; 
	}


	@Override
	public student getStudentById(String student) {

		student stu=dao.getStudentById(student);
		return stu;
	}


	@Override
	public boolean deleteStudentById(String studentId) 
	{
	boolean b=	dao.deleteStudentId(studentId);
	return b;
	}

}


