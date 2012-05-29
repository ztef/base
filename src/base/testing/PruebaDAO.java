package base.testing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eortiz
 */
import base.model.dao.UsuarioDAO;
import base.model.dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** @author asuncion */
public class PruebaDAO {
    public PruebaDAO() {
    }
    public static void main(String[] args) {
        /*
         * Pruebas de funcionamiento
         */
        Connection cnn = null;
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
        //Crear una Instacia del DTO
        UsuarioDTO dto = new UsuarioDTO();
        //Crear una instacia del DAO
        UsuarioDAO dao = new UsuarioDAO();
        try {
            //Agregar un registro nuevo
            //dto.setUsername("u1");
            //dto.setPassword("p1");
            //dto.setExistencias(100);
            //dto.setPrecio(5000);
            //dao.create(dto, cnn);
            
            //Actualizar un registro existente
            //dto.setClaveArticulo("art100");
            //dto.setDescripcion("lap hp ");
            //dto.setExistencias(100);
            //dto.setPrecio(5000);
            //dao.update(dto, cnn);
            
                      
            //Mostrar un solo registro
            //dto.setClaveArticulo("art100");
            //dto = dao.load(dto, cnn);
            //System.out.println(dto);
        
        //Eliminar un registro
            //dto.setClaveArticulo("art100");
            //dao.delete(dto, cnn);
            
            //Listar los registros
             System.out.println(dao.loadAll(cnn));
        } catch (SQLException ex) {
            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
