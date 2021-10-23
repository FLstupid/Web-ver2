
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <li><a   href="customer"><span>Thông tin tài khoản</span></a></li>
                    <li><a    href="changingpassword"><span>Đổi mật khẩu</span></a></li>
                    <li><a   href="customerorder"><span>Quản lý đơn hàng</span></a></li>
                    <li><a class="is-active"  href="addaddress"><span>Sổ địa chỉ</span></a></li>
                    <li><a  href="customerReview"><span>Nhận xét sản phẩm đã mua</span></a></li>
                    <li><a   href="buyinglater"><span>Sản phẩm mua sau</span></a></li>
                </ul>
            </aside>
            <div class="Account_StylesAccountLayoutInner">
                <div style="width: 970px;" id="addadress" class="themdiachi ">
                    <h3 class="HeadingContent">Thêm địa chỉ</h3>

                    <div class="Content_StylesNav">

                        <form class="formthemdiachi">
                            <div class="form-control ">
                                <label for="fullName" class="input-label">Họ và tên:</label>
                                <div>
                                    <input class="inputdiachi" type="text" required="" name="fullName" placeholder="Nhập họ và tên" maxlength="50" class="Input-sc-17i9bto-0 girQwT" value="Minh Hoàng">
                                </div>
                            </div>
                            <div class="form-control"><label for="company" class="input-label">Công ty:</label>
                                <input class="inputdiachi" type="text" name="company" placeholder="Nhập công ty" class="Input-sc-17i9bto-0 girQwT" value="">
                            </div>
                            <div class="form-control "><label for="telephone" class="input-label">Số điện thoại:</label>
                                <div><input class="inputdiachi" type="text" required="" name="telephone" placeholder="Nhập số điện thoại" class="Input-sc-17i9bto-0 girQwT" value=""></div>
                            </div>
                            <div class="form-control">
                                <label for="region" class="input-label">Tỉnh/Thành phố:</label>
                                <select class="inputdiachi" required=""><option value="">Chọn Tỉnh/Thành phố</option>
                                    <option value="294">Hồ Chí Minh</option>
                                    <option value="297">Hà Nội</option>
                                    <option value="291">Đà Nẵng</option>
                                    <option value="278">An Giang</option>
                                    <option value="280">Bà Rịa - Vũng Tàu</option>
                                    <option value="282">Bắc Giang</option>
                                    <option value="281">Bắc Kạn</option>
                                    <option value="279">Bạc Liêu</option>
                                    <option value="283">Bắc Ninh</option>
                                    <option value="284">Bến Tre</option>
                                    <option value="285">Bình Dương</option>
                                    <option value="286">Bình Phước</option>
                                    <option value="287">Bình Thuận</option>
                                    <option value="316">Bình Định</option>
                                    <option value="289">Cà Mau</option>
                                    <option value="290">Cần Thơ</option>
                                    <option value="288">Cao Bằng</option>
                                    <option value="293">Gia Lai</option>
                                    <option value="295">Hà Giang</option>
                                    <option value="296">Hà Nam</option>
                                    <option value="299">Hà Tĩnh</option>
                                    <option value="300">Hải Dương</option>
                                    <option value="301">Hải Phòng</option>
                                    <option value="319">Hậu Giang</option>
                                    <option value="302">Hoà Bình</option>
                                    <option value="320">Hưng Yên</option>
                                    <option value="321">Khánh Hòa</option>
                                    <option value="322">Kiên Giang</option>
                                    <option value="323">Kon Tum</option>
                                    <option value="304">Lai Châu</option>
                                    <option value="306">Lâm Đồng</option>
                                    <option value="305">Lạng Sơn</option>
                                    <option value="324">Lào Cai</option>
                                    <option value="325">Long An</option>
                                    <option value="326">Nam Định</option>
                                    <option value="327">Nghệ An</option>
                                    <option value="307">Ninh Bình</option>
                                    <option value="328">Ninh Thuận</option>
                                    <option value="329">Phú Thọ</option>
                                    <option value="308">Phú Yên</option>
                                    <option value="309">Quảng Bình</option>
                                    <option value="310">Quảng Nam</option>
                                    <option value="311">Quảng Ngãi</option>
                                    <option value="330">Quảng Ninh</option>
                                    <option value="312">Quảng Trị</option>
                                    <option value="313">Sóc Trăng</option>
                                    <option value="331">Sơn La</option>
                                    <option value="332">Tây Ninh</option>
                                    <option value="333">Thái Bình</option>
                                    <option value="334">Thái Nguyên</option>
                                    <option value="335">Thanh Hóa</option>
                                    <option value="303">Thừa Thiên Huế</option>
                                    <option value="336">Tiền Giang</option>
                                    <option value="314">Trà Vinh</option>
                                    <option value="315">Tuyên Quang</option>
                                    <option value="337">Vĩnh Long</option>
                                    <option value="338">Vĩnh Phúc</option>
                                    <option value="339">Yên Bái</option>
                                    <option value="292">Đắk Lắk</option>
                                    <option value="340">Đắk Nông</option>
                                    <option value="341">Điện Biên</option>
                                    <option value="317">Đồng Nai</option>
                                    <option value="318">Đồng Tháp</option>
                                </select>
                            </div>
                            <div class="form-control">
                                <label for="district" class="input-label">Quận huyện:</label>
                                <select class="inputdiachi" required="">
                                    <option value="">Chọn Quận/Huyện</option>
                                    <option value="664">Huyện Định Quán</option>
                                    <option value="665">Huyện Long Thành</option>
                                    <option value="666">Huyện Cẩm Mỹ</option>
                                    <option value="667">Thành phố Biên Hòa</option>
                                    <option value="668">Huyện Thống Nhất</option>
                                    <option value="669">Huyện Nhơn Trạch</option>
                                    <option value="670">Huyện Vĩnh Cửu</option>
                                    <option value="671">Huyện Xuân Lộc</option>
                                    <option value="672">Huyện Trảng Bom</option>
                                    <option value="673">Huyện Tân Phú</option>
                                    <option value="674">Thị xã Long Khánh</option>
                                </select>
                            </div>
                            <div class="form-control">
                                <label for="ward" class="input-label">Phường xã:</label>
                                <select class="inputdiachi" required="">
                                    <option value="">Chọn Phường/Xã</option>
                                    <option value="2310">Thị trấn Định Quán</option>
                                    <option value="2311">Xã Gia Canh</option>
                                    <option value="2312">Xã La Ngà</option>
                                    <option value="2313">Xã Ngọc Định</option>
                                    <option value="2314">Xã Phú Cường</option>
                                    <option value="2315">Xã Phú Hòa</option>
                                    <option value="2316">Xã Phú Lợi</option>
                                    <option value="2317">Xã Phú Ngọc</option>
                                    <option value="2318">Xã Phú Tân</option>
                                    <option value="2319">Xã Phú Túc</option>
                                    <option value="2320">Xã Phú Vinh</option>
                                    <option value="2321">Xã Suối Nho</option>
                                    <option value="2322">Xã Thanh Sơn</option>
                                    <option value="2323">Xã Túc Trưng</option>
                                </select>
                            </div>
                            <div class="form-control ">
                                <label for="address" class="input-label">
                                    Địa chỉ:</label>
                                <div>
                                    <textarea class="inputdiachi" required="" name="street" rows="5" placeholder="Nhập địa chỉ"></textarea>
                                </div>
                            </div>
                            <div class="form-control"><label for="deliveryAddressType" class="input-label">Loại địa chỉ:</label>
                                <label class="Radio__StyledRadio-sc-sim90b-0 kpLnYz">
                                    <input  type="radio" name="deliveryAddressType" value="" checked="">
                                    <span class="radio-fake"></span><span class="label">Nhà riêng / Chung cư</span>
                                </label>
                                <label style="margin-left: 15px"Nữ class="Radio__StyledRadio-sc-sim90b-0 kpLnYz">
                                    <input  type="radio" name="deliveryAddressType" value="company">
                                    <span  class="radio-fake"></span>
                                    <span class="label">Cơ quan / Công ty</span>
                                </label></div><div class="form-control">
                            <label class="input-label">&nbsp;</label>
                            <label class="Checkbox__StyledCheckbox-sc-75m08j-0 etNXAi">
                                <input type="checkbox"><span class="checkbox-fake">
                    </span><span class="label">Đặt làm địa chỉ mặc định</span>
                            </label></div><div class="form-control">
                            <label class="input-label">&nbsp;</label>
                            <button type="submit" class="btn-submit">
                                Cập nhật</button>
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
<script src="js/main.js"></script>
</body>
</html>