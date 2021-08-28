package proyecto.biblioteca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BibliotecaModelo {

    public static void agregarLibro(String titulo1, String codigo1, int idAutor, int anio1, int idBiblioteca) throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "INSERT INTO bibliotecabd.libros (titulo,codigo,anio,estado,Autores_idAutores,Bibliotecas_idBibliotecas) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        System.out.println(ps.toString());
        ps.setString(1, titulo1);
        ps.setString(2, codigo1);
        ps.setInt(3, anio1);
        ps.setInt(4, 1);
        ps.setInt(5, idAutor);
        ps.setInt(6, idBiblioteca);
        System.out.println(ps.toString());
        ps.executeUpdate();
        con.close();
    }

    public static ArrayList<AutoresE> cargarAutores() throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT * FROM bibliotecabd.autores";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet resultado = ps.executeQuery();

        ArrayList<AutoresE> data = new ArrayList<AutoresE>();

        while (resultado.next()) {
            AutoresE b1 = new AutoresE(resultado.getInt(1), resultado.getString(2));
            data.add(b1);
            //System.out.println(resultado.getString(1));
            //System.out.println(resultado.getString(2));
            //System.out.println("***********************");
        }
        System.out.println(data.toString());
        con.close();
        return data;
    }

    public static ArrayList<LibroE> cargarLibros() throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT idLibros,titulo,codigo, autores.nombre as autor, anio " +
                       "FROM libros " +
                       "JOIN autores " +
                       "ON libros.Autores_idAutores = autores.idAutores;";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet resultado = ps.executeQuery();

        ArrayList<LibroE> data = new ArrayList<LibroE>();

        while (resultado.next()) {
            LibroE b1 = new LibroE(resultado.getInt(1), resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getInt(5));
            data.add(b1);
            System.out.println(b1.toString());
            //System.out.println(resultado.getString(1));
            //System.out.println(resultado.getString(2));
            //System.out.println("***********************");
        }
        System.out.println(data.toString());
        con.close();
        return data;
    }

    public static void main(String[] args) throws SQLException {
        //cargarAutores();
        //agregarLibro("libro1", "libro1", 2, 2021, 1);
        cargarLibros();
    }
}
