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

    <!-- Script -->
    <script src="assets/js/jquery-3.3.1.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/owlcarousel/owl.carousel.min.js"></script>
    <script src="assets/js/owl.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
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
                        <a class="header__navbar-item header__navbar-item--separate"
                           href="${pageContext.request.contextPath}/summary">Kênh người bán</a>
                    </li>
                    <li class="
									header__navbar-item
									header__navbar-item--has-qr
									header__navbar-item--separate
								">
                        Tải ứng dụng
                        <!-- Header QR Code -->
                        <div class="header__qr">
                            <img src="./assets/img/qrcode.png" alt="QR Code" class="header__qr-img"/>
                            <div class="header__qr-apps">
                                <a href="" class="header__qr-link">
                                    <img src="./assets/img/ch_play.png" alt="Google Play"
                                         class="header__qr-download-img"/>
                                </a>
                                <a href="" class="header__qr-link">
                                    <img src="./assets/img/appstore.png" alt="App Store"
                                         class="header__qr-download-img"/>
                                </a>
                            </div>
                        </div>
                    </li>
                    <li class="header__navbar-item">
                        <div class="header__navbar-title--no-pointer">Kết nối</div>
                        <a href="" class="header__navbar-icon-link">
                            <i class="header__navbar-icon fab fa-facebook"></i>
                        </a>
                        <a href="" class="header__navbar-icon-link">
                            <i class="header__navbar-icon fab fa-instagram"></i>
                        </a>
                    </li>
                </ul>
                <!--rnd header navbar left -->

                <!-- header navbar right -->
                <!-- Thông báo -->
                <ul class="header__navbar-list">
                    <li class="header__navbar-item header__navbar-item--has-notify">
                        <a href="#" class="header__navbar-item-link">
                            <i class="header__navbar-icon far fa-bell"></i>
                            Thông báo
                        </a>
                        <% session=request.getSession(false); if (session==null || session.getAttribute("loggedInUser")==null) {%>
                        <div class="header__notify">
                            <ul class="header__notify-list">
                                <li class="header__notify-item1">
                                    <a href="#" class="header__notify-link1">
                                        <img src="assets/img/register_notify.png"
                                             alt=""
                                             class="header__notify-img_registration"
                                        />
                                    </a>
                                </li>
                            </ul>
                            <div class="header__notify-footer">
                                <a href="#" class="header__notify-caption">Đăng nhập để xem Thông báo</a>
                            </div>
                            <div class="header__notify-footer">
                                <a href="login" class="header__notify-footer-registration">Đăng nhập</a>
                                <a href="login" class="header__notify-footer-registration">Đăng ký</a>
                            </div>
                        </div>
                        <%} else { %>
                        <div class="header__notify">
                            <header class="header__notify-header">
                                <h3>Thông báo mới nhận</h3>
                            </header>
                            <ul class="header__notify-list">
                                <li class="header__notify-item header__notify-item--viewed">
                                    <a href="#" class="header__notify-link">
                                        <img src="assets/img/prd/prd_img_3.jpg" alt="" class="header__notify-img">
                                        <div class="header__notify-info">
                                            <div class="header__notify-name">4 ký do bạn phải sử dụng kem chống nắng
                                                thường xuyên</div>
                                            <div class="header__notify-description">Nhiều người vẫn cho rằng kem
                                                chống nắng chỉ sử dụng khi có ánh nắng mặt trời, còn khi thời tiết
                                                lạnh, râm</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__notify-item">
                                    <a href="#" class="header__notify-link">
                                        <img src="assets/img/prd/prd_img_2.jpg" alt="" class="header__notify-img">
                                        <div class="header__notify-info">
                                            <div class="header__notify-name">4 ký do bạn phải sử dụng kem chống nắng
                                                thường xuyên</div>
                                            <div class="header__notify-description">Nhiều người vẫn cho rằng kem
                                                chống nắng chỉ sử dụng khi có ánh nắng mặt trời, còn khi thời tiết
                                                lạnh, râm</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__notify-item header__notify-item--viewed">
                                    <a href="#" class="header__notify-link">
                                        <img src="assets/img/prd/prd_img_4.jpg" alt="" class="header__notify-img">
                                        <div class="header__notify-info">
                                            <div class="header__notify-name">4 ký do bạn phải sử dụng kem chống nắng
                                                thường xuyên</div>
                                            <div class="header__notify-description">Nhiều người vẫn cho rằng kem
                                                chống nắng chỉ sử dụng khi có ánh nắng mặt trời, còn khi thời tiết
                                                lạnh, râm</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="header__notify-item">
                                    <a href="#" class="header__notify-link">
                                        <img src="assets/img/prd/prd_img_8.jpg" alt="" class="header__notify-img">
                                        <div class="header__notify-info">
                                            <div class="header__notify-name">4 ký do bạn phải sử dụng kem chống nắng
                                                thường xuyên</div>
                                            <div class="header__notify-description">Nhiều người vẫn cho rằng kem
                                                chống nắng chỉ sử dụng khi có ánh nắng mặt trời, còn khi thời tiết
                                                lạnh, râm</div>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                            <div class="header__notify-footer">
                                <a href="#" class="header__notify-footer-link">Xem tất cả</a>
                            </div>
                        </div>
                        <%}%>
                    </li>

                    <!-- Trợ giúp -->
                    <li class="header__navbar-item">
                        <a href="" class="header__navbar-item-link">
                            <i class="header__navbar-icon far fa-question-circle"></i>
                            Trợ giúp
                        </a>
                    </li>

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
                        <span class="home-filter__label">Sắp xếp theo</span>
                        <button class="home-filter__btn btn1">Phổ biến</button>
                        <button class="home-filter__btn btn1 btn--primary">
                            Mới nhất
                        </button>
                        <button class="home-filter__btn btn1">Bán chạy</button>
                        <div class="select-input">
                            <span class="select-input__label">Giá</span>
                            <i class="select-input__icon fas fa-angle-down"></i>
                            <!-- List option -->
                            <ul class="select-input__list">
                                <li class="select-input__item">
                                    <a href="#" class="select-input__link">Giá: Thấp đến cao</a>
                                </li>
                                <li class="select-input__item">
                                    <a href="#" class="select-input__link">Giá: Cao đến thấp</a>
                                </li>
                            </ul>
                        </div>

                        <div class="home-filter__page">
								<span class="home-filter__page-num">
									<span class="home-filter__page-current">1</span>/
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
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_3.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Mũ 3/4 YOHE 878 2 Kính Thời Thượng
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">1.400.000đ</span>
                                        <span class="home-product-item__price-current">1.300.000₫</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Yohe</span>
                                        <span class="home-product-item__origin-name">Thái Lan</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">10%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_2.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Mũ 3/4 YOHE 878 2 Kính Thời Thượng
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">1.200.000đ</span>
                                        <span class="home-product-item__price-current">900.000đ</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Yohe</span>
                                        <span class="home-product-item__origin-name">Thái Lan</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">10%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_4.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Mũ Fullface LS2 Rapid FF353
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">1.700.000đ</span>
                                        <span class="home-product-item__price-current">1.500.000₫</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">LS2</span>
                                        <span class="home-product-item__origin-name">Trung Quốc</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">10%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_5.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Áo khoác giáp bảo hộ cho nữ HJS303F đẹp bền dễ chịu
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">3.500.000đ</span>
                                        <span class="home-product-item__price-current">3.300.000₫</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">QC</span>
                                        <span class="home-product-item__origin-name">Việt Nam</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">12%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_6.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Áo khoác giáp phượt cho Nam
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">4.200.000đ</span>
                                        <span class="home-product-item__price-current">3.850.000₫</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Whoo</span>
                                        <span class="home-product-item__origin-name">Nhật Bản</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">15%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_1.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Mũ bảo hiểm Roc R01 Màu Xanh Lá | Tặng Pinlock
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">1.800.000đ</span>
                                        <span class="home-product-item__price-current">1.730.000₫</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Yamaha</span>
                                        <span class="home-product-item__origin-name">Mỹ</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">4%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_8.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Quần giáp Jeans bảo hộ đi motor,phượt Komine
                                        (Đen) Quần giáp Jeans bảo hộ đi motor, phượt Komine (Đen)
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">1.200.000đ</span>
                                        <span class="home-product-item__price-current">900.000</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Whoo</span>
                                        <span class="home-product-item__origin-name">Nhật Bản</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">10%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_7.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Găng tay da cao cấp HGL200M Full ngón
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">1.800.000đ</span>
                                        <span class="home-product-item__price-current">1.730.000₫</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Yamaha</span>
                                        <span class="home-product-item__origin-name">Mỹ</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">10%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_9.jpg)"></div>
                                    <h4 class="home-product-item__name">
                                        Găng tay moto,xe máy gù carbon Komine GK160
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">1.400.000đ</span>
                                        <span class="home-product-item__price-current">1.300.000₫</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Whoo</span>
                                        <span class="home-product-item__origin-name">Nhật Bản</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">10%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
                            <div class="col1 l-2-4 m1-4 c-6">
                                <a class="home-product-item" href="#">
                                    <div class="home-product-item__img"
                                         style="background-image: url(assets/img/prd/prd_img_10.png)"></div>
                                    <h4 class="home-product-item__name">
                                        Mũ fullface Ls2 Stream FF320 Axis Matt Black Yellow
                                    </h4>
                                    <div class="home-product-item__price">
                                        <span class="home-product-item__price-old">3.200.000đ</span>
                                        <span class="home-product-item__price-current">2.599.000đ</span>
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
                                        <div class="home-product-item__rating">
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                            <i class="fas fa-star home-product-item__star--gold"></i>
                                        </div>
                                        <span class="home-product-item__sold">22 đã bán</span>
                                    </div>
                                    <div class="home-product-item__origin">
                                        <span class="home-product-item__brand">Whoo</span>
                                        <span class="home-product-item__origin-name">Nhật Bản</span>
                                    </div>
                                    <div class="home-product-item__favourite">
                                        <i class="fas fa-check"></i>
                                        <span>Yêu thích</span>
                                    </div>
                                    <div class="home-product-item__sale-off">
                                        <span class="home-product-item__sale-off-percent">20%</span>
                                        <span class="home-product-item__sale-off-label">GIẢM</span>
                                    </div>
                                </a>
                            </div>
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
</body>
</html>