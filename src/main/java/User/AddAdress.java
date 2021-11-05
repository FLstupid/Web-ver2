package User;

import java.io.*;
import java.sql.Timestamp;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.swing.*;

import Data.accountIO;
import Data.addressIO;
import Model.Account;
import Model.Address;
import Model.UserAddress;

@WebServlet(name = "addaddress", value = "/addaddress")
public class AddAdress extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/addaddress.jsp";
        String action = request.getParameter("action");
        if (action == null) {
            action = "addaddress"; // default action
        } else if (action.equals("add")) {
            String username = request.getParameter("fullName");
            String phone;
            String message = "";
            String message1 = "";
            String province;
            String district;
            String addressname;
            phone = request.getParameter("telephone");
            province = request.getParameter("province");
            district = request.getParameter("district");
            addressname = request.getParameter("street");
            Address address = new Address(phone,addressname,province,district);
            if ( addressname == null || addressname.isEmpty() || phone == null || phone.isEmpty()|| province == null || province.isEmpty()|| district == null || district.isEmpty()) {
                message = "Please fill out all three text boxes.";
                url = "/addaddress.jsp";
            }
            else {
                message1 = "Cập nhật địa chỉ thành công";
                //show message
                //cách show giá trị trong select ra sau khi update

                addressIO.insert(address);
                url = "/usercenter.jsp";

            }
            request.setAttribute("address", address);
            request.setAttribute("message", message);
            request.setAttribute("message1", message1);
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
