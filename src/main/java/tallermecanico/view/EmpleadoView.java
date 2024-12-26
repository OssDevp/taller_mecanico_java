
package tallermecanico.view;

import javax.swing.*;

import tallermecanico.controller.EmpleadoController;
import tallermecanico.entities.EmpleadoEntity;
import tallermecanico.view.components.ImageSize;

public class EmpleadoView extends javax.swing.JFrame {

    EmpleadoController empleadoController;
    EmpleadoEntity empleadoEntity;

    public EmpleadoView() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        empleadoController = new EmpleadoController();
        setResizable(false);
        setLocationRelativeTo(null);
        ImageSize image = new ImageSize();
        image.setSize(lblImage, "src/main/resources/empleado.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtHabilidades = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 41, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setText("jLabel5");
        jPanel2.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 79, 260, 294));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 470));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cedula");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 130, -1));

        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, -1));

        jLabel3.setText("Cargo");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, -1));

        jLabel4.setText("Habilidades");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));
        jPanel3.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 190, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 190, -1));
        jPanel3.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 190, -1));
        jPanel3.add(txtHabilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 190, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Empleado");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 135, 50));

        btnGuardar.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 80, 30));

        btnBorrar.setBackground(new java.awt.Color(26, 41, 74));
        btnBorrar.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(204, 204, 204));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.setBorderPainted(false);
        btnBorrar.setFocusPainted(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 80, 30));

        btnNuevo.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 80, 30));

        btnListar.setBackground(new java.awt.Color(26, 41, 74));
        btnListar.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        btnListar.setForeground(new java.awt.Color(204, 204, 204));
        btnListar.setText("Listar Empleados");
        btnListar.setBorder(null);
        btnListar.setBorderPainted(false);
        btnListar.setFocusPainted(false);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel3.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 190, 30));

        rbActivo.setText("Activo");
        jPanel3.add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        rbInactivo.setText("Inactivo");
        jPanel3.add(rbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 190, 10));

        btnBuscar1.setBackground(new java.awt.Color(26, 41, 74));
        btnBuscar1.setFont(new java.awt.Font("DialogInput", 1, 15)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(204, 204, 204));
        btnBuscar1.setText("Buscar");
        btnBuscar1.setBorder(null);
        btnBuscar1.setBorderPainted(false);
        btnBuscar1.setFocusPainted(false);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 80, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 330, 470));

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

    //Nuevo empleado
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarCampos();
    }

    //Buscar empleado
    // FIXME: No se esta buscando por cedula
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cedula del empleado", "Buscar empleado", JOptionPane.QUESTION_MESSAGE);
        if (cedula.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la cedula del empleado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                empleadoEntity = empleadoController.obtenerEmpleado(cedula);
                txtIdEmpleado.setText(empleadoEntity.getCedula());
                txtNombre.setText(empleadoEntity.getNombre());
//                txtCargo.setText(empleadoEntity.());
                txtHabilidades.setText(empleadoEntity.getHabilidades());

                JOptionPane.showMessageDialog(null, "Empleado encontrado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Borrar empleado
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String cedula = JOptionPane.showInputDialog(null, "Ingrese su Cedula:", "Eliminar Cliente", JOptionPane.QUESTION_MESSAGE);

        if (cedula.isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo no debe estar vacio", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        } else {

            var confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el cliente?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmacion == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                empleadoController.eliminarEmpleado(cedula);
                JOptionPane.showMessageDialog(null, "Cliente Eliminado", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Guardar empleado
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String cedula = txtIdEmpleado.getText();
        String nombre = txtNombre.getText();
        String cargo = txtCargo.getText();
        String habilidades = txtHabilidades.getText();

        if (cedula.isBlank() || nombre.isBlank() || cargo.isBlank() || habilidades.isBlank()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                empleadoEntity = new EmpleadoEntity();
                empleadoEntity.setCedula(cedula);
                empleadoEntity.setNombre(nombre);
//                empleadoEntity.setCargo(cargo);
                empleadoEntity.setHabilidades(habilidades);

                empleadoController.registrarEmpleado(empleadoEntity);
                JOptionPane.showMessageDialog(null, "Empleado guardado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void limpiarCampos() {
        txtIdEmpleado.setText("");
        txtNombre.setText("");
        txtCargo.setText("");
        txtHabilidades.setText("");
        rbActivo.setSelected(false);
        rbInactivo.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtHabilidades;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
