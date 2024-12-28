
package tallermecanico.view;

import javax.swing.*;

import tallermecanico.controller.ProductoController;
import tallermecanico.entities.ProductoEntity;
import tallermecanico.view.components.ImageSize;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductoView extends javax.swing.JFrame {

    private ImageSize image = new ImageSize();
    private ProductoController productoController = new ProductoController();
  
    public ProductoView() {
        initComponents();
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
        btnNuevo1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnIrProveedor = new javax.swing.JButton();
        txtIdProveedor1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnBorrar1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo1.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnNuevo1.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevo1.setText("Nuevo");
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, 30));

        jLabel8.setText("Id Proveedor");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        btnBuscar1.setBackground(new java.awt.Color(26, 41, 74));
        btnBuscar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(204, 204, 204));
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, 30));
        jPanel2.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, -1));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, -1));

        btnIrProveedor.setText("...");
        btnIrProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(btnIrProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 23, -1));
        jPanel2.add(txtIdProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, -1));

        jLabel9.setText("Id Producto");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 95, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Producto");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 70, 50));

        jLabel11.setText("Nombre");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 95, -1));

        jLabel12.setText("Descripcion");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 95, -1));

        btnGuardar1.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 110, 30));

        jLabel13.setText("Precio Unitario");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        btnBorrar1.setBackground(new java.awt.Color(26, 41, 74));
        btnBorrar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(204, 204, 204));
        btnBorrar1.setText("Eliminar");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 110, 30));

        jLabel14.setText("Stock");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 78, -1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 0, 383, 444));

        jPanel3.setBackground(new java.awt.Color(26, 41, 74));

        lblImage.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 444));

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

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnIrProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrProveedorActionPerformed
        ProveedorView proveedorView = new ProveedorView();
        proveedorView.setVisible(true);
    }//GEN-LAST:event_btnIrProveedorActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
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
    }

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.limpiarCampos();
    }

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        String id = JOptionPane.showInputDialog(null, "Ingrese su ID:", "Eliminar Producto", JOptionPane.QUESTION_MESSAGE);

        if (id != null && id.isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo no debe estar vacio", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }

        if(id != null) {
            var confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el producto?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmacion == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                productoController.eliminarProducto(id);
                JOptionPane.showMessageDialog(null, "Producto Eliminado", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
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
                txtIdProveedor1.setText(producto.getIdProveedor().toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void limpiarCampos() {
        txtIdProducto.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtIdProveedor1.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnIrProveedor;
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
