<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password DHS</title>

    <!-- Logo -->
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo/logo.ico">

    <!-- CSS -->
    <link rel="stylesheet" href="assets/css/usercenter.css">
    <link rel="stylesheet" href="assets/css/core.css">
    <link rel="stylesheet" href="assets/css/shortcode/shortcodes.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome/css/all.min.css">

    <!-- Script -->
    <script src="assets/js/jquery-3.3.1.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/owl.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="assets/js/main.js"></script>
</head>

<body>
<div class="app">
    <!-- header -->
    <header class="header">
        <div class="grid wide">
            <!-- header navbar -->
            <nav class="header__navbar hide-on-mobile-tablet">
                <!-- header navbar left -->
                <ul class="header__navbar-list">
                    <li>
                        <i class="header__navbar-icon fas fa-store"></i>
                        <a class="header__navbar-item"
                           href="${pageContext.request.contextPath}/summary">Kênh người bán</a>
                    </li>
                </ul>
                <!--rnd header navbar left -->

                <!-- header navbar right -->
                <ul class="header__navbar-list">
                    <% session=request.getSession(false); if (session==null || session.getAttribute("loggedInUser")==null) {%>
                    <!-- Chưa đăng nhập -->
                    <li>
                        <a href="login" class="
									header__navbar-item
									header__navbar-item--strong
									header__navbar-item--separate"
                        > Đăng ký</a>
                    </li>
                    <li>
                        <a href="login" class="
									header__navbar-item
									header__navbar-item--strong"
                        > Đăng Nhập</a>
                    </li>
                    <%} else {%>
                    <!-- Đã đăng nhập -->
                    <li class="header__navbar-item header__navbar-user">
                        <img src="${pageContext.request.contextPath}/images/${account.avatar}" class="header__navbar-user-img" alt="">
                        <% if(session.getAttribute("username")==null || session.getAttribute("loggedInUser")==null){%>
                        <span class="header__navbar-item--strong header__navbar-user-name">
                            User name</span>
                        <%} else { %>
                        <span>${account.username}</span>
                        <%}%>
                        <ul class="header__navbar-user-menu">
                            <li class="header__navbar-user-item">
                                <a rel="nofollow"
                                   href="${pageContext.request.contextPath}/customer"
                                >Tài khoản của tôi</a>
                            </li>
                            <li class="header__navbar-user-item">
                                <a rel="nofollow"
                                   href="${pageContext.request.contextPath}/customerorder"
                                >Đơn mua</a>
                            </li>
                            <li class="header__navbar-user-item header__navbar-user-item--separate">
                                <a rel="nofollow"
                                   href="${pageContext.request.contextPath}/logout"
                                >Đăng xuất</a>
                            </li>
                        </ul>
                    </li>
                    <%}%>
                </ul>
            </nav>

            <!-- Header with Search -->
            <div class="header-with-search">
                <!-- Header Logo -->
                <div class="header__logo">
                    <a href="home" class="header__logo-link">
                        <img class="header__logo-img" src="assets/img/logo/logo.svg" alt=""/>
                    </a>
                </div>

                <!-- Header Search -->
                <div class="header__search">
                    <div class="header__search-input-wrap">
                        <form action="search" method="get">
                            <input type="text" name="searchproduct" class="header__search-input"
                                   placeholder="Nhập để tìm kiếm sản phẩm" />
                        </form>
                    </div>
                    <form action="search" method="get">
                        <button type="submit" class="btn submit header__search-btn">
                                <i class="header__search-btn-icon fas fa-search"></i>
                        </button>
                    </form>
                </div>


                <!-- Cart layout -->
                <div class="header__cart">
                    <div class="header__cart-wrap">
                        <span class="header__cart-notice">0</span>
                        <a href="${pageContext.request.contextPath}/cart" rel="nofollow">
                            <i class="header__cart-icon fas fa-shopping-cart"></i>
                        </a>
                    </div>
                    <!--End cart -->
                </div>
                <!--End header-search -->
            </div>
        </div>
    </header>
    <!-- End header -->

    <div class="app__container">
        <div class="grid wide">
            <div class="row1 sm-gutter1 app__content">
                <!-- Danh mục -->
                <div class="col1 l-2 m-0 c-0">
                    <ul class="menu-user-item menu-user-name">
                        <img src="assets/img/user_avatar.jpg" class="menu-user-img" alt="">
                        <span class="menu-user-item--strong menu-user">
                                Nguyễn Thanh Minh Đức</span>
                    </ul>
                    <nav class="menu">
                        <h3 class="menu__heading">
                            <i class="fas fa-list-ul menu__heading-icon"></i>
                            Danh mục
                        </h3>
                        <ul class="menu-list">
                            <li class="menu-item catgory-item--active">
                                <a href="customer" class="menu-item__link">
                                    <i class="fas fa-users menu__item-icon"></i>
                                    Thông tin tài khoản</a>
                            </li>
                            <li class="menu-item catgory-item--active">
                                <a href="changingpassword" class="menu-item__link">
                                    <i class="fas fa-key menu__item-icon"></i>
                                    Đổi mật khẩu</a>
                            </li>
                            <li class="menu-item catgory-item--active">
                                <a href="customerorder" class="menu-item__link">
                                    <i class="fas fa-cart-arrow-down menu__item-icon"></i>
                                    Quản lý đơn hàng</a>
                            </li>
                            <li class="menu-item catgory-item--active">
                                <a href="addresslist" class="menu-item__link">
                                    <i class="fas fa-map-marked menu__item-icon"></i>
                                    Sổ địa chỉ</a>
                            </li>
                            <li class="menu-item catgory-item--active">
                                <a href="customerReview" class="menu-item__link">
                                    <i class="far fa-address-card menu__item-icon"></i>
                                    Nhận xét của khách hàng</a>
                            </li>
                        </ul>
                    </nav>
                </div>

                <div class="col1 l-10 m-12 c-12">
                    <!-- Tiêu đề -->
                    <div class="breadcrump-filter">
                        <span class="breadcrump-filter__label">Thay đổi mật khẩu</span>
                    </div>

                    <!-- Nội dung -->
                    <div class="home">
                        <div class="row1 sm-gutter1">
                            <div class="col1 l-4 m1-4 c-6">
                                <a class="home-interface non-underline-link" href="#">
                                    <form method="post" action="changingpassword">
                                        <div class="form-control">
                                            <label class="home-item__name">Mật Khẩu Cũ</label>
                                            <input type="password" name="odlPassword" maxlength="128" minlength="6"
                                                   class="Input-styles" value="">
                                        </div>
                                    </form>
                                </a>
                            </div>
                            <div class="col1 l-4 m1-4 c-6">
                                <a class="home-interface non-underline-link" href="#">
                                    <form method="post" action="changingpassword">
                                        <div class="form-control">
                                            <label class="home-item__name">Mật Khẩu Mới</label>
                                            <input type="password" name="newPassword" maxlength="128" minlength="6"
                                                   class="Input-styles" value="">
                                        </div>
                                    </form>
                                </a>
                            </div>
                            <div class="col1 l-4 m1-4 c-6">
                                <a class="home-interface non-underline-link" href="#">
                                    <form method="post" action="changingpassword">
                                        <div class="form-control">
                                            <label class="home-item__name">Xác Nhận Mật Khẩu</label>
                                            <input type="password" name="confirmNewPassword" maxlength="128"
                                                   minlength="6" class="Input-styles" value="">
                                        </div>
                                    </form>
                                </a>
                            </div>
                            <form method="post" action="changingpassword">
                                <button type="submit" onclick="alert('${message}')" class="btn-submit2">Thay Đổi Mật
                                    Khẩu</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer class="footer">
        <div class="grid wide">
            <div class="grid__row">
                <div class="col l-2-4 m-4 c-6">
                    <h3 class="footer__heading">Chăm sóc khách hàng</h3>
                    <ul class="footer-list">
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Trung Tâm Trợ Giúp</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Thanh Toán</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Vận Chuyển</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Trả hàng & Hoàn Tiền</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Chăm Sóc Khách Hàng</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Chính Sách Bảo Hành</a>
                        </li>
                    </ul>
                </div>
                <div class="col l-2-4 m-4 c-6">
                    <h3 class="footer__heading">Về DHS</h3>
                    <ul class="footer-list">
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Về chúng tôi</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Liên hệ</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Điều khoản DHS</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Kênh Người Bán</a>
                        </li>
                    </ul>
                </div>
                <div class="col l-2-4 m-4 c-6">
                    <h3 class="footer__heading">Kết nối với chúng tôi</h3>
                    <ul class="footer-list">
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">
                                <i class="fab fa-facebook footer-item__icon"></i>
                                Facebook
                            </a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">
                                <i class="fab fa-instagram footer-item__icon"></i>
                                Instagram
                            </a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">
                                <i class="fab fa-linkedin footer-item__icon"></i>
                                Linkedin</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="footer__bottom">
            <div class="grid wide">
                <p class="footer__text">@2021 - Bản quyền thuộc về Nhóm 3 - Designed by Nguyễn Thanh Minh Đức</p>
            </div>
        </div>
    </footer>
    <!--End footer -->

</div>
</body>

</html>