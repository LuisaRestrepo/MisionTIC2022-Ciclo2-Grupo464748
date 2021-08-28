package proyecto.biblioteca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proyecto.biblioteca.controlador.PasswordUtils;

public class LoginModelo {

    public static boolean validarUsuario(String usuario, String clave) throws SQLException {
        System.out.println("Usuario>" + usuario);
        System.out.println("Clave>" + clave);
        Connection con = Conexion.getConexion();
        String query = "SELECT clave,llave FROM empleados WHERE usuario = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);
        //System.out.println(ps.toString());
        ResultSet resultado = ps.executeQuery();

        boolean bandera = false;
        if (resultado.next()) {
            String clave2 = resultado.getString(1);
            System.out.println("CLAVE:"+clave2);
            String llave = resultado.getString(2);
            System.out.println("LLAVE:"+llave);
            boolean passwordMatch = PasswordUtils.verifyUserPassword(clave, clave2, llave);

            if (passwordMatch) {
                System.out.println("Provided user password " + clave + " is correct.");
            } else {
                System.out.println("Provided password is incorrect");
            }
            //System.out.println(x);
            bandera = true;

        }
        con.close();
        return bandera;
    }

    public static int getPerfil(String usuario) throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT Perfiles_idPerfiles FROM bibliotecabd.empleados WHERE usuario = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);
        ResultSet resultado = ps.executeQuery();

        int idPerfil = 0;

        if (resultado.next()) {
            idPerfil = resultado.getInt(1);
        }
        System.out.println(idPerfil);
        con.close();
        return idPerfil;
    }

    public static int getIDBibloteca(String usuario) throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT Bibliotecas_idBibliotecas FROM bibliotecabd.empleados WHERE usuario = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);
        ResultSet resultado = ps.executeQuery();

        int idBiblioteca = 0;

        if (resultado.next()) {
            idBiblioteca = resultado.getInt(1);
        }
        System.out.println(idBiblioteca);
        con.close();
        return idBiblioteca;
    }

    public static void main(String[] args) throws SQLException {
        validarUsuario("minticprueba", "minticprueba");
        getPerfil("kilo");
        getPerfil("prueba");
    }

}
