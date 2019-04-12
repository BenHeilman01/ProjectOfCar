package com.servlet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.user.CarObject;

public class Customer1 {
	
	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	private String custVin;
	//the path where I save customer files
	private final static String path = "C:\\Software\\ServletProject\\custFolder\\";
	
	

	//default constructor
	public Customer1() {}
	//constructor built this way to mirror response from user
	public Customer1(String firstName, String lastName, String email, String telephone, String custVin) {
		
	}
	
	
	//Getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static String getPath() {
		return path;
	}

	public String getCustVin() {
		return custVin;
	}
	public void setCustVin(String custVin) {
		this.custVin = custVin;
	}
	public static Customer1 readFromFile(String custVin) {
		Customer1 customer = new Customer1();
		//the name of the file needs to be unique, so used e-mail.
		String fileName = path+custVin+".txt";

		
		//do this, if exception, throw FileNotFoundException
		try {
		//connect input to method
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
		//parsed the input to each variable separated by comma	
				String[] parsedLine = line.split(",");
				
				customer.setFirstName(parsedLine[0]);
				customer.setLastName(parsedLine[1]);
				customer.setEmail(parsedLine[2]);
				customer.setTelephone(parsedLine[3]);
				customer.setCustVin(parsedLine[4]);
				System.out.println(customer + "cust at com.servlet");
				
			}
		}catch(FileNotFoundException e) {
			System.out.println("Invalid file name");
		}
		return customer;		
	}
	//save the file
	public void saveToFile() {
	String fileName = path+email+".txt";
	
	try {
	BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	bw.write(formatData());
	bw.close();
	}catch(IOException e) {
		System.out.println("Save to file failed");
	}
	
	}
	private String formatData() {
		return this.firstName+","+this.lastName+","+this.email+","+this.telephone;
}

	public String toString() {
		return "First Name: "+this.firstName+" Last Name: "+this.lastName+"Email: "+this.email+"Telephone: "+this.telephone;
	}
	public static void initCust(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		// path of custFolder
		final String path = "C:\\Software\\ServletProject\\custFolder\\";
		// create end custList array
		ArrayList<Customer1> custList = new ArrayList<Customer1>();
		// create customer object to put into tempCustList array
		Customer1 customer = new Customer1();
		// create an array to load each file
		File dir = new File(path);
		File[] tempCustList = dir.listFiles();
		int i = 0;
		// is it pulling?
		for (i = 0; i < tempCustList.length; i++) {
			customer = new Customer1();
			// System.out.println(customer);

			try {
				// Reading the 'path' folder, getting the array
				Scanner scanner = new Scanner(new File(path + tempCustList[i].getName()));
				// go line by line to assign customer to array
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					String[] parsedLine = line.split(",");
					// parse line by ","

					// String fName = parsedLine[0];
					customer.setFirstName(parsedLine[0]);
					customer.setLastName(parsedLine[1]);
					customer.setEmail(parsedLine[2]);
					customer.setTelephone(parsedLine[3]);
					customer.setCustVin(parsedLine[4]);
					custList.add(customer);
					System.out.println(custList + " from CustList");
				}

			} catch (FileNotFoundException e) {
				System.out.println("Invalid file name" + e.getMessage());

			}
		}
		session.setAttribute("custList", custList);
	}
} //  <-------MAIN METHOD 
