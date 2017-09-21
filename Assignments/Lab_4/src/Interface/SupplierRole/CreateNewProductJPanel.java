/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierRole;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.nashorn.internal.runtime.UserAccessorProperty;

/**
 *
 * @author Malick
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewProductJPanel
     */
    Supplier supplier;
    JPanel userProcessControl;
    
    public CreateNewProductJPanel(JPanel userProcessControl, Supplier supplier) {
        initComponents();
        this.supplier = supplier;
        this.userProcessControl = userProcessControl;
        
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
        txtProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 29, -1, -1));

        jLabel2.setText("Product Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });
        add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 92, 150, -1));

        jLabel3.setText("Product ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtProductId.setEnabled(false);
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });
        add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, -1));

        jLabel4.setText("Product Price");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, -1));

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        Product product = supplier.getProductCatalog().addProduct();
        product.setProductName(txtProductName.getText());
        product.setPrice(Integer.parseInt(txtProductPrice.getText()));

        JOptionPane.showMessageDialog(null,"Product Successfully Added","Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessControl.remove(this);
        CardLayout layout = (CardLayout) userProcessControl.getLayout();
        layout.previous(userProcessControl);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    // End of variables declaration//GEN-END:variables
}