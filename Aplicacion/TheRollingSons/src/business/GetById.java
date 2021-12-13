package business;

import bd.r.ConsultaConId;
import clases.Personal;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class GetById {
    public Personal getPersonalById(int id) throws ClassNotFoundException, SQLException, DAOInitializationException{
        Personal personal;
        ConsultaConId consultaConId = new ConsultaConId();
        personal = consultaConId.getPersonal(id);
        return personal;
    }
}
