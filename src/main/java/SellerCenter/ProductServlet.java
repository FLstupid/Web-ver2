package SellerCenter;

import Data.productIO;
import Data.shopIO;
import Model.Account;
import Model.Shop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "product", value = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/product.jsp";
        Account acc = (Account) request.getSession().getAttribute("account");
        HttpSession session = request.getSession();
        long id = acc.getId();
        Shop shop = shopIO.getShopbyUserID(id);
        List  listproductbyshop = productIO.selectListProductbyshop(shop.getId());
        session.setAttribute("listproductbyshop", listproductbyshop);
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
