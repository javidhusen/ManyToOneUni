package com.ty.amezon.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.amezon.dto.Product;
import com.ty.amezon.dto.Review;

public class Dao {

	void saveProduct() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product product = new Product();
		product.setName("Watch");
		product.setBrand("fastrack");
		product.setCost(3000);
		
		Review review = new Review();
		review.setUsername("jack");
		review.setDescription("Excellent product");
		
		review.setPro(product);
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(review);
		entityTransaction.commit();
	}
}
