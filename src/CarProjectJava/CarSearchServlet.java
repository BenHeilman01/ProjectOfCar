package CarProjectJava;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet.CarArrayServlet;
import com.user.CarObject;
import com.user.Student;


/**
 * Servlet implementation class CarSearchServlet
 */
@WebServlet("/CarSearchServlet")
public class CarSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static String path = "C:\\Software\\ServletProject\\carFolder\\";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		String searchModel = request.getParameter("searchModel");
		System.out.println("##################Searching for: "+searchModel);
		ArrayList<CarObject> carInv = (ArrayList<CarObject>)session.getAttribute("carInv");
	for(int i=0;i < carInv.size();i++)
	{
		if(carInv.get(i).getModel().equalsIgnoreCase(searchModel))
		{	
			//if found, create a list
			ArrayList<CarObject> searchList = new ArrayList<CarObject>();
			//Create car from that info
			CarObject car = new CarObject();
			//add car to new list
			searchList.add(carInv.get(i));
			//save car to the session
			session.setAttribute("searchList", searchList);
			
			System.out.println("Car Found!!!  ");
			System.out.println(carInv.get(i));
			//refresh page and go back to "CarSearch.jsp"
			RequestDispatcher rs = request.getRequestDispatcher("CarSearch.jsp");
			rs.forward(request, response);
			}
			else { System.out.println("Car not found");
		}
		}

}
	//Add to list
		//save list to session
		//redirect next page
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
