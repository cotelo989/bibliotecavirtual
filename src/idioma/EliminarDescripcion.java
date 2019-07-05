/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idioma;

import estado.*;
import Editorial.*;
import Categoria.EliminarCategoria;
import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class EliminarDescripcion extends javax.swing.JInternalFrame {

    /**
     * Creates new form EliminarEditorial
     */
    public EliminarDescripcion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mipanel = new javax.swing.JPanel();
        txtcodigo = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        lblcodigo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lblcodigo.setText("Codigo");

        javax.swing.GroupLayout MipanelLayout = new javax.swing.GroupLayout(Mipanel);
        Mipanel.setLayout(MipanelLayout);
        MipanelLayout.setHorizontalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MipanelLayout.createSequentialGroup()
                        .addComponent(lblcodigo)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MipanelLayout.setVerticalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            Conexion ObjetoConexion = new Conexion();

            String codigo_idioma = txtcodigo.getText();
            if (codigo_idioma.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Complete el espacio en blanco");
            }

            String query ="delete from idioma where codigo_idioma = '"+codigo_idioma+"'";

            state = ObjetoConexion.getCon().createStatement();

            int x = state.executeUpdate(query);

            if (x>0) {
                JOptionPane.showMessageDialog(this, "Eliminado");
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo Eliminar");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(EliminarDescripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    Statement state;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mipanel;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}