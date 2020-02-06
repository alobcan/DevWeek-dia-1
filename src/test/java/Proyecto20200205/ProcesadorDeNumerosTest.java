/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20200205;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleja
 */
public class ProcesadorDeNumerosTest {
    
    public ProcesadorDeNumerosTest() {
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
   @Test
    public void testDescomponerNumero_UnSoloDigito() {
        ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
        Numero numero = new Numero(1);
        String resultado = procesador.descomponerNumero(numero);
        String resultadoEsperado = "1 en la posicion 0\n";
        assertEquals(resultado, resultadoEsperado );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDescomponerNumero_DosDigitos() {
        ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
         Numero numero = new Numero(23);
        String resultado = procesador.descomponerNumero(numero);
        String resultadoEsperado = "2 en la posicion 0\n3 en la posicion 1\n";
        assertEquals(resultado, resultadoEsperado );
    }
    @Test 
    public void testInvertirNumero_UnDigito(){
        ProcesadorDeNumeros procesador = new  ProcesadorDeNumeros();
        Numero numero = new Numero(1);
        String resultado = procesador.invertirNumero(numero);
        String resultadoEsperado = "1";
        assertEquals(resultado, resultadoEsperado);
    }
    @Test 
    public void testInvertirNumero_DosDigitos(){
        ProcesadorDeNumeros procesador = new  ProcesadorDeNumeros();
        Numero numero = new Numero(34);
        String resultado = procesador.invertirNumero(numero);
        String resultadoEsperado = "43";
        assertEquals(resultado, resultadoEsperado);
    }
    @Test 
    public void testInvertirNumero_NumeroTerminaEnCero(){
        ProcesadorDeNumeros procesador = new  ProcesadorDeNumeros();
        Numero numero = new Numero(4560);
        String resultado = procesador.invertirNumero(numero);
        String resultadoEsperado = "0654";
        assertEquals(resultado, resultadoEsperado);
    }
    @Test
    public void testDecimal_A_Binario(){
        ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
        Numero numero = new Numero(7, 10);
        int binario = procesador.convertirDecimalABinario(numero);
        int resultadoEsperado = 111;
        assertEquals(binario, resultadoEsperado);
    }
    @Test
    public void testOctal_A_Decimal(){
    ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
    Numero numero = new Numero(12, 8);
    int decimal = procesador.convertirCualquierBaseADecimal(numero);
    int resultadoEsperado = 10;
    assertEquals(decimal, resultadoEsperado);
    }
    @Test
    public void testBinario_A_Decimal(){
    ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
     Numero numero = new Numero(1010, 2);
    int decimal = procesador.convertirCualquierBaseADecimal(numero);
    int resultadoEsperado = 10;
    assertEquals(decimal, resultadoEsperado);
    }
    @Test
    public void testHex_A_Decimal(){
    ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
    Numero numero = new Numero("79");
    int decimal = procesador.convertirCualquierBaseADecimal(numero);
    int resultadoEsperado = 121;
    assertEquals(decimal, resultadoEsperado);
    }
    @Test
    public void testHexConLetra_A_Decimal(){
    ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
    Numero numero = new Numero("2e");
    int decimal = procesador.convertirCualquierBaseADecimal(numero);
    int resultadoEsperado = 46;
    assertEquals(decimal, resultadoEsperado);
    }
    @Test
    public void testAsciiATexto(){
        ProcesadorDeNumeros procesador = new ProcesadorDeNumeros();
        int [] mensaje = {66,105,101,110,118,101,110,105,100,111,
            115,32,97,32,108,97,32,70,117,110,100,97,99,105,111,110,
            32,74,97,108,97,32,58,45,41,33};
        String mensajeEsperado = procesador.conversorAsciiATexto(mensaje);
        assertEquals(mensajeEsperado,"Bienvenidos a la Fundacion Jala :-)!");
    } 
}

    
    
