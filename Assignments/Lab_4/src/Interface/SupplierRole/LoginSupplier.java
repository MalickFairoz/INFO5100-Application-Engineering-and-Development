/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierRole;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Malick
 */
public class LoginSupplier extends javax.swing.JPanel {
    
     JPanel userProcessControl;
    SupplierDirectory supplierDirectory;
    /**
     * Creates new form LoginSupplier
     */
    public LoginSupplier(JPanel userProcessControl, SupplierDirectory supplierDirectory) {
        initComponents();
             this.userProcessControl = userProcessControl;
        this.supplierDirectory = supplierDirectory;
        
        supplierComboBox.removeAllItems();
        for(Supplier supplier:supplierDirectory.getSupplierDirectory())
        {
            supplierComboBox.addItem(supplier);
              
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supplierComboBox = new javax.swing.JComboBox();
        btnGo = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Supplier Login ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 39, -1, -1));

        jLabel2.setText("Supplier Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        supplierComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(supplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 125, 100, 40));

        btnGo.setText("GO >>");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        Supplier supplier = (Supplier) supplierComboBox.getSelectedItem();
        SupplierWorkAreaJPanel swajp =  new SupplierWorkAreaJPanel(userProcessControl, supplier);
        userProcessControl.add("SupplierWorkAreaJPanel", swajp);
        CardLayout layout = (CardLayout)userProcessControl.getLayout();
        layout.next(userProcessControl);
    }//GEN-LAST:event_btnGoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables
}