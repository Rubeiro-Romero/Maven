/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;

import co.edu.unicauca.pagos.p.common.IPago;

/**
 *
 * @author ahurtado
 */
public class PagoTransferenciaBancaria implements IPago{
    
    private String numero;
    double valor;

    public PagoTransferenciaBancaria(String string, double d) {
        numero = string;
        valor = d;
    }

    @Override
    public boolean validar() {
        return numero.matches("\\d{12}"); //Valida que sean 12 digitos
    }

    @Override
    public void procesar() {
        //Validacion de cuenta antes de la transferencia
        if (!validar()) {
            throw new IllegalArgumentException("Número de cuenta inválido.");
        }

        //Simulación de transferencia
        System.out.println("Transferencia realizada exitosamente.");
        System.out.println("Cuenta: " + numero);
        System.out.println("Monto: $" + valor);
    }

    @Override
    public String obtenerDetalle() {
        return "Transferencia bancaria a la cuenta " + numero + " por un monto de $" + valor;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }   

    public double getValor() {
        return valor;
    }
}
