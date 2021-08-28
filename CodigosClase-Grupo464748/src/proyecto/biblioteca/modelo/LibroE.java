
package proyecto.biblioteca.modelo;

import proyecto.biblioteca.*;


public class LibroE {
    private int id;
    private String titulo;
    private String codigo;
    private String autor;
    private int anio;

    public LibroE(int id, String titulo, String codigo, String autor, int anio) {
        this.id = id;
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public String toString(){
        String texto = this.id + ", "+ this.titulo + ", " + this.codigo+ ", " + this.autor+ ", " + this.anio;
        return texto;
    }
    

}
