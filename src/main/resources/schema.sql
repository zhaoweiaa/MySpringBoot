drop table staff if exists;
drop table t_user if exists;

create TABLE staff(
id CHAR(20) NOT NULL primary key,
name CHAR(20),
age INTEGER
);

create table t_user(
id integer not null primary key,
username varchar(50) not null,
password varchar (50) not null
);