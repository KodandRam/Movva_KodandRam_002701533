/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author movvakodandram
 */
public class EditDoctor extends javax.swing.JPanel {

    /**
     * Creates new form EditDoctor
     */
    public EditDoctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSpecial = new javax.swing.JTextField();
        submitVIewDr = new javax.swing.JButton();
        lblCommName1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        lblCommZip1 = new javax.swing.JLabel();
        txtDrName1 = new javax.swing.JTextField();
        submitUpdateDr = new javax.swing.JButton();
        submitDeleteDr = new javax.swing.JButton();
        lblHname1 = new javax.swing.JLabel();
        txtHName1 = new javax.swing.JTextField();

        txtSpecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialActionPerformed(evt);
            }
        });

        submitVIewDr.setText("VIEW");

        lblCommName1.setText("Doctor Name");

        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Name", "Specialisation", "Hospital Name"
            }
        ));
        jScrollPane1.setViewportView(docTable);

        lblCommZip1.setText("Specialisation");

        txtDrName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrName1ActionPerformed(evt);
            }
        });

        submitUpdateDr.setText("UPDATE");

        submitDeleteDr.setText("DELETE");
        submitDeleteDr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDeleteDrActionPerformed(evt);
            }
        });

        lblHname1.setText("Hospital Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitVIewDr)
                                .addGap(18, 18, 18)
                                .addComponent(submitUpdateDr)
                                .addGap(18, 18, 18)
                                .addComponent(submitDeleteDr))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCommZip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCommName1))
                                    .addComponent(lblHname1))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDrName1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(txtSpecial)
                                    .addComponent(txtHName1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommName1)
                    .addComponent(txtDrName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommZip1)
                    .addComponent(txtSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHname1)
                    .addComponent(txtHName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitVIewDr)
                    .addComponent(submitDeleteDr)
                    .addComponent(submitUpdateDr))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSpecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialActionPerformed

    private void txtDrName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrName1ActionPerformed

    private void submitDeleteDrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDeleteDrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitDeleteDrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable docTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommName1;
    private javax.swing.JLabel lblCommZip1;
    private javax.swing.JLabel lblHname1;
    private javax.swing.JButton submitDeleteDr;
    private javax.swing.JButton submitUpdateDr;
    private javax.swing.JButton submitVIewDr;
    private javax.swing.JTextField txtDrName1;
    private javax.swing.JTextField txtHName1;
    private javax.swing.JTextField txtSpecial;
    // End of variables declaration//GEN-END:variables
}