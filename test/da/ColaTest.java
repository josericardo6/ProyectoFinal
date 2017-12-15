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
public class ColaTest {
    
    public ColaTest() {
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
     * Test of size method, of class Cola.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Cola instance = new Cola();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class Cola.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Cola instance = new Cola();
        instance.setCabeza(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class Cola.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        Cola instance = new Cola();
        Nodo expResult = null;
        Nodo result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimo method, of class Cola.
     */
    @Test
    public void testSetUltimo() {
        System.out.println("setUltimo");
        Cola instance = new Cola();
        instance.setUltimo(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Cola.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Cola instance = new Cola();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class Cola.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Cola instance = new Cola();
        Nodo expResult = null;
        Nodo result = instance.top();
        assertEquals(expResult, null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cola.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cola instance = new Cola();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of queue method, of class Cola.
     */
    @Test
    public void testQueue() {
        System.out.println("queue");
        String nombre = "";
        String apellido = "";
        String apellido2 = "";
        String documento = "";
        double edad = 0.0;
        Cola instance = new Cola();
        boolean expResult = false;
        boolean result = instance.queue(nombre, apellido, apellido2, documento, edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeSort method, of class Cola.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Nodo inicial = null;
        Cola instance = new Cola();
        Nodo expResult = null;
        Nodo result = instance.mergeSort(inicial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeCola method, of class Cola.
     */
    @Test
    public void testMergeCola() {
        System.out.println("mergeCola");
        Nodo izqIni = null;
        Nodo derIni = null;
        Cola instance = new Cola();
        instance.mergeCola(izqIni, derIni);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCedulaPasaporte method, of class Cola.
     */
    @Test
    public void testValidarCedulaPasaporte() {
        System.out.println("validarCedulaPasaporte");
        String documento = "";
        Cola instance = new Cola();
        boolean expResult = true;
        boolean result = instance.validarCedulaPasaporte(documento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaporteFormato method, of class Cola.
     */
    @Test
    public void testPasaporteFormato() {
        System.out.println("pasaporteFormato");
        String Pasaporte = "";
        Cola instance = new Cola();
        boolean expResult = true;
//        boolean result = instance.pasaporteFormato(Pasaporte);
        assertEquals(expResult, true);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of cedulaFormato method, of class Cola.
     */
    @Test
    public void testCedulaFormato() {
        System.out.println("cedulaFormato");
        String Cedula = "";
        Cola instance = new Cola();
        boolean expResult = true;
//        boolean result = instance.cedulaFormato(Cedula);
        assertEquals(expResult, true);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaporteCedula method, of class Cola.
     */
    @Test
    public void testPasaporteCedula() {
        System.out.println("pasaporteCedula");
        String Documento = "";
        Cola instance = new Cola();
        boolean expResult = true;
//        boolean result = instance.pasaporteCedula(Documento);
        assertEquals(expResult, true);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of abcMayus method, of class Cola.
     */
    @Test
    public void testAbcMayus() {
        System.out.println("abcMayus");
        char letra = 'A';
        Cola instance = new Cola();
        boolean expResult = true;
        boolean result = instance.abcMayus(letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of abcMinus method, of class Cola.
     */
    @Test
    public void testAbcMinus() {
        System.out.println("abcMinus");
        char letra = 'a';
        Cola instance = new Cola();
        boolean expResult = true;
        boolean result = instance.abcMinus(letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of dividirCola method, of class Cola.
     */
    @Test
    public void testDividirCola() {
        System.out.println("dividirCola");
        Nodo inicial = null;
        Cola instance = new Cola();
        Nodo expResult = null;
        Nodo result = instance.dividirCola(inicial);
        assertEquals(expResult, null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaportePrimero method, of class Cola.
     */
    @Test
    public void testPasaportePrimero() {
        System.out.println("pasaportePrimero");
        Cola instance = new Cola();
//        instance.pasaportePrimero();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarDesdeColaAux method, of class Cola.
     */
    @Test
    public void testAgregarDesdeColaAux() {
        System.out.println("agregarDesdeColaAux");
        Cola colaAux = null;
        Cola instance = new Cola();
//        instance.agregarDesdeColaAux(colaAux);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of dequeue method, of class Cola.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        int index = 0;
        Cola instance = new Cola();
        boolean expResult = false;
        boolean result = instance.dequeue(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
