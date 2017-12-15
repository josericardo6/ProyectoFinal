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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ricardo Rodriguez
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({da.ListaMergeTest.class, da.BoxNumberTest.class, da.PersonaTest.class, da.NodoDataTest.class, da.ListaDataTest.class, da.ColaTest.class, da.ListaInsertionTest.class, da.NodoTest.class})
public class DaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
