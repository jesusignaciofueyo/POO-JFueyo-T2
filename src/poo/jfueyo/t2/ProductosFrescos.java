/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.t2;

/**
 *
 * @author jesus_ignacio_159
 */
public class ProductosFrescos extends Productos {
    public int temperaturaDeFrescuraRecomendada;
    
    /**
     * 
     * @param cad
     * @param lot 
     */
    public ProductosFrescos(String cad, int lot) {
        super(cad, lot);
    }
    
    /**
     * 
     * @param cad
     * @param lot 
     */
    public ProductosFrescos(String cad, int lot, int tfr) {
        super(cad, lot);
        this.temperaturaDeFrescuraRecomendada = tfr;
    }
    
    /**
     * 
     * @return 
     */
    public int getTemperaturaDeFrescuraRecomendada() {
        return this.temperaturaDeFrescuraRecomendada;
    }
}
