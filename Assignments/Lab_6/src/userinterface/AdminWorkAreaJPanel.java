/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.*;
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
    private JPanel userProcessContainer;
    private Businesse businesse;
    
    
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Businesse businesse) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.businesse = businesse;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageEmployee = new javax.swing.JButton();
        btnManageUserAccounts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnManageUserAccounts.setText("Manage User Accounts");
        btnManageUserAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Admin Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageUserAccounts)
                    .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnManageEmployee)
                .addGap(18, 18, 18)
                .addComponent(btnManageUserAccounts)
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed


        ManageEmployeesJPanel mejpanel = new ManageEmployeesJPanel(userProcessContainer, businesse);
        userProcessContainer.add("mejpanel", mejpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);








        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountsActionPerformed



        ManageUserAccountsJPanel muajpanel = new ManageUserAccountsJPanel(userProcessContainer, businesse);
        userProcessContainer.add("muajpanel", muajpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);










        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageUserAccountsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageUserAccounts;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
