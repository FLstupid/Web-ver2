<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang chủ DHS</title>
</head>
<body>
<h1>Kết quả tìm kiếm của <%=request.getParameter("searchproduct")%></h1>
<center>
    <table border="1">
        <tr>
            <th>id</th>
            <th>Tên sản phẩm</th>
            <th>giá</th>
            <th>mô tả</th>
            <th>Tên shop</th>
        </tr>
        <c:forEach items="${ListProductByproductname}" var="elements">
        <tr>
            <td>${elements[4]}</td>
            <td>${elements[0]}</td>
            <td>${elements[2]}</td>
            <td>${elements[1]}</td>
            <td>${elements[3]}</td>
        </tr>
        </c:forEach>
    </table>
</center>


<datalist id="listproduct">
<option value=""></option>
</datalist>

</body>
</html>
