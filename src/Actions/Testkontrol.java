/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javafx.beans.binding.Bindings;
import javafx.event.*;
import javax.swing.JOptionPane;
import poscihazı.giris;
import poscihazı.poscihazi;
import poscihazı.*;
import poscihazı.cikis;
import poscihazı.giris;
import poscihazı.kredikartibankakarti;
import poscihazı.poscihazi;
import java.util.Timer;
import java.util.Scanner;
public class Testkontrol {
    poscihazi a=new poscihazi();
    action b=new action(a);
    
    
    public boolean sifrekont()
    {
        b.sifre="1234";
        System.out.println("sifreyi kontrolü test ediliyor...");
        if(b.sifre.length()==4)
        return true;
        else
        return false;
    }
    public boolean testAsagi()
    {
        System.out.println("Test asağı buton visible kontrolü test ediliyor..."); //işlev kontrolü
        Object karsilatirmaasagi = null;
        Object konta = b.getasagi();
        if(konta==karsilatirmaasagi)
         return false;
        else
        return true;
    }
     public boolean testYukari()
    {
         System.out.println("Test yukarı buton visible kontrolü test ediliyor..."); //işlev kontrolü
        Object karsilatirmaasagi = null;
        Object konta = b.getyukari();
        if(konta==karsilatirmaasagi)
         return false;
        else
        return true;
    }
    
     public boolean bakiyeKontrol()
    {
         System.out.println("bakiye kontolü test ediliyor..."); //işlev kontrolü
        double bakiye = b.bakiye;
       double tutardonusum= Double.parseDouble(b.tutar);
      
        if(bakiye>tutardonusum)
         return true;
        else
        return false;
    }
     public boolean stringvonvertodoublekontrolbakiye()
     {
         int hata_denetim=0;
         System.out.println("string sayi kontolü test ediliyor..."); //işlev kontrolü
         //Scanner 
       String deger=b.tutar; //önceikle değer integer ise stringe strin ise zaten stringe dönüşüoyr mu test edilir
             try
             {
             Double.parseDouble(deger);
             }
             catch (Exception e)
             {
                 hata_denetim=1;
             }
             if(hata_denetim==0)
                 return true;
             else
                 return false;

     }
    
    
}
