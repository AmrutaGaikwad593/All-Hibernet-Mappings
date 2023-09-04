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
	s.setName("amruta");
	s.setEmail("am12@gamil.com");
	
	Course c=new Course();
	c.setSubject("java");
	c.setDuration("3 months");
	
	Course c1=new Course();
	c1.setSubject("sql");
	c1.setDuration("1 months");
	
	Course c2=new Course();
	c2.setSubject("web");
	c2.setDuration("2 months");
	
	
   ArrayList<Course> courses=new ArrayList<>();
   courses.add(c);
   courses.add(c1);
   courses.add(c2);
   
   s.setCourses(courses);
   
  
   entityTransaction.begin();
   entityManager.persist(s);
   entityManager.persist(c);
   entityManager.persist(c1);
   entityManager.persist(c2);
   entityTransaction.commit();
   
	
	
}
}
