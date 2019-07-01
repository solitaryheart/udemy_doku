create database myzone;
create table customer(
						myZoneID varchar(50) primary key not null,
                        firstName varchar(10) not null,
                        lastName varchar(10) not null,
                        phone int(10) unsigned not null unique,
                        email varchar(50) not null unique,
                        address varchar(100) not null,
                        city varchar(25) not null,
                        state varchar(25) not null,
                        zipcode int(5) unsigned not null,
                        country varchar(25) not null,
                        creationDate date not null
                        );
                        
select * from myzone.customer;
alter table customer change column email  email varchar(50) not null unique;
insert into myzone.customer values('mz9823982333','fNAme', 'lName',02349494,'abice@gmail.com', 
						'42,4th corss, poplavar vaenue','new yort','NewYork',43556,'US','2016-12-12');
select * from myzone.customer where myZoneID = 'cust7025949';
delete from myzone.customer where myZoneID = 'cust8346135';
                        
/**************************************************************************/
create table orders( 
						orderID varchar(15) primary key not null,
                        orderCreated varchar(25) not null,
                        orderShipped varchar(25),
                        orderStatus	varchar(25) not null,
                        myZoneID varchar(50) not null,
                        foreign key fk_cust(myZoneID) references customer(myZoneID) on delete cascade
						);
alter table orders change column orderShipped  orderShipped varchar(25) not null;
select * from orders where myzoneID = 'cust6558547' and orderID = 'ord1509330';
select * from orders;
insert into myzone.orders values('ORD8373933','2017-23-12 12:12:12','2017-23-13 12:12:12','SHIPPED','mz9823982393');
drop table myzone.orders;
/**************************************************************************/
create table products(
						prodcutID varchar(15) primary key not null,
                        productName varchar(50) not null,
						cost int(10) not null,
                        trackingID varchar(25),
                        orderID varchar(15) not null,
                        foreign key fk_ord(orderID) references orders(orderID)
                        on delete cascade ,
                        myZoneID varchar(50) not null,
                        foreign key fk_custp(myZoneID) references customer(myZoneID) on delete cascade
						);
select * from products;
alter table products drop column msrp;
update myzone.products set productName = 'Sony portable 2 in 1 speaker', cost = 22, 
trackingID = 'tr48484' where prodcutID = 'prd9909029';
truncate products;
drop table products;
drop database myzone;
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        