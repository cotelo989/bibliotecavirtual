/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autor;

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
public class EliminarAutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form EliminarAutor
     */
    public EliminarAutor() {
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
        lblrut = new javax.swing.JLabel();
        txcodigo = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblrut.setText("Codigo");

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MipanelLayout = new javax.swing.GroupLayout(Mipanel);
        Mipanel.setLayout(MipanelLayout);
        MipanelLayout.setHorizontalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MipanelLayout.createSequentialGroup()
                        .addComponent(lblrut)
                        .addGap(44, 44, 44)
                        .addComponent(txcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MipanelLayout.setVerticalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrut)
                    .addComponent(txcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btneliminar)
                .addContainerGap(25, Short.MAX_VALUE))
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
            
            String codigo = txcodigo.getText();
            if (codigo.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Complete el espacio en blanco"); 
            }
            
            String query ="delete from autor where codigo = '"+codigo+"'";
            
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
           Logger.getLogger(EliminarAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    Statement state;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mipanel;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel lblrut;
    private javax.swing.JTextField txcodigo;
    // End of variables declaration//GEN-END:variables
}
