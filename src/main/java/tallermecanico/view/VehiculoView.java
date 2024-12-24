
package tallermecanico.view;

import javax.swing.JFrame;
import tallermecanico.view.components.ImageSize;


public class VehiculoView extends javax.swing.JFrame {

private ImageSize image = new ImageSize();
    public VehiculoView() {
        initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.image.setSize(lblImage, "src/main/resources/vehiculo.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtAnho = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tbnBuscar = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        btnIrCliente = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vehiculos");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 41, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setText("jLabel9");
        jPanel2.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 270));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 410));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtAnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 123, -1));
        jPanel3.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 123, -1));

        jLabel2.setText("Placa");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
        jPanel3.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 90, -1));

        jLabel3.setText("Marca");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setText("Modelo");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        jPanel3.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel7.setText("Color");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel8.setText("Cedula Cliente");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        tbnBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbnBuscar.setText("Buscar");
        jPanel3.add(tbnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));
        jPanel3.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 123, -1));

        btnIrCliente.setText("...");
        jPanel3.add(btnIrCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));
        jPanel3.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 123, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Vehiculo");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 56));
        jPanel3.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 123, -1));

        jLabel5.setText("Año");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 360, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void limpiarCampos() {
        txtPlaca.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtIdCliente.setText("");
        txtAnho.setText("");
        txtColor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIrCliente;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JButton tbnBuscar;
    private javax.swing.JTextField txtAnho;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
