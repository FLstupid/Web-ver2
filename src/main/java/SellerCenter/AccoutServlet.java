package SellerCenter;

import Data.accountIO;
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
import java.sql.Timestamp;

@WebServlet(name = "account", value = "/account")
public class AccoutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        String action = request.getParameter("action");
        Account acc = (Account) request.getSession().getAttribute("account");
        HttpSession session = request.getSession();
        Shop shop;
        if (action == null) {
            action = "account"; // default action
        }
        else if (action.equals("shopinfor"))
        {
            String shopName = request.getParameter("shopName");
            String shopStreet = request.getParameter("shopStreet");
            String shopDistrict = request.getParameter("shopDistrict");
            String shopCity = request.getParameter("shopCity");
            String numberProduct1 = request.getParameter("numberProduct");
            String bank1 = request.getParameter("bank");
            int bank = Integer.parseInt(bank1);
            Timestamp lastupdate = new Timestamp(System.currentTimeMillis());
            long numberProduct = Long.parseLong(numberProduct1);
            shop = new Shop(shopCity,shopStreet,shopDistrict,shopName,numberProduct,acc,lastupdate,bank);
            shopIO.insert(shop);
            acc.setShopId(shop.getId());
            accountIO.update(acc);
            request.setAttribute("account", acc);
            request.getSession().setAttribute("shop", shop);
            request.getSession().setAttribute("account", acc);
        }


        String url = "/account.jsp";
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
