/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierRole;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Malick
 */
public class SearchForProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchForProductJPanel
     */
    JPanel userProcessControl;
    Supplier supplier;
    public SearchForProductJPanel(JPanel userProcessControl, Supplier supplier) {
        initComponents();
        this.userProcessControl = userProcessControl;
        this.supplier = supplier;
        
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
        txtProductID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Search For Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 35, -1, -1));

        jLabel2.setText("Product ID ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 111, -1, -1));
        add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 144, 144, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 143, 87, -1));

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 217, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int productId = Integer.parseInt(txtProductID.getText());
        Product product =  supplier.getProductCatalog().searchProduct(productId);
        ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessControl, product);
        userProcessControl.add("ViewProductDetailJPanel", vpdjp);
        CardLayout layout = (CardLayout) userProcessControl.getLayout();
        layout.next(userProcessControl); 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       userProcessControl.remove(this);
        CardLayout layout = (CardLayout) userProcessControl.getLayout();
        layout.previous(userProcessControl);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtProductID;
    // End of variables declaration//GEN-END:variables
}
