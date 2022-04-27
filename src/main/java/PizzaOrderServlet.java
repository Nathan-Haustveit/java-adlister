import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("crust"));
        System.out.println(request.getParameter("sauce"));
        System.out.println(request.getParameter("size"));
        String[] toppings = request.getParameterValues("toppings");
        for (String topping : toppings) {
            System.out.println(topping);
        }
        String address = request.getParameter("address");
        System.out.println(address);
        response.sendRedirect("/pizza-order");
    }
}
