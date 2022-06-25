package com.tyss.finalAssessment;

public class Student {
	private int Id;
	private String Name;
	private int Marks;
	private String Course;

	public Student(int id, String name, int marks, String course) {
		//super();
		this.Id = id;
		this.Name = name;
		this.Marks = marks;
		this.Course = course;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Marks=" + Marks + ", Course=" + Course + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

}