
package proyecto.biblioteca;

import proyecto.biblioteca.controlador.LoginControlador;
import proyecto.biblioteca.modelo.LoginModelo;
import proyecto.biblioteca.vista.BibliotecaLogin;


public class Main {
    
    public static void main(String[] args) {
        BibliotecaLogin vista = new BibliotecaLogin();
        LoginModelo modelo = new LoginModelo();
        
        LoginControlador controlador = new LoginControlador(vista,modelo);
        controlador.iniciar();
    }
    
}
