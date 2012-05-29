/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.model.facade;

/**
 *
 * @author eortiz
 */
import base.model.dao.UsuarioDAO;
import base.model.dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
/** @author asuncion */

public class UsuarioFacade {
    private Connection cnn;
    private UsuarioDAO dao;
    public UsuarioFacade(Connection cnn) {
        this.cnn = cnn;
        dao = new UsuarioDAO();
    }
    public void crear(UsuarioDTO dto) throws SQLException {
        dao.create(dto, cnn);
    }
    public List listar() throws SQLException {
        return dao.loadAll(cnn);
    }
    public UsuarioDTO leer(UsuarioDTO dto)throws SQLException {
        return dao.load(dto, cnn);
    }
    public void actualiza(UsuarioDTO dto)throws SQLException {
         dao.update(dto, cnn);
    }
    public void elimina(UsuarioDTO dto)throws SQLException {
         dao.delete(dto, cnn);
    }
}
