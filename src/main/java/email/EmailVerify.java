package email;

import Data.accountIO;
import Model.Account;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Emailverify", value = "/Emailverify")
public class EmailVerify extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EmailVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            if (request.getCharacterEncoding() == null) {
                request.setCharacterEncoding("UTF-8");
            }
            HttpSession session = request.getSession();
            Account user= (Account) session.getAttribute("account");
            String message;
            String code = request.getParameter("authcode");
            String verifycode = (String)request.getSession().getAttribute("code");;
            if(code.equals(verifycode)){
                accountIO.insert(user);
                session.setAttribute("account", user);
                message="Xác nhận thành công! Hãy tiến hành đăng nhập!";
                response.sendRedirect("login.jsp");
            }else{
                message="Mã xác thực không đúng";
                session.setAttribute("message", message);
                response.sendRedirect("verify.jsp");
            }
        }
    }
}
