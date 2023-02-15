package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Emp;

public class Empdao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pqr");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void insert(Emp emp) {
	entityTransaction.begin();
	entityManager.persist(emp);
	entityTransaction.commit();
}
}
