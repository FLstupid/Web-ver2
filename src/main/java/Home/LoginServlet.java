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
        String message= "Chào mừng bạn tới với DHS";
        String t=null;
        Account temp = null;
        if (action == null) {
            action = "join";  // default action
        }
        if (action.equals("join")) {
            action = "login";
        }
        else if(action.equals("add")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String confirmpassword = request.getParameter("confirmpassword");
            if (email == null || email.equals("") || password == null || password.equals("")) {
                message = "Xin hãy nhập tài khoản và mật khẩu";
            }else if(!password.equals(confirmpassword))
            {
                message = "Mật khẩu xác nhận không đúng";
            }
            else {
                if (accountIO.userExist(email)) {
                    message = "Tài khoản đã tồn tại";
                } else {
                    message = "Đăng kí tài khoản thành công";
                    temp = new Account(email, password);
                    accountIO.insert(temp);
                    t = temp.getUsername();
                }
            }
            url = "/login.jsp";
        }
        if (action.equals("signin")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if (email == null || email.equals("") || password==null || password.equals("")) {
                message = "Xin hãy nhập tài khoản và mật khẩu";
                url = "/login.jsp";
            }
            else if (accountIO.userExist(email)) {
                temp = accountIO.selectAcc(email);
                assert temp != null;
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
                }
                request.setAttribute("account", temp);
                request.setAttribute("message", message);
            } else {
                message = "Tài khoản chưa tồn tại";
            }
        }
        request.getSession().setAttribute("loggedInUser", temp);
        request.getSession().setAttribute("message", message);
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
