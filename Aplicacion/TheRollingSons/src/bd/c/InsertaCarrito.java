package bd.c;

import clases.util.Articulo;
import clases.util.Carrito;
import dao.DAOInitializationException;
import dao.DataAccessObject;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertaCarrito extends DataAccessObject {

    public InsertaCarrito() throws ClassNotFoundException, SQLException {
        super();
    }

    public void setCarrito(Carrito carrito) throws SQLException, DAOInitializationException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement pStmt = null;
        String sql;
        for (Articulo art : carrito.getlArticulo()) {
            try {
                sql = "insert into productoVenta(cantidad, precio, idVenta1, idCProducto1) values(?,?,?,?)";

                pStmt = con.prepareStatement(sql);
                pStmt.setFloat(1, art.getProductoVenta().getPrecio());
                pStmt.setFloat(2, art.getProductoVenta().getPrecio());
                pStmt.setInt(3, art.getProductoVenta().getVenta().getIdVenta());
                pStmt.setInt(4, art.getProductoVenta().getCatProducto().getIdCProducto());

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
