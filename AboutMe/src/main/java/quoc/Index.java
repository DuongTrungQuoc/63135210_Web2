package quoc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AboutMe")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html><body>");
		out.println("<h2>Nhập thông tin cá nhân của người yêu bạn</h2>");
		out.println("<form method = 'post'>");
		out.println("Tên: <input type='text' name='name'><br>");
        out.println("Tuổi: <input type='text' name='age'><br>");
        out.println("Sở thích: <input type='text' name='hobbies'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
	    String age = request.getParameter("age");
	    String hobbies = request.getParameter("hobbies");

	    out.println("<html><body>");
	    out.println("<h2>Thông tin cá nhân của người yêu bạn</h2>");
	    out.println("Tên: " + name + "<br>");
	    out.println("Tuổi: " + age + "<br>");
	    out.println("Sở thích: " + hobbies + "<br>");
	    out.println("</body></html>");
	}

}
