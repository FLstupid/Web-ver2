create database dhs;
use dhs;

create table Account (
	username nvarchar(100) unique primary key,
    passwordHash nvarchar(255) not null,
    phone int(10) not null,
    email nvarchar(255),
    shop_name nvarchar(255),
    birthday date
);

create table Address (
	Ausername nvarchar(100) references Account(username),
	direction nvarchar(255) not null,
    Aphone int(10) not null,
    Aname nvarchar(255) not null,
    state bit default 0
);

create table Payment (
	Ptype nvarchar(40) not null,
    Pusername nvarchar(100) references Account (username),
    Idcard int (10) not null,
    Pname nvarchar(255) not null
);

create table Cart (
	id bigint primary key
);

create table Cart_item (
	id bigint references Cart(id)
);

create table Product (
	id bigint primary key
);

create table Caterogy (
	id bigint primary key
);

create table Tag (
	id bigint primary key,
    tag_name nvarchar(255) not null
);

create table Order_detail (
	id	bigint primary key,
	user_Order nvarchar(100) references Account (username),
    states int(1) check (Ostates < 6) default 0,
    product nvarchar(500) not null
);

create table Order_item (
	orderId	bigint references Order_detail(Id),
    productId	bigint references Product(Id)
);

create table Tag_product (
	productId	bigint references Product(Id),
    tagId	bigint references Tag(Id)
);

create table Product_category (
	productId	bigint references Product(Id),
    categoryId	bigint references Category(Id)
);