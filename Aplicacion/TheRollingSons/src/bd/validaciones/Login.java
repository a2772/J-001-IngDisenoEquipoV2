package bd.validaciones;

import dao.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends DataAccessObject{
    public Login() throws ClassNotFoundException,SQLException{
        super();
    }
    public boolean inicioSesion (String email, String pass) throws ClassNotFoundException, SQLException, DAOInitializationException{
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        String sql = "select ps.pass from Datos d, Personal p, Pass ps where d.idDatos=p.idDatos and ps.idPersonal=p.idPersonal and p.email=? and ps.pass=?";
        try {
            stmt = prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2,pass);
            rs = stmt.executeQuery();
            System.out.println("Hola");
            if (rs.next()) {
                System.out.println("Hola2");
                isValid = true;
            }
        } catch (DAOInitializationException | SQLException ex) {
            System.out.println("Hola3");
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return isValid;
    }
}
