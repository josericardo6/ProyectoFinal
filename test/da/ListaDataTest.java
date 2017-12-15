/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo Rodriguez
 */
public class ListaDataTest {
    
    public ListaDataTest() {
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
     * Test of getCabeza method, of class ListaData.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaData instance = new ListaData();
        NodoData expResult = null;
        NodoData result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaData.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        ListaData instance = new ListaData();
        instance.setCabeza(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class ListaData.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        ListaData instance = new ListaData();
        NodoData expResult = null;
        NodoData result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimo method, of class ListaData.
     */
    @Test
    public void testSetUltimo() {
        System.out.println("setUltimo");
        ListaData instance = new ListaData();
        instance.setUltimo(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ListaData.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ListaData instance = new ListaData();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ListaData.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ListaData instance = new ListaData();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaData.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        NodoData nuevo = null;
        ListaData instance = new ListaData();
        boolean expResult = true;
        boolean result = instance.add(nuevo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaData.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaData instance = new ListaData();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, "");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
