package proyecto.biblioteca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proyecto.biblioteca.PasswordUtils;


public class LoginModelo {

    public static void validarUsuario(String usuario, String clave) throws SQLException {
        Connection con = Conexion.getConexion();
        String query = "SELECT clave,llave FROM bibliotecabd.empleados WHERE usuario = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);
        //System.out.println(ps.toString());
        ResultSet resultado = ps.executeQuery();

        boolean bandera = false;
        if (resultado.next()) {
            String clave2 = resultado.getString(1);
            System.out.println(clave2);
            String llave = resultado.getString(2);
            System.out.println(llave);
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
        //return data;
    }

    public static void main(String[] args) throws SQLException {
        validarUsuario("prueba", "prueba123");
    }

}
