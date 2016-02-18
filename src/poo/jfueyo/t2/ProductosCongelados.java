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
public class ProductosCongelados extends Productos {
    public int temperaturadeCongelacionRecomendada;

    /**
     * 
     * @param cad
     * @param lot 
     */
    public ProductosCongelados(String cad, int lot) {
        super(cad, lot);
    }
    
    /**
     * 
     * @param cad
     * @param lot
     * @param tcr 
     */
    public ProductosCongelados(String cad, int lot, int tcr) {
        super(cad, lot);
        this.temperaturadeCongelacionRecomendada = tcr;
    }
    
    /**
     * 
     * @return 
     */
    public int getTemperaturaDeCongelacionRecomendada() {
        return this.temperaturadeCongelacionRecomendada;
    }
}
