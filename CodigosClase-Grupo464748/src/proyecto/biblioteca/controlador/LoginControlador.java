package proyecto.biblioteca.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyecto.biblioteca.modelo.LoginModelo;
import proyecto.biblioteca.vista.BibliotecaGUI;
import proyecto.biblioteca.vista.BibliotecaLogin;

public class LoginControlador implements ActionListener {

    private BibliotecaLogin vista;
    private LoginModelo modelo;

    public LoginControlador(BibliotecaLogin vista, LoginModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getIngresar().addActionListener(this);
        this.vista.getMostrar().addActionListener(this);
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

                if (user.equals("mintic") && pass.equals("admin123")) {
                    JOptionPane.showMessageDialog(vista, "Logueo exitoso");
                    new BibliotecaGUI().setVisible(true);
                    vista.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(vista, "Credenciales Inválidas", "ERROR!", JOptionPane.ERROR_MESSAGE);

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

        }
    }

}
