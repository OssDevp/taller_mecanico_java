package tallermecanico.view;

import tallermecanico.view.components.ImageSize;

public class MenuView extends javax.swing.JFrame {

    private ImageSize image = new ImageSize();
    private ClienteView clienteView = new ClienteView();
    private OrdenView ordenView = new OrdenView();

    public MenuView() {
        initComponents();
        setResizable(false);
        this.image.setSize(this.lblImage, "src/main/resources/tallermecanico.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanelContainer = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        lblTituloPrincipal = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarOrden = new javax.swing.JButton();
        btnEstadoOrden = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnServicios = new javax.swing.JMenuItem();
        jMnCliente = new javax.swing.JMenuItem();
        jMnVehiculo = new javax.swing.JMenuItem();
        jMnFactura = new javax.swing.JMenu();
        jMnFacturas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMnEmpleado = new javax.swing.JMenuItem();
        jMnCargo = new javax.swing.JMenuItem();
        jMnProducto = new javax.swing.JMenuItem();
        jMnProveedor = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taller MOFA");

        jPanelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(26, 41, 74));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTituloPrincipal.setForeground(new java.awt.Color(161, 171, 188));
        lblTituloPrincipal.setText("Taller MOFA");
        jPanelPrincipal.add(lblTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, 40));

        btnRegistrarCliente.setBackground(new java.awt.Color(140, 161, 201));
        btnRegistrarCliente.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(23, 40, 61));
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setBorder(null);
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCliente.setFocusCycleRoot(true);
        btnRegistrarCliente.setFocusPainted(false);
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 170, 70));

        btnRegistrarOrden.setBackground(new java.awt.Color(140, 161, 201));
        btnRegistrarOrden.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnRegistrarOrden.setForeground(new java.awt.Color(23, 40, 61));
        btnRegistrarOrden.setText("Registrar Orden");
        btnRegistrarOrden.setBorder(null);
        btnRegistrarOrden.setBorderPainted(false);
        btnRegistrarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarOrden.setFocusCycleRoot(true);
        btnRegistrarOrden.setFocusPainted(false);
        btnRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarOrdenActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnRegistrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 70));

        btnEstadoOrden.setBackground(new java.awt.Color(140, 161, 201));
        btnEstadoOrden.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEstadoOrden.setForeground(new java.awt.Color(23, 40, 61));
        btnEstadoOrden.setText("Ver Estado Orden");
        btnEstadoOrden.setBorder(null);
        btnEstadoOrden.setBorderPainted(false);
        btnEstadoOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadoOrden.setFocusCycleRoot(true);
        btnEstadoOrden.setFocusPainted(false);
        jPanelPrincipal.add(btnEstadoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, 70));

        jPanelContainer.add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 500));

        lblImage.setText("imagen");
        jPanelContainer.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 410, 380));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Atencion");

        jMnServicios.setText("Servicios");
        jMnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnServiciosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnServicios);

        jMnCliente.setText("Cliente");
        jMnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMnCliente);

        jMnVehiculo.setText("Vehiculo");
        jMnVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnVehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(jMnVehiculo);

        jMenuBar1.add(jMenu1);

        jMnFactura.setText("Facturacion");

        jMnFacturas.setText("Facturas");
        jMnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnFacturasActionPerformed(evt);
            }
        });
        jMnFactura.add(jMnFacturas);

        jMenuBar1.add(jMnFactura);

        jMenu4.setText("Admin");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMnEmpleado.setText("Empleado");
        jMnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnEmpleadoActionPerformed(evt);
            }
        });
        jMenu4.add(jMnEmpleado);

        jMnCargo.setText("Cargo");
        jMnCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCargoActionPerformed(evt);
            }
        });
        jMenu4.add(jMnCargo);

        jMnProducto.setText("Producto");
        jMnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnProductoActionPerformed(evt);
            }
        });
        jMenu4.add(jMnProducto);

        jMnProveedor.setText("Proveedor");
        jMnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnProveedorActionPerformed(evt);
            }
        });
        jMenu4.add(jMnProveedor);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        clienteView.setVisible(true);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
        ordenView.setVisible(true);
    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed

    private void jMnCargoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CargoView cargoView = new CargoView();
        cargoView.setVisible(true);
    }

    private void jMnServiciosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ServicioView servicioView = new ServicioView();
        servicioView.setVisible(true);
    }

    private void jMnClienteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        clienteView.setVisible(true);
    }

    private void jMnVehiculoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        VehiculoView vehiculoView = new VehiculoView();
        vehiculoView.setVisible(true);
    }

    private void jMnFacturasActionPerformed(java.awt.event.ActionEvent evt) {                                            
        FacturaView facturaView = new FacturaView();
        facturaView.setVisible(true);
    }

    private void jMnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        EmpleadoView empleadoView = new EmpleadoView();
        empleadoView.setVisible(true);
    }

    private void jMnProductoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ProductoView productoView = new ProductoView();
        productoView.setVisible(true);
                
    }

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }

    private void jMnProveedorActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ProveedorView proveedorView = new ProveedorView();
        proveedorView.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadoOrden;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnCargo;
    private javax.swing.JMenuItem jMnCliente;
    private javax.swing.JMenuItem jMnEmpleado;
    private javax.swing.JMenu jMnFactura;
    private javax.swing.JMenuItem jMnFacturas;
    private javax.swing.JMenuItem jMnProducto;
    private javax.swing.JMenuItem jMnProveedor;
    private javax.swing.JMenuItem jMnServicios;
    private javax.swing.JMenuItem jMnVehiculo;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
