

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Student;

/**
 * Servlet implementation class SchedulerServlet
 */
@WebServlet("/SchedulerServlet")
public class SchedulerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchedulerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Course course = new Course();
		String[] weekdays = request.getParameterValues("weekday");
		WeekDay[] tempList = new WeekDay[weekdays.length];
		for (int i = 0;i<weekdays.length;i++) {
			
		
		String day = weekdays[i];
		
		
		if (day.equals("MONDAY")) 
			tempList[i] = WeekDay.MONDAY;
		else if (day.equals("TUESDAY"))
			tempList[i] = WeekDay.TUESDAY;
		else if (day.equals("WEDNESDAY"))
			tempList[i] = WeekDay.WEDNESDAY;
		else if (day.equals("THURSDAY"))
			tempList[i] = WeekDay.THURSDAY;
		else if (day.equals("FRIDAY"))
			tempList[i] = WeekDay.FRIDAY;
		
		}

		course.setCourseName(request.getParameter("courseName"));
		course.setProfessor(request.getParameter("professor"));
		course.setTime(request.getParameter("time"));
		course.setRoomNumber(request.getParameter("roomNumber"));
		course.setStartDate(request.getParameter("startDate"));
		course.setOccurrences(tempList);
		HttpSession session = request.getSession(true);
		ArrayList<Course> courseList = (ArrayList<Course>)session.getAttribute("courseList");
	
		if (courseList == null) {
			courseList = new ArrayList<Course>();
			
		} 
	
		courseList.add(course);
		session.setAttribute("courseList", courseList);
		RequestDispatcher rs = request.getRequestDispatcher("course.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

//      <td><c:out value="${for (i = 0; i<courseList.length;i++ }"/><td>
//<td><c:out value="${courseList[i]}"/></td>
