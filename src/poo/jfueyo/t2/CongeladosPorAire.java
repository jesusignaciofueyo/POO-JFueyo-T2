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
public class CongeladosPorAire extends ProductosCongelados {
    public int resequedad;
    
    /**
     * 
     * @param cad
     * @param lot 
     */
    public CongeladosPorAire(String cad, int lot) {
        super(cad, lot);
    }
    
    /**
     * 
     * @param cad
     * @param lot
     * @param tcr 
     */
    public CongeladosPorAire(String cad, int lot, int tcr) {
        super(cad, lot, tcr);
    }
    
    
    /**
     * 
     * @param cad
     * @param lot
     * @param tcr
     * @param res 
     */
    public CongeladosPorAire(String cad, int lot, int tcr, int res) {
        super(cad, lot, tcr);
        this.resequedad = res;
    }
    
    /**
     * 
     * @return 
     */
    public int getResequedad() {
        return this.resequedad;
    }
}
