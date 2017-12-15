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
public class ListaInsertionTest {
    
    public ListaInsertionTest() {
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
     * Test of size method, of class ListaInsertion.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaInsertion instance = new ListaInsertion();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCabeza method, of class ListaInsertion.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaInsertion instance = new ListaInsertion();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaInsertion.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        ListaInsertion instance = new ListaInsertion();
        instance.setCabeza(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class ListaInsertion.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        ListaInsertion instance = new ListaInsertion();
        Nodo expResult = null;
        Nodo result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimo method, of class ListaInsertion.
     */
    @Test
    public void testSetUltimo() {
        System.out.println("setUltimo");
        ListaInsertion instance = new ListaInsertion();
        instance.setUltimo(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ListaInsertion.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaInsertion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaInsertion instance = new ListaInsertion();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, "");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaInsertion.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String nombre = "";
        String apellido = "";
        String apellido2 = "";
        String documento = "";
        double edad = 0.0;
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
        boolean result = instance.add(nombre, apellido, apellido2, documento, edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insertionSort method, of class ListaInsertion.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        ListaInsertion instance = new ListaInsertion();
//        instance.insertionSort();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of sortedInsert method, of class ListaInsertion.
     */
    @Test
    public void testSortedInsert() {
        System.out.println("sortedInsert");
        Nodo ListaOrdenada = null;
        Nodo añadido = null;
        ListaInsertion instance = new ListaInsertion();
        Nodo expResult = null;
//        Nodo result = instance.sortedInsert(ListaOrdenada, añadido);
        assertEquals(expResult, null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaportePrimero method, of class ListaInsertion.
     */
    @Test
    public void testPasaportePrimero() {
        System.out.println("pasaportePrimero");
        ListaInsertion instance = new ListaInsertion();
//        instance.pasaportePrimero();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of ultimoNodoLista method, of class ListaInsertion.
     */
    @Test
    public void testUltimoNodoLista() {
        System.out.println("ultimoNodoLista");
        ListaInsertion instance = new ListaInsertion();
//        instance.ultimoNodoLista();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaporteCedula method, of class ListaInsertion.
     */
    @Test
    public void testPasaporteCedula() {
        System.out.println("pasaporteCedula");
        String Documento = "";
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
//        boolean result = instance.pasaporteCedula(Documento);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCedulaPasaporte method, of class ListaInsertion.
     */
    @Test
    public void testValidarCedulaPasaporte() {
        System.out.println("validarCedulaPasaporte");
        String documento = "";
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
//        boolean result = instance.validarCedulaPasaporte(documento);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMultiple method, of class ListaInsertion.
     */
    @Test
    public void testRemoveMultiple() {
        System.out.println("removeMultiple");
        int index = 0;
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
//        boolean result = instance.removeMultiple(index);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of cedulaFormato method, of class ListaInsertion.
     */
    @Test
    public void testCedulaFormato() {
        System.out.println("cedulaFormato");
        String Cedula = "";
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
//        boolean result = instance.cedulaFormato(Cedula);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of abcMayus method, of class ListaInsertion.
     */
    @Test
    public void testAbcMayus() {
        System.out.println("abcMayus");
        char letra = ' ';
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
        boolean result = instance.abcMayus(letra);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of abcMinus method, of class ListaInsertion.
     */
    @Test
    public void testAbcMinus() {
        System.out.println("abcMinus");
        char letra = 'a';
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = true;
        boolean result = instance.abcMinus(letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaporteFormato method, of class ListaInsertion.
     */
    @Test
    public void testPasaporteFormato() {
        System.out.println("pasaporteFormato");
        String Pasaporte = "";
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
//        boolean result = instance.pasaporteFormato(Pasaporte);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ListaInsertion.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
        boolean result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addCircular method, of class ListaInsertion.
     */
    @Test
    public void testAddCircular() {
        System.out.println("addCircular");
        String nombre = "";
        String apellido = "";
        String apellido2 = "";
        String documento = "";
        double edad = 0.0;
        ListaInsertion instance = new ListaInsertion();
        boolean expResult = false;
        boolean result = instance.addCircular(nombre, apellido, apellido2, documento, edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insertionSortCircular method, of class ListaInsertion.
     */
    @Test
    public void testInsertionSortCircular() {
        System.out.println("insertionSortCircular");
        ListaInsertion instance = new ListaInsertion();
//        instance.insertionSortCircular();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
