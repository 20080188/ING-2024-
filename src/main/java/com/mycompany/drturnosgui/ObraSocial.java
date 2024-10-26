
package com.mycompany.drturnosgui;
import java.io.Serializable;

/**
 * Clase ObraSocial, representa a las obras sociales
 * @author Isaias
 */
public class ObraSocial implements Serializable {

    private String ObraSocial;

    public ObraSocial(String ObraSocial) {
        this.ObraSocial = ObraSocial;
    }

    public String getObraSocial() {
        return ObraSocial;
    }

    public void setObraSocial(String ObraSocial) {
        this.ObraSocial = ObraSocial;
    }
}
