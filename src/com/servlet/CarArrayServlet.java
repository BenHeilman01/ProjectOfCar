package com.servlet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.CarObject;

/**
 * Servlet implementation class CarArrayServlet
 */
@WebServlet("/CarArrayServlet")
public class CarArrayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static String path = "C:\\Software\\ServletProject\\carFolder\\";
	private final static String carPath = "C:\\Software\\ServletProject\\WebContent\\pics\\";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CarArrayServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//pull list
		Customer1.initCust(request);
		HttpSession session = request.getSession(true);
		//Pull custList from CustList.java
	ArrayList<Customer1> custList = (ArrayList<Customer1>) session.getAttribute("custList");
	
		//pull
	ArrayList<CarObject> carInv = new ArrayList<CarObject>();
	
		final String path = "C:\\Software\\ServletProject\\carFolder\\";
		//create car object to reference in the carArray
		CarObject car = new CarObject();
		File dir = new File(path);
		// Create an array to load each file we find on to
		File[] carArray = dir.listFiles();
		int i=0;
		// test to see if it's pulling
		for (i=0; i<carArray.length; i++)
		{
		car = new CarObject();
		//w00t it's pulling the files
		//parse the array
	try {	
		//reading the 'path' folder, getting the array
		Scanner scanner = new Scanner(new File(path+carArray[i].getName()));
		//go line by line while there is any left
	while(scanner.hasNextLine()) {
		String line = scanner.nextLine();
		//time to parse the lines
		//parse line by line by ","
		String[] parsedLine = line.split(",");
		//assign each line to a specific variable
	String name = parsedLine[0];
		car.setName(name);
		car.setModel(parsedLine[1]);
		car.setYear(parsedLine[2]);
		car.setPrice(parsedLine[3]);
		car.setDescription(parsedLine[4]);
		car.setVin(parsedLine[5]);
		//System.out.println(car);
		carInv.add(car);
		}
	
		}catch(FileNotFoundException e) {
			System.out.println("Invalid file name"+e.getMessage());
					
		}
		
		}
		//looping through custList and carInv list
		for (Customer1 cust : custList) {
			for(CarObject carObj: carInv)
			{
				//If custVin == vin...set variable setBoughtBy
				if(cust.getCustVin().equals(carObj.getVin()))
				{
					//set variable setBoughtBy
					carObj.setBoughtBy(cust.getEmail());
					System.out.println("Sold Status" + carObj);
				}
			}
		}
		
		
		
		
	session.setAttribute("carInv", carInv);
		//after commands executed, goto CarLogIn.jsp
		RequestDispatcher rs = request.getRequestDispatcher("CarLogIn.jsp");
		rs.forward(request, response);
	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	
}
		
	
}
