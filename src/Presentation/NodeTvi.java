/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentation;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author DELL
 */
public class NodeTvi extends javax.swing.JPanel {

    /**
     * Creates new form NodeTvi
     */
    public NodeTvi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPBarraOpciones = new javax.swing.JPanel();
        btnProgramming = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        JPContainer = new javax.swing.JPanel();

        JPFondo.setBackground(new java.awt.Color(204, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HorizonStream+ TV");

        javax.swing.GroupLayout JPFondoLayout = new javax.swing.GroupLayout(JPFondo);
        JPFondo.setLayout(JPFondoLayout);
        JPFondoLayout.setHorizontalGroup(
            JPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFondoLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(233, 233, 233))
        );
        JPFondoLayout.setVerticalGroup(
            JPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPFondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPBarraOpciones.setBackground(new java.awt.Color(102, 153, 255));
        JPBarraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProgramming.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnProgramming.setText("Programacion");
        btnProgramming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgrammingActionPerformed(evt);
            }
        });
        JPBarraOpciones.add(btnProgramming, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 60));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAdd.setText("Manage Programs");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        JPBarraOpciones.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 60));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        JPBarraOpciones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 140, 60));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDelete.setText("Delete Programs");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        JPBarraOpciones.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 60));

        JPContainer.setMinimumSize(new java.awt.Dimension(650, 450));

        javax.swing.GroupLayout JPContainerLayout = new javax.swing.GroupLayout(JPContainer);
        JPContainer.setLayout(JPContainerLayout);
        JPContainerLayout.setHorizontalGroup(
            JPContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );
        JPContainerLayout.setVerticalGroup(
            JPContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPBarraOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(JPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(JPContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPBarraOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProgrammingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgrammingActionPerformed
        showProgrammingPanel();
    }//GEN-LAST:event_btnProgrammingActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        showHomePanel();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed
    /**
     * Method to show the home panel. Método para mostrar el panel de inicio.
     */
    public void showHomePanel() {

        JPAdd show = new JPAdd();
        show.setSize(1500, 650);
        show.setLocation(0, 0);

        JPContainer.removeAll();
        JPContainer.add(show, new AbsoluteConstraints(0,
                0, -1, -1));
        JPContainer.revalidate();
        JPContainer.repaint();
    }

    /**
     * Method to show the programming panel. Método para mostrar el panel de
     * programación.
     */
    public void showProgrammingPanel() {

        Programming show = new Programming();
        show.setSize(1500, 650);
        show.setLocation(0, 0);

        JPContainer.removeAll();
        JPContainer.add(show, new AbsoluteConstraints(0,
                0, -1, -1));
        JPContainer.revalidate();
        JPContainer.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPBarraOpciones;
    private javax.swing.JPanel JPContainer;
    private javax.swing.JPanel JPFondo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnProgramming;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
