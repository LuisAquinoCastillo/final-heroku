/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.repaso;

//importacion del paquete de etiquetado para especificar el ID
import org.springframework.data.annotation.Id;
public class Repaso {
    // Declaracion de documentos (Filas de la coleccion)
    @Id
    private String idRepaso;
    
    private String nombre;
    private String carrera;
    
    //Constructor para buscar por ID
   public Repaso(String idRepaso){
       this.idRepaso=idRepaso;
   }
   
   //Constructor para actualizar
   public Repaso(String idRepaso,String nombre,String carrera){
       this.idRepaso=idRepaso;
       this.nombre=nombre;
       this.carrera=carrera;
   }
   
   //Constructor para guardar y borrar
   public Repaso(String nombre,String carrera){
       this.nombre=nombre;
       this.carrera=carrera;
   }
   
   //Constructor dedefecto
   public Repaso(){
   }

    //Getters y setters para la introduccion de datos en mongoDB
    public String getIdRepaso() {
        return idRepaso;
    }

    public void setIdRepaso(String idRepaso) {
        this.idRepaso = idRepaso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
