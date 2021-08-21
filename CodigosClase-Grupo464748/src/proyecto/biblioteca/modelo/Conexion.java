package proyecto.biblioteca.modelo;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;

public class Conexion {

    private static final String SERVIDOR = Config.SERVIDOR;
    private static final int PUERTO = Config.PUERTO;
    private static final String BD = Config.BD;
    private static final String NOMBRE_USUARIO = Config.NOMBRE_USUARIO;
    private static final String CONTRASENA_USUARIO = Config.CONTRASENA_USUARIO;

    public static Connection getConexion() throws SQLException {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName(SERVIDOR);
        ds.setPortNumber(PUERTO);
        ds.setDatabaseName(BD);
        ds.setUser(NOMBRE_USUARIO);
        ds.setPassword(CONTRASENA_USUARIO);
        
        Connection con = ds.getConnection();
        return con;
    }
}
