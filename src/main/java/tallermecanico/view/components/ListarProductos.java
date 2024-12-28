
package tallermecanico.view.components;

import tallermecanico.controller.EmpleadoController;
import tallermecanico.controller.ProductoController;
import tallermecanico.entities.EmpleadoEntity;
import tallermecanico.entities.ProductoEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListarProductos extends javax.swing.JFrame {

    private final ProductoController productoController;

    public ListarProductos() {
        initComponents();
        productoController = new ProductoController();
        cargarTabla();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio Unitario", "Stock", "Proveedor"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla() {
        try {
            List<ProductoEntity> productos = productoController.obtenerProductos();
            DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
            modeloTabla.setRowCount(0);

            for (ProductoEntity p : productos) {
                Object[] fila = {
                        p.getId(),
                        p.getNombre(),
                        p.getDescripcion(),
                        p.getPrecioUnitario(),
                        p.getStock(),
                        p.getProveedor().getNombre()
                };
                modeloTabla.addRow(fila);
            }
        } catch (RuntimeException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los servicios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
