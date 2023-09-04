package com.jsp.school.course.withjoin;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gmail;
	
	@OneToMany (mappedBy = "student", cascade = CascadeType.ALL)
	private List<Course> Courses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public List<Course> getCourses() {
		return Courses;
	}

	public void setCourses(List<Course> Courses) {
		this.Courses = Courses;
	}
	
	
}
