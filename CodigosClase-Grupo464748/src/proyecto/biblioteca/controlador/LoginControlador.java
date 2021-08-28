package proyecto.biblioteca.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.biblioteca.modelo.LoginModelo;
import proyecto.biblioteca.vista.BibliotecaGUI;
import proyecto.biblioteca.vista.BibliotecaLogin;
import proyecto.biblioteca.vista.BibliotecaRegistro;

public class LoginControlador implements ActionListener {

    private BibliotecaLogin vista;
    private LoginModelo modelo;

    public LoginControlador(BibliotecaLogin vista, LoginModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getIngresar().addActionListener(this);
        this.vista.getMostrar().addActionListener(this);
        this.vista.registro.addActionListener(this);
    }
    
    public void iniciar(){
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Ingresar":
                String user = this.vista.getUsuario().getText();
                String pass = new String(this.vista.getPassword().getPassword());

            {
                try {
                    //if (user.equals("mintic") && pass.equals("admin123"))
                    if (LoginModelo.validarUsuario(user,pass)) {
                        JOptionPane.showMessageDialog(vista, "Logueo exitoso");
                        int idPerfil = LoginModelo.getPerfil(user);
                        int idBiblioteca = LoginModelo.getIDBibloteca(user);
                        new BibliotecaGUI(idPerfil,idBiblioteca).setVisible(true);
                        vista.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(vista, "Credenciales Inválidas", "ERROR!", JOptionPane.ERROR_MESSAGE);
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginControlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                this.vista.getUsuario().setText("");
                this.vista.getPassword().setText("");
                break;

            case "Mostrar contraseña":
                if (this.vista.getMostrar().isSelected()) {
                    this.vista.getPassword().setEchoChar((char) 0);
                } else {
                    this.vista.getPassword().setEchoChar('*');
                }
                break;
                
            case "Registro":
            {
                try {
                    new BibliotecaRegistro().setVisible(true);
                    vista.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginControlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;


        }
    }

}
