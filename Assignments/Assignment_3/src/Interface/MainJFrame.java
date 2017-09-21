/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Catalog;
import Business.CatalogList;
import java.awt.CardLayout;



/**
 *
 * @author Malick
 */
public class MainJFrame extends javax.swing.JFrame {

    
     private CatalogList productCatalogList; 
    /**
     * Creates new form MainJFrame
     */
     public MainJFrame() {
        initComponents();
        this.productCatalogList = new CatalogList();
        Catalog computer = new Catalog();
        computer.setName("Computer");
        Catalog printer = new Catalog();
        printer.setName("Printer");
        Catalog hardware = new Catalog();
        hardware.setName("Hardware");
        Catalog software = new Catalog();
        software.setName("Software");
        productCatalogList.getMainCatalogList().add(computer);
        productCatalogList.getMainCatalogList().add(printer);
        productCatalogList.getMainCatalogList().add(hardware);
        productCatalogList.getMainCatalogList().add(software);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        MainJPanel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtATC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnVendor = new javax.swing.JButton();
        MainJPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MainJPanel1.setBackground(new java.awt.Color(255, 255, 255));
        MainJPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtATC.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtATC.setText("AT Corporation");
        jPanel1.add(txtATC, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 14, 260, 70));

        MainJPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 11, -1, -1));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(153, 0, 153));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 74, 68));

        MainJPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 100, 90));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVendor.setBackground(new java.awt.Color(153, 0, 153));
        btnVendor.setText("Enter");
        btnVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorActionPerformed(evt);
            }
        });
        jPanel3.add(btnVendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 79, 68));

        MainJPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 110, 90));

        jSplitPane1.setTopComponent(MainJPanel1);

        MainJPanel2.setBackground(new java.awt.Color(0, 102, 102));
        MainJPanel2.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(MainJPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
          System.exit(0);
        

// TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorActionPerformed
        CatalogJPanel panel = new CatalogJPanel(MainJPanel2, productCatalogList);
        MainJPanel2.add("CatalogJPanel", panel);
        CardLayout layout = (CardLayout) MainJPanel2.getLayout();
        layout.next(MainJPanel2);
        
       

        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendorActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainJPanel1;
    private javax.swing.JPanel MainJPanel2;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnVendor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel txtATC;
    // End of variables declaration//GEN-END:variables
}
