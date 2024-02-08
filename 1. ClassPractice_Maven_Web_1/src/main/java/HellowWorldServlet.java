

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.Maven_webapp_one.Car;
import com.gl.Maven_webapp_one.CarCollection;

/**
 * Servlet implementation class HellowWorldServlet
 */
@WebServlet("/HellowWorldServlet")
public class HellowWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HellowWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<b> Car Collection Servlet <b><br>");
		
		CarCollection carlist = new CarCollection();
		
		for (Car c : carlist.carCollection()) {
			out.println(c);
			out.println("<br>");
		}
		
	}

}
