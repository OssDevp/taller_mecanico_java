
package tallermecanico.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import tallermecanico.controller.ServicioController;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.entities.ServicioEntity;
import tallermecanico.view.components.ImageSize;
import tallermecanico.view.components.ListarServicios;

import java.math.BigDecimal;


public class ServicioView extends javax.swing.JFrame {

    private final ServicioController servicioController;
    private ServicioEntity servicioEntity;

    public ServicioView() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        servicioController = new ServicioController();
        setResizable(false);
        setLocationRelativeTo(null);

        ImageSize image = new ImageSize();
        image.setSize(lblImage, "src/main/resources/servicio.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdServicio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnListarServicios = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Servicios");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id servicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 44, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 94, -1, -1));

        jLabel3.setText("Descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 144, -1, -1));

        jLabel4.setText("Costo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 194, -1, -1));
        jPanel1.add(txtIdServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 66, 173, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 116, 173, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 166, 173, -1));
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 222, 173, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Servicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 6, 73, 35));

        btnGuardar.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, -1));

        btnBorrar.setBackground(new java.awt.Color(26, 41, 74));
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(204, 204, 204));
        btnBorrar.setText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 100, -1));

        btnNuevo.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 100, -1));

        btnListarServicios.setBackground(new java.awt.Color(26, 41, 74));
        btnListarServicios.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnListarServicios.setForeground(new java.awt.Color(204, 204, 204));
        btnListarServicios.setText("Listar");
        btnListarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 210, -1));

        btnEditar.setBackground(new java.awt.Color(26, 41, 74));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(204, 204, 204));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 100, -1));

        jPanel3.setBackground(new java.awt.Color(26, 41, 74));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setText("jLabel5");
        jPanel3.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        BigDecimal costoDecimal;
        String idServicio = txtIdServicio.getText();
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        String costo = txtCosto.getText();

        if (nombre.isBlank() || descripcion.isBlank() || costo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
             costoDecimal = new BigDecimal(costo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El costo debe ser un numero", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            servicioEntity = new ServicioEntity();
            servicioEntity.setNombre(nombre);
            servicioEntity.setDescripcion(descripcion);
            servicioEntity.setCosto(costoDecimal);

            servicioController.registrarServicio(servicioEntity);

            JOptionPane.showMessageDialog(null, "Dato Registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String id = JOptionPane.showInputDialog(null, "Ingrese su ID:", "Eliminar Servicio", JOptionPane.QUESTION_MESSAGE);

        if (id != null && id.isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo no debe estar vacio", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }

        if(id != null) {

            var confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el servicio?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmacion == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                servicioController.eliminarServicio(id);
                JOptionPane.showMessageDialog(null, "Servicio Eliminado", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnListarServiciosActionPerformed(java.awt.event.ActionEvent evt) {
        ListarServicios listarServicios = new ListarServicios();
        listarServicios.setVisible(true);
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtIdServicio.getText().isBlank() || txtNombre.getText().isBlank() || txtDescripcion.getText().isBlank() || txtCosto.getText().isBlank()) {
            String id = JOptionPane.showInputDialog(null, "Ingrese el ID:", "Buscar Servicio", JOptionPane.QUESTION_MESSAGE);

            if (id != null && id.isBlank()) {
                JOptionPane.showMessageDialog(null, "El campo no debe estar vacio", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }

            if(id != null && id.length() > 5) {
                try {
                    servicioEntity = servicioController.obtenerServicio(id);
                    txtIdServicio.setText(String.valueOf(servicioEntity.getId()));
                    txtNombre.setText(servicioEntity.getNombre());
                    txtDescripcion.setText(servicioEntity.getDescripcion());
                    txtCosto.setText(String.valueOf(servicioEntity.getCosto()));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
//           String nombre = txtNombre.getText();
//              String descripcion = txtDescripcion.getText();
//                BigDecimal costo = new BigDecimal(txtCosto.getText());
//                servicioEntity.setNombre(nombre);
        }

    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtIdServicio.setText("");
        txtDescripcion.setText("");
        txtCosto.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListarServicios;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdServicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
