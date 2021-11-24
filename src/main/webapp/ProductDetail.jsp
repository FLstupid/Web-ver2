<%--@elvariable id="amount" type="java"--%>
<%--@elvariable id="product" type="java.Model.Product"--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Sản Phẩm</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <link
            rel="stylesheet"
            href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    />
    <link
            href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500&display=swap"
            rel="stylesheet"
    />
    <link rel="stylesheet" href="fonts/fontawesome/css/all.min.css" />
    <link
            href="https://fonts.googleapis.com/css2?family=Paytone+One&display=swap"
            rel="stylesheet"
    />
    <link rel="stylesheet" href="Product/style.css" />
    <link rel="stylesheet" href="Product/product.css" />
    <link rel="stylesheet" href="owlcarousel/assets/owl.carousel.min.css" />
    <link
            rel="stylesheet"
            href="owlcarousel/assets/owl.theme.default.min.css"
    />
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="owlcarousel/owl.carousel.min.js"></script>
    <script src="js/owl.js"></script>
</head>
<body>
<!-- container -->
<div class="container">
    <!-- menu top -->
    <div class="row">
        <div class="col-md-7 dtl-header">
            <p class="text"><marquee>DHS</marquee></p>
        </div>
        <div class="col-md-5 dtl-header">
            <p class="text-1">Hỏi Đáp</p>
            <p class="text-1">Hướng Dẫn</p>
            <p class="text-1">Đăng ký</p>
            <p class="text-1">Đăng nhập</p>
        </div>
    </div>
    <!-- end menu top -->
    <!-- menu bottom -->
    <div class="row">
        <div class="col-md-3 header__logo">
            <a href="#" class="header__logo-link">
                <img src="#" alt="Logo" class="header__logo-img" />
            </a>
        </div>
        <div class="col-md-6 header__search">
            <select name="" id="" class="header__search-select">
                <option value="0">All</option>
                <option value="1">Mũ bảo hiểm</option>
                <option value="2">Găng tay</option>
                <option value="3">Áo phượt</option>
                <option value="4">Giày phượt</option>
                <option value="5">Balo phượt</option>
            </select>
            <input
                    type="text"
                    class="header__search-input"
                    placeholder="Tìm kiếm tại đây..."
            />
            <button class="header__search-btn">
                <div class="header__search-icon-wrap">
                    <i class="fas fa-search header__search-icon"></i>
                </div>
            </button>
        </div>
        <div class="col-md-2 header__call">
            <div class="header__call-icon-wrap">
                <i class="fas fa-phone-alt header__call-icon"></i>
            </div>
            <div class="header__call-info">
                <div class="header__call-text">Gọi điện tư vấn</div>
                <div class="header__call-number">0352.860.701</div>
            </div>
        </div>
        <div class="col-md-1 header__cart">
            <a href="cart.jsp">
                <span class="header__notice">4</span>
                <i class="fas fa-shopping-cart header__nav-cart-icon"></i>
            </a>
        </div>
    </div>
    <!-- end menu bottom -->
    <div class="row">
        <div class="col-md-3 header__nav-menu-wrap">
            <i class="fas fa-bars header__nav-menu-icon"></i>
            <div class="header__nav-menu-title">Danh mục sản phẩm</div>
        </div>
        <div class="col-md-9 header__nav">
            <ul class="header__nav-list">
                <li class="header__nav-item">
                    <a href="Home.jsp" class="header__nav-link">Trang chủ</a>
                </li>
                <li class="header__nav-item">
                    <a href="#" class="header__nav-link">Giới thiệu</a>
                </li>
                <li class="header__nav-item">
                    <a href="#" class="header__nav-link">Sản phẩm</a>
                </li>
                <li class="header__nav-item">
                    <a href="#" class="header__nav-link">Bài viết</a>
                </li>
                <li class="header__nav-item">
                    <a href="#" class="header__nav-link">Tuyển cộng tác viên</a>
                </li>
                <li class="header__nav-item">
                    <a href="#" class="header__nav-link">Liên hệ</a>
                </li>
            </ul>
        </div>
    </div>
    <!-- end -->
    <!-- product -->
    <div class="row">
        <div class="col-md-9">
            <div class="row">
                <div class="col-md-4">
                    <img class="product-img-primary" src="images/product_13.png"  alt=""/>
                    <img class="product-img-list" src="images/product_13.png"  alt=""/>
                    <img class="product-img-list" src="images/product_15.jpg"  alt=""/>
                    <img class="product-img-list" src="images/product_16.jpg"  alt=""/>
                    <img class="product-img-list" src="images/product_17.jpg"  alt=""/>
                </div>

                <div class="col-md-8">
                    <div class="product-breadcrumb">Trang chủ / Sản phẩm</div>
                        <h4 class="product-info">
                        ${product.title}
                    </h4>
                    <div class="product-star">
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                        <i class="fas fa-star product__main-info-rate"></i>
                    </div>
                    <p class="product-current">${product.content}</p>
                    <p class="product-description">
                        ${product.decription}
                    </p>
                    <p class="discount">
                      Discount: 3
                    </p>
                    <p class="Shopname">
                        Shop: ${product.shopByShopId}
                    </p>
                    <input class="cart__body-quantity-total" name="amount" type="number" value="1"/>
                    <button type="button" class="btn btn-kx" formmethod="post" formaction="add">
                        <%
                            if(session.getAttribute("loggedInUser") == null){%>
                     <a style="color: white; text-decoration: none"  href="cart?action=checkUser&amp;productCode=${product.id}" >
                         Cập nhật giỏ hàng
                     </a>
                        <%}else {
                        %>
                        <a style="color: white; text-decoration: none"  href="productdetail?action=add&amp;productCode=${product.id}" >Cập nhật giỏ hàng <%-- --%>
                        </a><%}%>
                    </button>
                    <div class="product__main-info-contact">
                        <div class="product__main-info-contact-phone-icon">
                            <i class="fas fa-phone-alt"></i>
                            <div class="product__main-info-contact-phone-title">
                                Gọi điện tư vấn
                            </div>
                            <div class="product__main-info-contact-phone-number">
                                ( 0352.860.701)
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-12 product-tab">
                    <div>
                        <a href="#thongtin" class="product-active"> Thông Tin Chi Tiết </a>
                        <a href="#danhgia"  class="review product-tab-link"> Đánh giá </a>
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
								<span class="text-1"
                                >Không khí trong và ngoài sẽ được lưu thông</span
                                >
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
                        Miễn phí vận chuyển. <br />
                        Sản phẩm được bảo hành uy tín. <br />
                        Giá sản phẩm cạnh tranh và rẻ hơn thị trường. <br />
                        Cam kết nguồn gốc sản phẩm, đảm bảo chính hãng. <br />
                    </p>
                    <p class="text-content">
                        Với kinh nghiệm lâu năm trong nghề,
                        <span class="text-1">DHS</span> tự tin mang đến cho bạn
                        sản phẩm chất lượng tốt nhất.
                    </p>
                </div>
                <div id="danhgia" disabled class="col-md-12 product-content-wrap">
                    <c:forEach items="${nhanxet}" var="elements">
                        <h4 class="product-content">
                                ${elements[1]}
                        </h4>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="col-md-3 tl-border">
            <div class="product__aside">
                <img class="product-img" src="images/shipper.png"  alt=""/>
                <p class="product__aside-link-heading">
                    Giao hàng nhanh chóng
                    <span class="text-2"> Chỉ trong vòng 24h </span>
                </p>
            </div>
            <div class="product__aside">
                <img class="product-img" src="images/brand.png"  alt=""/>
                <p class="product__aside-link-heading">
                    Sản phẩm chính hãng
                    <span class="text-2"> Sản phẩm nhập khẩu 100% </span>
                </p>
            </div>
            <div class="product__aside">
                <img class="product-img" src="images/less.png"  alt=""/>
                <p class="product__aside-link-heading">
                    Mua hàng tiết kiệm
                    <span class="text-2"> Rẻ hơn từ 10% đến 30% </span>
                </p>
            </div>
        </div>
    </div>
</div>
    <!-- end product love -->
<script>
    const slide = document.getElementsByClassName("review");
    const review = document.getElementById("danhgia");
</script>
</body>
</html>
