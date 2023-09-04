package com.jsp.hospital.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("amruta");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital h=new Hospital();
		h.setHname("aryan");
		h.setGst("ARYAN123456");
		
		Branch b1=new Branch();
		b1.setCity("mumbai");
		
		Branch b2=new Branch();
		b2.setCity("navi mumbai");
		
		Branch b3=new Branch();
		b3.setCity("pune");
		
		ArrayList<Branch> branches=new ArrayList<Branch>();
		branches.add(b1);
		branches.add(b2);
		branches.add(b3);
		h.setBranches(branches);
		
		entityTransaction.begin();
		entityManager.persist(h);
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(b3);
		entityTransaction.commit();
		
		
	}
}
