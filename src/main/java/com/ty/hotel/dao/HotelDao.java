package com.ty.hotel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotel.dto.Hotel;
import com.ty.hotel.dto.Room;

public class HotelDao {

	public void saveHotel() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vika");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hotel hotel = new Hotel();
		hotel.setName("TAJ");
		hotel.setAdress("raj banglore");

		Room room = new Room();
		room.setType("AC");
		room.setCapacity(2);

		Room room1 = new Room();
		room1.setType("Non AC");
		room1.setCapacity(3);

		Room room2 = new Room();
		room2.setType("AC");
		room2.setCapacity(2);

		Room room3 = new Room();
		room3.setType("Non AC");
		room3.setCapacity(3);

		List<Hotel> ls = new ArrayList<Hotel>();
		ls.add(hotel);

		entityTransaction.begin();
		entityManager.persist(hotel);
		entityManager.persist(room);
		entityManager.persist(room1);
		entityManager.persist(room2);
		entityManager.persist(room3);
		entityTransaction.commit();

	}
}
