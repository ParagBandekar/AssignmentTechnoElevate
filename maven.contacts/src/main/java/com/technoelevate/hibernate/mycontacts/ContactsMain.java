package com.technoelevate.hibernate.mycontacts;

import java.util.Scanner;

import javax.naming.directory.SearchControls;
import javax.swing.JOptionPane;

public class ContactsMain {
	public ContactsMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "welcome to phone book");
		System.out.println("1.show all contacts\n2.search contacts\n3.operate contact");
		Scanner scanner = new Scanner(System.in);
		int userOption = scanner.nextInt();
		switch (userOption) {
		case 1:
			System.out.println("showing all contacts");
			Main main = new Main();
			main.showAllContacts();
			break;

		case 2:
			Main.searchContact();
			break;
		case 3:
			Main.operateoncontact();
		default:
			break;
		}

	}
}
