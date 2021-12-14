package business;

import bd.r.ConsultaCats;
import clases.CatCategoria;
import clases.CatDia;
import clases.CatHorario;
import clases.CatMarca;
import clases.CatPerfil;
import clases.CatProducto;
import clases.CatSeccion;
import clases.CatSexo;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.util.List;

public class GetListas {
    public List<CatSexo> fillLCatSexo() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatSexo> lCatSexo;
        ConsultaCats consultaCats = new ConsultaCats();
        lCatSexo = consultaCats.getLCatSexo();
        return lCatSexo;
    }
    public List<CatPerfil> fillLCatPerfil() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatPerfil> lCatPerfil;
        ConsultaCats consultaCats = new ConsultaCats();
        lCatPerfil = consultaCats.getLCatPerfil();
        return lCatPerfil;
    }
    public List<CatCategoria> fillLCatCategoria() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatCategoria> lista;
        ConsultaCats consultaCats = new ConsultaCats();
        lista = consultaCats.getLCatCategoria();
        return lista;
    }
    public List<CatDia> fillLCatDia() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatDia> list;
        ConsultaCats consultaCats = new ConsultaCats();
        list = consultaCats.getLCatDia();
        return list;
    }
    public List<CatHorario> fillLCatHorario() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatHorario> list;
        ConsultaCats consultaCats = new ConsultaCats();
        list = consultaCats.getLCatHorario();
        return list;
    }
    public List<CatMarca> fillLCatMarca() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatMarca> list;
        ConsultaCats consultaCats = new ConsultaCats();
        list = consultaCats.getLCatMarca();
        return list;
    }
    public List<CatProducto> fillLCatProducto() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatProducto> list;
        ConsultaCats consultaCats = new ConsultaCats();
        list = consultaCats.getLCatProducto();
        return list;
    }
    public List<CatSeccion> fillLCatSeccion() throws ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatSeccion> list;
        ConsultaCats consultaCats = new ConsultaCats();
        list = consultaCats.getLCatSeccion();
        return list;
    }    
}
