package business;

import bd.r.ConsultaConId;
import clases.Personal;
import clases.Venta;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class GetById {
    public Personal getPersonalById(int id) throws ClassNotFoundException, SQLException, DAOInitializationException{
        Personal personal;
        ConsultaConId consultaConId = new ConsultaConId();
        personal = consultaConId.getPersonal(id);
        return personal;
    }
    public Venta getVentaById(int id) throws ClassNotFoundException, SQLException, DAOInitializationException{
        Venta venta;
        ConsultaConId consultaConId = new ConsultaConId();
        venta = consultaConId.getVenta(id);
        return venta;
    }
}
