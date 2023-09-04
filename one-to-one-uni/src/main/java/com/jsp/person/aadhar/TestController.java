package com.jsp.person.aadhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("amruta");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person p=new Person();
		p.setName("ketki");
		p.setEmail("ketki@gmail.com");
		
		
		Aadhar a=new Aadhar();
		a.setAadhar_no("45768345");
		a.setCity("Navi-Mumbai");
		
		a.setPerson(p);
		
		entityTransaction.begin();
		entityManager.persist(p);
		entityManager.persist(a);
		entityTransaction.commit();
	}
}
