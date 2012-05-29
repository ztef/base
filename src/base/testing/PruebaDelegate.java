package base.testing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eortiz
 */
import base.model.delegate.UsuarioDelegate;
import base.model.dto.UsuarioDTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/** @author asuncion */

public class PruebaDelegate {
    public PruebaDelegate() {
    }
    public static void main(String[] args) {
        UsuarioDelegate del = new UsuarioDelegate();
        UsuarioDTO dto = new UsuarioDTO();
        try {
            //Agregar un registro nuevo
            dto.setUsername("art1000");
            dto.setPassword("libreta");
            //dto.setExistencias(100);
            //dto.setPrecio(5000);
            del.crearUsuario(dto);
            //Actualizar un registro existente
            //dto.setClaveArticulo("art1000");
            //dto.setDescripcion("lap hp ");
            //dto.setExistencias(100);
            //dto.setPrecio(5000);
            // del.actualiza(dto);
            //Eliminar un registro
            //dto.setClaveArticulo("art1000");
            //del.elimina(dto);
            //Mostrar un solo registro
            //dto.setClaveArticulo("art1000");
            //dto = del.leerArticulo(dto);
            //System.out.println(dto);
            //Listar los registros
            //System.out.println(del.listarUsuarios());
        } catch (SQLException ex) {
            Logger.getLogger(PruebaDelegate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}