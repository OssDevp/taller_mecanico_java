
package tallermecanico.view;

import javax.swing.*;

import tallermecanico.controller.OrdenController;
import tallermecanico.entities.FacturaEntity;
import tallermecanico.entities.OrdenEntity;
import tallermecanico.view.components.ImageSize;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FacturaView extends javax.swing.JFrame {

    private ImageSize image = new ImageSize();
    private final OrdenController ordenController = new OrdenController();
    FacturaEntity facturaEntity = new FacturaEntity();
    
    public FacturaView() {
        initComponents();
        setTitle("Factura");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        txtFechaEmision.setEnabled(false);
        txtCliente.setEnabled(false);
        txtTotal.setEnabled(false);
        setLocationRelativeTo(null);
        this.image.setSize(lblImage, "src/main/resources/factura.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCliente = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtFechaEmision = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTotal = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtOrden = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnVerCliente = new javax.swing.JButton();
        btnVerOrden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 41, 74));

        lblImage.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 410));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Factura");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 80, 40));

        jLabel3.setText("Fecha Emision");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jScrollPane2.setViewportView(txtCliente);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 120, -1));

        jLabel4.setText("Cedula Cliente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jScrollPane3.setViewportView(txtFechaEmision);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 130, -1));

        jLabel5.setText("Total");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jScrollPane4.setViewportView(txtTotal);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 130, -1));

        txtOrden.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOrdenFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(txtOrden);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 120, -1));

        jLabel6.setText("Nro Orden");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 90, 30));

        btnEditar.setBackground(new java.awt.Color(26, 41, 74));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(204, 204, 204));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 90, 30));

        btnNuevo.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 90, 30));

        btnVerCliente.setBackground(new java.awt.Color(26, 41, 74));
        btnVerCliente.setForeground(new java.awt.Color(204, 204, 204));
        btnVerCliente.setText("...");
        btnVerCliente.setBorderPainted(false);
        btnVerCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnVerCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, -1));

        btnVerOrden.setBackground(new java.awt.Color(26, 41, 74));
        btnVerOrden.setForeground(new java.awt.Color(204, 204, 204));
        btnVerOrden.setText("...");
        btnVerOrden.setBorderPainted(false);
        btnVerOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerOrdenActionPerformed(evt);
            }
        });
        jPanel3.add(btnVerOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 30, -1));

        jButton1.setBackground(new java.awt.Color(26, 41, 74));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Completar Factura");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 290, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 430, 410));

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

    private void txtOrdenFocusLost(java.awt.event.FocusEvent evt) {                                   
        this.autoCompletarCampos();
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.limpiarCampos();
        LocalDate fecha = LocalDate.now();
        txtFechaEmision.setText(fecha.toString());
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String fechaEmision = txtFechaEmision.getText();
        String orden = txtOrden.getText();

        if (fechaEmision.isEmpty() || orden.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            OrdenEntity ordenEntity = ordenController.obtenerOrden(orden);
            facturaEntity = new FacturaEntity();
            facturaEntity.setFechaEmision(LocalDate.parse(fechaEmision));
            facturaEntity.setCliente(ordenEntity.getCliente());
            facturaEntity.setOrden(ordenEntity);
            facturaEntity.setTotal(ordenEntity.getCostoTotal());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la factura", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        ClienteView clienteView = new ClienteView();
        clienteView.setVisible(true);
    }

    private void btnVerOrdenActionPerformed(java.awt.event.ActionEvent evt) {                                            
        OrdenView ordenView = new OrdenView();
        ordenView.setVisible(true);
    }

    private void limpiarCampos() {
        txtCliente.setText("");
        txtFechaEmision.setText("");
        txtTotal.setText("");
        txtOrden.setText("");
    }

    private void autoCompletarCampos() {
        try {
            OrdenEntity ordenEntity = ordenController.obtenerOrden(txtOrden.getText());
            LocalDate fecha = LocalDate.now();
            txtCliente.setText(ordenEntity.getCliente().getCedula());
            txtTotal.setText(ordenEntity.getCostoTotal().toString());
            txtFechaEmision.setText(fecha.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JButton btnVerOrden;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextPane txtCliente;
    private javax.swing.JTextPane txtFechaEmision;
    private javax.swing.JTextPane txtOrden;
    private javax.swing.JTextPane txtTotal;
    // End of variables declaration//GEN-END:variables
}
