

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.CarObject;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		//creating a carInv ArrayList
		ArrayList<CarObject> carInv = (ArrayList<CarObject>)session.getAttribute("carInv");
		CarObject car = new CarObject();
		
		//setting parameters for carInv
		car.setName(request.getParameter("name"));
		car.setModel(request.getParameter("model"));
		car.setYear(request.getParameter("year"));
		car.setPrice(request.getParameter("price"));
		car.setDescription(request.getParameter("description")); 
		car.setVin(request.getParameter("vin"));
		System.out.println(car);
		//saving car to file
		car.saveToFile();
		
		

		//if no list, create one
		if (carInv == null) {
			carInv = new ArrayList<CarObject>();
			
		}
		//calling the above 'car' to carInv 
		carInv.add(car);
		//setting it to the session so it can be accessed
		session.setAttribute("carInv", carInv);
		//after commands executed, goto CarInvPage.jsp
		RequestDispatcher rs = request.getRequestDispatcher("Test.jsp");
		rs.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
