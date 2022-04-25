import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//When the user goes to "/greeting", the user will see an h1 with the message "Howdy, null".
//	If the user adds a query string with a key of name and a value of any name, the results will be displayed as "Howdy, WHATEVER_NAME_IN_QUERY_STRING_HERE".
@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        resp.getWriter().println("Howdy, " + name);
    }
}
