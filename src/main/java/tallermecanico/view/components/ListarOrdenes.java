/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tallermecanico.view.components;

import tallermecanico.controller.OrdenController;
import tallermecanico.entities.OrdenEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;

import java.util.List;

/**
 *
 * @author fabri
 */
public class ListarOrdenes extends javax.swing.JFrame {

    private final OrdenController ordenController;

    public ListarOrdenes() {
        initComponents();
        ordenController = new OrdenController();
        cargarTabla();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo la ventana de listado
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void cargarTabla() {
        try {
            List<OrdenEntity> ordenes = ordenController.obtenerOrdenes();
            DefaultTableModel modeloTabla = (DefaultTableModel) tblOrdenes.getModel();
            modeloTabla.setRowCount(0);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato para mostrar en la tabla

            for (OrdenEntity orden : ordenes) {
                Object[] fila = {
//                        orden.getId(),
//                        orden.getCostoTotal(),
//                        orden.getEstado(),
//                        orden.getFechaFinalizacion() != null ? orden.getFechaFinalizacion().format(formatter) : "", // Formatear fecha
//                        orden.getFechaIngreso() != null ? orden.getFechaIngreso().format(formatter) : "",       // Formatear fecha
//                        orden.getIdCliente(),
//                        orden.getIdEmpleado(),
//                        orden.getIdServicio(),
//                        orden.getIdVehiculo()
                };
                modeloTabla.addRow(fila);
            }
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las órdenes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar Órdenes");

        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID Orden", "Costo Total", "Estado", "Fecha Finalización", "Fecha Ingreso", "ID Cliente", "ID Empleado", "ID Servicio", "ID Vehículo"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrdenes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE) // Aumenté el tamaño a 900
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE) // Ajusta este valor según sea necesario
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrdenes;
    // End of variables declaration//GEN-END:variables
}
