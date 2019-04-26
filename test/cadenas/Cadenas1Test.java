/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio Jesus
 */
public class Cadenas1Test {
    
    public Cadenas1Test() {
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

    

    /**
     * Test of pasaMay method, of class Cadenas1.
     */
    @Test
    public void testPasaMay() {
        System.out.println("pasaMay");
        String texto1 = "hola";
        String expResult = "HOLA";
        String result = Cadenas1.pasaMay(texto1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of pasaMin method, of class Cadenas1.
     */
    @Test
    public void testPasaMin() {
        System.out.println("pasaMin");
        String texto2 = "HOLA";
        String expResult = "hola";
        String result = Cadenas1.pasaMin(texto2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
