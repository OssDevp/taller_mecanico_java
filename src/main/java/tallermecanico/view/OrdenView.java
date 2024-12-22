
package tallermecanico.view;

import javax.swing.JFrame;
import tallermecanico.view.components.ImageSize;


public class OrdenView extends javax.swing.JFrame {
    
    private ImageSize image = new ImageSize();
    
    public OrdenView() {
        initComponents();
        setTitle("Registrar Orden");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        image.setSize(lblImage, "src/main/resources/orden.png");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        txtFechaFinal = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtidVehiculo = new javax.swing.JTextField();
        txtIdEmpleado = new javax.swing.JTextField();
        txtIdServicio = new javax.swing.JTextField();
        txtCostoTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnIrCliente = new javax.swing.JButton();
        btnIrVehiculo = new javax.swing.JButton();
        btnIrEmpleado = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(26, 41, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setText("jLabel11");
        jPanel2.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 88, 230, 363));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Fecha de Ingreso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setText("Fecha de Finalizacion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel4.setText("Cedula Cliente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel5.setText("Placa Vehiculo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel6.setText("Cedula Empleado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel7.setText("Servicio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel9.setText("Costo Total:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));
        jPanel1.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));
        jPanel1.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 171, -1));
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 171, -1));
        jPanel1.add(txtidVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 171, -1));
        jPanel1.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 171, -1));
        jPanel1.add(txtIdServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 171, -1));
        jPanel1.add(txtCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 171, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Orden");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 380, 67));

        btnGuardar.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 80, 30));

        btnNuevo.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 70, 30));

        btnBorrar.setBackground(new java.awt.Color(26, 41, 74));
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("");
        btnBorrar.setBorder(null);
        btnBorrar.setBorderPainted(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setFocusPainted(false);
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 70, 30));

        btnIrCliente.setBackground(new java.awt.Color(26, 41, 74));
        btnIrCliente.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnIrCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnIrCliente.setText("...");
        btnIrCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIrCliente.setFocusPainted(false);
        btnIrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnIrCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 25, -1));

        btnIrVehiculo.setBackground(new java.awt.Color(26, 41, 74));
        btnIrVehiculo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnIrVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnIrVehiculo.setText("...");
        btnIrVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIrVehiculo.setFocusPainted(false);
        btnIrVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIrVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 25, -1));

        btnIrEmpleado.setBackground(new java.awt.Color(26, 41, 74));
        btnIrEmpleado.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnIrEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnIrEmpleado.setText("...");
        btnIrEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIrEmpleado.setFocusPainted(false);
        btnIrEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIrEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 25, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Trabajando", "Finalizado" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 170, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnIrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrClienteActionPerformed
        ClienteView cliente = new ClienteView();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnIrClienteActionPerformed

    private void btnIrVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrVehiculoActionPerformed
        VehiculoView vehiculoView = new VehiculoView();
        vehiculoView.setVisible(true);
    }//GEN-LAST:event_btnIrVehiculoActionPerformed

    private void btnIrEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrEmpleadoActionPerformed
        EmpleadoView empleadoView = new EmpleadoView();
        empleadoView.setVisible(true);
    }//GEN-LAST:event_btnIrEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIrCliente;
    private javax.swing.JButton btnIrEmpleado;
    private javax.swing.JButton btnIrVehiculo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdServicio;
    private javax.swing.JTextField txtidVehiculo;
    // End of variables declaration//GEN-END:variables
}
