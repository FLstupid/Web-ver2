
create database shoping;
use shoping;
SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  id int(11) NOT NULL auto_increment primary key,
  userName varchar(255) collate utf8_unicode_ci NOT NULL,
  password varchar(255) collate utf8_unicode_ci NOT NULL,
  birth date default NULL,
  gender varchar(10) collate utf8_unicode_ci default NULL,
  email varchar(255) collate utf8_unicode_ci default NULL,
  phone varchar(20) collate utf8_unicode_ci default NULL,
  address varchar(255) collate utf8_unicode_ci default NULL
) AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS category;
CREATE TABLE category (
  id bigint NOT NULL auto_increment,
  name varchar(255) collate utf8_unicode_ci default NULL,
  decription varchar(255) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (id)
) AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS cart;
create table cart (
	id int(11) not null primary key,
    userId int(11) not null,
    price double default 0,
    foreign key (userId) references user(id)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS cart_item;
create table cart_item (
	id int(11) not null primary key,
    cartId int(11) default null,
    productId bigint not null,
    amount smallint not null default 1,
    foreign key (cartId) references cart(id),
    foreign key (productId) references product(id)
) DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
  id bigint NOT NULL PRIMARY KEY auto_increment,
  userId int(11) default NULL,
  cartId int(11) default NULL,
  productCode int(11) default NULL,
  createAt timestamp NULL default NULL,
  amount int(11) default NULL,
  totalPrice double default NULL,
  foreign key (userId) references user(id),
  foreign key (cartId) references cart(id)
) AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS product;
CREATE TABLE product (
  id bigint NOT NULL auto_increment primary key,
  categoryId bigint default NULL,
  productName varchar(255) collate utf8_unicode_ci default NULL,
  picture varchar(255) collate utf8_unicode_ci default NULL,
  price double default NULL,
  NSX varchar(255) collate utf8_unicode_ci default NULL,
  content text collate utf8_unicode_ci default NULL,
  foreign key (categoryId) references category (id)
) AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



INSERT INTO product VALUES ('1', '1', 'Áo khoát Adachi mới', 'new.jpg', '100000', 'Oron', 'Đang cập nhật');
INSERT INTO product VALUES ('2', '2', 'Áo sale', 'nu1.jpg', '520000', 'Omo', 'Đang cập nhật');
INSERT INTO product VALUES ('3', '3', 'Áo no style', 'nostyle.jpg', '520000', 'Mabu', 'Đang cập nhật');
INSERT INTO product VALUES ('4', '4', 'Áo nam', 'nam.jpg', '520000', 'Lv', 'Đang cập nhật');
INSERT INTO product VALUES ('5', '5', 'Áo nữ 2', 'nu2.jpg', '520000', 'Romano', 'Đang cập nhật');
INSERT INTO product VALUES ('6', '6', 'Dép', 'dep.jpg', '520000', 'Bitis', 'Đang cập nhật');
INSERT INTO product VALUES ('7', '7', 'Nón', 'non.jpg', '520000', 'Goku', 'Đang cập nhật');

INSERT INTO category VALUES ('1', 'New', 'Quần áo mới thiết kế');
INSERT INTO category VALUES ('2', 'Sale', 'Quần áo giảm giá');
INSERT INTO category VALUES ('3', 'Style', 'Quần áo dạo phố');
INSERT INTO category VALUES ('4', 'Nam', 'Thời trang nam');
INSERT INTO category VALUES ('5', 'Nữ', 'Thời trang nữ');
INSERT INTO category VALUES ('6', 'Dép', 'Dép thời trang');
INSERT INTO category VALUES ('7', 'Nón', 'Nón thời trang');

INSERT INTO orders VALUES ('8', '13', '1' , '2', '2015-05-17 14:55:17', '1', '520000');