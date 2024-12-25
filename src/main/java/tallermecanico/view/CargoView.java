
package tallermecanico.view;

import javax.swing.JFrame;

public class CargoView extends javax.swing.JFrame {

    public CargoView() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdCargo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 41, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setText("jLabel4");
        jPanel2.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 48, 220, 330));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 440));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID - Cargo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setText("Cargo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setText("Sueldo");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        jPanel3.add(txtIdCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, -1));
        jPanel3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 200, -1));
        jPanel3.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 200, -1));

        btnGuardar.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 90, 30));

        btnNuevo.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, 30));

        btnBorrar.setBackground(new java.awt.Color(26, 41, 74));
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.setBorderPainted(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cargo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 80, 67));

        btnEditar.setBackground(new java.awt.Color(26, 41, 74));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, 30));

        btnListar.setBackground(new java.awt.Color(26, 41, 74));
        btnListar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnListar.setText("Listar");
        btnListar.setBorder(null);
        btnListar.setBorderPainted(false);
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel3.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 200, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 330, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdCargo;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
