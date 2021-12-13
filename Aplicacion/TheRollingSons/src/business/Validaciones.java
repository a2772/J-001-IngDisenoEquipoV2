package business;

import clases.util.Usuario;
import bd.validaciones.*;
import dao.DAOInitializationException;
import java.sql.SQLException;

public class Validaciones {
    public boolean usuarioValido(Usuario usuario) throws ClassNotFoundException, SQLException, DAOInitializationException {
        usuario.setEstatus(false);
        //Buscando en la BD si es válido
        Login login = new Login();
        usuario.setEstatus(login.inicioSesion(usuario.getCorreo(), usuario.getPass()));
        return usuario.isEstatus();
    }
}
