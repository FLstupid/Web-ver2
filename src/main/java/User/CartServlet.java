package User;

import Data.accountIO;
import Data.cartItemIO;
import Model.Account;
import Model.Cart;

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
        if (action == null) {
            action = "cart"; // default action
        }
        if (sc != null) {
//            List<?> listaddress = addressIO.selectUserAdress();
//            request.getSession().setAttribute("listaddress", listaddress);
            Cart cart;
            HttpSession session = request.getSession();
            request.getParameter("productCode");
            List<?> listcart = cartItemIO.selectItems();
            cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                new Cart();
            }
//            long id = Long.parseLong(productCode);
//            Product product = productIO.selectProductByid(id);
//            CartItem cartItem = new CartItem();
//            cartItem.setProductByProductId(product);
//            cartItem.setAmount(amount);
//            if (amount > 0) {
//                cartItemIO.insert(cartItem);
//            } else {
//                cartItemIO.delete(cartItem);
//            }

            session.setAttribute("cart", cart);
            session.setAttribute("listcart",listcart);
        }
        url = "/cart.jsp";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    private String checkUser(HttpServletRequest request,
                             HttpServletResponse response) {
        String productCode = request.getParameter("productCode");
        HttpSession session = request.getSession();
        session.setAttribute("productCode", productCode);
        String url;
        if (productCode == null || productCode.equals("")) {
                url = "/login.jsp";
        }
        else {
            ServletContext sc = getServletContext();
            Account  account = (Account) request.getSession().getAttribute("account");
            long id = account.getId();
            Account   account1 = accountIO.getAccountById(id);
            session.setAttribute("account", account1);
            url = "/cart.jsp";
        }
        return url;
    }
}
