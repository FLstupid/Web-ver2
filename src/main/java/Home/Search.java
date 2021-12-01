package Home;

import Data.productIO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "search", value = "/search")
public class Search  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        String pn = request.getParameter("searchproduct");
        List<?> ListProductByproductname = productIO.selectListProductByproductname(pn);
        if (pn!=null||ListProductByproductname != null) {
            request.getSession().setAttribute("ListProductByproductname", ListProductByproductname);
        }
        getServletContext()
                .getRequestDispatcher("/search.jsp")
                .forward(request, response);
    }
}
