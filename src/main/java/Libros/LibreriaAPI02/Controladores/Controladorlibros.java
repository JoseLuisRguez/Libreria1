package Libros.LibreriaAPI02.Controladores;

import Libros.LibreriaAPI02.Entidades.Libros;
import Libros.LibreriaAPI02.Servicios.Servicioslibros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Libreria")
public class Controladorlibros {
    
    @Autowired
    Servicioslibros slibros;
    
    //Esto es un edpoint el cual cacha los datos
    @GetMapping("") 
    public List<Libros> getTodosLosLibros(){
        return slibros.obtenerTodosLosLibros();
    }

    //
    @PostMapping("")
    public List<Libros> postInsertarAnimal(@RequestBody Libros L){ //recuerda que el nombre de la variable siempre debe ser igual
        if (slibros.insertarLibros(L)){
            return slibros.obtenerTodosLosLibros();
        }else{
            return null;
        }
    }
    
    @PutMapping("")
    public List<Libros> putActualizarLibros(@RequestBody Libros L){ //recuerda que el nombre de la variable siempre debe ser igual
        if (slibros.actualizarLibros(L)){
            return slibros.obtenerTodosLosLibros();
        }else{
            return null;
        }
    }
    
    @DeleteMapping("")
    public List<Libros> DeleteLibros(@RequestBody Libros L){ //recuerda que el nombre de la variable siempre debe ser igual
        if (slibros.eliminarLibros(L)){
            return slibros.obtenerTodosLosLibros();
        }else{
            return null;
        }
    }
    
}
