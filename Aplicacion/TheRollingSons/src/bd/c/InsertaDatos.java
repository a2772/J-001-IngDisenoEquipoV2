package bd.c;

import bd.r.ConsultaBuscandoId;
import clases.Personal;
import clases.util.Articulo;
import dao.DAOInitializationException;
import dao.DataAccessObject;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertaDatos extends DataAccessObject {

    public InsertaDatos() throws ClassNotFoundException, SQLException {
        super();
    }

    public void setPersonal(Personal p) throws SQLException, DAOInitializationException, ClassNotFoundException {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement pStmt = null;
        String sql;
        //Ahora procedemos a insertar la parte de Venta
        try {
            sql = "insert into personal(nombre,apPat,apMat,curp,tel,fechNac,correo,idCPerfil1,idSexo1) values (?,?,?,?,?,?,?,?,?)";

            pStmt = con.prepareStatement(sql);
            pStmt.setString(1, p.getNombre());
            pStmt.setString(2, p.getApPat());
            pStmt.setString(3, p.getApMat());
            pStmt.setString(4, p.getCurp());
            pStmt.setString(5, p.getTel());
            pStmt.setObject(6, p.getFechaNac());
            pStmt.setString(7, p.getCorreo());
            pStmt.setInt(8, p.getCatPerfil().getIdCPerfil());
            pStmt.setInt(9, p.getCatSexo().getIdSexo());
            
            pStmt.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            if (pStmt != null) {
                pStmt.close();
            }
        }
    }
}
