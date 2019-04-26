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
public class Cadenas2Test {
    
    public Cadenas2Test() {
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
     * Test of concatenaCadena method, of class Cadenas2.
     */
    @Test
    public void testConcatenaCadena() {
        System.out.println("concatenaCadena");
        String texto1 = "ho";
        String texto2 = "la";
        String expResult = "hola";
        String result = Cadenas2.concatenaCadena(texto1, texto2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
