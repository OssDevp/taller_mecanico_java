package tallermecanico.view.components;

import tallermecanico.controller.ServicioController;
import tallermecanico.entities.ServicioEntity;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListarServicios extends javax.swing.JFrame {

    private final ServicioController servicioController;

    public ListarServicios() {
        initComponents();
        servicioController = new ServicioController();
        cargarTabla();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void cargarTabla() {
        try {
            List<ServicioEntity> servicios = servicioController.obtenerServicios();
            DefaultTableModel modeloTabla = (DefaultTableModel) tblServicios.getModel();
            modeloTabla.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

            for (ServicioEntity servicio : servicios) {
                Object[] fila = {
                        servicio.getId(),
                        servicio.getNombre(),
                        servicio.getDescripcion(),
                        servicio.getCosto()
                };
                modeloTabla.addRow(fila);
            }
        } catch (RuntimeException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los servicios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Imprime la traza de la excepción para depuración
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
        setTitle("Lista de Servicios");

        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Nombre", "Descripción", "Costo"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicios);

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
        setLocationRelativeTo(null); // Centrar la ventana
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblServicios;
    // End of variables declaration//GEN-END:variables
}
