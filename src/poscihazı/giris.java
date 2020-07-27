/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poscihazı;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kubra
 */
public class giris {

  

poscihazi enter;


  public giris(poscihazi pd){
      enter=pd;
  }
  

    public poscihazi getEnter() {
        return enter;
    }

    public void setEnter(poscihazi enter) {
        this.enter = enter;
    } 
       public Object getCalistimakod() {
         getEnter().getSifree().setVisible(false);
           getEnter().getSatistutar().setVisible(false);
           getEnter().getAlt_label().setVisible(true);
           getEnter().getUst_label().setVisible(true);
           getEnter().getBosluklabel().setVisible(true);
           return 1;
       }
    
}
