package User;

import Data.cartItemIO;
import Model.Account;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "cart", value = "/cart")
public class CartServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");}
        ServletContext sc = getServletContext();
        String action = request.getParameter("action");
        String url;
        HttpSession session = request.getSession();
        if (action == null) {
            action = "cart";
        }
        if (session.getAttribute("account") == null) {
            url = "/login.jsp";
            getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
        }
        else {
            Account acc = (Account) session.getAttribute("account");
            long Id = acc.getId();
            List<?> listcart = cartItemIO.selectItems(Id);

            session.setAttribute("listcart", listcart);
            url = "/cart.jsp";
            getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
