package com.example.studentService.entity;


	
	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.SequenceGenerator;

	@Entity
	public class student {
		@Id
		String studentId;
		String studentName;
	   Long studentMarks;
	   long branchId;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String studentId, String studentName, Long studentMarks, long branchId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.branchId = branchId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(Long studentMarks) {
		this.studentMarks = studentMarks;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", branchId=" + branchId + "]";
	}
	}