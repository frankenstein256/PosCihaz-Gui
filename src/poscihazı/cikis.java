/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poscihazı;

/**
 *
 * @author Kubra
 */
public class cikis {
      

poscihazi enter;


  public cikis(poscihazi pd){
      enter=pd;
  }
  

    public poscihazi getEnter() {
        return enter;
    }

    public void setEnter(poscihazi enter) {
        this.enter = enter;
    } 
       public Object getCikiskod() {
         getEnter().getPin().setVisible(false);
           getEnter().getSifre1().setVisible(false);
           getEnter().getSifree().setVisible(true);
          getEnter().getSatistutar().setVisible(true);
           getEnter().getSifree().setText("Teşekkürler...   ");
           getEnter().getSatistutar().setText("fişinizi alabilirsiniz...");
          getEnter().getSlipp().setVisible(true);
           return 1;
       }
    
}
