/*drop database restaurant;*/

create database restaurant;

use restaurant;

create table restaurant_table (
	tableId int primary key,
    maxSeats int
);

create table customer (
    customerID int primary key auto_increment,
	userName varchar(100)
);

/*
create table table_order (
	orderId int primary key auto_increment,
    orderCreatedDate datetime,
    numOfCustomers int,
    tableId int,
	FOREIGN KEY (tableId) REFERENCES restaurant_table(tableId)
);
*/ 

create table customer_order (
	customerID int,
    orderId int,
    primary key (customerID, orderId),
	FOREIGN KEY (customerID) REFERENCES customer(customerID),
	FOREIGN KEY (orderId) REFERENCES table_order(orderId)
);

/*
create table employee (
	employeeID int primary key,
    empFirstName varchar(100),
	empLastName varchar(100)
);
*/

create table item ( 
	itemId int primary key auto_increment,
    category varchar(30),
    /*subcategory varchar(30) not null,*/
    name varchar(30),
    description varchar(200),
    price decimal(5,2),
    image blob 
);

create table ordered_items (
	itemId int, 
    orderId int,
	qty int,
    primary key (itemId, orderId),
    FOREIGN KEY (itemId) REFERENCES item(itemId),
	FOREIGN KEY (orderId) REFERENCES table_order(orderId),
    CHECK (qty>=1)
); 

create table split_order (
	orderId int,
	customerID int,
    paymentPercent decimal,
    primary key (orderId, customerID),
    FOREIGN KEY (customerID) REFERENCES customer(customerID),
	FOREIGN KEY (orderId) REFERENCES table_order(orderId)
);

create table bill (
	billId int primary key,
    orderId int,
	customerID int,
    /*paymentStatus varchar(30),
    employeeId int references employee(employeeId),*/
    summaryPrice decimal,
	FOREIGN KEY (customerID) REFERENCES customer(customerID),
	FOREIGN KEY (orderId) REFERENCES table_order(orderId)

);


