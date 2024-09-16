package com.example.onetomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveController {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Mobile m=new Mobile();
		m.setId(12);
		m.setName("Oppo");
		m.setRam("8GB");
		m.setCost(14000);

		Sim s1=new Sim();
		s1.setId(1);
		s1.setName("Aircel");
		s1.setSignal("3G");

		Sim s2=new Sim();
		s2.setId(2);
		s2.setName("Airtel");
		s2.setSignal("5G");

		List<Sim> list=new ArrayList<Sim>();
		list.add(s1);
		list.add(s2);

		m.setSim(list);

		et.begin();
		em.persist(m);
		et.commit();
	}
}
