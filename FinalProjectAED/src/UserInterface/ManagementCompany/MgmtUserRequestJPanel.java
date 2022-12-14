/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ManagementCompany;

import Application.Utils.DatabaseUtils;
import Business.ManagementCompanyPackage.ManagementCompany;
import Business.ManagementCompanyPackage.ManagementCompanyDirectory;
import Business.Request.UserRequest;
import Business.Request.UserRequestDirectory;
import Email.Utils.EmailUtil;
import UserInterface.Main.WorkAreaContPanel;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hmitt
 */
public class MgmtUserRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MgmtUserRequestJPanel
     */
    ManagementCompanyDirectory mgmtList;
    UserRequestDirectory reqMgmtReqList;
    WorkAreaContPanel workAreaPanel;
    
    public MgmtUserRequestJPanel() {
        initComponents();
        this.mgmtList= DatabaseUtils.getMgmtListFromDB();
        this.reqMgmtReqList= DatabaseUtils.getMgmtRequestListFromDB();
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomejLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestListjTable = new javax.swing.JTable();
        RequestListjLabel = new javax.swing.JLabel();
        ApprovejButton = new javax.swing.JButton();
        RejectjButton = new javax.swing.JButton();

        WelcomejLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WelcomejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomejLabel.setText("Welcome to Apartment requests wizard!");

        RequestListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "User ID", "Building No.", "Apartment No.", "Request type", "Request status", "Last updated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RequestListjTable);

        RequestListjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RequestListjLabel.setText("Requests list:-");

        ApprovejButton.setText("Approve request");
        ApprovejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApprovejButtonActionPerformed(evt);
            }
        });

        RejectjButton.setText("Reject request");
        RejectjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RequestListjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(ApprovejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RejectjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(236, Short.MAX_VALUE)
                    .addComponent(WelcomejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(185, 185, 185)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(RequestListjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApprovejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RejectjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(WelcomejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(595, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ApprovejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApprovejButtonActionPerformed
        // TODO add your handling code here:
        
        int agentId;
        int selectedRow[] = RequestListjTable.getSelectedRows();
        String requestType = new String();
        int reqToUpdate;
        int propToUpdate;
        int aptToUpdate;
        int tenantId;
        String status= new String();
        
        if (selectedRow.length == 0) {
            JOptionPane.showMessageDialog(ApprovejButton, "Please select a row to approve!");
            return;
        }

        else if (selectedRow.length>1) {
            JOptionPane.showMessageDialog(ApprovejButton, "Please select only 1 row to approve!");
            return;
        }

        else {
             
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) RequestListjTable.getModel();

            for (int i=0;i<selectedRow.length;i++){
                reqToUpdate = (Integer) model.getValueAt(selectedRow[i], 0);
                tenantId = (Integer) model.getValueAt(selectedRow[i], 1);
                propToUpdate = (Integer) model.getValueAt(selectedRow[i], 2);
                aptToUpdate = (Integer) model.getValueAt(selectedRow[i], 3);
                requestType = (String) model.getValueAt(selectedRow[i], 4);
                status = (String) model.getValueAt(selectedRow[i], 5);
                
                if (status.equals("Pending")){
                    for (UserRequest u : reqMgmtReqList.getReqList()){
                    if (u.getRequestId()==reqToUpdate)
                        u.setStatus("Approved");
                    }

                    try{

                        Connection conn= DatabaseUtils.getConnection();
                        Statement st1 = conn.createStatement();
                        st1.executeUpdate("UPDATE `aedfinalproject`.`user_application_request` SET Status = \"Approved\" WHERE Request_Id = " + reqToUpdate + "");

                        populateRequestTable();
                        if (requestType.equals("To-Lease")){
                            agentId= Integer.parseInt(JOptionPane.showInputDialog("Assign agent to the property!"));
                            Statement st2 = conn.createStatement();
                            st2.executeUpdate("UPDATE `aedfinalproject`.`property_details` SET mgt_broker_id = " + agentId + " WHERE prop_id = " + propToUpdate +"");
                        }
                        else if (requestType.equals("Lease")){
                            Statement st3 = conn.createStatement();
                            st3.executeUpdate("UPDATE `aedfinalproject`.`apartment_details` SET is_Leased = " + 1 + " , Tenant_Id = " + tenantId + " WHERE Apt_id = " + aptToUpdate +"");
                        }

                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    JOptionPane.showMessageDialog(ApprovejButton, "Request approved!");
                    
                    EmailUtil.triggerManagementToUserMail("managementcomptestacc@gmail.com", "abcx98414@gmail.com");
                    
                }
                
                else{
                    JOptionPane.showMessageDialog(ApprovejButton, "Request already closed!");
                }
                
            }
            
        }
        
    }//GEN-LAST:event_ApprovejButtonActionPerformed

    private void RejectjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectjButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow[] = RequestListjTable.getSelectedRows();
        int reqToUpdate;
        int propToUpdate;
        String requestType = new String();
        String status = new String();
        
        if (selectedRow.length == 0) {
            JOptionPane.showMessageDialog(RejectjButton, "Please select a row to reject!");
            return;
        }

        else if (selectedRow.length>1) {
            JOptionPane.showMessageDialog(RejectjButton, "Please select only 1 row to reject!");
            return;
        }

        else {
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) RequestListjTable.getModel();

            for (int i=0;i<selectedRow.length;i++){
                reqToUpdate = (Integer) model.getValueAt(selectedRow[i], 0);
                propToUpdate = (Integer) model.getValueAt(selectedRow[i], 2);
                requestType = (String) model.getValueAt(selectedRow[i], 4);
                status = (String) model.getValueAt(selectedRow[i], 5);
                
                if (status.equals("Pending")){
                    for (UserRequest u : reqMgmtReqList.getReqList()){
                    if (u.getRequestId()==reqToUpdate)
                        u.setStatus("Rejected");
                    }

                    try{

                        Connection conn= DatabaseUtils.getConnection();
                        Statement st1 = conn.createStatement();
                        st1.executeUpdate("UPDATE `aedfinalproject`.`user_application_request` SET Status = \"Rejected\" WHERE Request_Id = " + reqToUpdate + "");

                        populateRequestTable();
                        if (requestType.equals("To-Lease")){
                            Statement st2 = conn.createStatement();
                            st2.executeUpdate("DELETE FROM `aedfinalproject`.`property_details` WHERE prop_id = " + propToUpdate +"");
                        }

                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    JOptionPane.showMessageDialog(RejectjButton, "Request rejected!");
                    
                    EmailUtil.triggerManagementToUserMail("managementcomptestacc@gmail.com", "abcx98414@gmail.com");
                    
                }
                else{
                    JOptionPane.showMessageDialog(RejectjButton, "Request already closed!");
                }
                
            }
            
        }
        
    }//GEN-LAST:event_RejectjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApprovejButton;
    private javax.swing.JButton RejectjButton;
    private javax.swing.JLabel RequestListjLabel;
    private javax.swing.JTable RequestListjTable;
    private javax.swing.JLabel WelcomejLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    public void populateRequestTable(){
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) RequestListjTable.getModel();
        model.setRowCount(0);
        
        for (UserRequest u : reqMgmtReqList.getReqList()){
            
            Object[] row = new Object[7];
            row[0] = u.getRequestId();
            row[1] = u.getUserId();
            row[2] = u.getPropId();
            row[3] = u.getAptId();
            row[4] = u.getRequestType();
            row[5] = u.getStatus();
            row[6] = u.getLastMdfdDate();

            model.addRow(row);
            
        }
    }


}
