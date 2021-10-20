<%--
  Created by IntelliJ IDEA.
  User: Hoang
  Date: 10/14/2021
  Time: 8:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <link rel="stylesheet" href="css/newcss.css" />
</head>
<body>
<!---------------------------------------------------header-------------------------------------------->
<header class="style__Header">
    <section class="Container">
        <div class="Middle__Wrap">
            <div class="Middle__LeftContainer">
                <div class="logo-menu">
                    <div class="style_Logo">
                        <a href="homepage.html" class="dhs-logo">
                            <img
                                    src="img/logo.svg"
                            />
                        </a>
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
                            />
                            Search
                        </button>
                    </div>
                </div>

                <div class="Userstyle__Root">

                    <div class="Userstyle__Item">
                        <a href="customer">
                            <img   class=" profile-icon" src="img/user.png" />
                        </a>
                        <span class="Userstyle__ItemText">
                <span class="Userstyle__NoWrap">Tài khoản</span>
                <span class="account_laber">
                  <div style="display: flex" class="buttonDropdown">
                    <span>user-name</span>
                  <img class="arrowIcon" src="img/down.png" />
                  </div>

                    <ul class="UserHeader_UserDropDown disableForm">
                      <li><a rel="nofollow" href="">
                      <p
                              title="Order history"
                              class="UserHeader_UserDropDownItem"
                      >
                        Order history
                      </p>
                    </a></li>
                      <li><a rel="nofollow" href="">
                      <p title="Notification" class="UserHeader_UserDropDownItem">
                        Notification
                        <span class="bagde">0</span>
                      </p>
                    </a></li>
                      <li><a rel="nofollow" href="">
                      <p title="My account" class="UserHeader_UserDropDownItem">
                        My account
                      </p>
                    </a></li>
                      <li><a rel="nofollow" href="">
                      <p title="Reviews" class="UserHeader_UserDropDownItem">
                        "Reviews"
                      </p>
                    </a></li>
                      <li><a rel="nofollow" href="">
                      <p title="Log out" class="UserHeader_UserDropDownItem">
                        Log out
                      </p>
                    </a></li>
                    </ul>
                </span>
              </span>
                    </div>
                    </a>
                    <div class="Userstyle__CartItem">
                        <a href="#" rel="nofollow">
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
                    <li><a  class="formshow is-active" href="#"><span>Thông tin tài khoản</span></a></li>
                    <li><a  class="formshow" href="#"><span>Đổi mật khẩu</span></a></li>
                    <li><a  class="formshow" href="#"><span>Quản lý đơn hàng</span></a></li>
                    <li><a  class="formshow"  href="#"><span>Sổ địa chỉ</span></a></li>
                    <li><a  class="formshow"  href="#"><span>Nhận xét sản phẩm đã mua</span></a></li>
                    <li><a  class="formshow"  href="#"><span>Sản phẩm mua sau</span></a></li>
                </ul>
            </aside>
            <div class="Account_StylesAccountLayoutInner">
                <div class="account formresult ">
                    <h3 class="HeadingContent">Thông Tin Tài Khoản</h3>
                    <div class="Content_StylesNav">
                        <form >
                            <div class="form-control">
                                <label class="input-label">Họ tên</label>
                                <div>
                                    <input type="text" name="fullName" maxlength="128" class="Input-styles" value="">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label">Số điện thoại</label>
                                <div>
                                    <input type="tel" disabled name="phoneNumber" placeholder="Nhập SĐT" class="Input-styles" value="">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label">Email</label>
                                <div>
                                    <input type="email" disabled name="email" class="Input-styles" value="">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label sexcheck">Giới tính</label>
                                <label class="Radio_StylesRadio">
                                    <input type="radio" name="gender" value="male" checked>
                                    <span class="radio-fake">

                    </span>
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
                                    <select class="selectday" name="day">
                                        <option value="0">Ngày</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                        <option value="6">6</option>
                                        <option value="7">7</option>
                                        <option value="8">8</option>
                                        <option value="9">9</option>
                                        <option value="10">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                        <option value="13">13</option>
                                        <option value="14">14</option>
                                        <option value="15">15</option>
                                        <option value="16">16</option>
                                        <option value="17">17</option>
                                        <option value="18">18</option>
                                        <option value="19">19</option>
                                        <option value="20">20</option>
                                        <option value="21">21</option>
                                        <option value="22">22</option>
                                        <option value="23">23</option>
                                        <option value="24">24</option>
                                        <option value="25">25</option>
                                        <option value="26">26</option>
                                        <option value="27">27</option>
                                        <option value="28">28</option>
                                        <option value="29">29</option>
                                        <option value="30">30</option>
                                        <option value="31">31</option>
                                    </select>
                                    <select class="selectday" name="month">
                                        <option value="0">Tháng</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                        <option value="6">6</option>
                                        <option value="7">7</option>
                                        <option value="8">8</option>
                                        <option value="9">9</option>
                                        <option value="10">10</option>
                                        <option value="11">11</option>
                                        <option value="12">12</option>
                                    </select>
                                    <select class="selectday" name="year">
                                        <option value="0">Năm</option>
                                        <option value="2021">2021</option>
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
                <div class="resetPassword  formresult disableForm ">
                    <h3 class="HeadingContent">Thay Đổi Mật Khẩu</h3>
                    <div class="Content_StylesNav">
                        <form>
                            <div class="form-control">
                                <label class="input-label">Mật Khẩu Cũ</label>
                                <div>
                                    <input type="text" name="odlPassword" maxlength="128" minlength="6" class="Input-styles" value="">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label">Mật Khẩu Mới</label>
                                <div>
                                    <input type="text" name="newPassword" maxlength="128" minlength="6" class="Input-styles" value="">
                                </div>
                            </div>
                            <div class="form-control">
                                <label class="input-label">Xác Nhận Mật Khẩu Mới</label>
                                <div>
                                    <input type="text" name="confirmNewPassword" maxlength="128" minlength="6" class="Input-styles" value="">
                                </div>
                            </div>

                            <div class="form-control">
                                <label class="input-label">&nbsp;</label>
                                <button type="submit" class="btn-submit">Thay Đổi Mật Khẩu</button>
                            </div>
                        </form>
                    </div>
                    <br>
                </div>
                <div style="width: 970px" class="order formresult disableForm">
                    <h3 class="HeadingContent">Quản Lý Đơn Mua</h3>
                    <div class="container">
                        <div class="row height d-flex justify-content-center align-items-center">
                            <div class="col-md-6">
                                <div class="form"> <i class="fab fa-search"></i>
                                    <span  class="left-pan"><i class="fa fa-microphone"></i></span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="Content_StylesNav">
                        <form >
                            <table class="bangmua">
                                <thead>
                                <tr>
                                    <th width="100px">Mã đơn hàng</th>
                                    <th>Ngày mua</th>
                                    <th>Sản phẩm</th>
                                    <th width="100px">Tổng tiền</th>
                                    <th width="150px">Trạng thái đơn hàng</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>
                                        <a width="100px" href="/sales/order/view/280563326">280563326</a>
                                    </td>
                                    <td>17/09/2021</td>
                                    <td>Điện thoại Vivo Y12s - Xanh dương nhạt- 4GB/128GB - Hàng Chính Hãng ...và 01 sản phẩm khác</td>
                                    <td width="100px">4.448.100 ₫</td>
                                    <td>Đã hủy</td>
                                </tr>
                                <tr>
                                    <td>
                                        <a width="100px" href="/sales/order/view/946255654">946255654</a>
                                    </td>
                                    <td>08/01/2018</td>
                                    <td>Tiếp Cận 23 Phương Pháp Giải Nhanh Hiện Đại Hóa Học</td>
                                    <td width="100px">151.000 ₫</td>
                                    <td>Giao hàng thành công</td>
                                </tr>
                                <tr>
                                    <td>
                                        <a width="100px" href="/sales/order/view/862449321">862449321</a>
                                    </td><td>04/01/2018</td>
                                    <td>Tiếp Cận 23 Phương Pháp Giải Nhanh Hiện Đại Hóa Học</td>
                                    <td width="100px">151.000 ₫</td>
                                    <td>Giao hàng thành công</td>
                                </tr>
                                <tr>
                                    <td>
                                        <a width="100px" href="/sales/order/view/15480958">15480958</a>
                                    </td>
                                    <td>28/08/2017</td>
                                    <td>Nhạc Lý Căn Bản</td>
                                    <td width="100px">41.800 ₫</td>
                                    <td>Giao hàng thành công</td>
                                </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
                <br>
                <div  class="adressadd formresult disableForm ">
                    <h3  class="HeadingContent">Danh Sách Địa Chỉ</h3>
                    <div class="new addadress">
                        <a id="a" href="#addadress">
                            <svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg">
                                <path d="M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z">
                                </path>
                            </svg>
                            <span>Thêm địa chỉ mới
                  </span>
                        </a>
                    </div>
                    <div class="Content_StylesNav">
                        <form>
                            <div style="display: flex" class="addresslist">
                                <div class="left">
                                    <div class="info">
                                        <div class="name">Lê Vũ Minh Hoàng
                                            <span>
                        <svg style="color: greenyellow;" stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 512 512" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg">
                          <path d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm0 48c110.532 0 200 89.451 200 200 0 110.532-89.451 200-200 200-110.532 0-200-89.451-200-200 0-110.532 89.451-200 200-200m140.204 130.267l-22.536-22.718c-4.667-4.705-12.265-4.736-16.97-.068L215.346 303.697l-59.792-60.277c-4.667-4.705-12.265-4.736-16.97-.069l-22.719 22.536c-4.705 4.667-4.736 12.265-.068 16.971l90.781 91.516c4.667 4.705 12.265 4.736 16.97.068l172.589-171.204c4.704-4.668 4.734-12.266.067-16.971z">
                          </path>
                        </svg>
                        <span style="color: greenyellow;" >
                          Địa chỉ mặc định
                        </span>
                      </span>
                                        </div>
                                        <div class="address">
                                            <span>Địa chỉ: </span>
                                            số nhà 30 tổ 3 ấp 1, Xã Suối Nho, Huyện Định Quán, Đồng Nai</div>
                                        <div class="phone">
                      <span>Điện thoại:
                      </span>0397537283</div>
                                    </div>
                                </div>
                                <div class="right">
                                    <div style="margin-left: 500px; margin-right: -500px;" class="action">
                                        <a class="edit" href="/customer/address/edit/2533851">
                                            Chỉnh sửa
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>

                </div>
                <div style="width: 970px;" id="addadress" class="themdiachi  disableForm">
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
                <br>
                <div class="comment formresult disableForm ">
                    <h3 class="HeadingContent">Nhận Xét Về Sản Phẩm Của Bạn</h3>
                    <div class="Content_StylesNav">
                        <form>
                            <!--                <p style="margin-left: 420px">Chưa có nhận xét nào</p>-->
                            <!--                <a href="/" class="back">Tiếp tục mua sắm</a>-->
                            <table class="comment">
                                <thead>
                                <tr>
                                    <th width="200px">Mã đơn hàng</th>
                                    <th>Sản phẩm</th>
                                    <th width="200px">Nhận xét</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>
                                        <a width="100px" href="/sales/order/view/280563326">280563326</a>
                                    </td>

                                    <td>Điện thoại Vivo Y12s - Xanh dương nhạt- 4GB/128GB - Hàng Chính Hãng ...và 01 sản phẩm khác</td>
                                    <td width="100px">Sản Phẩm rất tốt aaaaaa aaaaaa aaaaaa aaa</td>
                                </tr>

                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
                <div class="buying-Later formresult disableForm ">
                    <h3 class="HeadingContent">Sản Phẩm Mua Sau</h3>
                    <div class="Content_StylesNav">
                        <form>
                            <!--                <p style="margin-left: 420px">Chưa có sản phẩm nào</p>-->
                            <!--                <a href="/" class="back">Tiếp tục mua sắm</a>-->
                            <table class="comment">
                                <thead>
                                <tr>
                                    <th width="200px">Mã đơn hàng</th>
                                    <th>Sản phẩm</th>
                                    <th width="200px">Mua</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>
                                        <a width="100px" href="/sales/order/view/280563326">280563326</a>
                                    </td>

                                    <td>Điện thoại Vivo Y12s - Xanh dương nhạt- 4GB/128GB - Hàng Chính Hãng ...và 01 sản phẩm khác</td>
                                    <td style="text-align: center" width="100px"><input type="checkbox" id="vehicle1" ></td>
                                </tr>

                                </tbody>
                            </table>
                            <a href="/" class="back">Mua</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </section>
</main>
<!---------------------------------------------------footer-------------------------------------------->
<footer>

</footer>

<script src="js/main.js"></script>
</body>
</html>
