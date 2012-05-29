/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.eventbus;

import com.google.common.eventbus.EventBus;

/**
 *
 * @author eortiz
 */
public class Event_Bus {
    
    public EventBus eventbus;
    
    
   private static Event_Bus instance = null;
   protected Event_Bus() {
       eventbus = new EventBus();
   }
   public static Event_Bus getInstance() {
      if(instance == null) {
         instance = new Event_Bus();
      }
      return instance;
   }
    
    
    
}
