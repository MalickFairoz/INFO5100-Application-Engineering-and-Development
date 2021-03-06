/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Catalog;
import Business.CatalogList;
import Business.Product;
import Business.ProductCatalog;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CatalogJPanel extends javax.swing.JPanel {

    private Product P;
    private JPanel MainJPanel2;
    private CatalogList mainCatalog;

    CatalogJPanel(JPanel MainJPanel2, CatalogList mainCatalog) {
        initComponents();
        this.mainCatalog = mainCatalog;
        this.MainJPanel2 = MainJPanel2;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CatalogJPanel = new javax.swing.JPanel();
        labCat = new javax.swing.JLabel();
        listCat = new javax.swing.JComboBox<>();
        btnSub = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtCatlist = new javax.swing.JTextField();

        CatalogJPanel.setBackground(new java.awt.Color(255, 204, 204));
        CatalogJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labCat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labCat.setText("Catalog List");
        CatalogJPanel.add(labCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 55, 127, 28));

        listCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Printer", "Hardware", "Software" }));
        listCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCatActionPerformed(evt);
            }
        });
        CatalogJPanel.add(listCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 150, 197, 32));

        btnSub.setText("Submit");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        CatalogJPanel.add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 110, 40));

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        CatalogJPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 100, 40));

        txtCatlist.setEnabled(false);
        CatalogJPanel.add(txtCatlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CatalogJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CatalogJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCatActionPerformed

        String txtComlist1 = (String) listCat.getSelectedItem();

        txtCatlist.setText(txtComlist1);

// TODO add your handling code here:
    }//GEN-LAST:event_listCatActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        if (txtCatlist.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a Category");
            return;
        }
        String txtComlist1 = (String) listCat.getSelectedItem();

        txtCatlist.setText(txtComlist1);
        for (Catalog c : mainCatalog.getMainCatalogList()) {
            if (c.getName().equals(txtComlist1)) {
                VendorJPanel panel = new VendorJPanel(MainJPanel2, c.getProductCatalog());
                MainJPanel2.add("VendorJPanel", panel);
                CardLayout layout = (CardLayout) MainJPanel2.getLayout();
                layout.next(MainJPanel2);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainJPanel2.remove(this);
        CardLayout layout = (CardLayout) MainJPanel2.getLayout();
        layout.previous(MainJPanel2);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CatalogJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel labCat;
    private javax.swing.JComboBox<String> listCat;
    private javax.swing.JTextField txtCatlist;
    // End of variables declaration//GEN-END:variables
}
