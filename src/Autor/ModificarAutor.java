/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autor;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ModificarAutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarAutor
     */
    public ModificarAutor() {
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
        lblcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lbltapellido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellidopaterno = new javax.swing.JTextField();
        txtapellidomaterno = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblcodigo.setText("Rut");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lblnombre.setText("Nombre");

        lbltapellido.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtapellidopaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidopaternoActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MipanelLayout = new javax.swing.GroupLayout(Mipanel);
        Mipanel.setLayout(MipanelLayout);
        MipanelLayout.setHorizontalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(lblnombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblcodigo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lbltapellido))
                .addGap(18, 18, 18)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtapellidomaterno)
                    .addComponent(txtapellidopaterno)
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        MipanelLayout.setVerticalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MipanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltapellido)
                    .addComponent(txtapellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnmodificar)
                .addGap(20, 20, 20))
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

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidopaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidopaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidopaternoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try {                                          
            Conexion ObjetoConexion = new Conexion();
            
            String codigo = txtcodigo.getText();
            
            if (codigo.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Complete los espacios en blanco");
            }
            
            String query = "select * from autor where codigo ='"+codigo+"'";
            
            state = ObjetoConexion.getCon().createStatement();
            
            res = state.executeQuery(query);
            
            if (res.next()) {
                txtnombre.setText(res.getString("Nombre"));
                txtapellidopaterno.setText(res.getString("apellidopaterno"));
                txtapellidomaterno.setText(res.getString("apellidomaterno"));

            }
            else{
                JOptionPane.showMessageDialog(this, "No hay registros");
                txtcodigo.setText("");
                txtnombre.setText("");
                txtapellidopaterno.setText("");
                txtapellidomaterno.setText("");
                
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(ModificarAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {                                          
            Conexion ObjetoConexion = new Conexion();
            
            String codigo = txtcodigo.getText();
            String nombre = txtnombre.getText();
            String apellidopaterno = txtapellidopaterno.getText();
            String apellidomaterno = txtapellidomaterno.getText();


            String query ="update autor set nombre='"+nombre+"',apellidopaterno='"+apellidopaterno+"',"
                    + "apellidomaterno='"+apellidomaterno+"' where codigo = '"+codigo+"'";
            
            state = ObjetoConexion.getCon().createStatement();
            int x = state.executeUpdate(query);
            
            if (x > 0) {
                JOptionPane.showMessageDialog(this, "Actualizado");
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo Actualizar");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(ModificarAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    ResultSet res;
    Statement state;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mipanel;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltapellido;
    private javax.swing.JTextField txtapellidomaterno;
    private javax.swing.JTextField txtapellidopaterno;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
