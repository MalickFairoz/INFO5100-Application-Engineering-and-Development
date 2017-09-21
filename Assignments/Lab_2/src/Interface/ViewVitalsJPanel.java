/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Malick
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
    private VitalSignHistory vsh;
    public ViewVitalsJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
        populateTable();
        
    }
    public void populateTable() {
        
        DefaultTableModel dtm = (DefaultTableModel)TblVitalSigns.getModel();
        dtm.setRowCount(0);
        
        for(VitalSigns vs : vsh.getVitalSignHistory())
        {
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);
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

        ViewHead = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblVitalSigns = new javax.swing.JTable();
        BtnViewDetails = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        TxtTemp = new javax.swing.JTextField();
        LabTemp1 = new javax.swing.JLabel();
        TxtBloodPressure = new javax.swing.JTextField();
        LabTemp2 = new javax.swing.JLabel();
        TxtPulse = new javax.swing.JTextField();
        LabTemp3 = new javax.swing.JLabel();
        TxtDate = new javax.swing.JTextField();
        LabTemp = new javax.swing.JLabel();

        ViewHead.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ViewHead.setText("View Vital Sign");

        TblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datel", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblVitalSigns);

        BtnViewDetails.setText("View Details");
        BtnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewDetailsActionPerformed(evt);
            }
        });

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TxtTemp.setEnabled(false);
        TxtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTempActionPerformed(evt);
            }
        });

        LabTemp1.setText("Blood Pressure");

        TxtBloodPressure.setEnabled(false);
        TxtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBloodPressureActionPerformed(evt);
            }
        });

        LabTemp2.setText("Pulse");

        TxtPulse.setEnabled(false);
        TxtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPulseActionPerformed(evt);
            }
        });

        LabTemp3.setText("Date");

        TxtDate.setEnabled(false);
        TxtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDateActionPerformed(evt);
            }
        });

        LabTemp.setText("Temperature");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(ViewHead))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabTemp3)
                                .addGap(61, 61, 61)
                                .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabTemp2)
                                .addGap(61, 61, 61)
                                .addComponent(TxtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabTemp1)
                                .addGap(61, 61, 61)
                                .addComponent(TxtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabTemp)
                                .addGap(61, 61, 61)
                                .addComponent(TxtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnViewDetails)
                                .addGap(18, 18, 18)
                                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ViewHead)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnViewDetails)
                    .addComponent(BtnDelete))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabTemp)
                    .addComponent(TxtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabTemp1)
                    .addComponent(TxtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabTemp2)
                    .addComponent(TxtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabTemp3)
                    .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTempActionPerformed

    private void TxtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBloodPressureActionPerformed

    private void TxtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPulseActionPerformed

    private void TxtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDateActionPerformed

    private void BtnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewDetailsActionPerformed
            int selectedrow = TblVitalSigns.getSelectedRow();
            if(selectedrow >=0)
            {
                VitalSigns vs = (VitalSigns)TblVitalSigns.getValueAt(selectedrow, 0);
                TxtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
                TxtTemp.setText(String.valueOf(vs.getTemperature()));
                TxtPulse.setText(String.valueOf(vs.getPulse()));
                TxtDate.setText(String.valueOf(vs.getDate()));
                
                
            }

            else
                
                JOptionPane.showMessageDialog(null,"Please select any row");
            
// TODO add your handling code here:
    }//GEN-LAST:event_BtnViewDetailsActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int selectedrow = TblVitalSigns.getSelectedRow();
            if(selectedrow >=0)
            {
                VitalSigns vs = (VitalSigns)TblVitalSigns.getValueAt(selectedrow, 0);
                vsh.deleteVitals(vs);
                JOptionPane.showMessageDialog(null, "Vital sign has been deleted");
                populateTable();
            }
                    else
                
                JOptionPane.showMessageDialog(null,"Please select any row");
            
    }//GEN-LAST:event_BtnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnViewDetails;
    private javax.swing.JLabel LabTemp;
    private javax.swing.JLabel LabTemp1;
    private javax.swing.JLabel LabTemp2;
    private javax.swing.JLabel LabTemp3;
    private javax.swing.JTable TblVitalSigns;
    private javax.swing.JTextField TxtBloodPressure;
    private javax.swing.JTextField TxtDate;
    private javax.swing.JTextField TxtPulse;
    private javax.swing.JTextField TxtTemp;
    private javax.swing.JLabel ViewHead;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
