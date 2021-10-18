package User;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name = "customer", value = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext sc = getServletContext();

        String action = request.getParameter("action");
        if (action == null) {
            action = "customer"; // default action
        }

        String url = "/usercenter.jsp";
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
