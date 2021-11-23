package User;

import Data.*;
import Model.Account;
import Model.Cart;
import Model.CartItem;
import Model.Product;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ProductDetailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        String action = request.getParameter("action");
        String url ;
        Object product = null;
        List<?> nhanxet = null;
        if(action.equals("watch"))
        {

        }
        if(action.equals("detail"))
        {
            String productid = request.getParameter("productCode");
            long id = Long.parseLong(productid);
            request.getSession();
            product = productIO.selectProduct(id);
            nhanxet = reviewIO.selectReviewList(id);
        }
        else  if(action.equals("checkUser"))
        {
            checkUser(request);
        }
        if (action.equals("add")){
            AddItem(request);
        }
        request.getSession().setAttribute("product",product);
        request.getSession().setAttribute("nhanxet",nhanxet);
        url = "/ProductDetail.jsp";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    private void AddItem (HttpServletRequest request) {
        Account acc = (Account) request.getSession().getAttribute("account");
        long id1 = acc.getId();
        cartIO.selectCart(id1);
        List<?> listaddress = addressIO.selectUserAdress(id1);
        request.getSession().setAttribute("listaddress", listaddress);
        Cart cart;
        int amount;
        HttpSession session = request.getSession();
        String productCode = request.getParameter("productCode");
        String amountString = request.getParameter("amount");
        cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            new Cart();
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
    }

    private void checkUser(HttpServletRequest request) {

        String productCode = request.getParameter("productCode");
        HttpSession session = request.getSession();
        session.setAttribute("productCode", productCode);
        Account user = (Account) session.getAttribute("email");

        // if User object doesn't exist, check email cookie
        if (user == null) {
            String email =  request.getParameter("email");
            String password =  request.getParameter("password");
            // if cookie doesn't exist, go to Registration page
            if (email == null || email.equals("")) {
            }
            // if cookie exists, create User object and go to Downloads page
            else {
                ServletContext sc = getServletContext();
                Account  account = (Account) request.getSession().getAttribute("account");
                long id = account.getId();
                Account   account1 = accountIO.getAccountById(id);
                session.setAttribute("account", account1);
            }
        }
        // if User object exists, go to Downloads page
    }
}
