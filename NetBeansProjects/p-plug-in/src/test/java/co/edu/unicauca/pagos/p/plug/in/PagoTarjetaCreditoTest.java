/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 
 * @author ANACONA
 */
public class PagoTarjetaCreditoTest {

    public PagoTarjetaCreditoTest() {
    }

    @Test
    public void crearPagoTarjetaCredito() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("1234567812345678", 100000.0, pasarela);
        
        assertEquals("1234567812345678", pago.getNumero());
        assertEquals(100000.0, pago.getValor());
    }

    @Test
    public void validarTarjetaValidaTest() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("1234567812345678", 100000.0, pasarela);
        
        assertTrue(pago.validar());
    }

    @Test
    public void validarTarjetaInvalidaTest() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("12345", 100000.0, pasarela);
        
        assertFalse(pago.validar());
    }

    @Test
    public void validarPagoTarjetaCreditoTest() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("1234567812345678", 100000.0, pasarela);
        
        assertDoesNotThrow(pago::procesar);
    }

    @Test
    public void obtenerDetallePagoTest() {
        PasarelaPago pasarela = new PasarelaPago();
        PagoTarjetaCredito pago = new PagoTarjetaCredito("1234567812345678", 100000.0, pasarela);
        
        String esperado = "Pago con tarjeta terminada en 5678 por un monto de $100000.0";
        assertEquals(esperado, pago.obtenerDetalle());
    }
}
