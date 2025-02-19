/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rubei
 */
public class PagoCriptoMonedaTest {
    
    @Test
    public void testcreatePagoCriptoMoneda() {
        PagoCriptoMoneda pago = new PagoCriptoMoneda("1A2B3C4D5E");
        assertEquals(pago.getBilletera(),"1A2B3C4D5E");
    }
    
    @Test
    void testvalidarCuentaValida() {
        PagoCriptoMoneda pago = new PagoCriptoMoneda("1A2B3C4D5E");
        assertTrue(pago.validar());
    }
    
    @Test
    public void testvalidarPagoCriptoMoneda() {
        PagoCriptoMoneda pago = new PagoCriptoMoneda("1A2B3C4D5E");
        assertDoesNotThrow(pago::procesar);
    }
    
    @Test
    public void testProcesarPagoInvalido() {
    PagoCriptoMoneda pago = new PagoCriptoMoneda("1A2B3C4");
    assertFalse(pago.validar());
    }
    
}
