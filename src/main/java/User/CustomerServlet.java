package User;
import Model.Account;

import java.io.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import Data.accountIO;


@WebServlet(name = "customer", value = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="/usercenter.jsp";
        Boolean Gender;
        Calendar calendar = Calendar.getInstance();
        Date birhday;
        Timestamp lastUpdate;
        String phone;
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        if (action.equals("join")) {
            action = "customer"; // default action
        }
        else if (action.equals("add")) {
            String username =  request.getParameter("fullName");
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
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = year+"-"+month+"-"+day;
            Date birthday1 = null;
            try {
                birthday1 = sdf.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date birthday = new java.sql.Date(birthday1.getTime());
            boolean role = true;
            //last update
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = null;
            try {
                date = dateFormat.parse("23/09/2007");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            lastUpdate = new Timestamp(System.currentTimeMillis());
            Account  newaccount = new Account(username,password,phone,Gender ,email,"sa",birthday,role,lastUpdate);
            String message;
            if ( email == null || email.isEmpty() || phone == null || phone.isEmpty()) {
                message = "Please fill out all three text boxes.";
                url = "/usercenter.jsp";
            }
            else {
                message = "";
                accountIO.insert(newaccount);
                url = "/usercenter.jsp";

            }
            request.setAttribute("account", newaccount);
            request.setAttribute("message", message);
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
