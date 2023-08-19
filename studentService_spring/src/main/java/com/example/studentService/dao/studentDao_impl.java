package com.example.studentService.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.studentService.entity.student;

public class studentDao_impl implements studentDao {


	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public student saveStudent(student student) {
		
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		student stu=null;
		try {
		session.save(student);
		tx.commit();
		stu=student;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
		session.close();
		}
		return stu;
		
	
	}
	@Override
	public List<student> getAllStudent() {
		Session ses=sessionfactory.openSession();
		List<student> list=null;
		
		try
		{
			Query q1=ses.createQuery("from student");
			list=q1.list();
			}
		
		catch (Exception e) 
		{
		System.out.println(e);
		}
		finally
		{
			ses.close();
		}
		return list;
	}

	@Override
	public student getStudentById(String student) {
		Session ses=sessionfactory.openSession();
		student stu=null;
		try
		{
			student stu1=ses.get(student.class, student);
			stu=stu1;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			ses.close();
		}
		
		return stu;
	}

	@Override
	public boolean deleteStudentId(String id) {
		Session ses=sessionfactory.openSession();
		Transaction tx=ses.beginTransaction();
		boolean b=false;
		try
		{
			student stu=ses.get(student.class, id);
			ses.delete(stu);
			tx.commit();
			b=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

}
