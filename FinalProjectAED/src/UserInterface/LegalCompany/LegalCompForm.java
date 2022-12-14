/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.LegalCompany;

import Application.Utils.AppSystem;
import Application.Utils.DatabaseUtils;
import Application.Utils.Helper;
import Business.ContractApplication.ContractApplication;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ankitlall
 */
public class LegalCompForm extends javax.swing.JPanel {
    
    int appId;
    ContractApplication contract;

    /**
     * Creates new form LogalCompForm
     */
    public LegalCompForm(int appId) {
        this.appId=appId;
        initComponents();
        setPanelContent();
    }
    
    private void setPanelContent() {
        AppSystem.contractApplicationCatalog.getContracts(appId, "app_id");
        ArrayList<ContractApplication> contractApplicationCatalog = AppSystem.contractApplicationCatalog.getContractApplicationCatalog();
        contract = contractApplicationCatalog.get(0);
        aptNum.setText(String.valueOf(contract.getAptId()));
        propName.setText(contract.getPropName());
        
        
        years.setModel(new DefaultComboBoxModel(Helper.getFutYearsList()));
        months.setModel(new DefaultComboBoxModel(((int) years.getSelectedItem() == LocalDate.now().getYear())?setMonthsList():Helper.monthsList)); 
        days.setModel(new DefaultComboBoxModel<>(Helper.getDays(
				years.getItemAt(years.getSelectedIndex()), 
				Arrays.asList(Helper.monthsList).indexOf(months.getSelectedItem())+1
		)));       
    }
    
    private String[] setMonthsList() {
    	String[] monthList = Helper.getCurrentMonthsList();

        return monthList;
    }
    
    private void updateDaysList() {
    	Integer selectedDay = (Integer) days.getSelectedItem();
        Integer[] updatedDaysList = Helper.getDays(
                        years.getItemAt(years.getSelectedIndex()), 
                        Arrays.asList(Helper.monthsList).indexOf(months.getSelectedItem())+1
        );
        DefaultComboBoxModel<Integer> cmbModel = new DefaultComboBoxModel<>(updatedDaysList);
        days.setModel(cmbModel);
        if(Arrays.asList(updatedDaysList).contains(selectedDay)) {
                days.setSelectedItem((Object) selectedDay);
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

        propName = new javax.swing.JLabel();
        aptNum = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        years = new javax.swing.JComboBox<>();
        months = new javax.swing.JComboBox<>();
        days = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(0, 0, 810, 700));

        propName.setText("jLabel8");

        aptNum.setText("jLabel7");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsActionPerformed(evt);
            }
        });

        months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        months.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsActionPerformed(evt);
            }
        });

        days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysActionPerformed(evt);
            }
        });

        jLabel2.setText("Property Name:");

        jLabel1.setText("Apartment Number:");

        jLabel7.setText("Lease End Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aptNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aptNum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(propName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(283, 283, 283)
                .addComponent(jButton1)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String day=String.valueOf(days.getSelectedItem());
        String month=String.valueOf(months.getSelectedItem());
        String year=String.valueOf(years.getSelectedItem());

        contract.setLeaseEndDate(Helper.getDate(day, month, year));
        DatabaseUtils.updateContractLegal(contract);
        DatabaseUtils.createNewApartment(contract.getAptId(), contract.getPropId());
        JOptionPane.showMessageDialog(new JButton(), "Contract Updated.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsActionPerformed
        // TODO add your handling code here:
        if((int) years.getSelectedItem() == LocalDate.now().getYear()) {
            DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>(Helper.getCurrentMonthsList());
            months.setModel(cmbModel);
        }else {
            DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>(Helper.monthsList);
            months.setModel(cmbModel);
        }
        updateDaysList();
    }//GEN-LAST:event_yearsActionPerformed

    private void monthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsActionPerformed
        // TODO add your handling code here:
        updateDaysList();
    }//GEN-LAST:event_monthsActionPerformed

    private void daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aptNum;
    private javax.swing.JComboBox<Integer> days;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> months;
    private javax.swing.JLabel propName;
    private javax.swing.JComboBox<Integer> years;
    // End of variables declaration//GEN-END:variables
}
