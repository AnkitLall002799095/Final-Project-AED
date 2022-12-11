/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FinanceCompany;

import Application.Utils.AppSystem;
import Application.Utils.DatabaseUtils;
import Application.Utils.Helper;
import Business.ContractApplication.ContractApplication;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ankitlall
 */
public class FinanceCompForm extends javax.swing.JPanel {
    
    int appId;
    ContractApplication contract;

    /**
     * Creates new form FinanceCompForm
     */
    public FinanceCompForm(int appId) {
        this.appId=appId;
        initComponents();
        setPanelContent();
    }
    
    private void setPanelContent() {
        AppSystem.contractApplicationCatalog.getContracts(appId, "app_id");
        ArrayList<ContractApplication> contractApplicationCatalog = AppSystem.contractApplicationCatalog.getContractApplicationCatalog();
        contract = contractApplicationCatalog.get(0);
        aptNum.setText(String.valueOf(contract.getAppId()));
        propName.setText(contract.getPropName());
        
        
        years.setModel(new DefaultComboBoxModel(Helper.getYearsList(2000)));
        months.setModel(new DefaultComboBoxModel(((int) years.getSelectedItem() == LocalDate.now().getYear())?setMonthsList():Helper.monthsList)); 
        days.setModel(new DefaultComboBoxModel<>(Helper.getDays(
				years.getItemAt(years.getSelectedIndex()), 
				Arrays.asList(Helper.monthsList).indexOf(months.getSelectedItem())+1
		)));       
    }
    
    private String[] setMonthsList() {
    	Integer selectedMonth = (Integer) months.getSelectedItem();
    	String[] monthList = Helper.getCurrentMonthsList();
  		if(Arrays.asList(monthList).contains(selectedMonth)) {
  			months.setSelectedItem((Object) selectedMonth);
  		}
  		
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aptNum = new javax.swing.JLabel();
        propName = new javax.swing.JLabel();
        leaseCostTextField = new javax.swing.JTextField();
        maintanenceCostField = new javax.swing.JTextField();
        utilityCostField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        days = new javax.swing.JComboBox<>();
        months = new javax.swing.JComboBox<>();
        years = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        depositField = new javax.swing.JTextField();

        setBounds(new java.awt.Rectangle(0, 0, 798, 500));

        jLabel1.setText("Apartment Number:");

        jLabel2.setText("Property Name:");

        jLabel3.setText("Apartment Lease Cost:");

        jLabel4.setText("Maintanence Cost:");

        jLabel5.setText("Utilities Cost:");

        jLabel6.setText("Security Deposit:");

        aptNum.setText("jLabel7");

        propName.setText("jLabel8");

        jLabel7.setText("Billing Date:");

        days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysActionPerformed(evt);
            }
        });

        months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        months.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsActionPerformed(evt);
            }
        });

        years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaseCostTextField)
                    .addComponent(maintanenceCostField)
                    .addComponent(aptNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(utilityCostField)
                    .addComponent(depositField))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(leaseCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maintanenceCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(utilityCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(depositField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(jButton1)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysActionPerformed

    private void monthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsActionPerformed
        // TODO add your handling code here:
        updateDaysList();
    }//GEN-LAST:event_monthsActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int leaseCost = Integer.parseInt(leaseCostTextField.getText());
        int maintanenceCost = Integer.parseInt(maintanenceCostField.getText());
        int utilitiesCost = Integer.parseInt(utilityCostField.getText());
        int deposit = Integer.parseInt(depositField.getText());

        String day=String.valueOf(days.getSelectedItem());
        String month=String.valueOf(months.getSelectedItem());
        String year=String.valueOf(years.getSelectedItem());
        
        contract.setLeaseCost(leaseCost);
        contract.setMaintanenceCost(maintanenceCost);
        contract.setAptBillingDate(Helper.getDate(day, month, year));
        contract.setUtilitiesCost(utilitiesCost);
        contract.setDeposit(deposit);
        DatabaseUtils.updateContractFinance(contract);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aptNum;
    private javax.swing.JComboBox<Integer> days;
    private javax.swing.JTextField depositField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField leaseCostTextField;
    private javax.swing.JTextField maintanenceCostField;
    private javax.swing.JComboBox<String> months;
    private javax.swing.JLabel propName;
    private javax.swing.JTextField utilityCostField;
    private javax.swing.JComboBox<Integer> years;
    // End of variables declaration//GEN-END:variables
}