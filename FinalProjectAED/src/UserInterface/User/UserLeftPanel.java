/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.User;

import Application.Utils.AppSystem;
import UserInterface.Main.WorkAreaContPanel;
import UserInterface.ManagementCompany.CompanyEmployeeLeftPanel;
import UserInterface.ManagementCompany.MgmtDefaultJPanel;
import UserInterface.ManagementCompany.MgmtUserRequestJPanel;

/**
 *
 * @author hmitt
 */
public class UserLeftPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserLeftPanel
     */
    
    WorkAreaContPanel workAreaPanel;
    
    public UserLeftPanel() {
        this.workAreaPanel = AppSystem.workAreaPanel;
        setBounds(0, 0, 190, 700);
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

        WelcomejLabel = new javax.swing.JLabel();
        ViewjButton = new javax.swing.JButton();
        ViewjButton1 = new javax.swing.JButton();
        LogoutjButton = new javax.swing.JButton();
        ManagementjButton = new javax.swing.JButton();

        WelcomejLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        WelcomejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomejLabel.setText("Welcome user!");

        ViewjButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ViewjButton.setText("View apartments");
        ViewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewjButtonActionPerformed(evt);
            }
        });

        ViewjButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ViewjButton1.setText("Initiate new listing");
        ViewjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewjButton1ActionPerformed(evt);
            }
        });

        LogoutjButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LogoutjButton.setText("Logout");
        LogoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutjButtonActionPerformed(evt);
            }
        });

        ManagementjButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ManagementjButton.setText("Go to management");
        ManagementjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagementjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WelcomejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManagementjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(WelcomejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(ViewjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ViewjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(LogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewjButtonActionPerformed
        // TODO add your handling code here:
        
        workAreaPanel.setRightPanel(new ListingViewJPanel(workAreaPanel));
        
    }//GEN-LAST:event_ViewjButtonActionPerformed

    private void ViewjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewjButton1ActionPerformed
        // TODO add your handling code here:
        
        workAreaPanel.setRightPanel(new CreateListingRequestJPanel(workAreaPanel));
        
    }//GEN-LAST:event_ViewjButton1ActionPerformed

    private void LogoutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutjButtonActionPerformed
        // TODO add your handling code here:
        
        workAreaPanel.setRightPanel(new UserDefaultJPanel());
        
    }//GEN-LAST:event_LogoutjButtonActionPerformed

    private void ManagementjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagementjButtonActionPerformed
        // TODO add your handling code here:
        
        workAreaPanel.setLeftPanel(new CompanyEmployeeLeftPanel(workAreaPanel));
        workAreaPanel.setRightPanel(new MgmtDefaultJPanel(workAreaPanel));
    }//GEN-LAST:event_ManagementjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutjButton;
    private javax.swing.JButton ManagementjButton;
    private javax.swing.JButton ViewjButton;
    private javax.swing.JButton ViewjButton1;
    private javax.swing.JLabel WelcomejLabel;
    // End of variables declaration//GEN-END:variables
}
