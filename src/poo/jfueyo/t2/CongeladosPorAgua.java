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
public class CongeladosPorAgua extends ProductosCongelados {
    public int humedad;
    
    /**
     * 
     * @param cad
     * @param lot 
     */
    public CongeladosPorAgua(String cad, int lot) {
        super(cad, lot);
    }
    
    /**
     * 
     * @param cad
     * @param lot
     * @param tcr 
     */
    public CongeladosPorAgua(String cad, int lot, int tcr) {
        super(cad, lot, tcr);
    }
    
    /**
     * 
     * @param cad
     * @param lot
     * @param tcr
     * @param hum 
     */
    public CongeladosPorAgua(String cad, int lot, int tcr, int hum) {
        super(cad, lot, tcr);
        this.humedad = hum;
    }
    
    /**
     * 
     * @return 
     */
    public int getHumedad() {
        return this.humedad;
    }
}
