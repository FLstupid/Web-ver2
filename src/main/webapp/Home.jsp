<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <link rel="stylesheet" href="Home/homePage.css" />
    <title>DHS</title>
</head>

<body>
<!---------------------------------------------------header-------------------------------------------->
<header class="style__Header">

    <section class="Container">
        <a
                style="color: white"
                href="${pageContext.request.contextPath}/summary"
        >Kênh Người Bán</a
        >
        <div class="Middle__Wrap">
            <div class="Middle__LeftContainer">
                <div class="logo-menu">
                    <div class="style_Logo">
                        <a href="home" class="dhs-logo">
                            <img src="Home/img/logo.svg" alt="" />
                        </a>
                    </div>
                </div>

                <div class="Category__Root">
                    <div class="Category">
                        <div>
                            <img
                                    class="Category-icon"
                                    src="https://icon-library.com/images/hamburger-icon-white/hamburger-icon-white-16.jpg"
                                    alt=""
                            />
                        </div>
                        <div class="Category-info">
                            <div class="Category-text">
                                Danh mục
                                <p>Sản phẩm</p>
                            </div>
                        </div>
                        <img
                                class="arrowIcon"
                                src="Home/img/dropdownArrow.png"
                                alt=""
                        />
                    </div>
                </div>

                <div class="FormSearch__Root">
                    <div class="FormSearch__Form">
                        <input
                                type="text"
                                placeholder="Find somethings v............... ?"
                                class="FormSearch__Input"
                                value=""
                        />
                        <button class="FormSearch__Button">
                            <img
                                    class="icon-search"
                                    src="https://salt.tikicdn.com/ts/upload/ed/5e/b8/8538366274240326978318348ea8af7c.png"
                                    alt=""
                            />
                            Search
                        </button>
                    </div>
                </div>
                <% session = request.getSession(false);
                    if (session == null || session.getAttribute("loggedInUser") == null) {%>
                <a href="login" style="text-decoration: none; color: whitesmoke;"> Đăng nhập | Đăng ký</a>
                <%} else {%>
                <div class="Userstyle__Root">
                    <div class="Userstyle__Item">
                        <img class="profile-icon" src="Home/img/user.png" alt="" />
                        <a class="Userstyle__ItemText">
                            <span class="Userstyle__NoWrap">Tài khoản</span>
                            <span class="account_laber">
										<div style="display: flex" class="buttonDropdown">
                                            <%
                                                if(session.getAttribute("username") == null || session.getAttribute("loggedInUser") == null){%>
											<span>user-name</span>
                                            <%}else {
                                            %>
                                            <span>${account.username}</span>
                                            <%}%>
											<img class="arrowIcon" src="Home/img/down.png" alt="" />
										</div>
										<div
                                                style="margin-top: 20px"
                                                class="UserHeader_UserDropDown disableForm"
                                        >
											<a
                                                    rel="nofollow"
                                                    href="${pageContext.request.contextPath}/customerorder"
                                            >
												<p
                                                        title="Order history"
                                                        class="UserHeader_UserDropDownItem"
                                                >
													Order history
												</p>
											</a>

											<a
                                                    rel="nofollow"
                                                    href="${pageContext.request.contextPath}/customer"
                                            >
												<p
                                                        title="My account"
                                                        class="UserHeader_UserDropDownItem"
                                                >
													My account
												</p>
											</a>
											<a
                                                    rel="nofollow"
                                                    href="${pageContext.request.contextPath}/changingpassword"
                                            >
												<p
                                                        title="Notification"
                                                        class="UserHeader_UserDropDownItem"
                                                >
													Changing password
												</p>
											</a>
											<a
                                                    rel="nofollow"
                                                    href="${pageContext.request.contextPath}/customerReview"
                                            >
												<p title="Reviews" class="UserHeader_UserDropDownItem">
													"Reviews"
												</p>
											</a>
											<a rel="nofollow" href="logout">
												<p title="Log out" class="UserHeader_UserDropDownItem">
													Log out
												</p>
											</a>
										</div>
									</span>
                        </a>
                    </div>

                    <div class="Userstyle__CartItem">
                        <a
                                href="${pageContext.request.contextPath}/cart"
                                rel="nofollow"
                        >
                            <div class="Userstyle__Item2">
                                <div class="cart-wrapper">
                                    <img
                                            class="cart-icon"
                                            src="https://salt.tikicdn.com/ts/upload/40/44/6c/b80ad73e5e84aeb71c08e5d8d438eaa1.png"
                                    />
                                    <span class="Userstyle__ItemCart">3</span>
                                </div>

                                <span class="cart-text">Giỏ Hàng</span>
                            </div>
                        </a>
                    </div>
                </div>
                <%}%>
            </div>
        </div>
        </div>
    </section>
</header>

<!---------------------------------------------------main-------------------------------------------->

<main style="margin-top: 130px">
    <div class="Container">
        <div class="Tag-root">
            <p>Danh mục nổi bật</p>
            <ul class="list-tag">
                <li>
                    <div class="tag-img">
                        <img
                                src="https://www.kindpng.com/picc/m/43-435202_fresh-healthy-food-png-free-download-transparent-background.png"
                                alt=""
                        />
                    </div>
                    <span>Thực phẩm</span>
                </li>
                <li>
                    <div class="tag-img">
                        <img
                                src="https://binbadecor.com.vn/wp-content/uploads/2020/10/thi%E1%BA%BFt-k%E1%BA%BF-shop-qu%E1%BA%A7n-%C3%A1o-8.jpg"
                                alt=""
                        />
                    </div>
                    <span>Quần áo</span>
                </li>
                <li>
                    <div class="tag-img">
                        <img
                                src="https://cdn.vuahanghieu.com/unsafe/0x900/left/top/smart/filters:quality(90)/https://admin.vuahanghieu.com/upload/product/2019/08/balo-lacoste-men-s-neocroc-canvas-backpack-5d5bbdb84d190-20082019163032.png"
                                alt=""
                        />
                    </div>
                    <span>Balo</span>
                </li>
                <li>
                    <div class="tag-img">
                        <img
                                src="https://kienviet.net/wp-content/uploads/2019/09/cropped-noi-that-dong-gia-1-1440x809.jpg"
                                alt=""
                        />
                    </div>
                    <span>Nội thất</span>
                </li>
                <li>
                    <div class="tag-img">
                        <img
                                src="https://matika.vn/wp-content/uploads/2019/01/nang-tam-can-bep-viet-voi-4-mon-do-gia-dung-matika.jpg"
                                alt=""
                        />
                    </div>
                    <span>Đồ gia dụng</span>
                </li>
            </ul>
        </div>
        <div class="Middle__Wrap">
            <section class="wrapper">
                <div class="products">
                    <ul>
                        <c:forEach items="${listproduct}" var="elements">
                            <li class="main-product">
                                <div class="img-product">
                                    <a href="">
                                        <img
                                                class="img-prd"
                                                src="https://scontent.fsgn5-9.fna.fbcdn.net/v/t39.30808-6/245906105_1235826353561998_6022519217358799438_n.jpg?_nc_cat=102&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=jterUqRxM6YAX-lxdbA&_nc_ht=scontent.fsgn5-9.fna&oh=c27aca8ceb85c6615b3e3f57a6aa1624&oe=619C3B58"
                                                alt=""
                                        />
                                    </a>
                                </div>
                                <div  class="content-product">
                                    <a href="">
                                        <h3   class="content-product-h3">${elements[1]}</h3>
                                    </a>
                                    <span>${elements[3]}</span>
                                    <div class="content-product-deltals">
                                        <div class="price">
                                            <span class="money">${elements[2]}</span>
                                        </div>
                                    </div>
                                </div>
                            </li>


                        </c:forEach>
                    </ul>
                </div>
            </section>
        </div>
    </div>
</main>
<!---------------------------------------------------footer-------------------------------------------->

<script src="js/main.js"></script>
</body>
</html>
