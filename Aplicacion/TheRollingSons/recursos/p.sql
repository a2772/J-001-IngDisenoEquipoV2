USE therollingsons;

-- Consultas de prueba
-- select ps.pass from personal p, pass ps where p.idPersonal=ps.idPersonal4 and p.correo='paris.140815@gmail.com' and ps.pass='paris72';
-- select * from personal p, catPerfil cp where p.idCPerfil1=cp.idCPerfil and p.idPersonal=1;
-- select p.idPersonal from personal p, pass ps where p.idPersonal=ps.idPersonal4 and p.correo='paris.140815@gmail.com' and ps.pass='paris72';
-- select * from personal p, catPerfil cp, catSexo cs where p.idCPerfil1=cp.idCPerfil and cs.idSexo=p.idSexo1 and p.idPersonal='3';
-- select * from inventario i, catProducto cp, catSeccion cs where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion;
-- select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1
-- select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1
-- select * from personal p, catPerfil cp, catSexo cs where p.idCPerfil1=cp.idCPerfil and cs.idSexo=p.idSexo1 and p.idPersonal=3

select * from venta;
insert into productoVenta(cantidad, precio, idVenta1, idCProducto1) values(1,1,1,1);
select * from productoVenta;










































