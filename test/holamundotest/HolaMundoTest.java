/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundotest;

import holamundo.HolaMundo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fpayan
 */
public class HolaMundoTest {
    
    public HolaMundoTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void siTieneArgumentosMetodoMain() {
        final String[] argumentos = {"Juan", "Pardo"};
        final String finalArgumentos = HolaMundo.saludoPorArgumnentosMain(argumentos);
        assertEquals(finalArgumentos.trim(), "Juan Pardo");
    }
    
    @Test
    public void noTieneArgumentosMetodoMain() {
        final String[] argumentos = {};
        final String finalArgumentos = HolaMundo.saludoPorArgumnentosMain(argumentos);
        assertEquals(finalArgumentos.trim(), "Invitado");
    }
}
