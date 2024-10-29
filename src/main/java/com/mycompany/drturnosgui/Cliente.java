

package com.mycompany.drturnosgui;
import java.io.Serializable;

/**
 * Clase Cliente, representa un paciente con sus atributos correspondientes
 * @author Isaias
 */
public class Cliente extends ObraSocial implements Serializable {
   private String dni;
   private String nombre;
   private String telefono;

    public Cliente(String dni, String nombre, String telefono, String obraSocialNombre) {
        super(obraSocialNombre);
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getObraSocial() {
        return super.getObraSocial();
    }

    @Override
    public void setObraSocial(String obraSocial) {
        super.setObraSocial(obraSocial);
    }
}
/