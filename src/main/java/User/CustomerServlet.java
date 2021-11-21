package User;

import Data.accountIO;
import Model.Account;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet(name = "customer", value = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        String url="/usercenter.jsp";
        String action = request.getParameter("action");

        if (action == null) {
            action = "join";
        }
        if (action.equals("join")) {
            action = "customer";
        }
        else if(action.equals("checkUser"))
        {
            checkUser(request,response);
        }
        else if (action.equals("add")) {

            String username;
            boolean Gender;
            String phone;
            String message;
            Timestamp lastUpdate;
            username =  request.getParameter("fullName");
            String password =  request.getParameter("password");
            phone =request.getParameter("phoneNumber");
            String email =  request.getParameter("email");
            String sex = request.getParameter("gender");

            Gender = sex.equals("male");
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
            assert birthday1 != null;
            java.sql.Date birthday = new java.sql.Date(birthday1.getTime());
            boolean role = true;
            //last update
            lastUpdate = new Timestamp(System.currentTimeMillis());
            Account  account = (Account) request.getSession().getAttribute("account");
            if ( email == null || email.isEmpty() || phone == null || phone.isEmpty()) {
                message = "Xin hãy điền tất cả các giá trị";
            }
            else {
                message = "Cập nhật tài khoản thành công";
                account.setBirthday(birthday);
                account.setGender(Gender);
                account.setLastUpdate(lastUpdate);
                account.setPhone(phone);
                account.setRole(role);
                account.setShopName("");
                account.setUsername(username);
                accountIO.update(account);
            }
            url = "/usercenter.jsp";
            request.setAttribute("account", account);
            request.setAttribute("message", message);
            request.setAttribute("username", username);
            request.getSession().setAttribute("username", account.getUsername());
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
    private String checkUser(HttpServletRequest request,
                             HttpServletResponse response) {

        String productCode = request.getParameter("productCode");
        HttpSession session = request.getSession();
        session.setAttribute("productCode", productCode);
        Account user = (Account) session.getAttribute("email");

        String url;
        // if User object doesn't exist, check email cookie
        if (user == null) {
//            Cookie[] cookies = request.getCookies();
//            String emailAddress =CookieUtil.getCookieValue(cookies, "emailCookie");
            String email =  request.getParameter("email");
            String password =  request.getParameter("password");
            // if cookie doesn't exist, go to Registration page
            if (email == null || email.equals("")) {
                url = "/register.jsp";
            }
            // if cookie exists, create User object and go to Downloads page
            else {
                ServletContext sc = getServletContext();
                Account  account = (Account) request.getSession().getAttribute("account");
                long id = account.getId();
                Account   account1 = accountIO.getAccountById(id);
                session.setAttribute("account", account1);
                url = "/" + productCode + "/cart.jsp";
            }
        }
        // if User object exists, go to Downloads page
        else {
            url = "/" + productCode + "/cart.jsp";
        }
        return url;
    }

}
