package business;

import bd.c.InsertaCarrito;
import bd.c.InsertaDatos;
import clases.CatProducto;
import clases.Personal;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class InsertIndividual {
    public void fillCatProducto(CatProducto cp) throws ClassNotFoundException, SQLException, DAOInitializationException{
        InsertaCarrito insertaCarrito = new InsertaCarrito();
        insertaCarrito.setCatProducto(cp);
    }
    public void fillPersonal(Personal p) throws ClassNotFoundException, SQLException, DAOInitializationException{
        InsertaDatos insertaDatos = new InsertaDatos();
        insertaDatos.setPersonal(p);
    }
}
