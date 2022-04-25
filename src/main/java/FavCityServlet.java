import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/favCity")
public class FavCityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("<h1>Enter City</h1>");
        String html = "<form method='POST'>";
        html += "<label for='search'>Search</label>";
        html += "<input name='favCity' id='favCity' placeholder='Enter favorite city'>";
        html += "<br>";
        html += "<br>";
        html += "<button>Submit</button>";
        html += "</form>";
        resp.getWriter().println(html);
    }

//    When the user goes to "/favCity", the user sees a form where they can enter their favorite city and after submitting the form, the user should see a blank page.
//	- Define your logic in a FavoriteCity servlet
//	- User System.out.println in the doPost method of servlet to verify that the city name has been sent to the server
//
//   (BONUS) Add logic similar the search lecture example where the user is redirected to a results page where they can see the output of their favorite city in the browser
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String citySearch = request.getParameter("favCity");
    }
}

