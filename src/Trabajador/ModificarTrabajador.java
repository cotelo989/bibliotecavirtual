/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajador;

/**
 *
 * @author Administrador
 */
public class ModificarTrabajador extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarTrabajador
     */
    public ModificarTrabajador() {
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
        txtrut = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        lblDireecion = new javax.swing.JLabel();
        lblapellidopa = new javax.swing.JLabel();
        lblapellidoma = new javax.swing.JLabel();
        txtcontrato = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtapellidopaterno = new javax.swing.JTextField();
        lblcorreo = new javax.swing.JLabel();
        txtapellidomaterno = new javax.swing.JTextField();
        txtfechadenacimiento = new javax.swing.JTextField();
        txtdirrecion = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        lblcontrato = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        lblrut = new javax.swing.JLabel();
        lblfechadenacimiento = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btnbuscar.setText("Buscar");

        lblDireecion.setText("Direcion");

        lblapellidopa.setText("Apellido Paterno");

        lblapellidoma.setText("Apellido Materno");

        lblnombre.setText("Nombre");

        lblcorreo.setText("Correo");

        lbltelefono.setText("Telefono");

        lblcontrato.setText("Fecha  contrato laboral");

        lblrut.setText("Rut");

        lblfechadenacimiento.setText("Fecha de Nacimiento");

        btnmodificar.setText("Modificar");

        javax.swing.GroupLayout MipanelLayout = new javax.swing.GroupLayout(Mipanel);
        Mipanel.setLayout(MipanelLayout);
        MipanelLayout.setHorizontalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MipanelLayout.createSequentialGroup()
                        .addComponent(lblrut)
                        .addGap(31, 31, 31)
                        .addComponent(txtrut, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MipanelLayout.createSequentialGroup()
                        .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnombre)
                            .addComponent(lblapellidopa)
                            .addComponent(lblcorreo)
                            .addComponent(lbltelefono)
                            .addComponent(lblDireecion)
                            .addComponent(lblfechadenacimiento)
                            .addComponent(lblapellidoma)
                            .addComponent(lblcontrato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcontrato)
                                .addComponent(txtfechadenacimiento)
                                .addComponent(txtdirrecion)
                                .addComponent(txtapellidopaterno)
                                .addComponent(txtapellidomaterno)
                                .addComponent(txtnombre)
                                .addComponent(txttelefono)
                                .addComponent(txtcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
        );
        MipanelLayout.setVerticalGroup(
            MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MipanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(lblrut))
                .addGap(28, 28, 28)
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
                .addGap(18, 18, 18)
                .addGroup(MipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontrato)
                    .addComponent(txtcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mipanel;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel lblDireecion;
    private javax.swing.JLabel lblapellidoma;
    private javax.swing.JLabel lblapellidopa;
    private javax.swing.JLabel lblcontrato;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblfechadenacimiento;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblrut;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapellidomaterno;
    private javax.swing.JTextField txtapellidopaterno;
    private javax.swing.JTextField txtcontrato;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdirrecion;
    private javax.swing.JTextField txtfechadenacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtrut;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
