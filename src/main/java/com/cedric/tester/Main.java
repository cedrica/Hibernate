package com.cedric.tester;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
	
	public static void main(String[] args){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		Person person = new Person();
		person.setName("Cedric");
		Adresse adresse = new Adresse();
		adresse.setName("Adresse1");
		person.addAdresse(adresse);
		em.persist(person);
		em.getTransaction().commit();
		em.close();
	}
	
}
