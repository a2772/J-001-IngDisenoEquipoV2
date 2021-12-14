package bd.u;

import clases.*;
import clases.util.Articulo;
import clases.util.Carrito;
import clases.util.Usuario;
import dao.DAOInitializationException;
import dao.DataAccessObject;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActualizaProductos extends DataAccessObject {

    public ActualizaProductos () throws ClassNotFoundException, SQLException {
        super();
    }
    public void updtExistenciasVendidas(Carrito carrito) throws SQLException, DAOInitializationException {//Recorre el carrito actualizando las existencias
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement pStmt=null;
        String sql;
        for(Articulo art:carrito.getlArticulo()){
            //URL, DRIVER, USER, PASSWORD
            try {
                sql = "update inventario set cantidad=? where idInventario=?";

                pStmt = con.prepareStatement(sql);
                pStmt.setInt(1, art.getInventario().getIdInventario()-art.getCantidad());//Cantidad en existencia menos la vendida
                pStmt.setInt(2, art.getInventario().getIdInventario());

                pStmt.executeUpdate();
            } catch (SQLException ex) {
                
            } finally {
                if (pStmt != null) {
                    pStmt.close();
                }
            }
        }
    }
}
