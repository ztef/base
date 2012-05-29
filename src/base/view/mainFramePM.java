/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.view;


import base.events.LoginEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import base.eventbus.Event_Bus;

/**
 *
 * @author eortiz
 */
public class mainFramePM implements ActionListener {
    
    private mainFrame mainframe;
    
    public mainFramePM(){
        
        mainframe = new mainFrame();
        
        mainframe.jButton1.addActionListener(this);
        mainframe.jButton2.addActionListener(this);
                
    }
    
    public void setVisible(boolean b){
        mainframe.setVisible(b);
    }
    
    
    public void actionPerformed(ActionEvent event) {

          if(event.getSource()==mainframe.jButton2){
           System.out.println("quiere Salir");   
          }
          
          
          if(event.getSource()==mainframe.jButton1){
           System.out.println("login");   
           
           LoginEvent loginevent = new LoginEvent();
           loginevent.username =  mainframe.usuario.getText();
                   
           Event_Bus.getInstance().eventbus.post(loginevent);
           
           
           
          }
      
    }

        
    
    
}
