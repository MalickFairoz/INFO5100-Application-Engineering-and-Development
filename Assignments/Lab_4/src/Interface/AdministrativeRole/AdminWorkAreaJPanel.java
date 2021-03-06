/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdministrativeRole;

import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Malick
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

   
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    JPanel userProcessControl;
    SupplierDirectory supplierDirectory;
    
            
    public AdminWorkAreaJPanel(JPanel userProcessControl, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessControl = userProcessControl;
        this.supplierDirectory = supplierDirectory;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnManageSupplier = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("My Work Area - Administrative Role");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 40, -1, -1));

        btnManageSupplier.setText("Manage Suppliers >>>");
        btnManageSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSupplierActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 109, 270, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSupplierActionPerformed
        ManageSuppliers panel = new ManageSuppliers(userProcessControl, supplierDirectory);
        userProcessControl.add("ManageSuppliers", panel);
        CardLayout layout = (CardLayout)userProcessControl.getLayout();
        layout.next(userProcessControl);
        




// TODO add your handling code here:
    }//GEN-LAST:event_btnManageSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
