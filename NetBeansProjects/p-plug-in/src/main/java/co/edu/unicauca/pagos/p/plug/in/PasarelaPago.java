/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;

/**
 *
 * @author ANACONA
 */
public class PasarelaPago {
    public boolean realizarCobro(String numeroTarjeta, double monto) {
        System.out.println("Procesando pago de $" + monto + " con la tarjeta " + numeroTarjeta);
        return true; // Simulación de pago exitoso
    }
}

