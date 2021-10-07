create database dhs;
use dhs;

create table Account (
	id bigint primary key,
	username nvarchar(100) not null,
    passwordHash nvarchar(255) not null,
    phone int(10) not null,
    email nvarchar(255),
    shop_name nvarchar(255),
    birthday date,
    LAST_UPDATE datetime(0)
);

create table Shop (
	id bigint primary key,
    street_name nvarchar(255) not null,
    city nvarchar(150),
    district nvarchar(100),
    bank_id	int not null,
    active_day int default 0 not null,
    number_product bigint not null,
    LAST_UPDATE datetime(0)
);

create table Address (
	id bigint primary key,
    phone int(10) not null,
    street_name nvarchar(255) not null,
    city nvarchar(150),
    district nvarchar(100)
);

create table Cart (
	id bigint primary key,
    sessionId	nvarchar(100),
    tokenId 	nvarchar(100),
    status		smallint(6),
    accountId 	bigint references Account(id),
    phone 		int(10) not null,
    street_name nvarchar(255) not null,
    city		nvarchar(150) not null,
    district 	nvarchar(100) not null,
    delivery	nvarchar(100) not null,
    createdAt	datetime(0),
    updatedAt	datetime(0),
    content 	text
);

create table Product (
	id bigint primary key,
    shopId bigint not null references Shop(id),
    title nvarchar(255) not null,
    metalTitle nvarchar(255),
    quality	smallint not null,
    price	float not null,
    discount	float default 0 not null,
    startAt	datetime(0),
    endsAt	datetime(0),
    decription	tinytext,
    content	text,
    updatedAt	datetime(0),
    createdAt	datetime(0),
    publishedAt	datetime(0)
);

create table Category (
	id bigint primary key,
    categoryName nvarchar(255) not null
);

create table Tag (
	id bigint primary key,
    tagName nvarchar(255) not null
);

create table Order_detail (
	id	bigint primary key,
    states int(1) default 0,
    phone 		int(10) not null,
    street_name nvarchar(255) not null,
    city		nvarchar(150) not null,
    district 	nvarchar(100) not null,
    delivery	nvarchar(100) not null,
    createdAt	datetime(0) not null,
	shipPrice	float not null
);

create table Delivery (
	id bigint primary key,
    methodName	nvarchar(100) not null,
    price	int		#This is shipping cost per km
);

create table Cart_item (
	id bigint primary key,
	cartId	bigint references Cart(id),
    productId	bigint references Product(id),
    quality	smallint not null,
    price	float not null,
    discount	float default 0 not null,
    amount	int default 1 not null,
    createdAt	datetime(0) not null,
    updatedAt	datetime(0),
    content text
);

create table Order_item (
	id bigint primary key,
	orderId	bigint references Order_detail(id),
    productId	bigint references Product(id),
    quality	smallint not null,
    price	float not null,
    discount	float default 0 not null,
    amount	int default 1 not null,
    createdAt	datetime(0) not null,
    updatedAt	datetime(0),
    content text
);

create table Tag_product (
	productId	bigint references Product(id),
    tagId	bigint references Tag(id)
);

create table Category_product (
	productId	bigint references Product(id),
    categoryId	bigint references Category(id)
);

create table Review (
	id bigint primary key,
    productId bigint references Product(id),
    userId bigint references Account(id),
    title	nvarchar(255) not null,
    rating	smallint not null,
    publishedAt	datetime(0) not null,
    createdAt	datetime(0) not null,
    content	text
);

create table User_address (
	accountId bigint references Account(id),
    addressId bigint references Address(id)
);

create table Shop_delivery (
	shopId bigint references Shop(id),
    deliveryId bigint references Delivery(id)
);