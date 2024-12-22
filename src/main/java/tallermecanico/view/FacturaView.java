
package tallermecanico.view;

import javax.swing.JFrame;
import tallermecanico.view.components.ImageSize;

public class FacturaView extends javax.swing.JFrame {

    private ImageSize image = new ImageSize();
    
    public FacturaView() {
        initComponents();
        setTitle("Factura");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdFactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdOrden = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDetalleFactura = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnIrCliente = new javax.swing.JButton();
        btnIrOrden = new javax.swing.JButton();
        btnIrDetalle = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Factura");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 6, -1, 67));

        jLabel1.setText("Id Factura:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));
        jPanel2.add(txtIdFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 206, -1));

        jLabel2.setText("Fecha de Emision: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 118, -1, -1));
        jPanel2.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 115, 204, -1));

        jLabel3.setText("Id Cliente:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 148, -1, -1));
        jPanel2.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 145, 204, -1));

        jLabel4.setText("Id Orden:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 178, -1, -1));
        jPanel2.add(txtIdOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 175, 204, -1));

        jLabel5.setText("Total: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 208, -1, -1));
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 205, 204, -1));

        jLabel6.setText("Id Detalle");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jPanel2.add(txtDetalleFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 204, -1));

        btnGuardar.setText("Guardar Factura");
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 287, -1, -1));

        btnBorrar.setText("Eliminar Datos");
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 287, -1, -1));

        btnNuevo.setText("Nuevo");
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 287, -1, -1));

        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 323, -1, -1));

        btnIrCliente.setText("...");
        jPanel2.add(btnIrCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 25, -1));

        btnIrOrden.setText("...");
        jPanel2.add(btnIrOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 25, -1));

        btnIrDetalle.setText("...");
        jPanel2.add(btnIrDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 25, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, -3, 430, 480));

        jPanel3.setBackground(new java.awt.Color(26, 41, 74));

        lblImage.setText("jLabel8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIrCliente;
    private javax.swing.JButton btnIrDetalle;
    private javax.swing.JButton btnIrOrden;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtDetalleFactura;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdFactura;
    private javax.swing.JTextField txtIdOrden;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
