/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autor;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CrearAutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarAutor
     */
    public CrearAutor() {
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
        Mipanel1 = new javax.swing.JPanel();
        btnregistrar = new javax.swing.JButton();
        txtapellidomaterno = new javax.swing.JTextField();
        txtapellidopaterno = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        lbltapellido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblrut = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        javax.swing.GroupLayout MipanelLayout = new javax.swing.GroupLayout(Mipanel);
        Mipanel.setLayout(MipanelLayout);
        MipanelLayout.setHorizontalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        MipanelLayout.setVerticalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        txtapellidopaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidopaternoActionPerformed(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        lblnombre.setText("Nombre");

        lbltapellido.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        lblrut.setText("codigo");

        javax.swing.GroupLayout Mipanel1Layout = new javax.swing.GroupLayout(Mipanel1);
        Mipanel1.setLayout(Mipanel1Layout);
        Mipanel1Layout.setHorizontalGroup(
            Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mipanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(lblnombre, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lbltapellido)
                    .addComponent(lblrut))
                .addGap(54, 54, 54)
                .addGroup(Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtapellidomaterno)
                    .addComponent(txtapellidopaterno)
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txtcodigo))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        Mipanel1Layout.setVerticalGroup(
            Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Mipanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrut)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltapellido)
                    .addComponent(txtapellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Mipanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnregistrar)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mipanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Mipanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidopaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidopaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidopaternoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
    try {                                             
            
            Conexion ObjetoConexion = new Conexion();
            
            String codigo= txtcodigo.getText();
            String nombre = txtnombre.getText();
            String apellidopaterno = txtapellidopaterno.getText();
            String apellidomaterno = txtapellidomaterno.getText();

            if (codigo.trim().equals("")||nombre.trim().equals("")|| apellidopaterno.trim().equals("")|| apellidomaterno.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Complete los espacios en blanco");
            }     
            
        try{

            String query = " insert into autor values ('"+codigo+"','"+nombre+"','"+apellidopaterno+"','"+apellidomaterno+"')";
            
            state = ObjetoConexion.getCon().createStatement();

            try{
                int x = state.executeUpdate(query);

                if (x < 0) {
                    JOptionPane.showMessageDialog(this, "No se pudo Registrar");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Registrado Correctamente");
                }
            }
            catch(SQLException error){
                JOptionPane.showMessageDialog(this, "Codigo ya registrado");
            }

            }
        catch(NumberFormatException error){
        }


        } catch (SQLException ex) {
        Logger.getLogger(CrearAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    Connection con;
    Statement state;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mipanel;
    private javax.swing.JPanel Mipanel1;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblrut;
    private javax.swing.JLabel lbltapellido;
    private javax.swing.JTextField txtapellidomaterno;
    private javax.swing.JTextField txtapellidopaterno;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
