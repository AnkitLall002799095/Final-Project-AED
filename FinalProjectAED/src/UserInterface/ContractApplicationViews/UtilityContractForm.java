/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ContractApplicationViews;

import Application.Utils.AppSystem;
import Application.Utils.DatabaseUtils;
import Application.Utils.Helper;
import Business.ContractApplication.ContractApplication;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import java.util.Arrays;

/**
 *
 * @author ankitlall
 */
public class UtilityContractForm extends javax.swing.JPanel {

    int appId;
    String type;
    ContractApplication contract;
    
    /**
     * Creates new form ElectricityContractForm
     */
    public UtilityContractForm(int appId, String type) {
        this.type = type;
        this.appId=appId;
        initComponents();
        setPanelContent();
    }
    
    private void setPanelContent() {
        AppSystem.contractApplicationCatalog.getContracts(appId, "app_id");
        ArrayList<ContractApplication> contractApplicationCatalog = AppSystem.contractApplicationCatalog.getContractApplicationCatalog();
        contract = contractApplicationCatalog.get(0);
        aptNumLabel.setText(String.valueOf(contract.getAptId()));
        cityLabel.setText(contract.getCity());
        stateLabel.setText(contract.getState());
        streetLabel.setText(contract.getStreet());
        
        
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

        jLabel7 = new javax.swing.JLabel();
        headingLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        accNumField = new javax.swing.JTextField();
        aptNumLabel = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        days = new javax.swing.JComboBox<>();
        months = new javax.swing.JComboBox<>();
        years = new javax.swing.JComboBox<>();
        contactNumField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setBounds(new java.awt.Rectangle(0, 0, 798, 590));

        headingLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Account Number:");

        jLabel3.setText("Billing Address:");

        jLabel4.setText("Apartment Number:");

        jLabel5.setText("Street:");

        jLabel6.setText("City:");

        jLabel8.setText("State:");

        jLabel9.setText("Billing Date:");

        jLabel10.setText("Emergency and Repair:");

        aptNumLabel.setText("jLabel11");

        streetLabel.setText("jLabel12");

        cityLabel.setText("jLabel13");

        stateLabel.setText("jLabel14");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accNumField)
                            .addComponent(aptNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(stateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactNumField))
                        .addGap(150, 150, 150))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(headingLabel)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(accNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aptNumLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(streetLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cityLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(stateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(contactNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        long accNum = Long.parseLong(accNumField.getText());
        long contactNum = Long.parseLong(contactNumField.getText());

        String day=String.valueOf(days.getSelectedItem());
        String month=String.valueOf(months.getSelectedItem());
        String year=String.valueOf(years.getSelectedItem());
        
        switch(type) {
            case "electricity":
                contract.setElecAccNum(accNum);
                contract.setElecContactNum(contactNum);
                contract.setElecBillingDate(Helper.getDate(day, month, year));
                DatabaseUtils.updateContractElec(contract);
            case "water":
                contract.setWaterAccNum(accNum);
                contract.setWaterContactNum(contactNum);
                contract.setWaterBillingDate(Helper.getDate(day, month, year));
                DatabaseUtils.updateContractWater(contract);
            case "gas":
                contract.setGasAccNum(accNum);
                contract.setGasContactNum(contactNum);
                contract.setGasBillingDate(Helper.getDate(day, month, year));
                DatabaseUtils.updateContractGas(contract);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNumField;
    private javax.swing.JLabel aptNumLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField contactNumField;
    private javax.swing.JComboBox<Integer> days;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> months;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JComboBox<Integer> years;
    // End of variables declaration//GEN-END:variables
}
