<%--@elvariable id="account" type="com.sun.webkit.dom.HTMLAreaElementImpl" --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8" %>

<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang chủ DHS</title>

    <!-- Icon -->
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo.ico">

    <!-- CSS -->
    <link rel="stylesheet" href="assets/css/base.css" />
    <link rel="stylesheet" href="assets/css/main.css" />
    <link rel="stylesheet" href="assets/css/grid.css" />
    <link rel="stylesheet" href="assets/css/responsive.css" />
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/home.css">
    <link rel="stylesheet" href="assets/owlcarousel/assets/owl.carousel.min.css">
    <link rel="stylesheet" href="assets/owlcarousel/assets/owl.theme.default.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome/css/all.min.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Paytone+One&display=swap">
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
                        <a class="header__navbar-item "
                           href="${pageContext.request.contextPath}/summary">Kênh người bán</a>
                    </li>
                </ul>
                <!--rnd header navbar left -->

                <!-- header navbar right -->
                <!-- Thông báo -->
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
                        <img class="header__logo-img" src="assets/img/logo.svg" alt=""/>
                    </a>
                </div>

                <!-- Header Search -->
                <div class="header__search">
                    <div class="header__search-input-wrap">
                        <input type="text" class="header__search-input" placeholder="Nhập để tìm kiếm sản phẩm"/>

                        <!-- Search history -->
                        <div class="header__search-history">
                            <h3 class="header__search-history-heading">
                                Lịch sử tìm kiếm
                            </h3>
                            <ul class="header__search-history-list">
                                <li class="header__search-history-item">
                                    <a href="#">Mũ bảo hiểm</a>
                                </li>
                                <li class="header__search-history-item">
                                    <a href="#">Gang tay phượt</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <button class="header__search-btn">
                        <i class="header__search-btn-icon fas fa-search"></i>
                    </button>
                </div>

                <!-- Cart layout -->
                <div class="header__cart">
                    <div class="header__cart-wrap">
                        <i class="header__cart-icon fas fa-shopping-cart"></i>
                        <span class="header__cart-notice">0</span>
                        <!-- No Cart -->
                        <div class="header__cart-list">
                            <% session=request.getSession(false); if (session==null || session.getAttribute("loggedInUser")==null) {%>
                            <!-- Nocart -->
                            <img src="assets/img/no_cart.png" alt="" class="header__cart-no-cart-img"/>
                            <span class="header__cart-no-cart-msg">
									Chưa có sản phẩm
                            </span>
                            <!-- Has Cart -->
                            <%} else {%>
                            <h4 class="header__cart-heading">Sản phẩn đã thêm</h4>
                            <ul class="header__cart-list-item">
                                <li class="header__cart-item">
                                    <img
                                            src="assets/img/prd/prd_img_1.jpg"
                                            class="header__cart-img"
                                    />
                                    <div class="header__cart-item-info">
                                        <div class="header__cart-item-head">
                                            <h5 class="header__cart-item-name">
                                                Mũ bảo hiểm fullface yohe
                                            </h5>
                                            <div class="header__cart-item-price-wrap">
                                                    <span class="header__cart-item-price"
                                                    >2.500.000</span
                                                    >
                                                <span class="header__cart-item-multiply">x</span>
                                                <span class="header__cart-item-qnt">3</span>
                                            </div>
                                        </div>
                                        <div class="header__cart-item-body">
                                                <span class="header__cart-item-description">
                                                    Phân loại:
                                                    <span class="header__cart-item-classify"
                                                    >Mũ bảo hiểm</span
                                                    >
                                                </span>
                                            <span class="header__cart-item-remove">Xóa</span>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                            <button class="btn btn--primary header__cart-view-cart">
                                Xem giỏ hàng
                            </button>
                            <%}%>
                        </div>
                    </div>
                    <!--End cart -->
                </div>
                <!--End header-search -->
            </div>
        </div>
    </header>

    <div class="app__container">
        <div class="grid wide">
            <div class="row1 sm-gutter1 app__content">
                <!-- Category -->
                <div class="col1 l-2 m-0 c-0">
                    <nav class="category">
                        <h3 class="category__heading">
                            <i class="fas fa-list-ul category__heading-icon"></i>
                            Danh mục
                        </h3>
                        <ul class="category-list">
                            <li class="category-item catgory-item--active">
                                <a href="#" class="category-item__link">
                                    <i class="fas fa-utensils category__item-icon"></i>
                                    Thực phẩm</a>
                            </li>
                            <li class="category-item catgory-item--active">
                                <a href="#" class="category-item__link">
                                    <i class="fas fa-tshirt category__item-icon"></i>
                                    Quần áo</a>
                            </li>
                            <li class="category-item catgory-item--active">
                                <a href="#" class="category-item__link">
                                    <i class="fas fa-couch category__item-icon"></i>
                                    Nội thất</a>
                            </li>
                            <li class="category-item catgory-item--active">
                                <a href="#" class="category-item__link">
                                    <i class="fas fa-home category__item-icon"></i>
                                    Đồ gia dụng</a>
                            </li>
                        </ul>
                    </nav>
                </div>

                <!-- Filter -->
                <div class="col1 l-10 m-12 c-12">
                    <div class="home-filter">
                        <button class="home-filter__btn btn1 btn--primary">
                            Sản Phẩm
                        </button>

                        <div class="home-filter__page">
								<span class="home-filter__page-num">
									<span class="home-filter__page-current">1</span>
									<span class="home-filter__page-total">14</span>
								</span>
                            <div class="home-filter__page-control">
                                <a href="#"
                                   class="home-filter__page-btn home-filter__page-btn--disable non-underline-link">
                                    <i class="fas fa-angle-left home-filter__page-icon"></i>
                                </a>
                                <a href="#" class="home-filter__page-btn non-underline-link">
                                    <i class="fas fa-angle-right home-filter__page-icon"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                    <!--End home filter -->

                    <!-- Product -->
                    <div class="home-product">
                        <div class="row1 sm-gutter1">
                            <!-- Product item -->
                            <c:forEach items="${listproduct}" var="element">
                                <div class="col1 l-2-4 m1-4 c-6">
                                    <a class="home-product-item" href="productdetail?action=detail&amp;productCode=${element[4]}">
                                        <div class="home-product-item__img"
                                             style="background-image: url(assets/img/prd/prd_img_3.jpg)"></div></a>
                                        <h4 class="home-product-item__name">
                                            <a href="productdetail?action=detail&amp;productCode=${element[4]}">${element[0]}</a>
                                        </h4>
                                        <div class="home-product-item__price">
                                            <span class=""><a href="productdetail?action=detail&amp;productCode=${element[4]}">${element[2]}</a> </span>
                                        </div>
                                        <div class="home-product-item__action">
											<span class="
														home-product-item__like
														home-product-item__like--liked
													">
												<i class="
															home-product-item__like-icon-empty
															far
															fa-heart
														"></i>
												<i class="
															home-product-item__like-icon-fill
															fas
															fa-heart
														"></i>
											</span>
                                        </div>
                                        <div class="home-product-item__origin">
                                            <span class="home-product-item__origin-name">${element[3]}</span>
                                        </div>
                                    </a>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <ul class="pagination home-product__pagination">
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">
                                <i class="pagination-item__icon fas fa-angle-left"></i>
                            </a>
                        </li>
                        <li class="pagination-item pagination-item--active">
                            <a href="" class="pagination-item__link">1</a>
                        </li>
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">2</a>
                        </li>
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">3</a>
                        </li>
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">4</a>
                        </li>
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">5</a>
                        </li>
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">...</a>
                        </li>
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">14</a>
                        </li>
                        <li class="pagination-item">
                            <a href="" class="pagination-item__link">
                                <i class="pagination-item__icon fas fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
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
                            <a href="#" class="footer-item__link">Hướng Dẫn Mua Hàng</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Hướng Dẫn Bán Hàng</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Thanh Toán</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">DHS Xu</a>
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
                            <a href="#" class="footer-item__link">Giới thiệu về DHS Việt Nam</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Tuyển dụng</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Điều khoản DHS</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Chính Sách Bảo Mật</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Chính Hãng</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Kênh Người Bán</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Chương Trình Tiếp Thị Liên Kết DHS</a>
                        </li>
                        <li class="footer-item">
                            <a href="#" class="footer-item__link">Liên Hệ Truyền Thông</a>
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

                <div class="col l-2-4 m-8 c-6">
                    <h3 class="footer__heading">Tải ứng dụng trên điện thoại</h3>
                    <div class="footer__download">
                        <img src="assets/img/qrcode.png" class="footer__download-qr" alt=""/>
                        <div class="footer__download-apps">
                            <a href="#" class="footer__download-app-link">
                                <img src="assets/img/ch_play.png" class="footer__download-app-img" alt=""/>
                            </a>

                            <a href="#" class="footer__download-app-link">
                                <img src="assets/img/appstore.png" class="footer__download-app-img" alt=""/>
                            </a>
                        </div>
                    </div>
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
<script src="assets/js/jquery-3.3.1.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/owlcarousel/owl.carousel.min.js"></script>
<script src="assets/js/owl.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</body>
</html>