package bd.r;

import clases.CatCategoria;
import clases.CatMarca;
import clases.CatProducto;
import clases.CatSeccion;
import clases.Inventario;
import dao.DAOInitializationException;
import dao.DataAccessObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultaGeneral extends DataAccessObject {

    public ConsultaGeneral () throws ClassNotFoundException, SQLException {
        super();
    }
    //Consultar todo en inventarios
    public List<Inventario> getLInventario() throws SQLException, DAOInitializationException{
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<Inventario> lista = new ArrayList<>();
        Inventario inventario;
        CatProducto catProducto;
        CatSeccion catSeccion;
        
        CatCategoria catCategoria;
        
        //SUB- Anidados
        CatCategoria cc;
        CatMarca cm;
        
        String sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                inventario = new Inventario();
                //Tabla trabajador
                inventario.setIdInventario(rs.getInt("idInventario"));
                inventario.setCantidad(rs.getInt("cantidad"));
                inventario.setDescripcion(rs.getString("descripcion"));
                //Cat Producto
                
                catProducto=new CatProducto();
                catProducto.setIdCProducto(rs.getInt("idCProducto"));
                catProducto.setColor(rs.getString("color"));
                catProducto.setDescripcion(rs.getString("descripcion"));
                catProducto.setDescripcionAlmacenar(rs.getString("descripcionAlmacenar"));
                catProducto.setPrecio(rs.getFloat("precio"));
                catProducto.setProducto(rs.getString("producto"));
                            //SUB  de Cat Producto
                cc = new CatCategoria();
                cm = new CatMarca();
                cc.setIdCategoria(rs.getInt("idCategoria"));
                cc.setCategoria(rs.getString("categoria"));
                cm.setIdMarca(rs.getInt("idMarca"));
                cm.setMarca(rs.getString("marca"));
                
                catProducto.setCatCategoria(cc);
                catProducto.setCatMarca(cm);
                //CatSeccion
                catSeccion = new CatSeccion();
                catSeccion.setIdSeccion(rs.getInt("idSeccion"));
                catSeccion.setSeccion(rs.getString("seccion"));
                
                inventario.setCatProducto(catProducto);
                inventario.setCatSeccion(catSeccion);
                
                lista.add(inventario);
            }
        } catch (DAOInitializationException | SQLException ex) {
            lista = null;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return lista;
    }
}
