package CarProjectJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class Customer {
	// correct Customer. Populating CustomerServlet.
	// creating variables for customer
	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	private String custVin;
	// .txt where they are saved to
	private final static String path = "C:\\Software\\ServletProject\\custFolder\\";

	// add both constructors.
	public Customer() {
	}

	public Customer(String firstName, String lastName, String email, String telephone, String custVin) {

	}

	// getters and setters for variables
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

	// get customer and create method to save them to .txt
	public static Customer readFromFile(String email) {
		Customer customer = new Customer();
		String fileName = path + email + ".txt";

		// parse it by key strokes, called scanner
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				// parse that stuff
				String[] parsedLine = line.split(",");
				// String fName = parsedLine[0];
				customer.setFirstName(parsedLine[0]);
				customer.setLastName(parsedLine[1]);
				customer.setEmail(parsedLine[2]);
				customer.setTelephone(parsedLine[3]);
				customer.setCustVin(parsedLine[4]);
				System.out.println(customer + "from Customer src");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Invalid file name");
		}
		// once parsed, return the new customer object
		return customer;
	}

	// time to save new customer object
	public void saveToFile() {
		String fileName = path + email + ".txt";

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(formatData());
			bw.close();
		} catch (IOException e) {
			System.out.println("Error: Save failed");
		}

		// new getters and setters
	}

	private String formatData() {
		return this.firstName + "," + this.lastName + "," + this.email + "," + this.telephone + "," + this.custVin;
	}

	public String toString() {
		return "First Name: " + this.firstName + " Last Name: " + this.lastName + "Email: " + this.email + "Telephone: "
				+ this.telephone + "," + "Customer VIN " + this.custVin;
	}

	public static void initCust(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		// path of custFolder
		final String path = "C:\\Software\\ServletProject\\custFolder\\";
		// create end custList array
		ArrayList<Customer> custList = new ArrayList<Customer>();
		// create customer object to put into tempCustList array
		Customer customer = new Customer();
		// create an array to load each file
		File dir = new File(path);
		File[] tempCustList = dir.listFiles();
		int i = 0;
		// is it pulling?
		for (i = 0; i < tempCustList.length; i++) {
			customer = new Customer();
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
} // <-------MAIN METHOD
