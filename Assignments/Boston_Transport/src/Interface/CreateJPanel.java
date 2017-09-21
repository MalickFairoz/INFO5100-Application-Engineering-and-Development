/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Transport.Data;
import javax.swing.JOptionPane;
/**
 *
 * @author Malick
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Data data;
    
    
    public CreateJPanel(Data data) {
        initComponents();
        this.data=data;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadingJC = new javax.swing.JLabel();
        FirNamLab = new javax.swing.JLabel();
        LasNamLab = new javax.swing.JLabel();
        DOBLab = new javax.swing.JLabel();
        SexLab = new javax.swing.JLabel();
        FroStaLab = new javax.swing.JLabel();
        ToStaLab = new javax.swing.JLabel();
        FirNamTex = new javax.swing.JTextField();
        LasNamTex = new javax.swing.JTextField();
        DOBTex = new javax.swing.JTextField();
        SexTex = new javax.swing.JTextField();
        ToStaTex = new javax.swing.JTextField();
        FroStaTex = new javax.swing.JTextField();
        GenTicBtn = new javax.swing.JButton();
        PayRadBtn = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(153, 0, 153));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        HeadingJC.setBackground(new java.awt.Color(0, 255, 153));
        HeadingJC.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        HeadingJC.setForeground(new java.awt.Color(102, 255, 102));
        HeadingJC.setText("Enter your Details");

        FirNamLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FirNamLab.setForeground(new java.awt.Color(255, 255, 0));
        FirNamLab.setText("First Name");

        LasNamLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LasNamLab.setForeground(new java.awt.Color(255, 255, 0));
        LasNamLab.setText("Last Name");

        DOBLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DOBLab.setForeground(new java.awt.Color(255, 255, 0));
        DOBLab.setText("DOB");

        SexLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SexLab.setForeground(new java.awt.Color(255, 255, 0));
        SexLab.setText("Sex");

        FroStaLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FroStaLab.setForeground(new java.awt.Color(255, 255, 0));
        FroStaLab.setText("From Station");

        ToStaLab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ToStaLab.setForeground(new java.awt.Color(255, 255, 0));
        ToStaLab.setText("To Station");

        FirNamTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirNamTexActionPerformed(evt);
            }
        });

        SexTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexTexActionPerformed(evt);
            }
        });

        GenTicBtn.setText("Generate Ticket");
        GenTicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenTicBtnActionPerformed(evt);
            }
        });

        PayRadBtn.setText("Ticket Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(HeadingJC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LasNamLab)
                            .addComponent(FroStaLab)
                            .addComponent(FirNamLab)
                            .addComponent(DOBLab)
                            .addComponent(SexLab)
                            .addComponent(ToStaLab))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PayRadBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SexTex)
                                .addComponent(LasNamTex)
                                .addComponent(FirNamTex)
                                .addComponent(DOBTex)
                                .addComponent(ToStaTex, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(FroStaTex, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GenTicBtn)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(HeadingJC)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirNamLab)
                    .addComponent(FirNamTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LasNamLab)
                    .addComponent(LasNamTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOBLab)
                    .addComponent(DOBTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexLab)
                    .addComponent(SexTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FroStaLab)
                            .addComponent(FroStaTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ToStaLab))
                    .addComponent(ToStaTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenTicBtn)
                    .addComponent(PayRadBtn))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FirNamTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirNamTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirNamTexActionPerformed

    private void GenTicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenTicBtnActionPerformed
        // binding the user input to the data object
        data.setFirstName(FirNamTex.getText());
        data.setLastName(LasNamTex.getText());
        data.setDOB(DOBTex.getText());
        data.setSex(SexTex.getText());
        data.setFromStation(FroStaTex.getText());
        data.setToStation(ToStaTex.getText());
        
        
        //Prompt user that data is successfully created 
        
        JOptionPane.showMessageDialog(null,"Pasensenger Details Updated Successfully");
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_GenTicBtnActionPerformed

    private void SexTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexTexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBLab;
    private javax.swing.JTextField DOBTex;
    private javax.swing.JLabel FirNamLab;
    private javax.swing.JTextField FirNamTex;
    private javax.swing.JLabel FroStaLab;
    private javax.swing.JTextField FroStaTex;
    private javax.swing.JButton GenTicBtn;
    private javax.swing.JLabel HeadingJC;
    private javax.swing.JLabel LasNamLab;
    private javax.swing.JTextField LasNamTex;
    private javax.swing.JRadioButton PayRadBtn;
    private javax.swing.JLabel SexLab;
    private javax.swing.JTextField SexTex;
    private javax.swing.JLabel ToStaLab;
    private javax.swing.JTextField ToStaTex;
    // End of variables declaration//GEN-END:variables
}
