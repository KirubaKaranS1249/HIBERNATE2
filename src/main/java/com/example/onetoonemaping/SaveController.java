package com.example.onetoonemaping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveController {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("karan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person per=new Person();
		per.setId(151);
		per.setName("Choto");
		per.setGender('F');
		per.setDob("12-05-2002");
		
		
		Pan pan =new Pan();
		pan.setPanNumber(123456);
		pan.setAddress("Bangalore");
		
		per.setPan(pan);
		
		et.begin();
		em.persist(per);
		em.persist(pan);
		et.commit();
		
	}

}
