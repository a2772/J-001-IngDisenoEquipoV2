package bd.u;

import clases.CatProducto;
import clases.util.Articulo;
import clases.util.Carrito;
import dao.DAOInitializationException;
import dao.DataAccessObject;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ActualizaProductos extends DataAccessObject {

    public ActualizaProductos() throws ClassNotFoundException, SQLException {
        super();
    }

    public void updtExistenciasVendidas(Carrito carrito) throws SQLException, DAOInitializationException {//Recorre el carrito actualizando las existencias
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement pStmt = null;
        String sql;
        for (Articulo art : carrito.getlArticulo()) {
            //URL, DRIVER, USER, PASSWORD
            try {
                sql = "update inventario set cantidad=? where idInventario=?";

                pStmt = con.prepareStatement(sql);
                pStmt.setInt(1, art.getInventario().getCantidad() - art.getCantidad());//Cantidad en existencia menos la vendida
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

    public void updtCatProducto(CatProducto cp) throws SQLException, DAOInitializationException {//Recorre el carrito actualizando las existencias
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement pStmt = null;
        String sql;
        try {
            sql = "update catProducto set producto=?, descripcion=?, descripcionAlmacenar=?, precio=?,color=?,idCategoria1=?,idMarca1=? where idCProducto=?";

            pStmt = con.prepareStatement(sql);
            pStmt.setString(1, cp.getProducto());
            pStmt.setString(2, cp.getDescripcion());
            pStmt.setString(3, cp.getDescripcionAlmacenar());
            pStmt.setFloat(4, cp.getPrecio());
            pStmt.setString(5, cp.getColor());
            pStmt.setInt(6, cp.getCatCategoria().getIdCategoria());
            pStmt.setInt(7, cp.getCatMarca().getIdMarca());
            pStmt.setInt(8, cp.getIdCProducto());

            pStmt.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            if (pStmt != null) {
                pStmt.close();
            }
        }
    }
}
