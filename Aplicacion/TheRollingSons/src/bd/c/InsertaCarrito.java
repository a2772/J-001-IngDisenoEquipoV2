package bd.c;

import bd.r.ConsultaBuscandoId;
import clases.CatProducto;
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

    public void setCarrito(Carrito carrito) throws SQLException, DAOInitializationException, ClassNotFoundException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement pStmt = null;
        String sql;
        //Ahora procedemos a insertar la parte de Venta
        try {
            sql = "insert into Venta(iva, total, fecha, idPersonal1) values(?,?,?,?)";

            pStmt = con.prepareStatement(sql);
            pStmt.setFloat(1, carrito.getVenta().getIva());
            pStmt.setFloat(2, carrito.getVenta().getTotal());
            pStmt.setObject(3, carrito.getVenta().getFecha());
            pStmt.setInt(4, carrito.getVenta().getPersonal().getIdPersonal());

            pStmt.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            if (pStmt != null) {
                pStmt.close();
            }
        }

        //Obtenemos la ID de la venta que acabamos de insertar
        ConsultaBuscandoId consultaBuscandoId = new ConsultaBuscandoId();
        int idVenta = consultaBuscandoId.getIdMaxVenta();

        pStmt = null;
        for (Articulo art : carrito.getlArticulo()) {//Por cada artícuol del carrito
            try {
                sql = "insert into productoVenta(cantidad, precio, idVenta1, idCProducto1) values(?,?,?,?)";

                pStmt = con.prepareStatement(sql);
                pStmt.setInt(1, art.getProductoVenta().getCantidad());
                pStmt.setFloat(2, art.getProductoVenta().getPrecio());
                pStmt.setInt(3, idVenta);
                pStmt.setInt(4, art.getProductoVenta().getCatProducto().getIdCProducto());
                //System.out.println("C: " + art.getProductoVenta().getCantidad() +"; $:" + art.getProductoVenta().getPrecio() +"; ID: " +  idVenta + "; IDCP: " + art.getProductoVenta().getCatProducto().getIdCProducto() );

                pStmt.executeUpdate();
            } catch (SQLException ex) {

            } finally {
                if (pStmt != null) {
                    pStmt.close();
                }
            }
        }
    }
    public void setCatProducto(CatProducto cp) throws SQLException, DAOInitializationException, ClassNotFoundException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement pStmt = null;
        String sql;
        //Ahora procedemos a insertar
        try {
            sql = "insert into catProducto(producto,descripcionAlmacenar,descripcion,precio,color,idCategoria1,idMarca1) values (?,?,?,?,?,?,?)";

            pStmt = con.prepareStatement(sql);
            pStmt.setString(1, cp.getProducto());
            pStmt.setString(2, cp.getDescripcionAlmacenar());
            pStmt.setString(3, cp.getDescripcion());
            pStmt.setFloat(4, cp.getPrecio());
            pStmt.setString(5, cp.getColor());
            pStmt.setInt(6, cp.getCatCategoria().getIdCategoria());
            pStmt.setInt(7, cp.getCatMarca().getIdMarca());

            pStmt.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            if (pStmt != null) {
                pStmt.close();
            }
        }
    }
}
