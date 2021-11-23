create database dhs;
use dhs;

create table Account (
	id bigint primary key,
	username nvarchar(255),
    passwordHash char(255) not null,
    phone char(10) ,
    gender int default 0,
    email char(255) not null,
    shopName nvarchar(255),
    birthday date,
    role int default 0 ,
    lastUpdate datetime(0) 
);

create table Shop (
	id bigint primary key,
    accountId bigint not null,
    street_name nvarchar(255) not null,
    city nvarchar(255),
    district nvarchar(255),
    bank_id	int not null,
    number_product bigint not null,
    status smallint not null default 0,
    LAST_UPDATE datetime(0),
    
    foreign key (accountId) references Account(id)
);

create table Address (
	id bigint primary key,
    phone char(10) not null,
    streetName nvarchar(255) default "" not null,
    city char(150),
    district char(100)
);

create table Cart (
	id bigint primary key,
    status		smallint(6),
    accountId 	bigint,
    phone 		int(10) not null,
    streetName nvarchar(255) not null,
    city		nvarchar(255) not null,
    district 	nvarchar(255) not null,
    delivery	nvarchar(255) not null,	
    updatedAt	datetime(0),
    content 	text,
    
    foreign key (accountId) references Account(id)
);

create table Product (
	id bigint primary key,
    status smallint, #have permission form admin <1> : have permission <0> : don't have permission <3> had deleted
    shopId bigint not null,
    title nvarchar(255) not null,
    quality	smallint not null,
    price	float not null,
    decription	tinytext,
    content	text,
    updatedAt	datetime(0),
    createdAt	datetime(0),
    
    foreign key (shopId) references Shop(id)
);

create table Category (
	id bigint primary key,
    categoryName char(255) not null
);

create table Tag (
	id bigint primary key,
    tagName char(255) not null
);

create table Order_detail (
	id	bigint primary key,
    phone 		int(10) not null,
    street_name nvarchar(255) not null,
    city		nvarchar(255) not null,
    district 	nvarchar(255) not null,
    delivery	nvarchar(255) not null,
    createdAt	datetime(0) not null,
	shipPrice	float not null,
    totalPrice	float not null,
    note	text
);

create table Delivery (
	id bigint primary key,
    methodName	nvarchar(255) not null,
    price	int		#This is shipping cost per km
);

create table Cart_item (
	id bigint primary key,
	cartId	bigint,
    productId	bigint,
    quality	smallint not null,
    price	float not null,
    discount	float default 0 not null,
    amount	int default 1 not null,
    content text,
    
    foreign key (cartId) references Cart(id),
    foreign key (productId) references Product(id)
);

create table Order_item (
	id bigint primary key,
	orderId	bigint,
    productId	bigint,
    quality	smallint not null,
    price	float not null,
    discount	float default 0 not null,
    amount	int default 1 not null,
    content text,
	foreign key (orderId) references Order_detail(id),
    foreign key (productId) references Product(id)
);

create table Tag_product (
	id bigint primary key,
	productId	bigint,
    tagId	bigint,
    
    foreign key (productId) references Product(id),
    foreign key (tagId) references Tag(id)
);

create table Category_product (
	id bigint primary key,
	productId	bigint,
    categoryId	bigint,
    
    foreign key (productId) references Product(id),
    foreign key (categoryId) references Category(id)
);

create table Review (
	id bigint primary key,
    productId	bigint,
    userId	bigint,
    title	nvarchar(255) not null,
    rating	smallint not null,
    createdAt	datetime(0) not null,
    content	text,
    
    foreign key (productId) references Product(id),
    foreign key (userId) references Account(id)
);

create table User_address (
	id bigint primary key,
	accountId bigint,
    addressId bigint,
    
    foreign key (accountId) references Account(id),
    foreign key (addressId) references Address(id)
);

create table Shop_delivery (
	id bigint primary key,
	shopId bigint,
    deliveryId bigint,
    
    foreign key (shopId) references Shop(id),
    foreign key (deliveryId) references Delivery(id)
);

create table Trans (
	id bigint primary key,
    AccountId bigint,
    orderId bigint,
    states int(1) default 0,
    detailstates nvarchar(255),
    payment nvarchar(255) not null,
    detailpayment char(255),  #phone or bank id
    
    foreign key (AccountId) references Account(id),
    foreign key (orderId) references Order_Detail(id)
);