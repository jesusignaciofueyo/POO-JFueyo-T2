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
public class Productos {
    public String caducidad;
    public int lote;
    
    public Productos(String cad, int lot) {
        this.caducidad = cad;
        this.lote = lot;
    }
    
    public String getCaducidad() {
        return this.caducidad;
    }
    
    public int getLote() {
        return this.lote;
    }
}
