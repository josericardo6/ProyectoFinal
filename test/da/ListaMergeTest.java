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
public class ListaMergeTest {
    
    public ListaMergeTest() {
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
     * Test of size method, of class ListaMerge.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaMerge instance = new ListaMerge();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCabeza method, of class ListaMerge.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaMerge instance = new ListaMerge();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaMerge.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        ListaMerge instance = new ListaMerge();
        instance.setCabeza(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class ListaMerge.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        ListaMerge instance = new ListaMerge();
        Nodo expResult = null;
        Nodo result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltimo method, of class ListaMerge.
     */
    @Test
    public void testSetUltimo() {
        System.out.println("setUltimo");
        ListaMerge instance = new ListaMerge();
        instance.setUltimo(null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ListaMerge.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ListaMerge instance = new ListaMerge();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaMerge.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaMerge instance = new ListaMerge();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, "");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaMerge.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String nombre = "";
        String apellido = "";
        String apellido2 = "";
        String documento = "";
        double edad = 0.0;
        ListaMerge instance = new ListaMerge();
        boolean expResult = false;
        boolean result = instance.add(nombre, apellido, apellido2, documento, edad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeSort method, of class ListaMerge.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Nodo inicial = null;
        ListaMerge instance = new ListaMerge();
        Nodo expResult = null;
//        Nodo result = instance.mergeSort(inicial);
        assertEquals(expResult, null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeS method, of class ListaMerge.
     */
    @Test
    public void testMergeS() {
        System.out.println("mergeS");
        Nodo izqIni = null;
        Nodo derIni = null;
        ListaMerge instance = new ListaMerge();
//        instance.mergeS(izqIni, derIni);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCedulaPasaporte method, of class ListaMerge.
     */
    @Test
    public void testValidarCedulaPasaporte() {
        System.out.println("validarCedulaPasaporte");
        String documento = "";
        ListaMerge instance = new ListaMerge();
        boolean expResult = false;
//        boolean result = instance.validarCedulaPasaporte(documento);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaporteFormato method, of class ListaMerge.
     */
    @Test
    public void testPasaporteFormato() {
        System.out.println("pasaporteFormato");
        String Pasaporte = "";
        ListaMerge instance = new ListaMerge();
        boolean expResult = false;
//        boolean result = instance.pasaporteFormato(Pasaporte);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of cedulaFormato method, of class ListaMerge.
     */
    @Test
    public void testCedulaFormato() {
        System.out.println("cedulaFormato");
        String Cedula = "";
        ListaMerge instance = new ListaMerge();
        boolean expResult = false;
//        boolean result = instance.cedulaFormato(Cedula);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaporteCedula method, of class ListaMerge.
     */
    @Test
    public void testPasaporteCedula() {
        System.out.println("pasaporteCedula");
        String Documento = "";
        ListaMerge instance = new ListaMerge();
        boolean expResult = false;
//        boolean result = instance.pasaporteCedula(Documento);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of abcMayus method, of class ListaMerge.
     */
    @Test
    public void testAbcMayus() {
        System.out.println("abcMayus");
        char letra = ' ';
        ListaMerge instance = new ListaMerge();
        boolean expResult = false;
//        boolean result = instance.abcMayus(letra);
        assertEquals(expResult, false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of abcMinus method, of class ListaMerge.
     */
    @Test
    public void testAbcMinus() {
        System.out.println("abcMinus");
        char letra = 'a';
        ListaMerge instance = new ListaMerge();
        boolean expResult = true;
        boolean result = instance.abcMinus(letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of dividirLista method, of class ListaMerge.
     */
    @Test
    public void testDividirLista() {
        System.out.println("dividirLista");
        Nodo inicial = null;
        ListaMerge instance = new ListaMerge();
        Nodo expResult = null;
//        Nodo result = instance.dividirLista(inicial);
        assertEquals(expResult, null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pasaportePrimero method, of class ListaMerge.
     */
    @Test
    public void testPasaportePrimero() {
        System.out.println("pasaportePrimero");
        ListaMerge instance = new ListaMerge();
//        instance.pasaportePrimero();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarDesdeListaAux method, of class ListaMerge.
     */
    @Test
    public void testAgregarDesdeListaAux() {
        System.out.println("agregarDesdeListaAux");
        ListaMerge listaAux = null;
        ListaMerge instance = new ListaMerge();
//        instance.agregarDesdeListaAux(listaAux);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ListaMerge.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        ListaMerge instance = new ListaMerge();
        boolean expResult = false;
        boolean result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
