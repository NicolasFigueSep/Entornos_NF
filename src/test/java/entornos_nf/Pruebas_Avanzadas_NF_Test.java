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
public class Pruebas_Avanzadas_NF_Test {
    
    public Pruebas_Avanzadas_NF_Test() {
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
     * Test of ordenaMatriz()
     * Genero 300 elementos para la matriz
     */
    @Test(timeout=1)
    public void testOrdenaMatriz() {
        System.out.println("ordenaMatriz");
        int[] matriz = new int[300];
        int aux=0;
        for (int i = matriz.length; i >0; i--) {
            matriz[aux]=i;
            aux++;           
        }
        int [] matrizOrd = entornos_NF.ordenaMatriz(matriz);
    }
    
}
