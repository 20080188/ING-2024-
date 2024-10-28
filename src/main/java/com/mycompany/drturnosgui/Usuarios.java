package com.mycompany.drturnosgui;

import java.io.Serializable;

public class Usuarios {
    private static final long serialVersionUID = 1562261206917216737L; // Actualizar este número en caso de hacer cambios significativos.
    private String username;
    private String password;
    private Roles_usuarios rol; // Añadido para el rol de usuario

     public Usuarios(String username, String password, Roles_usuarios rol) {
        this.username = username;
        this.password = password;
        this.rol = rol; // Asignar el rol
    }

    public String getUsername() {
        return username;
    }    

    public String getPassword() {
        return password;    
    /**
     *
     * @return
     */
   // public Roles_usuarios getRol() {
     //   return rol; // Método para obtener el rol
    }
}

