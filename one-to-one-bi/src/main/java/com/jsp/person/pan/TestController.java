package com.jsp.person.pan;

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
		p.setName("amruta");
		p.setEmail("amu123@gmail.com");
		
		PanCard p1=new PanCard();
		p1.setPan_no("4576");
		p1.setDob("17-11-2001");
		
		p.setPanCard(p1);
		p1.setPerson(p);
		
		entityTransaction.begin();
		entityManager.persist(p);
        entityManager.persist(p1);
        entityTransaction.commit();
		
	}
}