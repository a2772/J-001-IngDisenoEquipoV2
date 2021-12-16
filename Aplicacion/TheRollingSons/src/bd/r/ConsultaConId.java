package bd.r;

import clases.*;
import dao.DAOInitializationException;
import dao.DataAccessObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaConId extends DataAccessObject {

    public ConsultaConId () throws ClassNotFoundException, SQLException {
        super();
    }
    public Personal getPersonal(int idPersonal) throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        Personal p = new Personal();
        //Objetos
        CatPerfil cp =new CatPerfil();
        CatSexo cs = new CatSexo();
        
        String sql = "select * from personal p, catPerfil cp, catSexo cs where p.idCPerfil1=cp.idCPerfil and cs.idSexo=p.idSexo1 and p.idPersonal=?";
        
        try {
            stmt = prepareStatement(sql);
            stmt.setInt(1, idPersonal);
            rs = stmt.executeQuery();
            while (rs.next()) {
                isValid = true;
                //Tabla trabajador
                p.setIdPersonal(rs.getInt("idPersonal"));
                p.setNombre(rs.getString("nombre"));
                p.setApPat(rs.getString("apPat"));
                p.setApMat(rs.getString("apMat"));
                p.setCorreo(rs.getString("correo"));
                p.setCurp(rs.getString("curp"));
                p.setFechaNac(rs.getObject("fechNac", LocalDate.class));
                p.setTel(rs.getString("tel"));
                //Parte del CatPerfil
                cp.setIdCPerfil(rs.getInt("idCPerfil"));
                cp.setPerfil(rs.getString("perfil"));
                //Parte CatSexo
                cs.setIdSexo(rs.getInt("idSexo"));
                cs.setSexo(rs.getString("sexo"));
                //Pasando los objetos
                p.setCatPerfil(cp);
                p.setCatSexo(cs);
            }
        } catch (DAOInitializationException | SQLException ex) {
            isValid = false;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return p;
    }
    public Venta getVenta(int idVenta) throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Venta ve = null;
        //Objetos
        CatPerfil cp =new CatPerfil();
        CatSexo cs = new CatSexo();
        
        String sql = "select * from venta where idVenta=?";
        
        try {
            stmt = prepareStatement(sql);
            stmt.setInt(1, idVenta);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ve= new Venta();
                ve.setIdVenta(rs.getInt("idVenta"));
                ve.setIva(rs.getFloat("iva"));
                ve.setTotal(rs.getFloat("total"));
                ve.setFecha(rs.getObject("fecha", LocalDateTime.class));
            }
        } catch (DAOInitializationException | SQLException ex) {
            
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return ve;
    }
    public CatProducto getCatProducto(int idCatProducto) throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        CatProducto catP=null;
        CatMarca cM;
        CatCategoria cC;

        String sql = "select * from catProducto cp, catMarca cm, catCategoria cc where cp.idCategoria1=cc.idCategoria and cp.idMarca1=cm.idMarca and cp.idCProducto=?";

        try {
            stmt = prepareStatement(sql);
            stmt.setInt(1, idCatProducto);            
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatProducto();
                //Tabla trabajador
                catP.setIdCProducto(rs.getInt("idCProducto"));
                catP.setProducto(rs.getString("producto"));
                catP.setPrecio(rs.getFloat("precio"));
                catP.setColor(rs.getString("color"));
                catP.setDescripcion(rs.getString("descripcion"));
                catP.setDescripcionAlmacenar(rs.getString("descripcionAlmacenar"));
                //CatMarca
                cM = new CatMarca();
                cM.setIdMarca(rs.getInt("idMarca"));
                cM.setMarca(rs.getString("marca"));
                //CatCategoria
                cC = new CatCategoria();
                cC.setIdCategoria(rs.getInt("idCategoria"));
                cC.setCategoria(rs.getString("categoria"));
                //Añadiendo objetos
                catP.setCatCategoria(cC);
                catP.setCatMarca(cM);
                
            }
        } catch (DAOInitializationException | SQLException ex) {
            
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return catP;
    }
}
