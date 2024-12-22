
package tallermecanico.view;

import tallermecanico.view.components.ImageSize;




public class MenuView extends javax.swing.JFrame {

    private ImageSize image = new ImageSize();
    private ClienteView clienteView = new ClienteView();
    
    public MenuView() {
        initComponents();
        setResizable(false);
        this.image.setSize(this.lblImage, "src/main/resources/tallermecanico.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanelContainer = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        lblTituloPrincipal = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarOrden = new javax.swing.JButton();
        btnEstadoOrden = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taller MOFA");

        jPanelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(26, 41, 74));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTituloPrincipal.setForeground(new java.awt.Color(161, 171, 188));
        lblTituloPrincipal.setText("Taller MOFA");
        jPanelPrincipal.add(lblTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, 40));

        btnRegistrarCliente.setBackground(new java.awt.Color(140, 161, 201));
        btnRegistrarCliente.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(23, 40, 61));
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setBorder(null);
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCliente.setFocusCycleRoot(true);
        btnRegistrarCliente.setFocusPainted(false);
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 170, 70));

        btnRegistrarOrden.setBackground(new java.awt.Color(140, 161, 201));
        btnRegistrarOrden.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnRegistrarOrden.setForeground(new java.awt.Color(23, 40, 61));
        btnRegistrarOrden.setText("Registrar Orden");
        btnRegistrarOrden.setBorder(null);
        btnRegistrarOrden.setBorderPainted(false);
        btnRegistrarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarOrden.setFocusCycleRoot(true);
        btnRegistrarOrden.setFocusPainted(false);
        jPanelPrincipal.add(btnRegistrarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 70));

        btnEstadoOrden.setBackground(new java.awt.Color(140, 161, 201));
        btnEstadoOrden.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnEstadoOrden.setForeground(new java.awt.Color(23, 40, 61));
        btnEstadoOrden.setText("Ver Estado Orden");
        btnEstadoOrden.setBorder(null);
        btnEstadoOrden.setBorderPainted(false);
        btnEstadoOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadoOrden.setFocusCycleRoot(true);
        btnEstadoOrden.setFocusPainted(false);
        jPanelPrincipal.add(btnEstadoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, 70));

        jPanelContainer.add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 500));

        lblImage.setText("imagen");
        jPanelContainer.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 410, 380));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("jMenu4");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        clienteView.setVisible(true);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadoOrden;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
