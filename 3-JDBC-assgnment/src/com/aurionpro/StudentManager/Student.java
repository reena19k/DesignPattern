package com.aurionpro.StudentManager;

public class Student {
	private int studentid;
	private String sname;
	private String city;

	public Student(int studentid, String sname, String city) {
		super();
		this.studentid = studentid;
		this.sname = sname;
		this.city = city;
	}

	public Student(String sname, String city) {
		super();
		this.sname = sname;
		this.city = city;
	}

	public Student() {
		super();
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", sname=" + sname + ", city=" + city + "]";
	}

}
