
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang chủ DHS</title>
</head>
<body>
<form action="Loc" method="post">
    <input type="text" list="${listproduct}" name="product">
    <button class="btn btn-primary" type="submit">Tìm Kiếm</button>
</form>



<datalist id="listproduct">
<option value=""></option>
</datalist>

</body>
</html>
