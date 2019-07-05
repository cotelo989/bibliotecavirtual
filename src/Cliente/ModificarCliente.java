/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Autor.ModificarAutor;
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
public class ModificarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarCliente
     */
    public ModificarCliente() {
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
        txtdirrecion = new javax.swing.JTextField();
        txtrut = new javax.swing.JTextField();
        lblDireecion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txtfechadenacimiento = new javax.swing.JTextField();
        lblcorreo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lblapellidoma = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lblfechadenacimiento = new javax.swing.JLabel();
        lblrut = new javax.swing.JLabel();
        txtapellidopaterno = new javax.swing.JTextField();
        txtapellidomaterno = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        lblapellidopa = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblDireecion.setText("Direcion");

        lbltelefono.setText("Telefono");

        lblcorreo.setText("Correo");

        lblnombre.setText("Nombre");

        lblapellidoma.setText("Apellido Materno");

        lblfechadenacimiento.setText("Fecha de Nacimiento");

        lblrut.setText("Rut");

        lblapellidopa.setText("Apellido Paterno");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MipanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MipanelLayout.createSequentialGroup()
                        .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre)
                            .addComponent(lblapellidopa)
                            .addComponent(lblcorreo)
                            .addComponent(lbltelefono)
                            .addComponent(lblDireecion)
                            .addComponent(lblfechadenacimiento)
                            .addComponent(lblapellidoma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfechadenacimiento)
                            .addComponent(txtdirrecion)
                            .addComponent(txtapellidopaterno)
                            .addComponent(txtapellidomaterno)
                            .addComponent(txtnombre)
                            .addComponent(txttelefono)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(46, 46, 46))
                    .addGroup(MipanelLayout.createSequentialGroup()
                        .addComponent(lblrut)
                        .addGap(18, 18, 18)
                        .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        MipanelLayout.setVerticalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrut)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(33, 33, 33)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapellidoma)
                    .addComponent(txtapellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellidopa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireecion))
                .addGap(18, 18, 18)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcorreo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechadenacimiento))
                .addGap(30, 30, 30)
                .addComponent(btnmodificar)
                .addContainerGap())
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

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try {                                          
            Conexion ObjetoConexion = new Conexion();
            
            String ruttexto = txtrut.getText();
            
            if (ruttexto.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Complete los espacios en blanco");
            }
            
            String query = "select * from autor where rut ='"+ruttexto+"'";
            
            state = ObjetoConexion.getCon().createStatement();
            
            res = state.executeQuery(query);
            
            if (res.next()) {
                txtnombre.setText(res.getString("Nombre"));
                txtapellidopaterno.setText(res.getString("Apellido Paterno"));
                txtapellidomaterno.setText(res.getString("Apellido Materno"));
                txtdirrecion.setText(res.getString("Direccion"));
                txttelefono.setText(res.getString("Telefono"));
                txtcorreo.setText(res.getString("Correo"));
                txtfechadenacimiento.setText(res.getString("Fecha de Nacimiento"));

            }
            else{
                JOptionPane.showMessageDialog(this, "No hay registros");
                txtrut.setText("");
                txtnombre.setText("");
                txtapellidopaterno.setText("");
                txtapellidomaterno.setText("");
                txtdirrecion.setText("");
                txttelefono.setText("");
                txtcorreo.setText("");
                txtfechadenacimiento.setText("");
                
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(ModificarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {                                          
            Conexion ObjetoConexion = new Conexion();
            
            String ruttexto = txtrut.getText();
            String nombretexto = txtnombre.getText();
            String apellidopaternotexto = txtapellidopaterno.getText();
            String apellidomaternotexto = txtapellidomaterno.getText();
            String direcciontexto = txtdirrecion.getText();
            String telefonotexto = txttelefono.getText();
            String correotexto = txtcorreo.getText();
            String fechanacimientotexto = txtfechadenacimiento.getText();
            


            String query ="update cliente set nombre='"+nombretexto+"',apellidopateno='"+apellidopaternotexto+"',"
                    + "apellidomaterno='"+apellidomaternotexto+"',direccion='"+direcciontexto+"',telefono='"+telefonotexto+"'"
                    + ",correo='"+correotexto+"',fechadenacimiento='"+fechanacimientotexto+"'";
            
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
            Logger.getLogger(ModificarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    ResultSet res;
    Statement state;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mipanel;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel lblDireecion;
    private javax.swing.JLabel lblapellidoma;
    private javax.swing.JLabel lblapellidopa;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblfechadenacimiento;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblrut;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapellidomaterno;
    private javax.swing.JTextField txtapellidopaterno;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdirrecion;
    private javax.swing.JTextField txtfechadenacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtrut;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}