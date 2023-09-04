package com.jsp.school.course.withjoin;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDriver {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("amruta");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction  entityTransaction=entityManager.getTransaction();
    
    Student s=new Student();
    s.setName("amruta");
    s.setGmail("amruta@gmail.com");
    
    Course c=new Course();
    c.setCname("java");
    c.setSchoolname("abc");
    
    Course c1=new Course();
    c1.setCname("c++");
    c1.setSchoolname("xyz");
    
    Course c2=new Course();
    c2.setCname("webtech");
    c2.setSchoolname("pqr");
    
    ArrayList<Course> cources=new ArrayList<Course>();
    cources.add(c);
    cources.add(c1);
    cources.add(c2);
    
    c.setStudent(s);
    c1.setStudent(s);
    c2.setStudent(s);
    s.setCourses(cources);
    
    entityTransaction.begin();
    entityManager.persist(s);
    entityTransaction.commit();
    
    
    
}
}
