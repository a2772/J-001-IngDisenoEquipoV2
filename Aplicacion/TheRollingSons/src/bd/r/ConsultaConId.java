package bd.r;

import clases.*;
import dao.DAOInitializationException;
import dao.DataAccessObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

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
        
        String sql = "select * from personal p, catPerfil cp where p.idCPerfil1=cp.idCPerfil and p.idPersonal=?";
        
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
                
                //Pasando los objetos
                p.setCatPerfil(cp);
            }
        } catch (DAOInitializationException | SQLException ex) {
            isValid = false;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return p;
    }
}
