create database pw3_todasporuma
go

use pw3_todasporuma
go

create table Usuario(
	rg			numeric(9)		not null primary key,
	nome		varchar(30)		not null,
	email		varchar(30)		not null,
	telefone	numeric(11)		not null
)
go

























