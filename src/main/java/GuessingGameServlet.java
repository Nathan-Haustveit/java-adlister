import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessingGame", urlPatterns="/guess")
public class GuessingGameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("/take-a-guess.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int randomNumber = (int) ((Math.random() * 3) + 1);
            int userGuess = Integer.parseInt(request.getParameter("guess"));
            if (randomNumber == userGuess) {
                response.sendRedirect("/correct");
            } else {
                response.sendRedirect("/incorrect");
        }
    }
}
