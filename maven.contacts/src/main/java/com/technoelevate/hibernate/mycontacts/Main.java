package com.technoelevate.hibernate.mycontacts;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.result.UpdatableResultSet;

public class Main {
	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entityManager = null;
	static EntityTransaction entityTransaction = null;
	static Scanner scanner = new Scanner(System.in);

	public void showAllContacts() {
		operator();
		Query createQuery = entityManager.createQuery("from MyContacts");
		List resultList = createQuery.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
		}

	}

	public static void operator() {
		entityManagerFactory = Persistence.createEntityManagerFactory("Contacts");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

	}

	public static void searchContact() {
		operator();
		System.out.println("enter any of the option to search\n1.slno\n2.name\n3.phone number\n4.email id");

		int userOption = scanner.nextInt();
		switch (userOption) {
		case 1:
			System.out.println("enter the slno");
			int i = scanner.nextInt();
			Query createQuery = entityManager.createQuery("from MyContacts where slno=" + i);
			List resultList = createQuery.getResultList();
			for (Object object : resultList) {
				System.out.println(object);
			}
			JOptionPane.showMessageDialog(null, resultList);
			break;

		case 2:
			System.out.println("enter the name");
			String s = scanner.next();
//			scanner.nextLine();
			Query createQuery2 = entityManager.createQuery("from MyContacts where name= '" + s + "'");
			List resultList2 = createQuery2.getResultList();
//			JOptionPane.showMessageDialog(null, resultList2);
			resultList2.forEach(System.out::println);
			break;
		case 3:
			System.out.println("enter the phone number");
			long l = scanner.nextLong();
			Query createQuery3 = entityManager.createQuery("from MyContacts where phno=" + l);
			List resultList3 = createQuery3.getResultList();
			resultList3.forEach(System.out::println);
			JOptionPane.showMessageDialog(null, resultList3);
		case 4:
			System.out.println("enter email id");
			String string = scanner.nextLine();
			scanner.nextLine();
			Query createQuery4 = entityManager.createQuery("from MyContacts where email='"+ string +"'");
			List resultList4 = createQuery4.getResultList();
			resultList4.forEach(System.out::println);
//			JOptionPane.showMessageDialog(null, resultList4);
		default:
			System.out.println("invalid option");
			break;
		}
	}

	public static void operateoncontact() {
		operator();
		System.out.println("enter the option\n1.add\n2.delete\n3.update");
		int i = scanner.nextInt();
		switch (i) {
		case 1:
			entityTransaction.begin();
			MyContacts contacts = new MyContacts();
			System.out.println("enter the details");
			System.out.println("enter the slno");
			int slno = scanner.nextInt();
			contacts.setSlno(slno);
			System.out.println("enter the name");
			String string = scanner.next();
			contacts.setName(string);
			System.out.println("enter the phone no");
			long l = scanner.nextLong();
			contacts.setPhno(l);
			System.out.println("enter the email id");
			String string2 = scanner.next();
			contacts.setEmail(string2);

			entityManager.persist(contacts);
			entityTransaction.commit();

			break;
		case 2:
			try {
				entityTransaction.begin();
				System.out.println("enter the slno to delete");
				int number = scanner.nextInt();
				Query createQuery = entityManager.createQuery("delete from MyContacts where slno=" + number);

				int update = createQuery.executeUpdate();
				System.out.println("details of " + number + " deleted succesfully");
//			entityManager.persist(update);
				entityTransaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		case 3:
			System.out.println("enter the option to update \n1.name\n2.phone no\n3.email");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				entityTransaction.begin();
				System.out.println("enter the slno whose name has to be updated");
				int no = scanner.nextInt();
				System.out.println("enter the new name");
				String string3 = scanner.next();
				Query createQuery = entityManager
						.createQuery("update MyContacts set name='" + string3 + "'" + " where slno=" + no);
				System.out.println("details of " + no + " is updated succesfully");
				createQuery.executeUpdate();
				entityTransaction.commit();
				break;
			case 2:
				entityTransaction.begin();
				System.out.println("enter the slno whose phone no has to be updated");
				int no1 = scanner.nextInt();
				System.out.println("enter the new number");
				long newno = scanner.nextLong();
				Query createQuery2 = entityManager
						.createQuery("update MyContacts set phno=" + newno + " where slno=" + no1);
				System.out.println("details of " + no1 + " is updated successfully");
				createQuery2.executeUpdate();
				entityTransaction.commit();

				break;
			case 3:
				entityTransaction.begin();
				System.out.println("enter the slno whose email has to be updated");
				int no2 = scanner.nextInt();
				System.out.println("enter the new email");
				String string4 = scanner.next();
				Query createQuery3 = entityManager.createQuery("update MyContacts set email='" + string4 + "'" + " where slno=" + no2);
				System.out.println("details of " + no2 + " updated successfully");
				createQuery3.executeUpdate();
				entityTransaction.commit();

				break;
			default:
				System.out.println("invalid option\n enter the valid option");
				operateoncontact();
			}

			break;
		default:
			System.out.println("invalid option");
			operateoncontact();
		}
	}
}
