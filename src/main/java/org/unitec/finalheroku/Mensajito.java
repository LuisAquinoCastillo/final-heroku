/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author luisabrahamaquino
 */
public class Mensajito {
    
    @Id
    private String id;
    private LocalDate fecha;

    public Mensajito(String id) {
        this.id = id;
    }
    private String titulo;
    private String cuerpo;

    public Mensajito(String id,String titulo, String cuerpo) {
        this.id=id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha=LocalDate.now();
    }
    
    public Mensajito(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha=LocalDate.now();
    }


    public Mensajito() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
