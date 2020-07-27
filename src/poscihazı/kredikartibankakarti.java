/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poscihazı;

import java.awt.event.ActionEvent;

/**
 *
 * @author Kubra
 */
public class kredikartibankakarti {
    poscihazi enter1;
    
    public kredikartibankakarti(poscihazi kd){
      enter1=kd;
  }
  
      ActionEvent e = null;
    public poscihazi getEnter() {
        return enter1;
    }

    public void setEnter(poscihazi enter) {
        this.enter1 = enter;
    }  
     public Object getkredibanka() {
         
            getEnter().getAlt_label().setVisible(false);
           getEnter().getUst_label().setVisible(false);
           getEnter().getBosluklabel().setVisible(false);
           getEnter().getPin().setVisible(true);
           getEnter().getSifre1().setVisible(true);
           
           
         return 1;
     }
    
}
