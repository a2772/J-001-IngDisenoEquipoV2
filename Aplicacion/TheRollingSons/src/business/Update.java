/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import bd.r.ConsultaBuscandoId;
import bd.u.ActualizaProductos;
import clases.CatProducto;
import clases.util.Usuario;
import dao.DAOInitializationException;
import java.sql.SQLException;

/**
 *
 * @author Anonymux2772
 */
public class Update {
    public void updtCatProducto(CatProducto cp) throws ClassNotFoundException, SQLException, DAOInitializationException {
        ActualizaProductos actualizaProductos = new ActualizaProductos();
        actualizaProductos.updtCatProducto(cp);
    }
}
