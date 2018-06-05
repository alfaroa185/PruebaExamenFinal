
package com.clases;

/**
 *
 * @author Admin
 */
public class Persona {
    
    private String dui;
    private String nit;

    public Persona() {
    }

    public Persona(String dui, String nit) {
        this.dui = dui;
        this.nit = nit;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
}
