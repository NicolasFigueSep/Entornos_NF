/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entornos_nf;

import entornos_nf.entornos_NF;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno Tarde
 */
public class Pruebas_Simples_NF_Test {
    
    public Pruebas_Simples_NF_Test() {
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
     * Test of main method, of class entornos_NF.
     */

    /**
     * Test of ordenaMatriz con numeros positivos
     */
    @Test
    public void testOrdenaMatrizPos() {
        System.out.println("ordenaMatriz");
        int[] matriz ={3,2,4,1,9};
        int[] expResult ={1,2,3,4,9};
        int[] result = entornos_NF.ordenaMatriz(matriz);
        assertArrayEquals(expResult, result);
    }
     /**
     * Test of ordenaMatriz con numeros negativos
     */
    @Test
    public void testOrdenaMatrizNeg() {
        System.out.println("ordenaMatriz");
        int[] matriz ={-3,-2,-4,-1,-9};
        int[] expResult ={-9,-4,-3,-2,-1};
        int[] result = entornos_NF.ordenaMatriz(matriz);
        assertArrayEquals(expResult, result);
    }
     /**
     * Test of ordenaMatriz con numeros negativos y positivos
     */
    @Test
    public void testOrdenaMatrizPosNeg() {
        System.out.println("ordenaMatriz");
        int[] matriz ={-3,2,-4,1,-9};
        int[] expResult ={-9,-4,-3,1,2};
        int[] result = entornos_NF.ordenaMatriz(matriz);
        assertArrayEquals(expResult, result);
    }
    
}
