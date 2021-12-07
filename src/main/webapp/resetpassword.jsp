<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Verify Page</title>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" href="css/all.min.css"/>
    <link rel="stylesheet" href="Registration/style.css"/>
    <!-- Logo -->
    <link rel="shortcut icon"
          type="image/x-icon"
          href="assets/img/logo/favicon.ico">
</head>
<body>
<div style="width: 100%" class="form-container sign-in-container">
    <form action="reset_password" method="post">
        <input type="hidden" name="action" value="resetpass">
        <h2>Khôi phục mật khẩu</h2>
        <p>
            Xin hãy nhập email tài khoản của bạn chúng tôi sẽ gửi 1 mã xác thực đến:
        </p>
        <input style="width: 500px" type="text" name="email" id="email" />
        <button type="submit" class="btn2 btn-submit">Xác Nhận</button>
        <c:if test="${not empty message}">
            <script>
                window.addEventListener("load", function () {
                    alert("${message}");
                })
            </script>
        </c:if>
    </form>
</div>
<c:if test="${not empty message}">
    <script>
        window.addEventListener("load", function () {
            alert("${message}");
        })
    </script>
</c:if>
<script type="text/javascript">

    $(document).ready(function () {
        $("#resetForm").validate({
            rules: {
                email: {
                    required: true,
                    email: true
                }
            },

            messages: {
                email: {
                    required: "Please enter email",
                    email: "Please enter a valid email address"
                }
            }
        });

    });

</script>
</body>
</html>