package business;

import bd.r.ConsultaCats;
import bd.r.ConsultaConId;
import bd.r.ConsultaGeneral;
import clases.CatSexo;
import clases.Personal;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class GetListas {
    public Personal getLCatSexo(int id) throws ClassNotFoundException, SQLException, DAOInitializationException{
        CatSexo catSexo;
        ConsultaCats consultaCats = new ConsultaCats();
        catSexo = consultaCats.getLCatSexo();
        return personal;
    }
}
