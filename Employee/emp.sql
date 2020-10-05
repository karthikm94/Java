create database db;
use db;
create table employee (Employee_Id integer AUTO_INCREMENT, Employee_Name varchar(10) , Employee_Address varchar(20),
 Date_of_Joining date, Experience integer, Date_of_Birth date,primary key(Employee_Id));
insert into employee(Employee_Name, Employee_Address, Date_of_Joining, Experience, Date_of_Birth) values 
( 'karthik','Bangalore','2020-02-02','3','1994-07-08');
