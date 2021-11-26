package User;

import Data.accountIO;
import Data.cartIO;
import Data.cartItemIO;
import Data.productIO;
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

public class ProductDetailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        String action = request.getParameter("action");
        String url ;
        Product product = null;
        int amount = 1;
        if(action.equals("watch"))
        {

        }
        else if(action.equals("detail"))
        {
            String productid = request.getParameter("productCode");
            long id = Long.parseLong(productid);
            request.getSession();
            product = productIO.selectProductByid(id);
        }
        else  if(action.equals("checkUser"))
        {
            checkUser(request);
        }
        else if (action.equals("add")){
            AddItem(request);
        }
        request.getSession().setAttribute("product",product);
        request.getSession().setAttribute("amount",amount);
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
        HttpSession session = request.getSession();
        Account acc = (Account) request.getSession().getAttribute("account");
        int amount = (int) session.getAttribute("amount");
        long productCode = Long.parseLong(request.getParameter("productCode"));
        Cart cart = (Cart) cartIO.selectCart(acc.getId());
        Product product = productIO.selectProductByid(productCode);
        CartItem cartItem = null;
        if (cart != null) {
            cartItem = (CartItem) cartItemIO.selectItem(productCode,cart.getId());
        }
        if (cartItem == null) {
            CartItem Item = new CartItem();
            Item.setAmount(amount);
            Item.setCartByCartId(cart);
            Item.setProductByProductId(product);
            cartItemIO.insert(Item);
        } else if (amount == 0) {
            cartItemIO.delete(cartItem);
        }
        else {
            cartItem.setAmount(amount);
            cartItemIO.update(cartItem);
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
