/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author eortiz
 */


import base.controller.Controller;
import base.model.Model;
import base.view.View;
import base.view.mainFrame;
import base.eventbus.Event_Bus;

public class BaseMain implements Runnable {

    /**
     * @param args the command line arguments
     */
    
    
    public static BaseMain instance;
    
  
    private Model model;
    private View view;
    private Controller controller;
    
    
    public static void main(String[] args) {
        
        System.out.println("Iniciando Aplicacion");
        instance = new BaseMain();
        instance.run();
        
        
    }
    
    public void run(){
        System.out.println("Corriendo Instancia");
        
        model = new Model();
        view = new View(model);
        controller = new Controller(model, view);
        
        Event_Bus.getInstance().eventbus.register(controller);
        
        
        view.setVisible(true);
        
        
        
        
        
    }
    
    
}
