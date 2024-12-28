package tallermecanico.view.components; 

import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import tallermecanico.controller.EmpleadoController;
import tallermecanico.entities.EmpleadoEntity;
import tallermecanico.entities.ServicioEntity;

public class ListarEmpleadosView extends javax.swing.JFrame {
 
    private final EmpleadoController empleadoController;
    
    public ListarEmpleadosView() {
        initComponents();
        empleadoController = new EmpleadoController();
        cargarTabla();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneServicio = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre y Apellido", "Cedula", "Cargo", "Habilidad"
            }
        ));
        scrollPaneServicio.setViewportView(tblEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void cargarTabla() {
        try {
            List<EmpleadoEntity> empleados = empleadoController.obtenerEmpleados();
            DefaultTableModel modeloTabla = (DefaultTableModel) tblEmpleados.getModel();
            modeloTabla.setRowCount(0);

            for (EmpleadoEntity e : empleados) {
                Object[] fila = {
                        e.getId(),
                        e.getNombre(),
                        e.getCedula(),
                        e.getCargo().getDescripcion(),
                        e.getHabilidades()
                };
                modeloTabla.addRow(fila);
            }
        } catch (RuntimeException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los servicios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPaneServicio;
    private javax.swing.JTable tblEmpleados;
    // End of variables declaration//GEN-END:variables
}
