/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.repaso;

//Importacion de framework de spring parala conexion de MongoDB
import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRepaso extends MongoRepository<Repaso, String>{
    
}
