/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SupplierRole;

import Business.Product;
import Business.Supplier;
import Business.SupplierDirectory;
import Interface.AdministrativeRole.ViewSupplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malick
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {

     JPanel userProcessControl;
    SupplierDirectory supplierDirectory;
    Supplier supplier;
    /**
     * Creates new form ManageProductCatalogJPanel
     */
    public ManageProductCatalogJPanel(JPanel userProcessControl, Supplier supplier) {
        initComponents();
         this.userProcessControl = userProcessControl;
        this.supplier = supplier;
        txtSupplierName.setText(supplier.getSupplierName());
        refreshTable();
        
    }
 private void refreshTable() {
         int rowCount = tableManageProdCat.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tableManageProdCat.getModel();
        for (int i = rowCount - 1; i>0; i--)
        {
            model.removeRow(i);
            
        }  
        for (Product p : supplier.getProductCatalog().getProductCatalog())
        { 
            Object row[] = new Object[3];
            row[0]=p;
            row[1]=p.getModelNumber();
            row[2]=p.getPrice();
            model.addRow(row);
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
        txtSupplierName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableManageProdCat = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Supplier");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtSupplierName.setText(" ");
        txtSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierNameActionPerformed(evt);
            }
        });
        add(txtSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, -1));

        tableManageProdCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableManageProdCat);
        if (tableManageProdCat.getColumnModel().getColumnCount() > 0) {
            tableManageProdCat.getColumnModel().getColumn(0).setResizable(false);
            tableManageProdCat.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 300, 110));

        btnSearch.setText("Search >>");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        btnBack.setText("< Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 53, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
               SearchForProductJPanel sfpjp = new SearchForProductJPanel(userProcessControl, supplier);
               userProcessControl.add("SearchForProductJPanel", sfpjp);
               CardLayout layout = (CardLayout) userProcessControl.getLayout();
               layout.next(userProcessControl); 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRow = tableManageProdCat.getSelectedRow(); 
           if (selectedRow < 0) {
                
               JOptionPane.showMessageDialog(null, "Please select a row from table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
           }
           else {
               Product p = (Product) tableManageProdCat.getValueAt(selectedRow, 0);
               ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessControl, p);
               userProcessControl.add("ViewProductDetailJPanel", vpdjp);
               CardLayout layout = (CardLayout) userProcessControl.getLayout();
               layout.next(userProcessControl); 
           }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
               CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(userProcessControl, supplier);
               userProcessControl.add("CreateNewProductJPanel", cnpjp);
               CardLayout layout = (CardLayout) userProcessControl.getLayout();
               layout.next(userProcessControl); 
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tableManageProdCat.getSelectedRow();
            if (selectedRow <0){
    JOptionPane.showMessageDialog(null, "Please select a row from table to delete", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                 Product product = (Product) tableManageProdCat.getValueAt(selectedRow, 0);
                    supplier.getProductCatalog().removeProduct(product);
                    refreshTable();
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessControl.remove(this);
        CardLayout layout = (CardLayout) userProcessControl.getLayout();
        layout.previous(userProcessControl);
    }//GEN-LAST:event_btnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
           refreshTable();
    
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableManageProdCat;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables

   
}