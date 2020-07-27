/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import poscihazı.poscihazi;

/**
 *
 * @author Administrator
 */
public class actionTest {
    
         poscihazi b;
   action a;
    public actionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            b=null;
     new action(b); 
    }
    
    @After
    public void tearDown() {
     
        a=null;
          a.sifre="12364";
          
    }
    @Test
      public void testadd()
      {
          
            assertEquals(4,a.sifre.length());  
        }
    
    @Test
    public void testGetA() {
        System.out.println("getA");
        action i = new action();
        poscihazi j = null;
        poscihazi result = i.getA();
        assertEquals(j, result);
      
    }

    @Test
    public void testSetA() {        //set a test yani burada set a ile bazı textk boxlar setleniyor mu 
        System.out.println("setA");
        poscihazi aa = null;
        action bb = new action();
        bb.setA(aa);
    }

    
    @Test
    public void testAction() {
        System.out.println("tiklama action olayi");
        ActionEvent deneme = null;
        action tikferform = new action();
        tikferform.actionPerformed(deneme); // buna bak mutlaka 
    }

    @Test
    public void testGetyukari() {
        System.out.println("getyukari");
        action testyukari = new action();
        Object karsilastirmayukari = null;
        Object konty = testyukari.getyukari();
        assertEquals(karsilastirmayukari, konty);
    }

    @Test
    public void testGetasagi() {
        System.out.println("getasagi");
        action testasagi = new action();
        Object karsilatirmaasagi = null;
        Object konta = testasagi.getasagi();
        assertEquals(karsilatirmaasagi, konta);
      
    }
    
}
