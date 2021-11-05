package User;

import Model.Account;

import java.io.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.swing.*;

import Data.accountIO;

import static java.lang.System.out;
import static javax.swing.JOptionPane.*;


@WebServlet(name = "customer", value = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="/usercenter.jsp";
        String action = request.getParameter("action");

        if (action == null) {
            action = "join";
        }
        if (action.equals("join")) {
            action = "customer";
        }
        else if (action.equals("add")) {

            String username;
            Boolean Gender;
            String phone;
            String message;
            Timestamp lastUpdate;
            username =  request.getParameter("fullName");
            String password =  request.getParameter("password");
            phone =request.getParameter("phoneNumber");
            String email =  request.getParameter("email");
            String sex = request.getParameter("gender");

            if(sex.equals("male")){
                Gender = true;
            }
            else {
                Gender = false;
            }
            String   day=request.getParameter("day");
            String   month=request.getParameter("month");
            String   year=request.getParameter("year");
            //birhday
            Date birthday1 = null;
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = year+"-"+month+"-"+day;

            try {
                birthday1 = sdf.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date birthday = new java.sql.Date(birthday1.getTime());
            boolean role = true;
            //last update
            lastUpdate = new Timestamp(System.currentTimeMillis());
            Account  account = new Account(username,password,phone,Gender ,email,"sa",birthday,role,lastUpdate);

            if ( email == null || email.isEmpty() || phone == null || phone.isEmpty()) {
                message = "Please fill out all three text boxes.";
                url = "/usercenter.jsp";
            }
            else {
                message = "Cập nhật tài khoản thành công";
                accountIO.insert(account);
                url = "/usercenter.jsp";
            }
            request.setAttribute("account", account);
            request.setAttribute("message", message);
            request.getSession().setAttribute("acc", account);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
