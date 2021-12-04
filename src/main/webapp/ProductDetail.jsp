<%--@elvariable id="amount" type="Model.CartItem"--%>
<%--@elvariable id="account" type="Model.Account"--%>
<%--@elvariable id="product" type="Model.Product"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DHS</title>

    <!-- Logo -->
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/logo/logo.ico">

    <!-- CSS -->
    <link rel="stylesheet" href="assets/css/pages/product.css">
    <link rel="stylesheet" href="assets/css/core.css">
    <link rel="stylesheet" href="assets/css/shortcode/shortcodes.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome/css/all.min.css">

    <!-- Script -->
    <script src="assets/js/jquery-3.3.1.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/owl.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>

<body>
<iframe style="display: none" src="" name="myiframe"></iframe>
<!-- container -->
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
                           href="${pageContext.request.contextPath}/account">Kênh người bán</a>
                    </li>
                </ul>
                <!--rnd header navbar left -->

                <!-- header navbar right -->
                <ul class="header__navbar-list">
                    <% session = request.getSession(false);
                        if (session == null || session.getAttribute("loggedInUser") == null) {%>
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
                        <img src="${pageContext.request.contextPath}/images/${account.avatar}"
                             class="header__navbar-user-img" alt="">
                        <% if (session.getAttribute("username") == null || session.getAttribute("loggedInUser") == null) {%>
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
                <form style="width: 800px" action="search" method="get">
                    <div class="header__search">
                        <div class="header__search-input-wrap">

                            <input type="text" name="searchproduct" class="header__search-input"
                                   placeholder="Nhập để tìm kiếm sản phẩm"/>
                        </div>
                        <button type="submit" class="btn submit header__search-btn">
                            <i class="header__search-btn-icon fas fa-search"></i>
                        </button>

                    </div>
                </form>

                <!-- Cart layout -->
                <div class="header__cart">
                    <div class="header__cart-wrap">
                        <span class="header__cart-notice">3</span>
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
</div>

<!-- Product -->
<div class="container">
    <div class="row">
        <div class="col-md-9">
            <div class="row">
                <div class="col-md-4">
                    <img class="product-img-primary" src="assets/img/product/product_13.png" alt="">
                </div>
                <div class="col-md-8">
                    <div class="product-breadcrumb">
                        Trang chủ / Sản phẩm
                    </div>
                    <a class="non-underline-link" href="#">
                        <h4 class="product-info">${product.title}</h4>
                    </a>
                    <div class="product-star">
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                    </div>
                    <p class="product-current">${product.content}</p>
                    <p class="product-description">${product.decription}</p>
                    <p><h5 class="product-quantity">Shop ${product.shopByShopId.shopname}</h5>
                    <div class="quantity buttons_added">
                        <h5 class="product-quantity">Số lượng</h5>
                    </div>
                    <div class="product__main-info-contact">
                        <%
                            assert session != null;
                            if (session.getAttribute("loggedInUser") == null) {
                        %>
                        <form action="productdetail?action=checkUser" method="post">
                            <input type="submit" value="-" class="minus">
                            <input type="number" step="1" min="1" max="" name="sl" value="${amount}"
                                   class="input-text qty text" size="4" pattern="" inputmode="">
                            <input type="submit" value="+" class="plus">
                            <input type="submit" class="product__main-buy-now" value="Mua Ngay">
                        </form>
                        <% } else { %>
                        <form action="productdetail?action=add" method="post">
                            <input type="submit" value="-" class="minus">
                            <input type="number" step="1" min="1" max="" name="sl" value="${amount}"
                                   class="input-text qty text" size="4" pattern="" inputmode="">
                            <input type="submit" value="+" class="plus">
                            <input type="hidden" value="${product.id}" name="productCode">
                            <input type="submit" class="product__main-buy-now" value="Mua Ngay">
                        </form>
                        <%}%>
                    </div>
                </div>
                <div class="col-md-12 product-tab">
                    <div>
                        <a href="#thongtin" class="product-active non-underline-link"> Thông Tin Chi Tiết </a>
                        <a href="#danhgia" class="review product-tab-link non-underline-link"> Đánh giá </a>
                    </div>
                </div>
                <div id="thongtin" class="col-md-12 product-content-wrap">
                    <p class="text-content">
                        <span class="text-1">Mũ fullface Yohe 967 2 kính</span> là dòng
                        mũ mang phong cách Châu Âu mạnh mẽ. Chiếc mũ này nổi bật ở chất
                        liệu vỏ mũ, chất liệu mặt kính mũ, kiểu dáng thời trang. Tạo nên
                        một dòng mũ bảo hiểm Yohe đậm chất chơi.
                    </p>
                    <p class="text-content">
                        <span class="text-1">Vỏ mũ bảo hiểm Yohe 967</span> được làm từ
                        nhựa ABS nguyên sinh cao cấp nên độ an toàn và độ bền rất cao.
                        Khả năng chịu lực, chịu được va đập mạnh, cứng cáp chống đâm
                        xuyên và cực an toàn.Trên mặt của vỏ mũ mũ bảo hiểm Yohe 965 có
                        lỗ thoáng khí. Bao gồm lỗ thông khí phía trước và lỗ thông khí
                        phía sau.
                    </p>
                    <p class="text-content">
                        <span class="text-1">Không khí trong và ngoài sẽ được lưu thông</span>
                        nhằm hạn chế mùi cũng như sự tích tụ vi khuẩn. Đây là một trong
                        những điểm cộng cho thiết kế của dòng mũ bảo hiểm Yohe mới nhất
                        này.Hơn nữa vỏ mũ bảo hiểm Yohe chính hãng được phủ lớp sơn mỏng
                        bền chống bám bẩn. Vì vậy mà trông mũ lúc nào cũng như mới.
                    </p>
                    <p class="text-content">
                        <span class="text-1">Màu sắc của vỏ mũ bảo hiểm Yohe 965</span>
                        cực kì đẹp. Dáng mũ trông rất thể thao, phong cách, đậm chất hầm
                        hố Châu Âu. Khiến cho những dân chơi xe phải thích thú.
                    </p>
                    <p class="text-content">
                        <span class="text-1">Kính chắn</span> là một trong những điểm vô
                        cùng quan trọng giúp tạo ra một tầm nhìn tốt khi lái xe. Và
                        chiếc mũ mũ bảo hiểm Yohe 965 2 kính 2019 này đã làm được điều
                        đó.Mũ chính hãng gồm 2 kính chắn. Một kính tối ở bên trong có
                        tác dụng làm giảm cường độ sáng, giảm sự nguy hiểm khi đi đường.
                    </p>
                    <p class="text-content">
                        <span class="text-1">Và một kính trong suốt đạt chuẩn</span> ở
                        bên ngoài giúp chắn bụi, chắn côn trùng bay vào mắt. Bảo vệ bạn
                        một cách tốt đa khi di chuyển trên đường.Kính mũ yohe được làm
                        bằng chất liệu PC cao cấp. Vì vậy mà nó rất là bền. Kính mũ bảo
                        hiểm Yohe chính hãng chống trầy tốt, chống đọng sương. Khi đi
                        mùa đông hay đi trời mưa sẽ không lo hơi thở làm đọng sương. Có
                        thể thay thế sau thời gian dài sử dụng.
                    </p>
                    <h5 class="product-conten">
                        Đại lý, cộng tác viên online sản phẩm mũ Yohe
                    </h5>
                    <p class="text-content">
                        Nếu bạn đang tìm đại lý phân phối sản phẩm mũ bảo hiểm yohe
                        chính hãng giá rẻ thì hãy đến với chúng tôi. Tại đây bạn sẽ được
                        hỗ trợ mua hàng như sau :
                    </p>
                    <p class="text-content">
                        Miễn phí vận chuyển. <br/>
                        Sản phẩm được bảo hành uy tín. <br/>
                        Giá sản phẩm cạnh tranh và rẻ hơn thị trường. <br/>
                        Cam kết nguồn gốc sản phẩm, đảm bảo chính hãng. <br/>
                    </p>
                    <p class="text-content">
                        Với kinh nghiệm lâu năm trong nghề,
                        <span class="text-1">DHS</span> tự tin mang đến cho bạn
                        sản phẩm chất lượng tốt nhất.
                    </p>
                </div>
                <div id="danhgia" disabled class="col-md-12 product-content-wrap">
                    <%--@elvariable id="nhanxet" type="java.util.List"--%>
                    <c:forEach items="${nhanxet}" var="elements">
                        <h4 class="product-content">${elements[1]}</h4>
                    </c:forEach>
                    <h5 class="product-conten">Đánh giá của bạn về sản phẩm</h5>
                    <form action="productdetail">
                        <input type="hidden" name="action" value="comment">
                        <div class="rating">
                            <label>
                                <input type="radio" name="stars" value="1"/>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                            </label>
                            <label>
                                <input type="radio" name="stars" value="2"/>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                            </label>
                            <label>
                                <input type="radio" name="stars" value="3"/>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                            </label>
                            <label>
                                <input type="radio" name="stars" value="4"/>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                            </label>
                            <label>
                                <input type="radio" name="stars" value="5"/>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                                <span class="icon-star1"><i class="fas fa-star post__aside-rate"></i></span>
                            </label>
                        </div>
                        <br>
                        <br>
                        <br>
                        <form action="productdetail" method="post">
                            <div style="margin-top: -20px;">
                                <span style="font-size: 1.5em; font-family: sans-serif; display: block; margin-bottom: 5px;">Chủ đề bình luận: </span>
                                <input type="text"
                                       style="width: 100%; height: 30px;margin-bottom: 5px;font-family: sans-serif;font-size: 1.4em;"
                                       name="topiccomment"><br>
                                <span style="font-size: 1.5em; font-family: sans-serif; display: block; margin-bottom: 5px;">Cảm nhận của bạn về sản phẩm: </span>
                                <textarea rows="5" name="comment" id="comment"
                                          style="margin-bottom: 2px;font-family: sans-serif;font-size: 1.4em;width: 100%;"> </textarea><br>
                                <input type="submit" value="comment"
                                       style="width: 150px;height: 30px;border: none;border-radius: 2px;font-size: 1.5rem;cursor: pointer;outline: none;color: var(--text-color);background: #8a2be2;display: inline-flex;justify-content: center;align-items: center;padding: 0 5px;text-align: center;margin: 5px 0 30px;font-weight: bold;">
                            </div>
                        </form>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-3 tl-border">
            <div class="product__aside">
                <img class="product-img" src="assets/img/shipper.png" alt="">
                <p class="product__aside-link-heading">
                    Giao hàng nhanh chóng
                    <span class="text-2">
                            Chỉ trong vòng 24h
                        </span>
                </p>
            </div>
            <div class="product__aside">
                <img class="product-img" src="assets/img/brand.png" alt="">
                <p class="product__aside-link-heading">
                    Sản phẩm chính hãng
                    <span class="text-2">
                            Sản phẩm nhập khẩu 100%
                        </span>
                </p>
            </div>
            <div class="product__aside">
                <img class="product-img" src="assets/img/less.png" alt="">
                <p class="product__aside-link-heading">
                    Mua hàng tiết kiệm
                    <span class="text-2">
                            Rẻ hơn từ 10% đến 30%
                        </span>
                </p>
            </div>
        </div>
    </div>
</div>
<!-- End product -->

<div class="app">
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

    <script>
        $(':radio').change(function () {
            console.log('New star rating: ' + this.value);
        });
        const slide = document.getElementsByClassName("review");
        const review = document.getElementById("danhgia");
    </script>
    <script src="assets/js/quantity.js"></script>
</div>
</body>
</html>
