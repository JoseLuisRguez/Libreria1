package Libros.LibreriaAPI02.Servicios;

import Libros.LibreriaAPI02.Entidades.Libros;
import Libros.LibreriaAPI02.Repositorios.Repositoriolibros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicioslibros {
 
    //Inyeccion de dependencias en Spring, insertar el repositorio en el servicio
    @Autowired
    Repositoriolibros rLibros;
    
    //Ahora ejecutamos los metodos
    public List<Libros> obtenerTodosLosLibros(){
        return rLibros.findAll();
    
    }
    
    //saber si se inserto de manera correcta en la base de datos
    public boolean insertarLibros (Libros L){
        boolean respuesta = false;
        try{
            rLibros.save(L); //Insert o Update a nivel de BD
            respuesta = true;
        }catch (Exception ex){
            respuesta = false;
        }
        return respuesta;
    }
    
    public boolean actualizarLibros (Libros L){
        boolean respuesta = false;
        try{
            rLibros.save(L); //Insert o Update a nivel de BD
            respuesta = true;
        }catch (Exception ex){
            respuesta = false;
        }
        return respuesta;
    }
    
    public boolean eliminarLibros (Libros L){
        boolean respuesta = false;
        try{
            rLibros.delete(L); //Delete a nivel de BD
            respuesta = true;
        }catch (Exception ex){
            respuesta = false;
        }
        return respuesta;
    }
    
}
