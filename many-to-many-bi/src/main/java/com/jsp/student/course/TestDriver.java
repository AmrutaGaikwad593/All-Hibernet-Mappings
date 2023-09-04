package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDriver {
public static void main(String[] args) {
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("amruta");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student s=new Student();
	s.setName("a");
	s.setEmail("al@gamil.com");
	
	Student s1=new Student();
	s1.setName("b");
	s1.setEmail("b@gamil.com");
	
	Student s2=new Student();
	s2.setName("c");
	s2.setEmail("c@gamil.com");
	
	Course c1=new Course();
	c1.setSubject("java");
	c1.setDuration("3 months");
	
	Course c2=new Course();
	c2.setSubject("java");
	c2.setDuration("3 months");
	
	Course c=new Course();
	c.setSubject("java");
	c.setDuration("3 months");
	
	ArrayList<Course> courses=new ArrayList<Course>();
	courses.add(c);
	courses.add(c1);
	courses.add(c2);
	
	ArrayList<Course> c5=new ArrayList<Course>();
	c5.add(c1);
	c5.add(c2);
	
	ArrayList<Student> students=new ArrayList<Student>();
	students.add(s);
	students.add(s2);
	
	s.setCourses(courses);
	s1.setCourses(courses);
	s2.setCourses(courses);
	
	c.setStudents(students);
	
	entityTransaction.begin();
	entityManager.persist(s);
	entityManager.persist(s1);
	entityManager.persist(s2);
	entityManager.persist(c);
	entityManager.persist(c1);
	entityManager.persist(c2);
	entityTransaction.commit();
}
}



















