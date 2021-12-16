DROP DATABASE IF EXISTS therollingsons;
CREATE DATABASE therollingsons;
USE therollingsons;

create table catDia(
	idDia int AUTO_INCREMENT primary key,
	dia nvarchar(10) not null
);
create table catSexo(
	idSexo int AUTO_INCREMENT primary key,
	sexo nvarchar(10) not null
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
	idSexo1 int,
	foreign key (idCPerfil1) references catPerfil(idCPerfil),
	foreign key (idSexo1) references catSexo(idSexo)
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
	idPersonal4 int,
	foreign key (idPersonal4) references personal(idPersonal)
);
-- Inserciones

	insert into catDia(dia) values ('Lunes'),('Martes'),('Miércoles'),('Jueves'),('Viernes'),('Sábado'),('Domingo');
	insert into catSexo (sexo) values ('Hombre'),('Mujer');
	
	insert into catHorario(horaInicio,horaFin,idDiaInicio,idDiaFin) values ('12:00:00','15:00:00',2,7),('16:00:00','19:00',2,7);
	insert into catHorario(horaInicio,horaFin,idDiaInicio,idDiaFin) values ('12:00:00','15:00:00',2,7),('16:00:00','20:00',2,7);
	
	insert into catPerfil(perfil) values ('Encargado'),('Vendedor');
	
	insert into catMarca(marca) values ('Awaken'), ('Blazer'), ('Hondar'), ('Catrina'), ('Santa Cruz'), ('Roller Derby'), ('Candi Grl'), ('Chicago'), ("Sector 9"), ("TRS"), ("Giro");

	insert into catCategoria(categoria) values ('Baleros'),('Aceite'),('Trucks'),('Patinetas'),("Patines"),('Ropa Hombre'),('Ropa Mujer'),('Ruedas para Patin'), ("Ruedas para patineta"),('Tablas');

	insert into catSeccion(seccion) values ('Estante 3, repisa 1'),('Estante 3, repisa 2'),('Estante 5, repisa 6'),('Bodega Norte'),('Bodega a 20 grados'),('Almacen express'),('Almacen 4');

	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Patineta Mediana',
		'No exponer a la humedad y no colocar nada encima, producto delicado',
		'Patineta color verde bandera de tamaño mediano con estampado de calavera',
		1699.99,
		'Verde bandera',
		4,
		1
	);
    
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Patineta Basica',
		'No exponer a la humedad y no colocar nada encima, producto delicado',
		'Patineta de madera de maple color rojo con detalles japoneses, Medida 8"',
		1100.00,
		'Rojo',
		4,
		2
	);    
  
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Patines Carlin Peach',
		'No exponer a la humedad y no colocar nada encima, producto delicado',
		'Patines de gamusa con guia de aluminio, Medida 5 US',
		3300.00,
		'Durazno',
		5,
		7
	);    
  
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Baleros Genericos',
		'No exponer a la humedad, producto delicado',
		'Juego de 8 baleros ABEC 7',
		280.00,
		'Gris',
		1,
		2
	);   
    
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Trucks Tornasol',
		'Producto delicado',
		'Par de trucks Catrina para tabla de 8"-8.5"',
		750.00,
		'Tornasol',
		3,
		4
	);  
    
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Aceite',
		'No dejar en lugares calientes, producto delicado',
		'Envase de aceite para baleros, 250ml',
		150.00,
		'Transparente',
		2,
		9
	); 
  
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Playera TRS',
		'Colgar correctamente en ganchos y evitar mancharla',
		'Playera con logo de la tienda, talla M',
		150.00,
		'Blanca',
		6,
		10
	);

	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Playera TRS',
		'Colgar correctamente en ganchos y evitar mancharla',
		'Playera con logo de la tienda, talla S',
		150.00,
		'Blanca',
		7,
		10
	);
    
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Rueda 76MM',
		'No dejar en lugares calientes, acomodar en juegos de 4 ruedas',
		'Juego de 4 ruedas para patin, medida 76MM',
		380.00,
		'Negro',
		8,
		3
	);    
    
	insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Rueda 54MM',
		'No dejar en lugares calientes, acomodar en juegos de 4 ruedas',
		'Juego de 4 ruedas para patineta, medida 54MM',
		280.00,
		'Blanco',
		9,
		3
	); 
    
    insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (
		'Tabla Giro',
		'No exponer a la humedad y no colocar nada encima, producto delicado',
		'Tabla Giro con diseño de Charlie Brown, medida 8.2" ',
		680.00,
		'Azul',
		10,
		11
	); 
    
	insert into personal(nombre,apPat,apMat,curp,tel,fechNac,correo,idCPerfil1,idSexo1) values (
		'Paris',
		'Ramirez',
		'Saldana',
		'RASP010527HDFJLR9',
		'55-9876-5432',
		'2001-05-27',
		'paris.140815@gmail.com',
		1,
		1
	),(
		'Luis Antonio',
		'Santiago',
		'Martin',
		'SAML990605HMCNRS01',
		'55-1234-5678',
		'1999-06-05',
		'luisasantiagom.5699@gmail.com',
		1,
		1
	),(
		'Fernanda',
		'Oregon',
		'Juarez',
		'SMTHNG',
		'99-1234-5678',
		'1999-12-31',
		'usr',
		2,
		2
	),(
		'FER',
		'ORTEGA',
		'Smith',
		'SMTHNG',
		'99-1234-5678',
		'1999-12-31',
		'u',
		1,
		1
	);

	insert into inventario(cantidad,descripcion,idCProducto2,idSeccion1) values (
		15,
		'Ingreso por compra a credito del 16/12/2021',
		1,
		1
	),(
		25,
		'Ingreso a inventario al contado',
		2,
		1
	),(
		10,
		'Pedido de cliente J.L Goytia. NO VENDER',
		1,
		4
	),(
		19,
		'Unidades de nuevo producto',
		1,
		3
	),(
		23,
		'Compra de posible nueva tendencia de articulo',
		1,
		5
	),(
		9,
		'Ingreso del 18/12/2021 por compra a credito',
		1,
		5
	);

	insert into horario(idPersonal2,idCHorario1) values (1,1),(1,2);

	insert into pass(pass, idPersonal4) values ('paris72',1),('luis5',2),('usr',3),('u',4);
-- Consultas de prueba



-- select ps.pass from personal p, pass ps where p.idPersonal=ps.idPersonal4 and p.correo='paris.140815@gmail.com' and ps.pass='paris72';
-- select * from personal p, catPerfil cp where p.idCPerfil1=cp.idCPerfil and p.idPersonal=1;
-- select p.idPersonal from personal p, pass ps where p.idPersonal=ps.idPersonal4 and p.correo='usr' and ps.pass='usr';
-- select * from CatMarca;
-- select * from CatProducto;
-- select * from catCategoria;






































