package tallermecanico.view;


import tallermecanico.controller.ProductoController;
import tallermecanico.entities.ProductoEntity;
import tallermecanico.view.components.ImageSize;
import tallermecanico.view.components.ListarProductos;

import javax.swing.*;
import java.math.BigDecimal;

public class ProductoView extends javax.swing.JFrame {

    private final ProductoController productoController;
    private ImageSize image = new ImageSize();

    public ProductoView() {
        initComponents();
        configurarModeloJSpinner();
        productoController = new ProductoController();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.image.setSize(lblImage, "src/main/resources/producto.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdProveedor1 = new javax.swing.JTextField();
        btnIrProveedor = new javax.swing.JButton();
        btnIrStock = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 41, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setText("jLabel1");
        jPanel2.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 290));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Producto");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 70, 50));
        jPanel3.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, -1));

        jLabel9.setText("Id Producto");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 95, -1));

        jLabel8.setText("Id Proveedor");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));
        jPanel3.add(txtIdProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, -1));

        btnIrProveedor.setBackground(new java.awt.Color(26, 41, 74));
        btnIrProveedor.setForeground(new java.awt.Color(204, 204, 204));
        btnIrProveedor.setText("...");
        btnIrProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnIrProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 23, -1));

        btnIrStock.setBackground(new java.awt.Color(26, 41, 74));
        btnIrStock.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnIrStock.setForeground(new java.awt.Color(204, 204, 204));
        btnIrStock.setText("Listar Productos");
        btnIrStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrStockActionPerformed(evt);
            }
        });
        jPanel3.add(btnIrStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 260, 30));
        jPanel3.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, -1));
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, -1));
        jPanel3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, -1));

        btnBuscar1.setBackground(new java.awt.Color(26, 41, 74));
        btnBuscar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(204, 204, 204));
        btnBuscar1.setText("Buscar");
        jPanel3.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 110, 30));

        btnNuevo1.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnNuevo1.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevo1.setText("Nuevo");
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 30));

        btnBorrar1.setBackground(new java.awt.Color(26, 41, 74));
        btnBorrar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(204, 204, 204));
        btnBorrar1.setText("Eliminar");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 110, 30));

        btnGuardar1.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 110, 30));

        jLabel11.setText("Nombre");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 95, -1));

        jLabel14.setText("Stock");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 78, -1));

        jLabel13.setText("Precio Unitario");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel12.setText("Descripcion");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 95, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 380, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 684, 452));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        ProveedorView proveedorView = new ProveedorView();
        proveedorView.setVisible(true);
    }

    private void btnIrStockActionPerformed(java.awt.event.ActionEvent evt) {
        ListarProductos productos = new ListarProductos();
        productos.setVisible(true);
    }

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarCampos();
    }

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        String id = JOptionPane.showInputDialog(null, "Ingrese su ID:", "Buscar Producto", JOptionPane.QUESTION_MESSAGE);

        if (id != null && id.isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo no debe estar vacio", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }

        if(id != null) {
            try {
                ProductoEntity producto = productoController.obtenerProducto(id);
                txtIdProducto.setText(producto.getId().toString());
                txtNombre.setText(producto.getNombre());
                txtDescripcion.setText(producto.getDescripcion());
                txtPrecio.setText(producto.getPrecioUnitario().toString());
                txtIdProveedor1.setText(producto.getProveedor().getId().toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        String idProducto = txtIdProducto.getText();
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        String precio = txtPrecio.getText();
        BigDecimal precioDecimal;
        String idProveedor = txtIdProveedor1.getText();

        if (nombre.isEmpty() || descripcion.isEmpty() || precio.isEmpty() || idProveedor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            if (precio != null) {
                precioDecimal = new BigDecimal(precio);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El costo debe ser un numero", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            precioDecimal = new BigDecimal(precio);
            ProductoEntity producto = new ProductoEntity();
            producto.setNombre(nombre);
            producto.setDescripcion(descripcion);
            producto.setPrecioUnitario(precioDecimal);
            //producto.setIdProveedor(idProveedor);
            productoController.registrarProducto(producto);

            JOptionPane.showMessageDialog(null, "Dato Registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void limpiarCampos() {
        txtIdProducto.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtIdProveedor1.setText("");
    }

    private void configurarModeloJSpinner() {
        SpinnerNumberModel modelo = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        jSpinner1.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnIrProveedor;
    private javax.swing.JButton btnIrStock;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdProveedor1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
