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
public class CongeladosPorNitrogeno extends ProductosCongelados {
    public int criogenia;
    
    /**
     * 
     * @param cad
     * @param lot 
     */
    public CongeladosPorNitrogeno(String cad, int lot) {
        super(cad, lot);
    }
    
    /**
     * 
     * @param cad
     * @param lot
     * @param tcr 
     */
    public CongeladosPorNitrogeno(String cad, int lot, int tcr) {
        super(cad, lot, tcr);
    }
    
    
    /**
     * 
     * @param cad
     * @param lot
     * @param tcr
     * @param cri 
     */
    public CongeladosPorNitrogeno(String cad, int lot, int tcr, int cri) {
        super(cad, lot, tcr);
        this.criogenia = cri;
    }
    
    /**
     * 
     * @return 
     */
    public int getCriogenia() {
        return this.criogenia;
    }
}
