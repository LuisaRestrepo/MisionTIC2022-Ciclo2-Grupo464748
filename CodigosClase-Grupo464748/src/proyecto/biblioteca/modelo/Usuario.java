
package proyecto.biblioteca.modelo;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Usuario {
    
    public static ArrayList<BibliotecasE> cargarBibliotecas() throws SQLException{
        Connection con = Conexion.getConexion();
        String query = "SELECT * FROM bibliotecabd.bibliotecas";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet resultado = ps.executeQuery();
        
        ArrayList<BibliotecasE> data = new ArrayList<BibliotecasE>();
        
        while(resultado.next()){
            BibliotecasE b1 = new BibliotecasE(resultado.getInt(1),resultado.getString(2));
            data.add(b1);
            //System.out.println(resultado.getString(1));
            //System.out.println(resultado.getString(2));
            //System.out.println("***********************");
        }         
        System.out.println(data.toString());
        return data;
    }
    
    public static void main(String[] args) throws SQLException {
        cargarBibliotecas();
    }
}
