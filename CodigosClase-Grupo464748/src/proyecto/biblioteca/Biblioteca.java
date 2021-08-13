package proyecto.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    public static ArrayList<Libro> libros;
    private String nombre;
    private int cantidadLibros = 0;
    private int secuenciaID = 1;

    public Biblioteca() {
        libros = new ArrayList<Libro>();
        Libro li1 = new Libro(secuenciaID, "la divina comedia", "FRT23", "Dante", 1472);
        libros.add(li1);
        secuenciaID++;
        cantidadLibros++;
    }

    public void agregar(String titulo, String codigo, String autor, int anio) {
        Libro li2 = new Libro(secuenciaID, titulo, codigo, autor, anio);
        libros.add(li2);
        secuenciaID++;
        cantidadLibros++;
    }

    public static Object[][] listar() {
        Object[][] tabla = new Object[libros.size()][5];

        int contador = 0;
        for (Libro i : libros) {
            tabla[contador][0] = i.getId();
            tabla[contador][1] = i.getTitulo();
            tabla[contador][2] = i.getCodigo();
            tabla[contador][3] = i.getAutor();
            tabla[contador][4] = i.getAnio();
            contador++;
        }
        return tabla;
    }

    public Object[][] obtenerPorId(int id) {
        Object[][] tabla = new Object[1][5];

        int contador = 0;
        for (Libro i : libros) {
            if (i.getId() == id) {
                tabla[contador][0] = i.getId();
                tabla[contador][1] = i.getTitulo();
                tabla[contador][2] = i.getCodigo();
                tabla[contador][3] = i.getAutor();
                tabla[contador][4] = i.getAnio();
            }
        }
        return tabla;
    }

    public void modificar(int id, String titulo, String codigo, String autor, int anio) {
        for (Libro i : libros) {
            if (i.getId() == id) {
                i.setTitulo(titulo);
                i.setCodigo(codigo);
                i.setAutor(autor);
                i.setAnio(anio);
            }
        }
    }
    
    public void modificar(int id, String autor) {
        for (Libro i : libros) {
            if (i.getId() == id) {
                i.setAutor(autor);
            }
        }
    }

    public void eliminar(int id) {
        for (Libro i : libros) {
            if (i.getId() == id) {
                libros.remove(i);
                cantidadLibros--;
                break;
            }
        }
    }

}
