/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.biblioteca.vista;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyecto.biblioteca.Biblioteca;
import proyecto.biblioteca.modelo.AutoresE;
import proyecto.biblioteca.modelo.BibliotecaModelo;
import proyecto.biblioteca.modelo.LibroE;

/**
 *
 * @author USUARIO
 */
public class BibliotecaGUI extends javax.swing.JFrame {

    /**
     * Creates new form BibliotecaGUI
     */
    public static Biblioteca b1;
    public static Object[][] data;
    public static TableModel modelo;
    public static String[] columnas = {"ID", "TITULO", "CODIGO", "AUTOR", "AÑO"};
    public static int idBiblioteca;

    public BibliotecaGUI(int idPerfil, int idBiblioteca) throws SQLException {
        b1 = new Biblioteca();
        this.idBiblioteca = idBiblioteca;
        this.getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        initComponents();
        actualizarTabla();
        inicializarCombo();

        if (idPerfil == 2) {
            this.modificar.setVisible(false);
            this.eliminar.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anio = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        autor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        buscarID = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Título:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Año:");

        agregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregar.setText("Agregar Libro");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titulo)
                            .addComponent(codigo)
                            .addComponent(anio, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(autor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Buscar ID:");

        buscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIDActionPerformed(evt);
            }
        });
        buscarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarIDKeyPressed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(buscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        data = b1.listar();
        modelo = new DefaultTableModel(data,columnas);
        tabla.setModel(modelo);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String titulo1 = titulo.getText();
        String codigo1 = codigo.getText();
        //String autor1 = autor.getText();

        String seleccionado = (String) autor.getSelectedItem();
        int indiceFinal = seleccionado.indexOf(" -");
        String sub = seleccionado.substring(0, indiceFinal);
        //System.out.println(sub);
        int idAutor = Integer.parseInt(sub);
        int anio1 = Integer.parseInt(anio.getText());

        try {
            //b1.agregar(titulo1, codigo1, autor1, anio1);
            BibliotecaModelo.agregarLibro(titulo1, codigo1, idAutor, anio1, idBiblioteca);
            actualizarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(BibliotecaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Libro creado", "Info", JOptionPane.INFORMATION_MESSAGE);
        titulo.setText("");
        codigo.setText("");
        //autor.setText("");
        anio.setText("");

    }//GEN-LAST:event_agregarActionPerformed

    public void inicializarCombo() throws SQLException {
        ArrayList<AutoresE> data = BibliotecaModelo.cargarAutores();
        for (int i = 0; i < data.size(); i++) {
            autor.addItem(data.get(i).toString());
            //System.out.println(data.get(i));
        }
    }

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        try {
            int id = Integer.parseInt(buscarID.getText());
            Object[][] resultado = b1.obtenerPorId(id);

            if (resultado[0][0] == null) {
                JOptionPane.showMessageDialog(this, "El libro con ese ID no existe.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                titulo.setText((String) resultado[0][1]);
                codigo.setText((String) resultado[0][2]);
                //autor.setText((String) resultado[0][3]);
                anio.setText(String.valueOf(resultado[0][4]));
            }

        } catch (Exception exec) {
            JOptionPane.showMessageDialog(this, "ID inválido, solo aceptan números", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        try {
            int id = Integer.parseInt(buscarID.getText());
            Object[][] resultado = b1.obtenerPorId(id);

            if (resultado[0][0] == null) {
                JOptionPane.showMessageDialog(this, "El libro con ese ID no existe.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                String titulo1 = titulo.getText();
                String codigo1 = codigo.getText();
                //String autor1 = autor.getText();
                int anio1 = Integer.parseInt(anio.getText());

                //b1.modificar(id, titulo1, codigo1, autor1, anio1);
                JOptionPane.showMessageDialog(this, "Libro modificado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
            }

        } catch (Exception exec) {
            JOptionPane.showMessageDialog(this, "ID inválido, solo aceptan números", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {
            int id = Integer.parseInt(buscarID.getText());
            Object[][] resultado = b1.obtenerPorId(id);

            if (resultado[0][0] == null) {
                JOptionPane.showMessageDialog(this, "El libro con ese ID no existe.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                b1.eliminar(id);
                JOptionPane.showMessageDialog(this, "Libro eliminado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
            }

        } catch (Exception exec) {
            JOptionPane.showMessageDialog(this, "ID inválido, solo aceptan números", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIDActionPerformed
        try {
            int id = Integer.parseInt(buscarID.getText());
            Object[][] resultado = b1.obtenerPorId(id);

            if (resultado[0][0] == null) {
                JOptionPane.showMessageDialog(this, "El libro con ese ID no existe.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                titulo.setText((String) resultado[0][1]);
                codigo.setText((String) resultado[0][2]);
                //autor.setText((String) resultado[0][3]);
                anio.setText(String.valueOf(resultado[0][4]));
            }

        } catch (Exception exec) {
            JOptionPane.showMessageDialog(this, "ID inválido, solo aceptan números", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarIDActionPerformed

    private void buscarIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarIDKeyPressed

    }//GEN-LAST:event_buscarIDKeyPressed

    public void actualizarTabla() throws SQLException {
        //data = b1.listar();
        DefaultTableModel modelo2 = new DefaultTableModel(null, columnas);
        ArrayList<LibroE> librosC = BibliotecaModelo.cargarLibros();
        for (LibroE libro : librosC) {
            String[] registro = new String[5];
            registro[0] = String.valueOf(libro.getId());
            registro[1] = libro.getTitulo();
            registro[2] = libro.getCodigo();
            registro[3] = libro.getAutor();
            registro[4] = String.valueOf(libro.getAnio());
            modelo2.addRow(registro);
        }
        tabla.setModel(modelo2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BibliotecaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BibliotecaGUI(1, 1).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BibliotecaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField anio;
    private javax.swing.JComboBox<String> autor;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField buscarID;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
