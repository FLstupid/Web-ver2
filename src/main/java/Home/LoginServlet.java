package Home;

import Data.accountIO;
import Model.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "login" , value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/login.jsp";
        String action = request.getParameter("action");
        String message = null;
        String t=null;
        Account temp = null;
        if (action == null) {
            action = "join";  // default action
        }
<<<<<<< Updated upstream
        if (action.equals("join")) {
            action = "login";
        }
        else if(action.equals("add")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            if (email.equals(null) || email.equals("") || password.equals(null) || password.equals("")) {
                message = "Xin hãy nhập tài khoản và mật khẩu";
                url = "/login.jsp";
            } else {
=======
        switch (action) {
            case "join":
                break;
            case "add": {
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String t = null;
>>>>>>> Stashed changes
                if (accountIO.userExist(email)) {
                    message = "Tài khoản đã tồn tại";
                } else {
                    message = "Đăng kí tài khoản thành công";
                    temp = new Account(email, password);
                    accountIO.insert(temp);
                    t = temp.getUsername();
                }
<<<<<<< Updated upstream
            }
        }
        if (action.equals("signin")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if (email.equals(null) || email.equals("") || password.equals("")) {
                message = "Xin hãy nhập tài khoản và mật khẩu";
                url = "/login.jsp";
            }
            else if (accountIO.userExist(email)) {
                temp = accountIO.selectAcc(email);
                if (temp.getPasswordHash().equals(password)) {
                    message = "Đăng nhập thành công";
                    HttpSession session = request.getSession();
                    session.setAttribute("loggedInUser", temp);
                    request.setAttribute("account", temp);
                    request.setAttribute("message", message);
                    request.getSession().setAttribute("account", temp);
                    t = temp.getUsername();
                    url = "/Home.jsp";
                } else {
                    message = "Mật khẩu không trùng khớp";
=======
                request.setAttribute("loggedInUser", temp);
                request.setAttribute("message", message);
                request.getSession().setAttribute("username", t);
                break;
            }
            case "signin": {
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                if (accountIO.userExist(email)) {
                    temp = accountIO.selectAcc(email);
                    assert temp != null;
                    if (temp.getPasswordHash().equals(password)) {
                        message = "Đăng nhập thành công";

                        session.setAttribute("loggedInUser", temp);
                        url = "/Home.jsp";
                    } else {
                        message = "Mật khẩu không trùng khớp";
                    }

                } else {
                    message = "Tài khoản chưa tồn tại";
>>>>>>> Stashed changes
                }
                request.setAttribute("account", temp);
                request.setAttribute("message", message);

<<<<<<< Updated upstream
            } else {
                message = "Tài khoản chưa tồn tại";
=======
                break;
>>>>>>> Stashed changes
            }
        }
        request.setAttribute("loggedInUser", temp);
        request.setAttribute("message", message);
        request.getSession().setAttribute("username", t);
        getServletContext()
                .getRequestDispatcher(url).forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
