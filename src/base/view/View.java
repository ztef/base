/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.view;

import base.model.Model;

/**
 *
 * @author eortiz
 */
public class View {
    
    private Model model;

    private mainFramePM mainframePM;
    
    
    public  View(Model model){
        this.model = model;
                
        // Inicializa la vista:
                
          mainframePM = new mainFramePM();
                
        
    }

    
    public void setVisible(boolean b){
        
        mainframePM.setVisible(b);
    }
    
    
}
