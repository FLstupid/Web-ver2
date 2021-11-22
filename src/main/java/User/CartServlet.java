package User;

import Data.*;
import Model.Account;
import Model.Cart;
import Model.CartItem;
import Model.Product;

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
            request.setCharacterEncoding("UTF-8");
        }
        String productCode;
        String amountString;
        ServletContext sc = getServletContext();
        String action = request.getParameter("action");
        String url = null;
        if (action == null) {
            action = "watchcart"; // default action
        }
        if(action.equals("checkUser"))
        {
          url =  checkUser(request,response);
        }
         else if(action.equals("cart")) {
             Account acc = (Account) request.getSession().getAttribute("account");
             long id1 = acc.getId();
             List<?> listcart = cartIO.selectCart(id1);
             List<?> listaddress = addressIO.selectUserAdress(id1);
             request.getSession().setAttribute("listaddress", listaddress);
             Cart cart = null;
             int amount = 0;
             HttpSession session = request.getSession();
            productCode = request.getParameter("productCode");
            amountString = request.getParameter("amount");
            cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
            }
            try {
                amount = Integer.parseInt(amountString);
                if (amount < 0) {
                    amount = 1;
                }
            } catch (NumberFormatException nfe) {
                amount = 1;
            }
            long id = Long.parseLong(productCode);
            Product product = productIO.selectProductByid(id);
            CartItem cartItem = new CartItem();
            cartItem.setProductByProductId(product);
            cartItem.setAmount(amount);
            if (amount > 0) {
                cartItemIO.insert(cartItem);
            } else {
                cartItemIO.delete(cartItem);
            }

            session.setAttribute("cart", cart);
             request.setAttribute("amount", amount);
             request.getSession().setAttribute("listcart", listcart);
             request.getSession().setAttribute("amount", amount);
             url = "/cart.jsp";
         }
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
