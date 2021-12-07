package com.technoelevate.javaprogram.musicplayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	entityTransaction.begin();
	
	entityManagerFactory  = Persistence.createEntityManagerFactory("Musicplayer1");
	}
}
