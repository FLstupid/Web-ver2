package Home;

import Data.productIO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        String url = "/Home.jsp";
        String action = request.getParameter("action");
//        if(action.equals("search"))
//        {
//
//        }
//        else {
            HttpSession session = request.getSession();
            List<?> listproduct = productIO.selectListProduct();
            if (listproduct != null) {
                session.setAttribute("listproduct", listproduct);
           }
//        }

         url = "/Home.jsp";

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
