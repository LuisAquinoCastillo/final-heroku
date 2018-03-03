/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.repaso;

/**
 *
 * @author ADO
 */
public class Respuesta {
    private boolean success;
    private String mensaje;
    
    public Respuesta(boolean success,String mensaje){
        this.success=success;
        this.mensaje=mensaje;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
