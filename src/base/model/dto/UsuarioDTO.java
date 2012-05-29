/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.model.dto;

/**
 *
 * @author eortiz
 */
public class UsuarioDTO {
    public String username;
    public String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "usuario=" + username + ", password=" + password + '}';
    }
    
    
    
    
    
}
