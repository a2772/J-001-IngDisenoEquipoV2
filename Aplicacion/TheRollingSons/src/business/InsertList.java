package business;

import bd.c.InsertaCarrito;
import bd.u.ActualizaProductos;
import clases.util.Articulo;
import clases.util.Carrito;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class InsertList {
    
    public void registraVentaCarrito(Carrito carrito) throws ClassNotFoundException, SQLException, DAOInitializationException {
        //Contamos con un carrito el cual es determinado número de artículos
        //El carrito es una lista de Artículos quienes a su vez son un registro de CatProducto con una cantidad int
        //Mandamos registrar la operacion
        InsertaCarrito insertaCarrito = new InsertaCarrito();
        insertaCarrito.setCarrito(carrito);
        //Llamamos a la actualización de inventarios
        ActualizaProductos actualizaProductos = new ActualizaProductos();
        actualizaProductos.updtExistenciasVendidas(carrito);
    }
}