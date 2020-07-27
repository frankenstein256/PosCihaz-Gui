/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import poscihazı.giris;
import poscihazı.poscihazi;
import poscihazı.*;
import poscihazı.cikis;
import poscihazı.giris;
import poscihazı.kredikartibankakarti;
import poscihazı.poscihazi;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import Actions.*;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class poscihaziunittest {
    
   poscihazi b=new poscihazi();
   action a=new action(b);
    
    void poscihaziunittest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
   public void poscihaziunittest1() {
        assertEquals(4,a.sifre.length());  
      System.out.print("lkm");
    }

}
