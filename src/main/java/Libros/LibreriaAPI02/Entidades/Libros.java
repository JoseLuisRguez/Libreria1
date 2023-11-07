package Libros.LibreriaAPI02.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "libros")
public class Libros {
    
    @Id
    private String nombredellibro;
    
    @Column (length = 50)
    private String autor;
    
    private int numerodepaginas;
    
    private String editorial;
    
    private String idioma;

    public Libros() {
    }

    public Libros(String nombredellibro, String autor, int numerodepaginas, String editorial, String idioma) {
        this.nombredellibro = nombredellibro;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
        this.editorial = editorial;
        this.idioma = idioma;
    }

    public String getNombredellibro() {
        return nombredellibro;
    }

    public void setNombredellibro(String nombredellibro) {
        this.nombredellibro = nombredellibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}