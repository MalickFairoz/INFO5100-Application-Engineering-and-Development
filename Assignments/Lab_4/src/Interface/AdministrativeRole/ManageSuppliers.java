/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdministrativeRole;

import Business.Product;
import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malick
 */
public class ManageSuppliers extends javax.swing.JPanel {

    
    JPanel userProcessControl;
    SupplierDirectory supplierDirectory;
    /**
     * Creates new form ManageSuppliers
     */
    public ManageSuppliers(JPanel userProcessControl, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessControl = userProcessControl;
        this.supplierDirectory = supplierDirectory;
        populateTable();
    }

    public void populateTable()
    {
        int rowCount = supplierTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) supplierTable.getModel();
        for (int i = rowCount - 1; i>0; i--)
        {
            model.removeRow(i);
            
        }  
        for (Supplier s : supplierDirectory.getSupplierDirectory())
        {
            Object row[] = new Object[1];
            row[0]=s;
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

        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddSupplier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 30));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 30));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 70, 30));

        btnAddSupplier.setText("Create");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });
        add(btnAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 70, 30));

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierTable);
        if (supplierTable.getColumnModel().getColumnCount() > 0) {
            supplierTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 350, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Suppliers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessControl.remove(this);
        CardLayout layout = (CardLayout) userProcessControl.getLayout();
        layout.previous(userProcessControl);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        AddSupplier as = new AddSupplier(userProcessControl, supplierDirectory);
        userProcessControl.add("AddSupplier", as);
        CardLayout layout = (CardLayout)userProcessControl.getLayout();
        layout.next(userProcessControl);
                

// TODO add your handling code here:
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRow = supplierTable.getSelectedRow(); 
           if (selectedRow < 0) {
                
               JOptionPane.showMessageDialog(null, "Please select a row from table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
           }
           else {
               Supplier s = (Supplier) supplierTable.getValueAt(selectedRow, 0);
               ViewSupplier vs = new ViewSupplier(userProcessControl, s);
               userProcessControl.add("ViewJPanel", vs);
               CardLayout layout = (CardLayout) userProcessControl.getLayout();
               layout.next(userProcessControl); 
           }
         // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int selectedRow = supplierTable.getSelectedRow();
            if (selectedRow >=0){
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the supplier details", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION){
                    Supplier supplier = (Supplier) supplierTable.getValueAt(selectedRow, 0);
                    supplierDirectory.removeSupplier(supplier);
                    populateTable();
                     
                }
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select a row from table to delete", "Warning", JOptionPane.WARNING_MESSAGE);
                
            }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable supplierTable;
    // End of variables declaration//GEN-END:variables
}
