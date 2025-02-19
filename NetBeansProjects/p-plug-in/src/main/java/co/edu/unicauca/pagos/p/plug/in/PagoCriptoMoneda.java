/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;
import co.edu.unicauca.pagos.p.common.IPago;
import java.util.regex.Pattern;


/**
 *
 * @author Jhonatan
 */
public class PagoCriptoMoneda implements IPago{
    
    private String billetera;
    
    //Expresion regular para validacion de billetera
    private static final Pattern WALLET_PATTERN = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]{10}$");

    public PagoCriptoMoneda(String string) {
        billetera = string;
    }

    @Override
    public boolean validar() {
        return WALLET_PATTERN.matcher(billetera).matches();
    }

    @Override
    public void procesar() {
        
        if(!validar()){
            throw new IllegalArgumentException("Número de billetera inválido.");
        }
        
        try{
            System.out.println("Proceando transaccion en blockchain...");
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.err.println("La transacción fue interrumpida: " + e.getMessage());
        }
        
        System.out.println("Transaccion Completada con Exito");
        
    }

    @Override
    public String obtenerDetalle() {
        return "Transaccion desde la billetera: " + billetera;
    }
    
    public String getBilletera() {
        return billetera;
    }

    public void setBilletera(String billetera) {
        this.billetera = billetera;
    } 
    
}
