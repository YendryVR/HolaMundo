package Presentation;

import Archive.CircularDoubly;
import Archive.ImageFile;
import Archive.Node;

import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author samir
 */
public class Carousel extends javax.swing.JFrame {

    public int currentIndex1 = 0;
    public int currentIndex2 = 1;
    public int currentIndex3 = 2;
    public final CircularDoubly imagePaths;

    /**
     * Creates new form Carrusel
     */
    public Carousel() {
        initComponents();
        imagePaths = new CircularDoubly();
        loadImages();
        if (!imagePaths.isEmpty()) {
            loadImage(jLabel1, currentIndex1);
            loadImage(jLabel2, currentIndex2);
            loadImage(jLabel3, currentIndex3);
            this.setLocationRelativeTo(null);
        }
    }

    private void loadImages() {
        ImageFile file = new ImageFile("src/Images", "Imagenes.txt");  //
        file.create();
        List<String> paths = file.getImagePaths();
        for (String path : paths) {
            imagePaths.addEnd(path);
        }

        if (imagePaths.getSize() == 0) {
            System.err.println("No images found in the file.");
        } else {
            System.out.println("Loaded " + imagePaths.getSize() + " images.");
        }
    }


    private void loadImage(javax.swing.JLabel label, int index) {
        Node node = imagePaths.getByPosition(index);
        if (node != null) {
            String path = (String) node.element;
            File file = new File(path);
            if (file.exists()) {
                ImageIcon icon = new ImageIcon(path);
                label.setIcon(icon);
            } else {
                System.err.println("File not found: " + path);
            }
        }
    }

    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Izquierda = new javax.swing.JButton();
        Derecha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Izquierda.setBackground(new java.awt.Color(0, 0, 0));
        Izquierda.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Izquierda.setForeground(new java.awt.Color(255, 255, 255));
        Izquierda.setText("◄");
        Izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzquierdaActionPerformed(evt);
            }
        });

        Derecha.setBackground(new java.awt.Color(0, 0, 0));
        Derecha.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Derecha.setForeground(new java.awt.Color(255, 255, 255));
        Derecha.setText("►");
        Derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Izquierda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Derecha))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Derecha, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzquierdaActionPerformed
        currentIndex1 = (currentIndex1 + 1) % imagePaths.getSize();
        loadImage(jLabel1, currentIndex1);
        currentIndex2 = (currentIndex2 + 1) % imagePaths.getSize();
        loadImage(jLabel2, currentIndex2);
        currentIndex3 = (currentIndex3 + 1) % imagePaths.getSize();
        loadImage(jLabel3, currentIndex3);

    }//GEN-LAST:event_IzquierdaActionPerformed

    private void DerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerechaActionPerformed
        currentIndex1 = (currentIndex1 - 1 + imagePaths.getSize()) % imagePaths.getSize();
        loadImage(jLabel1, currentIndex1);
        currentIndex2 = (currentIndex2 - 1 + imagePaths.getSize()) % imagePaths.getSize();
        loadImage(jLabel2, currentIndex2);
        currentIndex3 = (currentIndex3 - 1 + imagePaths.getSize()) % imagePaths.getSize();
        loadImage(jLabel3, currentIndex3);
    }//GEN-LAST:event_DerechaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carousel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carousel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carousel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carousel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carousel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Derecha;
    private javax.swing.JButton Izquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
