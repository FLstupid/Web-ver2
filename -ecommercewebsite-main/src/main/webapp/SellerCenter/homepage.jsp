<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="HomePage.css"/>
    <title>DHS Seller Center</title>
</head>
<body>
<header class="header-root">
    <section class="header-container">
        <a href="homepage.jsp" class="content-logo"><img src="img/android-chrome-192x192.png" alt=""></a>
        <a href="homepage.jsp" class="style-content">
            <span>Seller Center</span>
        </a>

        <div class="account-avatar">
            <img src="img/avatar.jfif" alt="">
            <span>Lê Trần Minh Nhựt</span>
        </div>
        <div class="quick-menu">
            <img src="img/menu.png" height="30px" width="30px" alt="">
            <!--<div>Icons made by
                <a href="https://www.flaticon.com/authors/pixel-perfect" title="Pixel perfect">Pixel perfect</a>
                from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a>
            </div>
            -->
            <div class="dropdown"></div>
            <div class="dropdown-menu">
                <div class="dropdown-content">
                    <div class="category-dropdown-box">
                        <span>a</span>
                    </div>
                    <div class="category-dropdown-box">
                        <span>b</span>
                    </div>
                    <div class="category-dropdown-box">
                        <span>c</span>
                    </div>
                    <div class="category-dropdown-box">
                        <span>d</span>
                    </div>
                    <div class="category-dropdown-box">
                        <span>e</span>
                    </div>
                    <div class="category-dropdown-box">
                        <span>e</span>
                    </div>
                </div>
            </div>
        </div>
    </section>
</header>
<main>
    <section class="layout-container">
        <aside class="styles-left-SideBar">
            <ul class="nav-bar-account">
                <li>
                    <a href="homepage.jsp" class="is-active">
                        <span>Doanh Thu</span>
                    </a>
                </li>
                <li>
                    <a href="product.jsp">
                        <span>Sản Phẩm</span>
                    </a>
                </li>
                <li>
                    <a href="bill.jsp">
                        <span>Đơn hàng</span>
                    </a>
                </li>
                <li>
                    <a href="delivery.jsp">
                        <span>Vận chuyển</span>
                    </a>
                </li>
                <li>
                    <a href="reviews.jsp">
                        <span>Đánh giá</span>
                    </a>
                </li>
                <li>
                    <a href="account.jsp">
                        <span>Tài khoản</span>
                    </a>
                </li>
            </ul>
        </aside>
        <section class="styles-middle-container has-sidebar">
            <div class="layout-menu">
                <div class="main-content">
                    <div class="content-1">
                        <h3 class="title">Tổng quan</h3>
                        <div class="content-1-wapper">
                            <div class="to-do-box" style="max-height: 180px; overflow: hidden;transition:max-height 0.3s ease 0s;">
                                <a class="to-do-box-item" href="#">
                                    <p class="item-title">0</p>
                                    <p class="item-desc">Chờ Xác Nhận</p>
                                </a>
                                <a class="to-do-box-item" href="#">
                                    <p class="item-title">0</p>
                                    <p class="item-desc">Chờ Lấy Hàng</p>
                                </a>
                                <a class="to-do-box-item" href="#">
                                    <p class="item-title">0</p>
                                    <p class="item-desc">Đã Xử Lý</p>
                                </a>
                                <a class="to-do-box-item" href="#">
                                    <p class="item-title">0</p>
                                    <p class="item-desc">Đơn Hủy</p>
                                </a>
                                <a class="to-do-box-item" href="#">
                                    <p class="item-title">0</p>
                                    <p class="item-desc">Sản Phẩm Bị Tạm Khóa</p>
                                </a>
                                <a class="to-do-box-item" href="#">
                                    <p class="item-title">0</p>
                                    <p class="item-desc">Sản Phẩm Hết Hàng</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="content-2">
                        <h3 class="title">Thống kê</h3>
                        <div class="content-2-wapper">
                            <div class="statistic">
                                <div class="statistic-item">
                                    <p>Đã bán</p>
                                    <p>0</p>
                                </div>
                                <div class="statistic-item">
                                    <p>Còn lại</p>
                                    <p>0</p>
                                </div>
                                <div class="statistic-item">
                                    <p>Doanh thu</p>
                                    <p>0</p>
                                </div>
                            </div>
                            <div class="content-2-detail">
                                <div class="detail-box" style="max-height: 200px; overflow: hidden;transition:max-height 0.3s ease 0s;">
                                    <div class="detail-box-item">
                                        <p class="detail-title">Lượt truy cập</p>
                                        <p class="detail-data">0</p>
                                        <p class="detail-title-2">Vs hôm qua 0.00%</p>
                                    </div>
                                    <div class="detail-box-item">
                                        <p class="detail-title">Lượt xem</p>
                                        <p class="detail-data">0</p>
                                        <p class="detail-title-2">Vs hôm qua 0.00%</p>
                                    </div>
                                    <div class="detail-box-item">
                                        <p class="detail-title">Đơn hàng</p>
                                        <p class="detail-data">0</p>
                                        <p class="detail-title-2">Vs hôm qua 0.00%</p>
                                    </div>
                                    <div class="detail-box-item">
                                        <p class="detail-title">Tỷ lệ chuyển đổi</p>
                                        <p class="detail-data">0</p>
                                        <p class="detail-title-2">Vs hôm qua 0.00%</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </section>
</main>
</body>
</html>