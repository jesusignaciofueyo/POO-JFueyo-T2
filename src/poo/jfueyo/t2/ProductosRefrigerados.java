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
public class ProductosRefrigerados extends Productos {
    public int temperaturaDeRefrigeracionRecomendada;
    
    /**
     * 
     * @param cad
     * @param lot 
     */
    public ProductosRefrigerados(String cad, int lot) {
        super(cad, lot);
    }
    
    /**
     * 
     * @param cad
     * @param lot
     * @param trr 
     */
    public ProductosRefrigerados(String cad, int lot, int trr) {
        super(cad, lot);
        this.temperaturaDeRefrigeracionRecomendada = trr;
    }
    
    /**
     * 
     * @return 
     */
    public int getTemperaturaDeRefrigeracionRecomendada() {
        return this.temperaturaDeRefrigeracionRecomendada;
    }
    
}
