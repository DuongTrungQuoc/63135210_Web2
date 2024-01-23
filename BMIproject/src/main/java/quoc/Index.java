package quoc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/BMI")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Index() {
        super();
    }

	//Xử lý yêu cầu GET để trả về trang web chứa form nhập Chiều cao, Cân nặng và nút Submit.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Form nhập liệu
        out.println("<html><body>");
        out.println("<h2>Calculate BMI</h2>");
        out.println("<form method='post'>");
        out.println("Height (cm): <input type='text' name='height'><br>");
        out.println("Weight (kg): <input type='text' name='weight'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
	}

	// Xử lý yêu cầu POST để lấy dữ liệu từ form, thực hiện tính toán BMI và gửi trả kết quả.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Lấy giá trị cân nặng và chiều cao
        String heightStr = request.getParameter("height");
        String weightStr = request.getParameter("weight");

        // Convert string -> double
        double height = Double.parseDouble(heightStr);
        double weight = Double.parseDouble(weightStr);

        // Gọi hàm Calculate BMI
        double bmi = calculateBMI(height, weight);

        // Set loại content cho the response
        response.setContentType("text/html");

        // Tạo PrintWriter để gửi HTML response
        PrintWriter out = response.getWriter();

        // Form hiện kết quả bmi
        out.println("<html><body>");
        out.println("<h2>BMI Result</h2>");
        out.println("Height: " + height + " cm<br>");
        out.println("Weight: " + weight + " kg<br>");
        out.println("BMI: " + bmi + "<br>");
        out.println("</body></html>");
	}
	private double calculateBMI(double height, double weight) {
        return weight / ((height / 100) * (height / 100));
    }
}
