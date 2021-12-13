package bd.r;

import clases.*;
import dao.DAOInitializationException;
import dao.DataAccessObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultaCats extends DataAccessObject {
    public ConsultaCats () throws ClassNotFoundException, SQLException {
        super();
    }
    
    //Llenar CatPerfil
    public List<CatPerfil> getLCatPerfil() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        List<CatPerfil> lista = new ArrayList<>();
        CatPerfil catP = new CatPerfil();
        
        String sql = "select * from catPerfil";
        
        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                isValid = true;
                //Tabla trabajador
                catP.setIdCPerfil(rs.getInt("idCPerfil"));
                catP.setPerfil(rs.getString("perfil"));
                lista .add(catP);
            }
        } catch (DAOInitializationException | SQLException ex) {
            lista = null;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return lista;
    }
    
    //Llenar CatCategoria
    
    //Llenar CatDia
    
    //Llenar CatHorario
    
    //Llenar CatMarca
    
    //Llenar CatPerfil
    
    //Llenar CatProducto
    
    //Llenar CatSeccion
    
}