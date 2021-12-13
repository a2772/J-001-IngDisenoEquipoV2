package bd.r;

import clases.*;
import clases.util.Usuario;
import dao.DAOInitializationException;
import dao.DataAccessObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaBuscandoId extends DataAccessObject {

    public ConsultaBuscandoId () throws ClassNotFoundException, SQLException {
        super();
    }
    public int getIdPersonal(Usuario usuario) throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        Personal p = new Personal();
        
        String sql = "select p.idPersonal from personal p, pass ps where p.idPersonal=ps.idPersonal4 and p.correo=? and ps.pass=?";
        
        try {
            stmt = prepareStatement(sql);
            stmt.setString(1, usuario.getCorreo());
            stmt.setString(2, usuario.getPass());
            rs = stmt.executeQuery();
            while (rs.next()) {
                isValid = true;
                p.setIdPersonal(rs.getInt("idPersonal"));
            }
        } catch (DAOInitializationException | SQLException ex) {
            isValid = false;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return p.getIdPersonal();
    }
}
