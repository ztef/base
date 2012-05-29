/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.model.dao;

/**
 *
 * @author eortiz
 */

import base.model.dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
   private static final String SQL_INSERT =
            "INSERT INTO usuarios ("
            + "username, password"
            + ") VALUES (?, ?)";
    private static final String SQL_SELECT =
            "SELECT username, password "
            + "  FROM usuarios where username = ?";
    private static final String SQL_SELECT_All =
            "SELECT username, password   "
            + "FROM usuarios";
    private static final String SQL_UPDATE =
            "UPDATE usuarios SET "
            + "username = ?, password = ?"
            + " WHERE "
            + "username = ? ";
    /* SQL to delete data */
    private static final String SQL_DELETE =
            "DELETE FROM usuarios WHERE "
            + "username = ?";
    public void create(UsuarioDTO dto, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, dto.getUsername());
            ps.setString(2, dto.getPassword());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
    public UsuarioDTO load(UsuarioDTO dto, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, dto.getUsername());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0) {
                return (UsuarioDTO) results.get(0);
            } else {
                return null;
            }
        } finally {
            cerrar(rs);
            cerrar(ps);
            cerrar(conn);
        }
    }
    public List loadAll(Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT_All);
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0) {
                return results;
            } else {
                return null;
            }
        } finally {
            cerrar(rs);
            cerrar(ps);
            cerrar(conn);
        }
    }
    public void update(UsuarioDTO dto, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, dto.getUsername());
            ps.setString(2, dto.getPassword());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
    public void delete(UsuarioDTO dto, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, dto.getUsername());
            ps.executeUpdate();
        } finally {
            cerrar(ps);
            cerrar(conn);
        }
    }
    private List getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList();
        while (rs.next()) {
            UsuarioDTO dto = new UsuarioDTO();
            dto.setUsername(rs.getString("username"));
            dto.setPassword(rs.getString("password"));
            results.add(dto);
        }
        return results;
    }
    private void cerrar(PreparedStatement ps) throws SQLException {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }
    private void cerrar(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            }
        }
    }
    private void cerrar(Connection cnn) {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (SQLException e) {
            }
        }
    }  
}
