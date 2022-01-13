
package com.bridgelabz.addressbook_workshop;

import java.util.Scanner;

public class Contact {

	    private String firstname, lastname, address, city, state, email,phone,zipcode;
   
		/**
		 * @return the firstname
		 */
		public String getFirstname() {
			return firstname;
		}



		/**
		 * @param firstname the firstname to set
		 * @return 
		 */
		public String setFirstname(String firstname) {
			return this.firstname = firstname;
		}



		/**
		 * @return the lastname
		 */
		public String getLastname() {
			return lastname;
		}



		/**
		 * @param lastname the lastname to set
		 * @return 
		 */
		public String setLastname(String lastname) {
			return this.lastname = lastname;
		}



		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}



		/**
		 * @param address the address to set
		 * @return 
		 */
		public String setAddress(String address) {
			return this.address = address;
		}



		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}



		/**
		 * @param city the city to set
		 * @return 
		 */
		public String setCity(String city) {
			return this.city = city;
		}



		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}



		/**
		 * @param state the state to set
		 * @return 
		 */
		public String setState(String state) {
			return this.state = state;
		}



		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}



		/**
		 * @param email the email to set
		 * @return 
		 */
		public String setEmail(String email) {
			return this.email = email;
		}



		/**
		 * @return the phone
		 */
		public String getPhone() {
			return phone;
		}



		/**
		 * @param phone the phone to set
		 * @return 
		 */
		public String setPhone(String phone) {
			return this.phone = phone;
		}



		/**
		 * @return the zipcode
		 */
		public String getZipcode() {
			return zipcode;
		}



		/**
		 * @param string the zipcode to set
		 * @return 
		 */
		public String setZipcode(String string) {
			this.zipcode = string;
			return this.zipcode = string;
		}

		public void createContact(Scanner sc){
	        System.out.print("Enter First Name : ");
	        setFirstname(sc.nextLine());
	        System.out.print("Enter Last Name: ");
	        setLastname((sc.nextLine()));
	        System.out.print("Enter Address: ");
	        setAddress(sc.nextLine());
	        System.out.print("Enter City: ");
	        setCity(sc.nextLine());
	        System.out.print("Enter state: ");
	        setState(sc.nextLine());
	        System.out.print("Enter zipcode: ");
	        setZipcode(sc.nextLine());
	        System.out.print("Enter Phone number: ");
	        setPhone(sc.nextLine());
	        System.out.print("Enter Email Id: ");
	        setEmail(sc.nextLine());
	        	        
	    }
	}