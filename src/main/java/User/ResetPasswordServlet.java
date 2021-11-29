package User;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.accountIO;
import Model.Account;
import email.Utility;
import forgetpassword.EmailUtility;
import org.apache.commons.lang3.RandomStringUtils;


/**
 * A Java Servlet to handle requests to reset password for customer
 *
 * @author www.codejava.net
 *
 */
@WebServlet("/reset_password")
public class ResetPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private String host;
    private String port;
    private String email;
    private String name;
    private String pass;

    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        email = context.getInitParameter("email");
        name = context.getInitParameter("name");
        pass = context.getInitParameter("pass");
    }

    public ResetPasswordServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String page = "resetpassword.jsp";
        request.getRequestDispatcher(page).forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String recipient = request.getParameter("email");
        String subject = "Your Password has been reset";



        Account customer = accountIO.selectAcc(recipient);
        String newPassword = RandomStringUtils.randomAlphanumeric(10);
        customer.setPasswordHash(newPassword);
        accountIO.update(customer);

        String message = "Hi, this is your new password: " + newPassword;
        message += "\nNote: for security reason, "
                + "you must change your password after logging in.";


        try {
            Utility.sendEmail(host, port, email,  pass,
                    recipient, subject, message);
            message = "Your password has been reset. Please check your e-mail.";
        } catch (Exception ex) {
            ex.printStackTrace();
            message = "There were an error: " + ex.getMessage();
        } finally {
            request.setAttribute("message", message);
            request.getRequestDispatcher("resetpassword.jsp").forward(request, response);
        }
    }

}
