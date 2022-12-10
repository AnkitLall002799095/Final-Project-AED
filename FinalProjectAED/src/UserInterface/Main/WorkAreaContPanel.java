/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Main;

import UserInterface.User.UserLeftPanel;
import UserInterface.User.ListingViewJPanel;
import Application.Utils.AppSystem;
import UserInterface.EclectricityUtility.ElectricityCompLeftPanel;
import UserInterface.EclectricityUtility.RequestsListingElecUtility;
import UserInterface.ManagementCompany.ApplicationsListingMgtComp;
import UserInterface.ManagementCompany.CompanyEmployeeLeftPanel;
import UserInterface.User.UserDefaultJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ankitlall
 */
public class WorkAreaContPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaContPanel
     */
    public WorkAreaContPanel() {
        setBounds(0, 0, 1040, 700);
        initComponents();
        AppSystem.workAreaPanel = this;
        setDefaultPanelViews();                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();

        jSplitPane1.setDividerLocation(190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setDefaultPanelViews() {
//        jSplitPane1.setLeftComponent(new UserLeftPanel());
//        jSplitPane1.setRightComponent(new UserDefaultJPanel());
        jSplitPane1.setLeftComponent(new ElectricityCompLeftPanel());
        jSplitPane1.setRightComponent(new RequestsListingElecUtility());
    }
    
    public void setLeftPanel(JPanel panel) {
        jSplitPane1.setLeftComponent(panel);
    }
    
       public void setRightPanel(JPanel panel) {
        jSplitPane1.setRightComponent(panel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
