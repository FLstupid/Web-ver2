
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>UserCenter</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <link rel="stylesheet" href="css/newcss.css" />
    <link rel="stylesheet" href="Home/homePage.css"/>
</head>
<body>
<!---------------------------------------------------header-------------------------------------------->
<header class="style__Header">
    <section class="Container">
        <a style="color: white" href="${pageContext.request.contextPath}/summary">Kênh Người Bán</a>
        <div class="Middle__Wrap">
            <div class="Middle__LeftContainer">
                <div class="logo-menu">
                    <div class="style_Logo">
                        <a href="home" class="dhs-logo">
                            <img src="Home/img/logo.svg" alt=""/>
                        </a>
                    </div>
                </div>

                <div class="Category__Root">
                    <div class="Category">
                        <div>
                            <img class="Category-icon" src="https://icon-library.com/images/hamburger-icon-white/hamburger-icon-white-16.jpg"  alt="">
                        </div>
                        <div class="Category-info">
                            <div class="Category-text">Danh mục
                                <p>Sản phẩm</p>
                            </div>

                        </div>
                        <img class="arrowIcon" src="Home/img/dropdownArrow.png" alt=""/>
                    </div>
                </div>

                <div class="FormSearch__Root">
                    <div class="FormSearch__Form">
                        <input type="text" placeholder="Find somethings v............... ?" class="FormSearch__Input" value="" />
                        <button class="FormSearch__Button">
                            <img class="icon-search"
                                 src="https://salt.tikicdn.com/ts/upload/ed/5e/b8/8538366274240326978318348ea8af7c.png"  alt=""/>
                            Search
                        </button>
                    </div>
                </div>

                <div class="Userstyle__Root">
                    <div class="Userstyle__Item">
                        <img class="profile-icon" src="Home/img/user.png" alt=""/>
                        <a class="Userstyle__ItemText" >
                            <span class="Userstyle__NoWrap">Tài khoản</span>
                            <span class="account_laber">
                <div style="display: flex" class="buttonDropdown">
                <span>user-name</span>
                <img class="arrowIcon" src="Home/img/down.png" alt=""/>
                </div>
                <div style="margin-top: 20px;" class="UserHeader_UserDropDown disableForm">
                  <a rel="nofollow" href="${pageContext.request.contextPath}/customerorder">
                    <p title="Order history" class="UserHeader_UserDropDownItem">
                      Order history
                    </p>
                  </a>

                  <a rel="nofollow" href="${pageContext.request.contextPath}/customer">
                    <p title="My account" class="UserHeader_UserDropDownItem">
                      My account
                    </p>
                  </a>
                   <a rel="nofollow" href="${pageContext.request.contextPath}/changingpassword">
                    <p title="Notification" class="UserHeader_UserDropDownItem">
                      Changing password
                    </p>
                  </a>
                  <a rel="nofollow" href="${pageContext.request.contextPath}/customerReview">
                    <p title="Reviews" class="UserHeader_UserDropDownItem">
                      "Reviews"
                    </p>
                  </a>
                  <a rel="nofollow" href="">
                    <p title="Log out" class="UserHeader_UserDropDownItem">
                      Log out
                    </p>
                  </a>
                </div>
              </span>
                        </a>
                    </div>

                    <div class="Userstyle__CartItem">
                        <a href="${pageContext.request.contextPath}/cart" rel="nofollow">
                            <div class="Userstyle__Item2">
                                <div class="cart-wrapper">
                                    <img class="cart-icon"
                                         src="https://salt.tikicdn.com/ts/upload/40/44/6c/b80ad73e5e84aeb71c08e5d8d438eaa1.png"  />
                                    <span class="Userstyle__ItemCart">3</span>
                                </div>

                                <span class="cart-text">Giỏ Hàng</span>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section>
</header>
<!---------------------------------------------------main-------------------------------------------->
<main>
    <section class="Container">
        <div class="Account_Layout">
            <div class="breadcrumb_Container"></div>
            <aside class="Account_StylesSideBar">
                <div class="Account_StylesAvatar">

                    <div class=" file1 temp" style="width: 10%; margin-top: 10px">
                        <img class="avt"  id="photo" src="img/logo_ico.png">
                        <div class="Btnclick">
                            <input type="file" id="file" name="img" >
                            <label  for="file" id="uploadBtn">Choose Avatar</label>
                        </div>
                    </div>
                    <div style="margin-left: 100px" class="info">
                        Tài Khoản
                        <strong>user-name</strong>
                    </div>
                </div>

                <ul class="Account_NavBar">
                    <li><a  class="is-active" href="customer"><span>Thông tin tài khoản</span></a></li>
                    <li><a    href="changingpassword"><span>Đổi mật khẩu</span></a></li>
                    <li><a   href="customerorder"><span>Quản lý đơn hàng</span></a></li>
                    <li><a  href="addresslist"><span>Sổ địa chỉ</span></a></li>
                    <li><a  href="customerReview"><span>Nhận xét sản phẩm đã mua</span></a></li>
                    <li><a   href="buyinglater"><span>Sản phẩm mua sau</span></a></li>
                </ul>
            </aside>
            <div class="Account_StylesAccountLayoutInner">
                <div class="account formresult ">
                    <h3 class="HeadingContent">Thông Tin Tài Khoản</h3>
                    <div class="Content_StylesNav">
                        <form method="post" action="customer">
                            <input type="hidden" name="action" value="add">
                            <div class="form-control">
                                <label class="input-label">Họ tên</label>
                                <div>
                                    <input type="text" name="fullName"  maxlength="128" class="Input-styles" value="${account.username}">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label">Mật khẩu</label>
                                <div>
                                    <input type="password" name="password"  maxlength="128" minlength="6" class="Input-styles"  value="${account.passwordHash}">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label">Số điện thoại</label>
                                <div>
                                    <input type="tel"  name="phoneNumber"  class="Input-styles" value="${account.phone} ">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label">Email</label>
                                <div>
                                    <input type="email" name="email" class="Input-styles" value="${account.email}">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label sexcheck">Giới tính</label>
                                <label  class="Radio_StylesRadio">
                                    <input type="radio" name="gender" value="male" checked>
                                    <span class="radio-fake"></span>
                                    <span class="label">Nam</span>
                                </label>
                                <label style="margin-left: 15px" class="Radio_StylesRadio">
                                    <input type="radio" name="gender" value="female">
                                    <span class="label">Nữ</span>
                                </label>
                            </div>
                            <div class="form-control">
                                <label class="input-label">
                                    <p>Ngày sinh</p>
                                </label>
                                <div class="styles_StylesBirthdayPicker">
                                    <select id="day"  class="selectday" name="day">
                                        <option name="day1" value="0" selected>Ngày</option>
                                        <option name="day1" value="1" >1</option>
                                        <option name="day1" value="2">2</option>
                                        <option name="day1" value="3">3</option>
                                        <option name="day1" value="4">4</option>
                                        <option name="day1" value="5">5</option>
                                        <option name="day1" value="6">6</option>
                                        <option name="day1" value="7">7</option>
                                        <option name="day1" value="8">8</option>
                                        <option name="day1" value="9">9</option>
                                        <option name="day1" value="10">10</option>
                                        <option name="day1" value="11">11</option>
                                        <option name="day1" value="12">12</option>
                                        <option name="day1" value="13">13</option>
                                        <option name="day1" value="14">14</option>
                                        <option name="day1" value="15">15</option>
                                        <option name="day1" value="16">16</option>
                                        <option name="day1" value="17">17</option>
                                        <option name="day1" value="18">18</option>
                                        <option name="day1" value="19">19</option>
                                        <option name="day1" value="20">20</option>
                                        <option name="day1" value="21">21</option>
                                        <option name="day1" value="22">22</option>
                                        <option name="day1" value="23">23</option>
                                        <option name="day1" value="24">24</option>
                                        <option name="day1" value="25">25</option>
                                        <option name="day1" value="26">26</option>
                                        <option name="day1" value="27">27</option>
                                        <option name="day1" value="28">28</option>
                                        <option name="day1" value="29">29</option>
                                        <option name="day1" value="30">30</option>
                                        <option name="day1" value="31">31</option>
                                    </select>
                                    <select class="selectmonth" name="month"  >
                                        <option name="month1" value="" selected>Tháng</option>
                                        <option name="month1"  value="1" >1</option>
                                        <option name="month1" value="2">2</option>
                                        <option name="month1" value="3">3</option>
                                        <option name="month1" value="4">4</option>
                                        <option name="month1" value="5">5</option>
                                        <option name="month1" value="6">6</option>
                                        <option name="month1" value="7">7</option>
                                        <option name="month1" value="8">8</option>
                                        <option name="month1" value="9">9</option>
                                        <option name="month1" value="10">10</option>
                                        <option name="month1" value="11">11</option>
                                        <option name="month1" value="12">12</option>
                                    </select>
                                    <select style=" margin-left: 20px" class="selectyear" name="year">
                                        <option name="year" value="" selected>Năm</option>
                                        <option name="year" value="2021">2021</option>
                                        <option name="year" value="2020">2020</option>
                                        <option name="year" value="2021">2019</option>
                                        <option name="year" value="2020">2018</option>
                                        <option name="year" value="2021">2017</option>
                                        <option name="year" value="2020">2016</option>
                                        <option name="year" value="2021">2015</option>
                                        <option name="year" value="2020">2014</option>
                                        <option name="year" value="2021">2013</option>
                                        <option name="year" value="2020">2012</option>
                                        <option name="year" value="2021">2011</option>
                                        <option name="year" value="2020">2010</option>
                                        <option name="year" value="2021">2009</option>
                                        <option name="year" value="2020">2008</option>
                                        <option name="year" value="2021">2007</option>
                                        <option name="year" value="2020">2006</option>
                                        <option name="year" value="2021">2005</option>
                                        <option name="year" value="2020">2004</option>
                                        <option name="year" value="2021">2003</option>
                                        <option name="year" value="2020">2002</option>
                                        <option name="year" value="2021">2001</option>
                                        <option name="year" value="2020">2000</option>
                                        <option name="year" value="2020">1999</option>
                                        <option name="year" value="2020">1998</option>
                                        <option name="year" value="2020">1997</option>
                                        <option name="year" value="2020">1996</option>
                                        <option name="year" value="2020">1995</option>
                                        <option name="year" value="2020">1994</option>
                                        <option name="year" value="2020">1993</option>
                                        <option name="year" value="2020">1992</option>
                                        <option name="year" value="2020">1991</option>
                                        <option name="year" value="2020">1990</option>
                                        <option name="year" value="2020">1989</option>
                                        <option name="year" value="2020">1988</option>
                                        <option name="year" value="2020">1987</option>
                                        <option name="year" value="2020">1986</option>
                                        <option name="year" value="2020">1985</option>
                                        <option name="year" value="2020">1984</option>
                                        <option name="year" value="2020">1983</option>
                                        <option name="year" value="2020">1982</option>
                                        <option name="year" value="2020">1981</option>
                                        <option name="year" value="2020">1980</option>
                                        <option name="year" value="2020">1979</option>
                                        <option name="year" value="2020">1978</option>
                                        <option name="year" value="2020">1977</option>
                                        <option name="year" value="2020">1976</option>
                                        <option name="year" value="2020">1975</option>
                                        <option name="year" value="2020">1974</option>
                                        <option name="year" value="2020">1973</option>
                                        <option name="year" value="2020">1972</option>
                                        <option name="year" value="2020">1971</option>
                                        <option name="year" value="2020">1970</option>
                                        <option name="year" value="2020">1969</option>
                                        <option name="year" value="2020">1968</option>
                                        <option name="year" value="2020">1967</option>
                                        <option name="year" value="2020">1966</option>
                                        <option name="year" value="2020">1965</option>
                                        <option name="year" value="2020">1964</option>
                                        <option name="year" value="2020">1963</option>
                                        <option name="year" value="2020">1962</option>
                                        <option name="year" value="2020">1961</option>
                                        <option name="year" value="2020">1960</option>
                                        <option name="year" value="2020">1959</option>
                                        <option name="year" value="2020">1958</option>
                                        <option name="year" value="2020">1957</option>
                                        <option name="year" value="2020">1956</option>
                                        <option name="year" value="2020">1955</option>
                                        <option name="year" value="2020">1954</option>
                                        <option name="year" value="2020">1953</option>
                                        <option name="year" value="2020">1952</option>
                                        <option name="year" value="2020">1951</option>
                                        <option name="year" value="2020">1950</option>
                                    </select>
                                </div>

                            </div>

                            <div class="form-control">
                                <label class="input-label">&nbsp;</label>
                                <button type="submit" class="btn-submit">Cập nhật</button>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
        </div>
    </section>
</main>
<!---------------------------------------------------footer-------------------------------------------->
<script src="js/main.js">
</script>
</body>
</html>
