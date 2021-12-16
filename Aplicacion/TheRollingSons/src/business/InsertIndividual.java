package business;

import bd.c.InsertaCarrito;
import clases.CatProducto;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class InsertIndividual {
    public void fillCatProducto(CatProducto cp) throws ClassNotFoundException, SQLException, DAOInitializationException{
        InsertaCarrito insertaCarrito = new InsertaCarrito();
        insertaCarrito.setCatProducto(cp);
    }
}
