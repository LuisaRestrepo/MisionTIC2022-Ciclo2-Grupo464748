/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class CalculadoraTest {
    
    public static Calculadora c1;

    public CalculadoraTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
        c1 = new Calculadora();
    }
//
//    @AfterClass
//    public static void tearDownClass() {
//        System.out.println("After class");
//    }
//
//    @Before
//    public void setUp() {
//        System.out.println("Before");
//    }
//
//    @After
//    public void tearDown() {
//        System.out.println("After");
//    }

    @Test
    public void testGetSuma() {
        System.out.println("Esta es la prueba suma");
        double a = 1.4;
        double b = 2.6;
        double result = c1.getSuma(a,b);
        double expected = 4;
        assertEquals(expected, result,0);  
    }

    @Test
    public void testGetResta() {
        double a = 1.4;
        double b = 2.6;
        double result = c1.getResta(a,b);
        double expected = -1.2;
        assertEquals(expected, result,1); 
    }

    @Test
    public void testGetDivision() {
        double a = 1.4;
        double b = 2.6;
        double result = c1.getDivision(a,b);
        double expected = 0.54;
        assertEquals(expected, result,1); 
    }

    @Test
    public void testGetMultiplicacion() {
    }

}
