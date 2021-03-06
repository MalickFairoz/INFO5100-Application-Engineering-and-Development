/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Malick
 */
public class AddUserAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddUserAccountsJPanel
     */
    private JPanel userProcessContainer;
    private Businesse businesse;
    public AddUserAccountsJPanel(JPanel userProcessContainer, Businesse businesse) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.businesse = businesse;
        populatePerson();
        populateRoles();
    }
    
    public void populatePerson()
    {
        ComboBoxPerson.removeAll();
        for (Person person : businesse.getEmployeeDirectory().getEmployeeList())
                {
    //                ComboBoxPerson.addItem(person);
               
                    
                }
    }
    
    public void populateRoles()
    {
        ComboBoxRole.removeAll();
        ComboBoxRole.addItem(UserAccount.EMPLOYEE_ROLE);
        
        
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
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRadioYesActive = new javax.swing.JRadioButton();
        btnRadioNoActive = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxPerson = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxRole = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnCreateUserAccounts = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Add New User Accounts");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        jLabel4.setText("Is Active ?");

        btnRadioYesActive.setSelected(true);
        btnRadioYesActive.setText("Yes");
        btnRadioYesActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioYesActiveActionPerformed(evt);
            }
        });

        btnRadioNoActive.setText("No");
        btnRadioNoActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioNoActiveActionPerformed(evt);
            }
        });

        jLabel5.setText("Person");

        jLabel6.setText("Role");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreateUserAccounts.setText("Create User Account");
        btnCreateUserAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserAccountsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRadioYesActive)
                                .addGap(18, 18, 18)
                                .addComponent(btnRadioNoActive))
                            .addComponent(ComboBoxPerson, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateUserAccounts)))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRadioYesActive)
                    .addComponent(btnRadioNoActive))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboBoxPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreateUserAccounts))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        
        Component[] componenetArray = userProcessContainer.getComponents();
        Component component = componenetArray[componenetArray.length - 1];
        ManageUserAccountsJPanel muajpanel = (ManageUserAccountsJPanel) component;
        muajpanel.refreshTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);







        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateUserAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserAccountsActionPerformed

        String userName = txtUserName.getText().trim();
        String password = txtPassword.getText().trim(); 
        
        if ((userName.equals("") || password.equals("")))
        {
            JOptionPane.showMessageDialog(this, "Invalid username/password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        
        UserAccount ua = businesse.getUserAccountDirectory().addUserAccount();
        ua.setUserName(userName);
        ua.setPassword(password);
        ua.setPerson ((Person) ComboBoxPerson.getSelectedItem());
        ua.setRole(String.valueOf(ComboBoxRole.getSelectedItem()));
        
        if(btnRadioYesActive.isSelected())
        {
            ua.setIsActive(true);
        }
        else
        {
            ua.setIsActive(false);
        }
        
        JOptionPane.showMessageDialog(this, "User Account created", "Info", JOptionPane.INFORMATION_MESSAGE);
            
        txtUserName.setText("");
        txtPassword.setText("");
        












        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateUserAccountsActionPerformed

    private void btnRadioNoActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioNoActiveActionPerformed
        
            if (btnRadioNoActive.isSelected())
            {
                btnRadioYesActive.setSelected(false);
            }




        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadioNoActiveActionPerformed

    private void btnRadioYesActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioYesActiveActionPerformed

        if (btnRadioYesActive.isSelected())
            {
                btnRadioNoActive.setSelected(false);
            }




        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadioYesActiveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxPerson;
    private javax.swing.JComboBox<String> ComboBoxRole;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUserAccounts;
    private javax.swing.JRadioButton btnRadioNoActive;
    private javax.swing.JRadioButton btnRadioYesActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
