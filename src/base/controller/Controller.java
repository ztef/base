/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.controller;


import com.google.common.eventbus.Subscribe;
import base.events.LoginEvent;
import base.model.Model;
import base.view.View;
 

/**
 *
 * @author eortiz
 */
public class Controller {
    
    public Model model;
    public View view;
    
    
    public  Controller(Model model, View view){
        this.model = model;
        this.view = view;
        
    }
    
    
    @Subscribe
    public void handleLogin(LoginEvent event) {
           System.out.println("Se quiere manejar un login para "+event.username);   
    }
    
    
    
    
    
    
}
