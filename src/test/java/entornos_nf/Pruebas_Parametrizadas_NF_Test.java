/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entornos_nf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alumno Tarde
 */
@RunWith(value=Parameterized.class)
public class Pruebas_Parametrizadas_NF_Test {

    @Parameters
    public static Iterable<Object[]> dameDatos(){
        int [] positiva = {3,2,4,1,9};
        int [] positivEsp = {1,2,3,4,9};
        int[] neg ={-3,-2,-4,-1,-9};
        int[] negEsp ={-9,-4,-3,-2,-1};
        int[] negPos ={-3,2,-4,1,-9};
        int[] negPosEsp ={-9,-4,-3,1,2};
        return Arrays.asList(new Object[][]{
             {positiva, positivEsp},
            {neg,negEsp},
            {negPos,negPosEsp}
            
        });
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
    private int [] matriz;
    private int [] esperado;
    public Pruebas_Parametrizadas_NF_Test(int[] matriz, int[] esperado) {
        this.matriz = matriz;
        this.esperado = esperado;
    }
    /**
     * Test of ordenaMatriz method, of class entornos_NF.
     */
    @Test
    public void testOrdenaMatriz() {
        System.out.println("ordenaMatriz");
        matriz = entornos_NF.ordenaMatriz(matriz);
        assertArrayEquals(esperado, matriz);
    }
    
}
