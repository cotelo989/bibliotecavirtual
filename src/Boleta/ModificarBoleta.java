/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boleta;

import java.sql.Statement;

/**
 *
 * @author pc
 */
public class ModificarBoleta extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarBoleta
     */
    public ModificarBoleta() {
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
        lblfolio = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtprecioneto = new javax.swing.JTextField();
        txtprecioconiva = new javax.swing.JTextField();
        txtcostoiva = new javax.swing.JTextField();
        txtfechadecompra = new javax.swing.JTextField();
        txthoradecomprar = new javax.swing.JTextField();
        txtdistribuidor = new javax.swing.JTextField();
        txtmetododepago = new javax.swing.JTextField();
        lblmetododepago = new javax.swing.JLabel();
        lbldistribuidora = new javax.swing.JLabel();
        lblhoradecompra = new javax.swing.JLabel();
        lblfechacompra = new javax.swing.JLabel();
        lblcostoiva = new javax.swing.JLabel();
        lblprecioconiva = new javax.swing.JLabel();
        lblprecioneto = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblfolio.setText("Folio");

        btnbuscar.setText("Buscar");

        txtdistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdistribuidorActionPerformed(evt);
            }
        });

        txtmetododepago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmetododepagoActionPerformed(evt);
            }
        });

        lblmetododepago.setText("Método de pago");

        lbldistribuidora.setText("Distribuidor involucrado");

        lblhoradecompra.setText("Hora de compra");

        lblfechacompra.setText("Fecha de compra");

        lblcostoiva.setText("Costo IVA");

        lblprecioconiva.setText("Precio con IVA");

        lblprecioneto.setText("Precio neto");

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
                .addGap(23, 23, 23)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MipanelLayout.createSequentialGroup()
                        .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprecioneto)
                            .addComponent(lblfechacompra)
                            .addComponent(lblmetododepago)
                            .addComponent(lbldistribuidora)
                            .addComponent(lblhoradecompra)
                            .addComponent(lblcostoiva)
                            .addComponent(lblprecioconiva))
                        .addGap(33, 33, 33)
                        .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfechadecompra, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtprecioneto, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtprecioconiva, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtcostoiva, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txthoradecomprar)
                            .addComponent(txtdistribuidor)
                            .addComponent(txtmetododepago, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MipanelLayout.createSequentialGroup()
                        .addComponent(lblfolio)
                        .addGap(123, 123, 123)
                        .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        MipanelLayout.setVerticalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfolio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuscar)
                .addGap(22, 22, 22)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprecioneto)
                    .addComponent(txtprecioneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprecioconiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblprecioconiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcostoiva)
                    .addComponent(txtcostoiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfechacompra)
                    .addComponent(txtfechadecompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhoradecompra)
                    .addComponent(txthoradecomprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldistribuidora)
                    .addComponent(txtdistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmetododepago)
                    .addComponent(txtmetododepago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtdistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdistribuidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdistribuidorActionPerformed

    private void txtmetododepagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmetododepagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmetododepagoActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    Statement state;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mipanel;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel lblcostoiva;
    private javax.swing.JLabel lbldistribuidora;
    private javax.swing.JLabel lblfechacompra;
    private javax.swing.JLabel lblfolio;
    private javax.swing.JLabel lblhoradecompra;
    private javax.swing.JLabel lblmetododepago;
    private javax.swing.JLabel lblprecioconiva;
    private javax.swing.JLabel lblprecioneto;
    private javax.swing.JTextField txtcostoiva;
    private javax.swing.JTextField txtdistribuidor;
    private javax.swing.JTextField txtfechadecompra;
    private javax.swing.JTextField txtfolio;
    private javax.swing.JTextField txthoradecomprar;
    private javax.swing.JTextField txtmetododepago;
    private javax.swing.JTextField txtprecioconiva;
    private javax.swing.JTextField txtprecioneto;
    // End of variables declaration//GEN-END:variables
}