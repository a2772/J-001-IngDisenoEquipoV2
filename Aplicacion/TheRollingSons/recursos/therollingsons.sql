DROP DATABASE IF EXISTS therollingsons;
CREATE DATABASE therollingsons;
USE therollingsons;

create table catDia(
	idDia int AUTO_INCREMENT primary key,
	dia nvarchar(10) not null
);
create table catHorario(
	idCHorario int AUTO_INCREMENT primary key,
	horaInicio time not null,
	horaFin time not null,
	idDiaInicio int not null,
	idDiaFin int not null,
	foreign key (idDiaInicio) references catDia(idDia),
	foreign key (idDiaFin) references catDia(idDia)
);
create table catPerfil(
	idCPerfil int AUTO_INCREMENT primary key,
	perfil nvarchar(14) not null
);
create table catMarca(
	idMarca int AUTO_INCREMENT primary key,
	marca nvarchar(70) not null
);
create table catCategoria(
	idCategoria int AUTO_INCREMENT primary key,
	categoria nvarchar(70) not null
);
create table catSeccion(
	idSeccion int AUTO_INCREMENT primary key,
	seccion nvarchar(70) not null
);
create table catProducto(
	idCProducto int AUTO_INCREMENT primary key,
	producto nvarchar(150) not null,
	descripcionAlmacenar nvarchar(1000),
	descripcion nvarchar (250),
	precio decimal (6,2),
	color nvarchar (50),
	idCategoria1 int,
	idMarca1 int,
	foreign key (idCategoria1) references catCategoria(idCategoria),
	foreign key (idMarca1) references catMarca(idMarca)
);
create table personal(
	idPersonal int AUTO_INCREMENT primary key,
	nombre nvarchar(250) not null,
	apPat nvarchar(100) not null,
	apMat nvarchar(100) not null,
	curp nvarchar(18) not null,
	tel nvarchar(12) not null,
	fechNac date not null,
	correo nvarchar(150) not null,
	idCPerfil1 int,
	foreign key (idCPerfil1) references catPerfil(idCPerfil)
);
create table venta(
	idVenta int AUTO_INCREMENT primary key,
	iva decimal (9,2) not null,
	total decimal (10,2) not null,
	fecha datetime not null,
	idPersonal1 int,
	foreign key (idPersonal1) references personal(idPersonal)
);
create table productoVenta(
	idProductoVenta int AUTO_INCREMENT primary key,
	cantidad int not null,
	precio decimal (6,2),
	idVenta1 int,
	idCProducto1 int,
	foreign key (idVenta1) references venta(idVenta),
	foreign key (idCProducto1) references catProducto(idCProducto)
);
create table inventario(
	idInventario int AUTO_INCREMENT primary key,
	cantidad int not null,
	descripcion nvarchar(100),
	idCProducto2 int,
	idSeccion1 int,
	foreign key (idCProducto2) references catProducto(idCProducto),
	foreign key (idSeccion1) references catSeccion(idSeccion)
);
create table horario(
	idHorario int AUTO_INCREMENT primary key,
	idPersonal2 int,
	idCHorario1 int,
	foreign key (idPersonal2) references personal(idPersonal),
	foreign key (idCHorario1) references catHorario(idCHorario)
);
create table horarioPersonal(
	idHorarioPersonal int AUTO_INCREMENT primary key,
	idHorario1 int,
	idPersonal3 int,
	foreign key (idHorario1) references horario(idHorario),
	foreign key (idPersonal3) references personal(idPersonal)
);
-- Login
create table pass(
	idPass int AUTO_INCREMENT primary key,
	pass nvarchar(50),
	idPersonal int,
	foreign key (idPersonal) references personal(idPersonal)
);
-- Inserciones
go
	insert into catDia(dia) values ('Lunes'),('Martes'),('Miércoles'),('Jueves'),('Viernes'),('Sábado'),('Domingo');
go
	insert into catHorario(horaInicio,horaFin,idDiaInicio,idDiaFin) values ('12:00:00','15:00:00',2,7),('16:00:00','19:00',2,7);
	insert into catHorario(horaInicio,horaFin,idDiaInicio,idDiaFin) values ('12:00:00','15:00:00',2,7),('16:00:00','20:00',2,7);
	
	insert into catPerfil(perfil) values ('Encargado'),('Vendedor');
	
	insert into catMarca(marca) values ('Nike');

	insert into catCategoria(categoria) values ('Baleros'),('Repuestos'),('Eje'),('Patinetas'),('Ropa Hombre'),('Ropa Mujer'),('Ruedas'),('Tablas');

	insert into catSeccion(seccion) values ('Estante 3, repisa 1');
go
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Patineta Mediana',
		'No exponer a la humedad y no colocar nada encima, producto delicado',
		'Patineta color verde bandera de tamaño mediano con estampado de calavera',
		1699.99,
		'Verde bandera',
		4,
		1
	);

select * from catProducto;
/*
create table personal(
	idPersonal int AUTO_INCREMENT primary key,
	nombre nvarchar(250) not null,
	apPat nvarchar(100) not null,
	apPat nvarchar(100) not null,
	curp nvarchar(18) not null,
	tel nvarchar(12) not null,
	fechNac date not null,
	correo nvarchar(150) not null,
	idCPerfil1 int,
	foreign key (idCPerfil1) references catPerfil(idCPerfil)
);
create table venta(
	idVenta int AUTO_INCREMENT primary key,
	iva decimal (9,2) not null,
	total decimal (10,2) not null,
	fecha datetime not null,
	foreign key (idPersonal1) references personal(idPersonal)
);
create table productoVenta(
	idProductoVenta int AUTO_INCREMENT primary key,
	cantidad int not null,
	precio decimal (6,2),
	idVenta1 int,
	idCProducto1 int,
	foreign key (idVenta1) references venta(idVenta),
	foreign key (idCProducto1) references catProducto(idCProducto)
);
create table inventario(
	idInventario int AUTO_INCREMENT primary key,
	cantidad int not null,
	descripcion nvarchar(100),
	idCProducto2 int,
	idSeccion1 int,
	foreign key (idCProducto2) references catProducto(idCProducto),
	foreign key (idSeccion1) references seccion(idSeccion)
);
create table horario(
	idHorario int AUTO_INCREMENT primary key,
	idPersonal2 int,
	idCHorario1 int,
	foreign key (idPersonal2) references personal(idPersonal),
	foreign key (idCHorario1) references catHorario(idCHorario)
);
create table horarioPersonal(
	idHorarioPersonal int AUTO_INCREMENT primary key,
	idHorario1 int,
	idPersonal3 int,
	foreign key (idHorario1) references horario(idHorario),
	foreign key (idPersonal3) references personal(idPersonal)
);
-- Login
create table pass(
	idPass int AUTO_INCREMENT primary key,
	pass nvarchar(50),
	idPersonal int,
	foreign key (idPersonal) references personal(idPersonal)
);


















































go
	-- Perfiles
	insert into catPerfil(perfil) values ('EL ADMIN');
	insert into catPerfil(perfil) values ('Director');
	insert into catPerfil(perfil) values ('Subdirector');
	insert into catPerfil(perfil) values ('Profesor');
	insert into catPerfil(perfil) values ('Secretaria/o');
	insert into catPerfil(perfil) values ('Personal de limpieza');
	insert into catPerfil(perfil) values ('Alumno');
	-- Salones
	insert into catSalon(nomSalon,cupo,piso) values ('Sin Salon', 0, 'Todo el edificio');
	insert into catSalon(nomSalon,cupo,piso) values ('Cubiculo 002', 2, 'Primer Piso');
go
	insert into Datos(nombre,apPat,apMat,fechNac,curp,direccion,sexo) values ('Soy','El','Admin','2001-01-01','AAAAAAAAAAAAAAAAAA','N/A','Hombre');
	insert into Personal(rfc,email,sueldoHora,idDatos,idPerfil,idSalon) values ('BBBBBBBBBBBBB','admin',69420.69,1,1,1);
	insert into Pass(idPersonal,pass) values (1,'admin');


select ps.pass from Datos d, Personal p, Pass ps where d.idDatos=p.idDatos and ps.idPersonal=p.idPersonal and p.email='admin' and ps.pass='admin';
