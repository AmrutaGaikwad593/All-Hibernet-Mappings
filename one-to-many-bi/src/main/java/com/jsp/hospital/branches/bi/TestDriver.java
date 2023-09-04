package com.jsp.hospital.branches.bi;

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
	
	Hospital h=new Hospital();
	h.setHname("Aaryan hospital");
	h.setGst("aaryan123456");
	
	Branches b=new Branches();
	b.setCity("pune");
	
	Branches b1=new Branches();
	b1.setCity("sangli");
	
	Branches b2=new Branches();
	b2.setCity("mumbai");
	
	
    ArrayList<Branches> branches=new ArrayList<Branches>();
    branches.add(b);
    branches.add(b1);
    branches.add(b2);
    
    b.setHospital(h);
    b1.setHospital(h);
    b2.setHospital(h);
    h.setBranches(branches);
    
    entityTransaction.begin();
    entityManager.persist(h);
    entityManager.persist(b);
    entityManager.persist(b1);
    entityManager.persist(b2);
    entityTransaction.commit();
}
}
