package co.edu.unicauca.pagos.p.common;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author ahurtado
 */
public interface IPago {
    public boolean validar();
    public void procesar();
    public String obtenerDetalle();
}
