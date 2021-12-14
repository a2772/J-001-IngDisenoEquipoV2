package bd.r;

import clases.*;
import dao.DAOInitializationException;
import dao.DataAccessObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ConsultaCats extends DataAccessObject {

    public ConsultaCats() throws ClassNotFoundException, SQLException {
        super();
    }

    //Llenar CatPerfil
    public List<CatPerfil> getLCatPerfil() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<CatPerfil> lista = new ArrayList<>();
        CatPerfil catP;

        String sql = "select * from catPerfil";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatPerfil();
                //Tabla trabajador
                catP.setIdCPerfil(rs.getInt("idCPerfil"));
                catP.setPerfil(rs.getString("perfil"));
                lista.add(catP);
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
        List<CatCategoria> lista = new ArrayList<>();
        CatCategoria catC;

        String sql = "select * from catCategoria";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                //Tabla trabajador
                catC = new CatCategoria();
                catC.setIdCategoria(rs.getInt("idCategoria"));
                catC.setCategoria(rs.getString("categoria"));
                lista.add(catC);
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
        List<CatDia> lista = new ArrayList<>();
        CatDia catP;

        String sql = "select * from catDia";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatDia();
                //Tabla trabajador
                catP.setIdDia(rs.getInt("idDia"));
                catP.setDia(rs.getString("dia"));
                lista.add(catP);
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
        List<CatHorario> lista = new ArrayList<>();
        CatHorario catP = new CatHorario();
        CatDia cd = new CatDia();

        String sql = "select * from catHorario";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatHorario();
                //Tabla trabajador
                catP.setIdHorario(rs.getInt("idCHorario"));
                catP.setHoraInicio(rs.getObject("horaInicio", LocalTime.class));
                catP.setHoraFin(rs.getObject("horaFin", LocalTime.class));
                //Parte de los días, añadimos primero las ID, en otra consulta el día
                cd.setIdDia(rs.getInt("idDiaInicio"));
                catP.setCatDiaIni(cd);
                cd = new CatDia();
                cd.setIdDia(rs.getInt("idDiaFin"));
                catP.setCatDiaFin(cd);
                lista.add(catP);
            }
        } catch (DAOInitializationException | SQLException ex) {
            lista = null;
        } finally {
            closeResultSet(rs);
            closeStatement(stmt);
        }
        //Parte de los dias
        sql = "select * from catDia where idDia=?";
        for (CatHorario ch : lista) {
            //Día inicio
            rs = null;
            stmt = null;
            CatDia cdi;
            try {
                stmt = prepareStatement(sql);
                stmt.setInt(1, ch.getCatDiaIni().getIdDia());
                rs = stmt.executeQuery();
                while (rs.next()) {
                    //Tabla dia
                    cdi = new CatDia();
                    cdi.setIdDia(ch.getCatDiaIni().getIdDia());
                    cdi.setDia(rs.getString("dia"));
                    catP.setCatDiaIni(cdi);
                }
            } catch (DAOInitializationException | SQLException ex) {
                lista = null;
            } finally {
                closeResultSet(rs);
                closeStatement(stmt);
            }
            
            //Día Fin
            rs = null;
            stmt = null;
            cdi = new CatDia();
            try {
                stmt = prepareStatement(sql);
                stmt.setInt(1, ch.getCatDiaFin().getIdDia());
                rs = stmt.executeQuery();
                while (rs.next()) {
                    cdi = new CatDia();
                    //Tabla dia
                    cdi.setIdDia(ch.getCatDiaFin().getIdDia());
                    cdi.setDia(rs.getString("dia"));
                    catP.setCatDiaFin(cdi);
                }
            } catch (DAOInitializationException | SQLException ex) {
                lista = null;
            } finally {
                closeResultSet(rs);
                closeStatement(stmt);
            }
            
        }
        return lista;
    }
    //Llenar CatMarca

    public List<CatMarca> getLCatMarca() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<CatMarca> lista = new ArrayList<>();
        CatMarca catP;

        String sql = "select * from catMarca";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatMarca();
                //Tabla trabajador
                catP.setIdMarca(rs.getInt("idMarca"));
                catP.setMarca(rs.getString("marca"));
                lista.add(catP);
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
    public List<CatProducto> getLCatProducto() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        boolean isValid = false;
        List<CatProducto> lista = new ArrayList<>();
        CatProducto catP;
        CatMarca cM;
        CatCategoria cC;

        String sql = "select * from catProducto cp, catMarca cm, catCategoria cc where cp.idCategoria1=cc.idCategoria and cp.idMarca1=cm.idMarca";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatProducto();
                //Tabla trabajador
                catP.setIdCProducto(rs.getInt("idCProducto"));
                catP.setProducto(rs.getString("producto"));
                catP.setPrecio(rs.getFloat("precio"));
                catP.setColor(rs.getString("color"));
                catP.setDescripcion(rs.getString("descripcio"));
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
                
                lista.add(catP);
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
    public List<CatSeccion> getLCatSeccion() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<CatSeccion> lista = new ArrayList<>();
        CatSeccion catP;

        String sql = "select * from catSeccion";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatSeccion();
                //Tabla trabajador
                catP.setIdSeccion(rs.getInt("idSeccion"));
                catP.setSeccion(rs.getString("seccion"));
                lista.add(catP);
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
    public List<CatSexo> getLCatSexo() throws SQLException, DAOInitializationException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<CatSexo> lista = new ArrayList<>();
        CatSexo catP;

        String sql = "select * from catSexo";

        try {
            stmt = prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                catP = new CatSexo();
                //Tabla trabajador
                catP.setIdSexo(rs.getInt("idSexo"));
                catP.setSexo(rs.getString("sexo"));
                lista.add(catP);
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
