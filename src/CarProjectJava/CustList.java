package CarProjectJava;

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

/**
 * Servlet implementation class CustList
 */
@WebServlet("/CustList")
public class CustList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String path = "C:\\Software\\ServletProject\\custFolder\\";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		//path of custFolder
		final String path = "C:\\Software\\ServletProject\\custFolder\\";
		//create end custList array
 ArrayList<Customer1> custList = new ArrayList<Customer1>();
 		//create customer object to put into tempCustList array
 	Customer1 customer = new Customer1();
 	//create an array to load each file 
 	File dir = new File(path);
 	File[] tempCustList = dir.listFiles();
 	int i=0;
 	//is it pulling?
 	for (i=0; i<tempCustList.length;i++)
 	{
 		customer = new Customer1();
 		//System.out.println(customer);
 	
 try {
	 //Reading the 'path' folder, getting the array
	 Scanner scanner = new Scanner(new File(path+tempCustList[i].getName()));
	 //go line by line to assign customer to array
 while(scanner.hasNextLine()) {
	 String line = scanner.nextLine();
	 String[] parsedLine = line.split(",");
	 //parse line by ","
		
		//String fName = parsedLine[0];
		customer.setFirstName(parsedLine[0]);
		customer.setLastName(parsedLine[1]);
		customer.setEmail(parsedLine[2]);
		customer.setTelephone(parsedLine[3]);
		customer.setCustVin(parsedLine[4]);
		custList.add(customer);
		//System.out.println(custList + " from CustList");
 }
 
 
	}catch(FileNotFoundException e) {
		System.out.println("Invalid file name"+e.getMessage());
 	
 	
 	
 	
 	
	}
	session.setAttribute("custList", custList);
	//after commands executed, goto CarLogIn.jsp
	RequestDispatcher rs = request.getRequestDispatcher("CarLogIn.jsp");
	rs.forward(request, response);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
