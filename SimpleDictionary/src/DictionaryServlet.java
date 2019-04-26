import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionartyServlet",urlPatterns = "/translate")
public class DictionaryServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chàoa");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = request.getParameter("search");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");


        String result = dictionary.get(search);
        if(result!=null){
            writer.println("Word: " + search);
            writer.println("Result: " + result);
        } else {
            writer.println("Not found");
        }
        writer.println("</html>");


    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
