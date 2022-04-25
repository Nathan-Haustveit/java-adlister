import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet {
    int counter = 1;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println("Number of times this page has been viewed: " + counter);
        counter +=1;
    }
}
