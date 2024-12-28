
package tallermecanico.view;

import javax.swing.*;

import tallermecanico.controller.*;
import tallermecanico.entities.*;
import tallermecanico.view.components.ImageSize;
import tallermecanico.view.components.ListarOrdenes;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class OrdenView extends javax.swing.JFrame {

    private final ClienteController clienteController;
    private final VehiculoController vehiculoController;
    private final EmpleadoController empleadoController;
    private final OrdenController ordenController;
    private final ServicioController servicioController;
    private BigDecimal costoDecimal;
    private ImageSize image = new ImageSize();
    
    public OrdenView() {
        initComponents();
        setTitle("Registrar Orden");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        clienteController = new ClienteController();
        vehiculoController = new VehiculoController();
        empleadoController = new EmpleadoController();
        ordenController = new OrdenController();
        servicioController = new ServicioController();
        cargarServiciosCombo();
        setResizable(false);
        setLocationRelativeTo(null);
        addPlaceholder(txtFechaIngreso, "aaaa/mm/dd");
        addPlaceholder(txtFechaFinal, "aaaa/mm/dd");
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
        txtCostoTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnIrCliente = new javax.swing.JButton();
        btnIrVehiculo = new javax.swing.JButton();
        btnIrEmpleado = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnListar = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        comboBoxServicio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 41, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setText("jLabel11");
        jPanel2.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 363));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 303, 450));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Fecha de Ingreso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setText("Fecha de Finalizacion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel4.setText("Cedula Cliente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setText("Placa Vehiculo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel6.setText("Cedula Empleado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel7.setText("Servicio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel9.setText("Costo Total:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));
        jPanel1.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, -1));
        jPanel1.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 170, -1));
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, -1));
        jPanel1.add(txtidVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 130, -1));
        jPanel1.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, -1));
        jPanel1.add(txtCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 171, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Orden");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 360, 67));

        btnGuardar.setBackground(new java.awt.Color(26, 41, 74));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 80, 30));

        btnNuevo.setBackground(new java.awt.Color(26, 41, 74));
        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 80, 30));

        btnBorrar.setBackground(new java.awt.Color(26, 41, 74));
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(204, 204, 204));
        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("");
        btnBorrar.setBorder(null);
        btnBorrar.setBorderPainted(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setFocusPainted(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 80, 30));

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
        jPanel1.add(btnIrCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 25, 20));

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
        jPanel1.add(btnIrVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 25, 20));

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
        jPanel1.add(btnIrEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 25, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Finalizado" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, -1));

        btnListar.setBackground(new java.awt.Color(26, 41, 74));
        btnListar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnListar.setForeground(new java.awt.Color(204, 204, 204));
        btnListar.setText("Listar");
        btnListar.setToolTipText("");
        btnListar.setBorder(null);
        btnListar.setBorderPainted(false);
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.setFocusPainted(false);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 350, 30));

        btnEditar1.setBackground(new java.awt.Color(26, 41, 74));
        btnEditar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEditar1.setForeground(new java.awt.Color(204, 204, 204));
        btnEditar1.setText("Editar");
        btnEditar1.setToolTipText("");
        btnEditar1.setBorder(null);
        btnEditar1.setBorderPainted(false);
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.setFocusPainted(false);
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 80, 30));

        jPanel1.add(comboBoxServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 170, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 440, 450));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           

        String fechaIngreso = txtFechaIngreso.getText();
        String fechaFinal = txtFechaFinal.getText();
        String cliente = txtIdCliente.getText();
        String vehiculo = txtidVehiculo.getText();
        String empleado = txtIdEmpleado.getText();
        String costoTotal = txtCostoTotal.getText();
        String servicio = comboBoxServicio.getSelectedItem().toString();
        String estado = jComboBox2.getSelectedItem().toString().toLowerCase();

        if (fechaIngreso.isEmpty() || fechaFinal.isEmpty() || cliente.isEmpty() || vehiculo.isEmpty() || empleado.isEmpty() || servicio.isEmpty() || costoTotal.isEmpty() || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            BigDecimal costoDecimal = new BigDecimal(txtCostoTotal.getText());
            OrdenEntity orden = new OrdenEntity();
            OrdenController ordenController = new OrdenController();
            ClienteEntity clienteEntity = clienteController.obtenerCliente(cliente);
            VehiculoEntity vehiculoEntity = vehiculoController.obtenerVehiculo(vehiculo);
            EmpleadoEntity empleadoEntity = empleadoController.obtenerEmpleado(empleado);
            ServicioEntity servicioEntity = servicioController.obtenerServicioPorNombre(servicio);
            orden.setFechaIngreso(LocalDate.parse(fechaIngreso));
            orden.setFechaFinalizacion(LocalDate.parse(fechaFinal));
            orden.setCliente(clienteEntity);
            orden.setVehiculo(vehiculoEntity);
            orden.setEmpleado(empleadoEntity);
            orden.setServicio(servicioEntity);
            orden.setCostoTotal(costoDecimal);
            orden.setEstado(estado);

            ordenController.registrarOrden(orden);
            JOptionPane.showMessageDialog(null, "Orden registrada correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.limpiarCampos();
    }
    
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
        ListarOrdenes listarOrdenes = new ListarOrdenes();
        listarOrdenes.setVisible(true);
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String id = JOptionPane.showInputDialog(null, "Ingrese el id:", "Eliminar Orden", JOptionPane.QUESTION_MESSAGE);

        if (id != null && id.isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo no debe estar vacio", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }

        if(id != null) {

            var confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar la orden?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmacion == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                ordenController.eliminarOrden(id);
                JOptionPane.showMessageDialog(null, "Orden Eliminada", "Eliminacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnIrClienteActionPerformed(java.awt.event.ActionEvent evt) {
        ClienteView cliente = new ClienteView();
        cliente.setVisible(true);
    }

    private void btnIrVehiculoActionPerformed(java.awt.event.ActionEvent evt) {
        VehiculoView vehiculoView = new VehiculoView();
        vehiculoView.setVisible(true);
    }

    private void btnIrEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
        EmpleadoView empleadoView = new EmpleadoView();
        empleadoView.setVisible(true);
    }

    private void cargarServiciosCombo() {
        ServicioController servicioController = new ServicioController();
        List<ServicioEntity> servicios = servicioController.obtenerServicios();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (ServicioEntity servicio: servicios) {
            model.addElement(servicio.getNombre());
        }

        comboBoxServicio.setModel(model);

    }

    private void limpiarCampos() {
        txtFechaIngreso.setText("");
        txtFechaFinal.setText("");
        txtIdCliente.setText("");
        txtidVehiculo.setText("");
        txtIdEmpleado.setText("");
        comboBoxServicio.setSelectedIndex(0);
        txtCostoTotal.setText("");
    }

    private void addPlaceholder(JTextField textField, String placeholder) {
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIrCliente;
    private javax.swing.JButton btnIrEmpleado;
    private javax.swing.JButton btnIrVehiculo;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> comboBoxServicio;
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
    private javax.swing.JTextField txtidVehiculo;
    // End of variables declaration//GEN-END:variables
}
