
create database std;
use std;

create table user(
   id int UNSIGNED primary key not null auto_increment, 
   name varchar(100), 
   email varchar(100)
);  
