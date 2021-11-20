package User;

import Data.productIO;
import Data.reviewIO;
import Model.Account;
import Model.Product;
import Model.Review;

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
        String url = null;
        if(action.equals("detail"))
        {
            String productid = request.getParameter("productCode");
            long id = Long.parseLong(productid);
            HttpSession session = request.getSession();
            Object product = productIO.selectProduct(id);
            List nhanxet = reviewIO.selectReviewList(id);
             request.getSession().setAttribute("product",product);
            request.getSession().setAttribute("nhanxet",nhanxet);
            url = "/ProductDetail.jsp";
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
}
