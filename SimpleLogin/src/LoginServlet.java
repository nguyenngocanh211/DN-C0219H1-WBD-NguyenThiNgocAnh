import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && ("admin".equals(password))) {
            request.setAttribute("username", username);
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/success.jsp");
            rd.forward(request, response);
        } else {
            writer.println("<html>");
            writer.println("<h1>login error</h1>");
            writer.println("</html>");

        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
