/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;

import co.edu.unicauca.pagos.p.common.IPago;
import co.edu.unicauca.pagos.p.plug.in.PasarelaPago;
//import edu.co.unicauca.pagos.pagosapp.domain.IPago;

/**
 *
 * @author ANACONA
 */
public class PagoTarjetaCredito implements IPago {
    private String numero;
    private double valor;
    private PasarelaPago pasarela; // Dependencia para procesar el pago

    public PagoTarjetaCredito(String numero, double valor, PasarelaPago pasarela) {
        this.numero = numero;
        this.valor = valor;
        this.pasarela = pasarela;
    }

    @Override
    public boolean validar() {
        return numero.matches("\\d{16}"); // Verifica que tenga 16 dígitos
    }

    @Override
    public void procesar() {
        if (!validar()) {
            System.out.println("Número de tarjeta inválido.");
            return;
        }
        boolean exito = pasarela.realizarCobro(numero, valor);
        if (exito) {
            System.out.println("Pago procesado con éxito.");
        } else {
            System.out.println("Pago fallido.");
        }
    }

    @Override
    public String obtenerDetalle() {
        return "Pago con tarjeta terminada en " + numero.substring(12) + 
               " por un monto de $" + valor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PasarelaPago getPasarela() {
        return pasarela;
    }

    public void setPasarela(PasarelaPago pasarela) {
        this.pasarela = pasarela;
    }
    
}
