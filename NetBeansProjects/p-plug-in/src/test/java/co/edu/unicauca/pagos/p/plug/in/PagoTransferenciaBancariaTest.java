/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package co.edu.unicauca.pagos.p.plug.in;
import co.edu.unicauca.pagos.p.plug.in.PagoTransferenciaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ahurtado
 */
public class PagoTransferenciaBancariaTest {
    
    public PagoTransferenciaBancariaTest() {
    }
    
    @Test
    public void testcreatePagoTransferenciaBancaria() {
        PagoTransferenciaBancaria pago = new PagoTransferenciaBancaria("746453746452", 340000.0);
        assertEquals(pago.getNumero(),"746453746452");
        assertEquals(pago.getValor(),340000.0);
    }
    
    @Test
    void testvalidarCuentaValida() {
        PagoTransferenciaBancaria pago = new PagoTransferenciaBancaria("746453746452", 340000.0);
        assertTrue(pago.validar());
    }
    
    @Test
    public void testvalidarPagoTransferenciaBancaria() {
        PagoTransferenciaBancaria pago = new PagoTransferenciaBancaria("746453746452", 340000.0);
        assertDoesNotThrow(pago::procesar);
    }
    
    @Test
    public void testProcesarPagoInvalido() {
    PagoTransferenciaBancaria pago = new PagoTransferenciaBancaria("123", 340000.0);
    assertFalse(pago.validar());
    }

    
}
