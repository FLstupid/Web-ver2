<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <link rel="stylesheet" href="css/sellercenter.css"/>
    <title>DHS Product Seller</title>
</head>
<body>
<header class="header-root">
    <section class="header-container">
        <a href="${pageContext.request.contextPath}/home" class="content-logo"><img src="SellerCenter/img/android-chrome-192x192.png" alt=""></a>
        <a href="${pageContext.request.contextPath}/summary" class="style-content">
            <span>Seller Center</span>
        </a>

        <div class="account-avatar">
            <img src="SellerCenter/img/avatar.jfif" alt="">
            <span>Lê Trần Minh Nhựt</span>
        </div>
        <div class="quick-menu">
            <img src="SellerCenter/img/menu.png" height="30px" width="30px" alt="">
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
                    <a href="${pageContext.request.contextPath}/summary">
                        <span>Doanh Thu</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/product" class="is-active">
                        <span>Sản Phẩm</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/bill">
                        <span>Đơn hàng</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/delivery">
                        <span>Vận chuyển</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/reviews">
                        <span>Đánh giá</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/account">
                        <span>Tài khoản</span>
                    </a>
                </li>
            </ul>
        </aside>
        <section class="styles-middle-container has-sidebar">
            <div class="layout-menu">
                <div class="main-content"> PRODUCT
                </div>
            </div>
        </section>
    </section>
</main>
</body>
</html>
