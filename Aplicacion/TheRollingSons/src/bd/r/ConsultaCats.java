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
    public List<CatCategoria> getLCatCategoria() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        List<CatCategoria> lista = new ArrayList<>();
        CatCategoria catC = new CatCategoria();
        
        String sql = "select * from catCategoria";
        
        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                isValid = true;
                //Tabla trabajador
                catC.setIdCategoria(rs.getInt("idCategoria"));
                catC.setCategoria(rs.getString("categoria"));
                lista .add(catC);
            }
        } catch (DAOInitializationException | SQLException ex) {
            lista = null;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        return lista;
    }
    //Llenar CatDia
    public List<CatDia> getLCatDia() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        List<CatDia> lista = new ArrayList<>();
        CatDia catP = new CatDia();
        
        String sql = "select * from catDia";
        
        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                isValid = true;
                //Tabla trabajador
                catP.setIdDia(rs.getInt("idDia"));
                catP.setDia(rs.getString("dia"));
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
    //Llenar CatHorario
    public List<CatHorario> getLCatHorario() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        List<CatHorario> lista = new ArrayList<>();
        CatHorario catP = new CatHorario();
        
        String sql = "select * from catHorario";
        
        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                isValid = true;
                //Tabla trabajador
                catP.setIdHorario(rs.getInt("idCPerfil"));
                catP.setIdDiaInicio(rs.getString("perfil"));
                catP.set(rs.getString("perfil"));
                catP.setIdDiaInicio(rs.getString("perfil"));
                catP.setIdDiaInicio(rs.getString("perfil"));
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
    //Llenar CatMarca
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
    //Llenar CatProducto
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
    //Llenar CatSeccion
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
    //Llenar CatSexo
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
}