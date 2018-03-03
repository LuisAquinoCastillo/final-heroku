/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.repaso;

import java.lang.reflect.Method;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controlador deservicios REST
@RestController
@CrossOrigin
@RequestMapping("/api")
public class ControladorRepaso {
    
    @Autowired RepositorioRepaso repoRepa;
    
    //Buscar todos
    @CrossOrigin
    @RequestMapping(value = "/Repaso",method = RequestMethod.GET,headers = {"Accept=application/json"})
    public ArrayList<Repaso> buscarTodos(){
        return (ArrayList<Repaso>)repoRepa.findAll();
    }
    
    //Buscar por ID
    @CrossOrigin
    @RequestMapping(value = "/Repaso",method = RequestMethod.GET,headers = {"Accept=application/json"})
    public Repaso buscarId(String idRepaso){
        return repoRepa.findOne(idRepaso);
    }
    
    //Actualizar
    @CrossOrigin
    @RequestMapping(value = "/Repaso/{idRepaso}/{nombre}/{carrera}",method = RequestMethod.PUT,headers = {"Accept=application/json"})
    public Respuesta actualizar(String idRepaso,String nombre,String carrera){
        repoRepa.save(new Repaso(idRepaso,nombre,carrera));
        return new Respuesta(true,"Actualizacion exitosa");
    }
    
    //Guardar
    @CrossOrigin
    @RequestMapping(value = "/Repaso/{nombre}/{carrera}",method = RequestMethod.POST,headers = {"Accept=application/json"})
    public Respuesta guardar(String nombre,String carrera){
        repoRepa.save(new Repaso(nombre,carrera));
        return new Respuesta(true,"Insercion correcta");
    }
    
    //Borrar
    @CrossOrigin
    @RequestMapping(value = "/Repaso/{idRepaso}",method = RequestMethod.DELETE,headers = {"Accept=application/json"})
    public Respuesta borrar(String idRepaso){
        Respuesta res=new Respuesta(true, "Borrado con exito");
        repoRepa.delete(new Repaso(idRepaso));
        return res;
    }
}
