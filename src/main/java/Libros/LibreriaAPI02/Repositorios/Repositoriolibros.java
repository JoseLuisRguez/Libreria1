package Libros.LibreriaAPI02.Repositorios;

import Libros.LibreriaAPI02.Entidades.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositoriolibros extends JpaRepository<Libros, Integer>{
    
}
