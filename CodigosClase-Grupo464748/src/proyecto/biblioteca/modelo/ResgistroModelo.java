
package proyecto.biblioteca.modelo;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import semana6.PasswordUtils;


public class ResgistroModelo {
    
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
        con.close();
        return data;
    }
    
    public static void agregarUsuario(String n,String e,String u,String c,int id) throws SQLException{
    
        String llave = PasswordUtils.getSalt(10);
        String clave = PasswordUtils.generateSecurePassword(llave, c);
        System.out.println(llave);
        System.out.println(clave);
        
        Connection con = Conexion.getConexion();
        String query = "INSERT INTO empleados (nombre, email, usuario, clave, llave,Perfiles_idPerfiles,Bibliotecas_idBibliotecas) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, n);
        ps.setString(2, e);
        ps.setString(3, u);
        ps.setString(4, clave);
        ps.setString(5, llave);
        ps.setInt(6, 2);
        ps.setInt(7, id);
        
        ps.executeUpdate();
        System.out.println(ps.toString());
        con.close();
    }
    
    public static void main(String[] args) throws SQLException {
        //cargarBibliotecas();
        agregarUsuario("p","p","p","admin123",1);
    }
}
