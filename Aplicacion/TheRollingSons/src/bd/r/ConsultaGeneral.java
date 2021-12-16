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

    public ConsultaGeneral() throws ClassNotFoundException, SQLException {
        super();
    }

    //Consultar todo en inventarios
    public List<Inventario> getLInventario() throws SQLException, DAOInitializationException {
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

                catProducto = new CatProducto();
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

    public List<Inventario> getLInventarioFiltro(int idMarca, int idCategoria) throws SQLException, DAOInitializationException {
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
        String sql = "";
        int caso = 0;

        if (idMarca == -1 && idCategoria == -1) {//Si no hay filtros
            sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1";
            caso = 0;
        } else if (idMarca != -1 && idCategoria != -1) {//Si tiene ambos filtros
            sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cm.idMarca=? and cc.idCategoria=?";
            caso = 1;
        } else if (idMarca != -1) {//Solo filtro marca
            sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cm.idMarca=?";
            caso = 2;
        } else if (idCategoria != -1) {//Solo filtro categoría
            sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cc.idCategoria=?";
            caso = 3;
        }

        try {
            stmt = prepareStatement(sql);
            switch (caso) {
                case 0://Sin filtro
                    break;
                case 1://Ambos filtros (primero marca luego categoría)
                    stmt.setInt(1, idMarca);
                    stmt.setInt(2, idCategoria);
                    break;
                case 2://Marca
                    stmt.setInt(1, idMarca);
                    break;
                case 3://Categoría
                    stmt.setInt(1, idCategoria);
                    break;
            }
            rs = stmt.executeQuery();
            while (rs.next()) {
                inventario = new Inventario();
                //Tabla trabajador
                inventario.setIdInventario(rs.getInt("idInventario"));
                inventario.setCantidad(rs.getInt("cantidad"));
                inventario.setDescripcion(rs.getString("descripcion"));
                //Cat Producto

                catProducto = new CatProducto();
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
    public List<CatProducto> getLCatProductoFiltro(int idMarca, int idCategoria) throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<CatProducto> lista = new ArrayList<>();
        CatProducto cp;
        CatMarca cm;
        CatCategoria cc;
        
        String sql = "";
        int caso = 0;

        if (idMarca == -1 && idCategoria == -1) {//Si no hay filtros
            sql = "select * from catProducto cp, catMarca cm, catCategoria cc where cp.idCategoria1=cc.idCategoria and cp.idMarca1=cm.idMarca";
            caso = 0;
        } else if (idMarca != -1 && idCategoria != -1) {//Si tiene ambos filtros
            sql = "select * from catProducto cp, catMarca cm, catCategoria cc where cp.idCategoria1=cc.idCategoria and cp.idMarca1=cm.idMarca and cm.idMarca=? and cc.idCategoria=?";
            caso = 1;
        } else if (idMarca != -1) {//Solo filtro marca
            sql = "select * from catProducto cp, catMarca cm, catCategoria cc where cp.idCategoria1=cc.idCategoria and cp.idMarca1=cm.idMarca and cm.idMarca=?";
            caso = 2;
        } else if (idCategoria != -1) {//Solo filtro categoría
            sql = "select * from catProducto cp, catMarca cm, catCategoria cc where cp.idCategoria1=cc.idCategoria and cp.idMarca1=cm.idMarca and cc.idCategoria=?";
            caso = 3;
        }

        try {
            stmt = prepareStatement(sql);
            switch (caso) {
                case 0://Sin filtro
                    break;
                case 1://Ambos filtros (primero marca luego categoría)
                    stmt.setInt(1, idMarca);
                    stmt.setInt(2, idCategoria);
                    break;
                case 2://Marca
                    stmt.setInt(1, idMarca);
                    break;
                case 3://Categoría
                    stmt.setInt(1, idCategoria);
                    break;
            }
            rs = stmt.executeQuery();
            while (rs.next()) {//Recuperando valores
                cp = new CatProducto();
                //Cat Producto
                cp = new CatProducto();
                
                cp.setIdCProducto(rs.getInt("idCProducto"));
                cp.setColor(rs.getString("color"));
                cp.setDescripcion(rs.getString("descripcion"));
                cp.setDescripcionAlmacenar(rs.getString("descripcionAlmacenar"));
                cp.setPrecio(rs.getFloat("precio"));
                cp.setProducto(rs.getString("producto"));
                //SUB  de Cat Producto
                cc = new CatCategoria();
                cm = new CatMarca();
                cc.setIdCategoria(rs.getInt("idCategoria"));
                cc.setCategoria(rs.getString("categoria"));
                cm.setIdMarca(rs.getInt("idMarca"));
                cm.setMarca(rs.getString("marca"));

                cp.setCatCategoria(cc);
                cp.setCatMarca(cm);
                
                lista.add(cp);
            }
        } catch (DAOInitializationException | SQLException ex) {
            lista = null;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return lista;
    }

    public List<Inventario> getLInventarioFiltro2(int idMarca, int idCategoria, int idSeccion) throws SQLException, DAOInitializationException {
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
        CatSeccion cs;
        String sql = "";
        int caso = 0;

        if (idSeccion != -1) {
            if (idMarca == -1 && idCategoria == -1) {//Si no hay filtros
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cs.idSeccion=?";
                caso = 4;
            } else if (idMarca != -1 && idCategoria != -1) {//Si tiene ambos filtros
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cm.idMarca=? and cc.idCategoria=? and cs.idSeccion=?";
                caso = 5;
            } else if (idMarca != -1) {//Solo filtro marca
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cm.idMarca=? and cs.idSeccion=?";
                caso = 6;
            } else if (idCategoria != -1) {//Solo filtro categoría
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cc.idCategoria=? and cs.idSeccion=?";
                caso = 7;
            }
        } else {//Si es -1 ingoramos la id de seccion
            if (idMarca == -1 && idCategoria == -1) {//Si no hay filtros
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1";
                caso = 0;
            } else if (idMarca != -1 && idCategoria != -1) {//Si tiene ambos filtros
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cm.idMarca=? and cc.idCategoria=?";
                caso = 1;
            } else if (idMarca != -1) {//Solo filtro marca
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cm.idMarca=?";
                caso = 2;
            } else if (idCategoria != -1) {//Solo filtro categoría
                sql = "select * from inventario i, catProducto cp, catSeccion cs, catMarca cm, catCategoria cc where i.idCProducto2=cp.idCProducto and i.idSeccion1=cs.idSeccion and cm.idMarca=cp.idMarca1 and cc.idCategoria=cp.idCategoria1 and cc.idCategoria=?";
                caso = 3;
            }
        }

        try {
            stmt = prepareStatement(sql);
            switch (caso) {
                case 0://Sin filtro
                    break;
                case 1://Ambos filtros (primero marca luego categoría)
                    stmt.setInt(1, idMarca);
                    stmt.setInt(2, idCategoria);
                    break;
                case 2://Marca
                    stmt.setInt(1, idMarca);
                    break;
                case 3://Categoría
                    stmt.setInt(1, idCategoria);
                    break;
                //Caso con CatSeccion
                case 4://Solo Cat Seccion
                    stmt.setInt(1, idSeccion);
                    break;
                case 5://Ambos filtros (primero marca luego categoría)
                    stmt.setInt(1, idMarca);
                    stmt.setInt(2, idCategoria);
                    stmt.setInt(3, idSeccion);
                    break;
                case 6://Marca
                    stmt.setInt(1, idMarca);
                    stmt.setInt(2, idSeccion);
                    break;
                case 7://Categoría
                    stmt.setInt(1, idCategoria);
                    stmt.setInt(2, idSeccion);
                    break;
            }
            rs = stmt.executeQuery();
            while (rs.next()) {
                inventario = new Inventario();
                //Tabla trabajador
                inventario.setIdInventario(rs.getInt("idInventario"));
                inventario.setCantidad(rs.getInt("cantidad"));
                inventario.setDescripcion(rs.getString("descripcion"));
                //Cat Producto

                catProducto = new CatProducto();
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
