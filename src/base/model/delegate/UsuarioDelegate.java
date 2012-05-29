/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.model.delegate;

/**
 *
 * @author eortiz
 */
import base.model.dto.UsuarioDTO;
import base.model.facade.UsuarioFacade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author asuncion
 */
public class UsuarioDelegate {
    private Connection cnn;
    private UsuarioFacade artFacade;
    public UsuarioDelegate() {
        String user = "root";
        String pwd = "root";
        String url = "jdbc:mysql://localhost:3306/pruebas";
        String mySqlDriver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(mySqlDriver);
            cnn = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        artFacade = new UsuarioFacade(cnn);
    }
    //Codigo para los Articulos
    public void crearUsuario(UsuarioDTO dto) throws SQLException {
        artFacade.crear(dto);
    }
    public List listarUsuarios() throws SQLException {
        return artFacade.listar();
    }
    public UsuarioDTO leerUsuario(UsuarioDTO dto) throws SQLException {
        return artFacade.leer(dto);
    }
    public void actualiza(UsuarioDTO dto) throws SQLException {
        artFacade.actualiza(dto);
    }
    public void elimina(UsuarioDTO dto) throws SQLException {
        artFacade.elimina(dto);
    }
}
