package com.technoelevate.javaprogram.musicplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MusicPlayer {
	public static void main(String[] args) {
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.displaySong();
	}

	public void displaySong() {

		System.out.println("1.play a song\n2.search a song\n3.operate a song");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		switch (i) {
		case 1:
			System.out.println("enter 1 to play all song");
			System.out.println("enter 2 to play random song");
			System.out.println("enter 3 to play current song");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				playasong();
				break;
			case 2:
			default:
				break;
			}
			playasong();
			break;
		case 2:
			searchasong();
			break;
		case 3:
			operateonsong();

		default:
			System.out.println("invalid input");
			break;
		}
	}

	public void playasong() {
		System.out.println("playing all song");
		hibernatedata();
		System.out.println("press\n1.menu\n2.exit");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			menu();
		case 2:
			exit();
			break;

		default:
			System.out.println("invalid input");
			break;
		}
	}

	public void menu() {
		displaySong();
	}

	public void searchasong() {
		System.out.println("enter the song to search from the list");
		Case1 searchSong = new Case1();

	}

	public void operateonsong() {

	}

	public void hibernatedata() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Musicplayer1");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Query createQuery = entityManager.createQuery("select song_name from Songs");
			List resultList = createQuery.getResultList();
			for (Object object : resultList) {
				System.out.println(object);

//				System.out.println(resultList.get((int)Math.random()*6));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("songs are playing");

	}

	public void exit() {
		System.exit(0);
	}
}
