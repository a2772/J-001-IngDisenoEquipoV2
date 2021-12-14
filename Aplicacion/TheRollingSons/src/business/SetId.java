package business;
import bd.r.ConsultaBuscandoId;
import clases.util.Usuario;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class SetId {
    public int setIdPersonal(Usuario usuario) throws ClassNotFoundException, SQLException, DAOInitializationException {
        ConsultaBuscandoId consultaBuscandoId = new ConsultaBuscandoId();
        return consultaBuscandoId.getIdPersonal(usuario);
    }
}
