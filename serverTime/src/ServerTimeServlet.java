import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "ServerTimeServlet", urlPatterns = "/new")

public class ServerTimeServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Run here post");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/ServerTime.jsp");
        rs.forward(request, response);

    }
}
