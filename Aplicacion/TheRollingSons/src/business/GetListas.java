package business;

import bd.r.ConsultaCats;
import bd.r.ConsultaGeneral;
import clases.CatCategoria;
import clases.CatDia;
import clases.CatHorario;
import clases.CatMarca;
import clases.CatPerfil;
import clases.CatProducto;
import clases.CatSeccion;
import clases.CatSexo;
import clases.Inventario;
import clases.Personal;
import clases.ProductoVenta;
import clases.Venta;
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
    
    //Obteniendo listas distintas a los CAT
    
    public List<Inventario> fillLInventario() throws ClassNotFoundException, ClassNotFoundException, SQLException, DAOInitializationException{
        List<Inventario> list;
        ConsultaGeneral consultaGeneral = new ConsultaGeneral();
        list = consultaGeneral.getLInventario();
        return list;
    }
    public List<Inventario> fillLInventarioFiltro(int idMarca, int idCategoria) throws ClassNotFoundException, ClassNotFoundException, SQLException, DAOInitializationException{
        List<Inventario> list;
        ConsultaGeneral consultaGeneral = new ConsultaGeneral();
        list = consultaGeneral.getLInventarioFiltro(idMarca, idCategoria);
        return list;
    }
    public List<Inventario> fillLInventarioFiltro2(int idMarca, int idCategoria, int idSeccion) throws ClassNotFoundException, ClassNotFoundException, SQLException, DAOInitializationException{
        List<Inventario> list;
        ConsultaGeneral consultaGeneral = new ConsultaGeneral();
        list = consultaGeneral.getLInventarioFiltro2(idMarca, idCategoria, idSeccion);
        return list;
    }
    public List<CatProducto> fillLCatProductoFiltro(int idMarca, int idCategoria) throws ClassNotFoundException, ClassNotFoundException, SQLException, DAOInitializationException{
        List<CatProducto> list;
        ConsultaGeneral consultaGeneral = new ConsultaGeneral();
        list = consultaGeneral.getLCatProductoFiltro(idMarca, idCategoria);
        return list;
    }
    public List<Venta> fillLCatVenta(Personal personal) throws ClassNotFoundException, ClassNotFoundException, SQLException, DAOInitializationException{
        List<Venta> list;
        ConsultaCats consultaCats = new ConsultaCats();
        list = consultaCats.getLVenta(personal);
        return list;
    }
    public List<ProductoVenta> fillLProductoVenta(Venta venta) throws ClassNotFoundException, ClassNotFoundException, SQLException, DAOInitializationException{
        List<ProductoVenta> list;
        ConsultaCats consultaCats = new ConsultaCats();
        list = consultaCats.getLProductoVenta(venta);
        return list;
    }
}
