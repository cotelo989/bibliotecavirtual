/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaccion;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author cristian
 */
public class BuscarComprar extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarComprar
     */
    public BuscarComprar() {
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

        jLabel1 = new javax.swing.JLabel();
        labLibro = new javax.swing.JLabel();
        labPrecio = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        labID = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Folio de factura:");

        labLibro.setText("Serie del libro:");

        labPrecio.setText("Precio:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labID.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labLibro)
                            .addComponent(labPrecio)
                            .addComponent(labID))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labID)
                .addGap(18, 18, 18)
                .addComponent(labPrecio)
                .addGap(18, 18, 18)
                .addComponent(labLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    try {                                         
        Conexion ObjetoConexion = new Conexion();
        
        String Buscar = txtBuscar.getText();
        String query = "select * from compra where folio_fac = '"+Buscar+"'";
        
        state = ObjetoConexion.getCon().createStatement();
        res = state.executeQuery(query); 
        
        
        if (Buscar.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Primero ingrese el folio de la factura");
        } else
        { 
            if (res.next()) 
        {   
            labID.setText("Id: "+res.getString("id"));
            labPrecio.setText("Precio: "+res.getString("precio"));
            labLibro.setText("Serie del libro: "+res.getString("serie"));
        } else
            {                
                labID.setText("Id: ");
                labPrecio.setText("Precio: ");
                labLibro.setText("Serie del libro: ");
            }
        }      
        } catch (SQLException ex) 
        {
            Logger.getLogger(BuscarComprar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    ResultSet res;
    Statement state;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labLibro;
    private javax.swing.JLabel labPrecio;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
