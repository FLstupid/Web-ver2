package User;

import Data.accountIO;
import Data.productIO;
import Data.reviewIO;
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
        List nhanxet = null;
        if(action.equals("watch"))
        {

        }
        if(action.equals("detail"))
        {
            String productid = request.getParameter("productCode");
            long id = Long.parseLong(productid);
            HttpSession session = request.getSession();
            product = productIO.selectProduct(id);
            nhanxet = reviewIO.selectReviewList(id);
        }
        else  if(action.equals("checkUser"))
        {
            checkUser(request,response);
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
    private String checkUser(HttpServletRequest request,
                             HttpServletResponse response) {

        String productCode = request.getParameter("productCode");
        HttpSession session = request.getSession();
        session.setAttribute("productCode", productCode);
        Account user = (Account) session.getAttribute("email");

        String url;
        // if User object doesn't exist, check email cookie
        if (user == null) {
//            Cookie[] cookies = request.getCookies();
//            String emailAddress =CookieUtil.getCookieValue(cookies, "emailCookie");
            String email =  request.getParameter("email");
            String password =  request.getParameter("password");
            // if cookie doesn't exist, go to Registration page
            if (email == null || email.equals("")) {
                url = "/register.jsp";
            }
            // if cookie exists, create User object and go to Downloads page
            else {
                ServletContext sc = getServletContext();
                Account  account = (Account) request.getSession().getAttribute("account");
                long id = account.getId();
                Account   account1 = accountIO.getAccountById(id);
                session.setAttribute("account", account1);
                url = "/" + productCode + "/cart.jsp";
            }
        }
        // if User object exists, go to Downloads page
        else {
            url = "/" + productCode + "/cart.jsp";
        }
        return url;
    }
}
