/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tallermecanico.view.components;

import tallermecanico.controller.CargoController;
import tallermecanico.entities.CargoEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author fabri
 */
public class ListarCargos extends javax.swing.JFrame {

    private final CargoController cargoController;
    public ListarCargos() {
        initComponents();
        cargoController = new CargoController();
        cargarTabla();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void cargarTabla() {
        try {
            List<CargoEntity> cargos = cargoController.obtenerTodos();
            DefaultTableModel modeloTabla = (DefaultTableModel) tblCargos.getModel();
            modeloTabla.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

            for (CargoEntity cargo : cargos) {
                Object[] fila = {
                        cargo.getId(),
                        cargo.getDescripcion(),
                        cargo.getSueldo()
                };
                modeloTabla.addRow(fila);
            }
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los cargos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Imprime la traza de la excepción para depuración
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCargos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Cargos");

        tblCargos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID Cargo", "Descripción", "Sueldo"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCargos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCargos;
    // End of variables declaration//GEN-END:variables
}
