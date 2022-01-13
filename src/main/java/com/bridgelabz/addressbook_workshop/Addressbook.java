package com.bridgelabz.addressbook_workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addressbook {
	List<Contact> listOfContacts;

	/**
	 * Add contact method adds the contact details to List of contacts
	 * 
	 * @return List of Contacts which are added
	 */
	public List<Contact> addContact() {
		Scanner sc = new Scanner(System.in);
		Contact contactDetails = new Contact();
		contactDetails.createContact(sc);
		listOfContacts.add(contactDetails);
		System.out.println(listOfContacts);
		return listOfContacts;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
	}

}
