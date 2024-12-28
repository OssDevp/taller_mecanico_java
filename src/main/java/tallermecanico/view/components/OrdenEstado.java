
package tallermecanico.view.components;


import tallermecanico.controller.OrdenController;
import tallermecanico.entities.EmpleadoEntity;
import tallermecanico.entities.OrdenEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class OrdenEstado extends javax.swing.JFrame {

    private final OrdenController orden = new OrdenController();
    private final DefaultTableModel modeloTabla;
    private static List<OrdenEntity> ordenes;

    public OrdenEstado() {
        initComponents();
        modeloTabla = (DefaultTableModel) tblOrden.getModel();
        cargarTablaInicial();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrden = new javax.swing.JTable();
        btnPendiente = new javax.swing.JButton();
        btnFinalizado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estado Orden");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Orden", "Cliente", "Vehiculo", "Servicio", "Estado", "Costo Total"
            }
        ));
        jScrollPane1.setViewportView(tblOrden);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 834, 469));

        btnPendiente.setBackground(new java.awt.Color(70, 143, 216));
        btnPendiente.setForeground(new java.awt.Color(14, 14, 49));
        btnPendiente.setText("Pendiente");
        btnPendiente.setBorder(null);
        btnPendiente.setBorderPainted(false);
        btnPendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 140, 40));

        btnFinalizado.setBackground(new java.awt.Color(70, 143, 216));
        btnFinalizado.setForeground(new java.awt.Color(14, 14, 49));
        btnFinalizado.setText("Finalizado");
        btnFinalizado.setBorder(null);
        btnFinalizado.setBorderPainted(false);
        btnFinalizado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPendienteActionPerformed(java.awt.event.ActionEvent evt) {
        modeloTabla.setRowCount(0);
        ordenes.stream()
                .filter(o -> o.getEstado().equals("pendiente"))
                .forEach(o -> {
                    Object[] fila = {
                        o.getId(),
                        o.getCliente().getCedula() + " - " + o.getCliente().getNombre(),
                        o.getVehiculo().getMarca(),
                        o.getServicio().getNombre(),
                        o.getEstado(),
                        o.getCostoTotal()
                    };
                    modeloTabla.addRow(fila);
                });
    }

    private void btnFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {
        modeloTabla.setRowCount(0);
        ordenes.stream()
                .filter(o -> o.getEstado().equals("finalizado"))
                .forEach(o -> {
                    Object[] fila = {
                            o.getId(),
                            o.getCliente().getCedula() + " - " + o.getCliente().getNombre(),
                            o.getVehiculo().getMarca(),
                            o.getServicio().getNombre(),
                            o.getEstado(),
                            o.getCostoTotal()
                    };
                    modeloTabla.addRow(fila);
                });
    }

    private void cargarTablaInicial() {
        try {
            ordenes = orden.obtenerOrdenes();
            modeloTabla.setRowCount(0);

            for (OrdenEntity o : ordenes) {
                Object[] fila = {
                        o.getId(),
                        o.getCliente().getCedula() + " - " + o.getCliente().getNombre(),
                        o.getVehiculo().getMarca(),
                        o.getServicio().getNombre(),
                        o.getEstado(),
                        o.getCostoTotal()
                };
                modeloTabla.addRow(fila);
            }
        } catch (RuntimeException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los servicios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizado;
    private javax.swing.JButton btnPendiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrden;
    // End of variables declaration//GEN-END:variables
}
