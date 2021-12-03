package User;

import Data.addressIO;
import Data.cartIO;
import Data.cartItemIO;
import Model.Account;
import Model.Cart;
import Model.CartItem;

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
            Cart cart = (Cart) cartIO.selectCart(Id);
            List<?> listcart = null;
            List<?> listaddress = addressIO.selectUserAdress(Id);

            if (cart != null) {
                listcart = cartItemIO.selectItems(cart.getId());
            }

            session.setAttribute("listcart", listcart);
            session.setAttribute("listaddress", listaddress);
            url = "/cart.jsp";
            getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
        }
        if(action.equals("Update")){
            long itemId = (long) session.getAttribute("id");
            long productCode = (long) session.getAttribute("productCode");
            int amount = (int) session.getAttribute("amount");
            CartItem item = (CartItem) cartItemIO.selectItem(productCode,itemId);
            if (item != null) {
                item.setAmount(amount);
                cartItemIO.update(item);
            }
        }
        else if(action.equals("remove")){
            long itemId = Long.parseLong(request.getParameter("id"));
            long productCode = Long.parseLong(request.getParameter("productCode"));
            CartItem item = (CartItem) cartItemIO.selectItem(productCode,itemId);
            cartItemIO.delete(item);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
