/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdmin;

import Application.Utils.AppSystem;
import Application.Utils.DatabaseUtils;
import Application.Utils.Helper;
import Business.ManagementCompanyPackage.ManagementCompanyDirectory;
import Business.ManagementCompanyPackage.ManagementCompany;
import Business.Users.Person;
import Business.UtilityCompany.ElectricityCompany;
import Business.ContractApplication.ContractApplication;
import Business.FinanceCompanyPackage.FinanceCompanyDirectory;
import Business.FinanceCompanyPackage.FinanceCompany;
import Business.LegalCompany.LegalCompanyDirectory;
import Business.LegalCompany.LegalCompany;
import Business.ManagementCompany.ManagementCompanyDirectory;
import Business.ManagementCompany.ManagementCompany;
import Business.Users.ElectricityCompanyAdmin;
import Business.Users.ElectricityCompanyAdminDirectory;
import Business.Users.FinanceCompanyAdmin;
import Business.Users.FinanceCompanyAdminDirectory;
import Business.Users.GasCompanyAdmin;
import Business.Users.GasCompanyAdminDirectory;
import Business.Users.LegalCompanyAdmin;
import Business.Users.LegalCompanyAdminDirectory;
import Business.Users.ManagementCompanyAdmin;
import Business.Users.ManagementCompanyAdminDirectory;
import Business.Users.WaterCompanyAdmin;
import Business.Users.WaterCompanyAdminDirectory;
import Business.UtilityCompany.ElectricityCompanyDirectory;
import Business.UtilityCompany.ElectricityCompany;
import Business.UtilityCompany.GasCompanyDirectory;
import Business.UtilityCompany.GasCompany;
import Business.UtilityCompany.WaterCompanyDirectory;
import Business.UtilityCompany.WaterCompany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ankitlall
 */
public class NewAdminForm extends javax.swing.JPanel {
    
    String type;
    
    private HashMap<String, Integer> companies=new HashMap<>();

    /**
     * Creates new form NewAdminForm
     */
    public NewAdminForm(String type) {
        this.type=type;
        initComponents();
        setCompanyList();
        setPanelContent();
    }
    
    private void setCompanyList(){
        
        switch(type) {
            case "management":
                ManagementCompanyDirectory mgmtListFromDB = DatabaseUtils.getMgmtListFromDB();
                for(ManagementCompany com : mgmtListFromDB.getMgmtList()){
                    compList.addItem(com.getMgmtName());
                    companies.put(com.getMgmtName(), com.getMgmtId());
                }
                break;
            case "gas":
                GasCompanyDirectory gasListFromDB = DatabaseUtils.getGasListFromDB();
                for(GasCompany com : gasListFromDB.getGasList()){
                    compList.addItem(com.getGasName());
                    companies.put(com.getGasName(), com.getGasId());
                }
                break;
            case "electricity":
                ElectricityCompanyDirectory electricityListFromDB = DatabaseUtils.getElecListFromDB();
                for(ElectricityCompany com : electricityListFromDB.getElecList()){
                    compList.addItem(com.getElectricityName());
                    companies.put(com.getElectricityName(), com.getElectricityId());
                }
                break;
           case "water": 
                WaterCompanyDirectory waterListFromDB = DatabaseUtils.getWaterListFromDB();
                for(WaterCompany com : waterListFromDB.getWaterList()){
                    compList.addItem(com.getWaterName());
                    companies.put(com.getWaterName(), com.getWaterId());
                }
                break;
            case "finance": 
                FinanceCompanyDirectory finListFromDB = DatabaseUtils.getFinComps();
                for(FinanceCompany com : finListFromDB.getFinanceCompanyList()){
                    compList.addItem(com.getCompanyName());
                    companies.put(com.getCompanyName(), com.getFinId());
                }
                break;
            case "legal": 
                LegalCompanyDirectory legalListFromDB = DatabaseUtils.getLegalComps();
                for(LegalCompany com : legalListFromDB.getLegalCompanyList()){
                    compList.addItem(com.getCompanyName());
                    companies.put(com.getCompanyName(), com.getLegalId());
                }
                break;
        }
    }
    
    private void setPanelContent() {
        years.setModel(new DefaultComboBoxModel(Helper.getYearsList(1964)));
        months.setModel(new DefaultComboBoxModel(((int) years.getSelectedItem() == LocalDate.now().getYear())?setMonthsList():Helper.monthsList)); 
        days.setModel(new DefaultComboBoxModel<>(Helper.getDays(
                                years.getItemAt(years.getSelectedIndex()), 
                                Arrays.asList(Helper.monthsList).indexOf(months.getSelectedItem())+1
                )));    
        jRadioButton1.setSelected(true);
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
    
    private void resetForm() {
        years.setModel(new DefaultComboBoxModel(Helper.getYearsList(1964)));
        months.setModel(new DefaultComboBoxModel(((int) years.getSelectedItem() == LocalDate.now().getYear())?setMonthsList():Helper.monthsList)); 
        days.setModel(new DefaultComboBoxModel<>(Helper.getDays(
                                years.getItemAt(years.getSelectedIndex()), 
                                Arrays.asList(Helper.monthsList).indexOf(months.getSelectedItem())+1
                )));    
        jRadioButton1.setSelected(true);
        
        nameField.setText("");
        emailField.setText("");
        phNumField.setText("");
        streetField.setText("");
        cityField.setText("");
        stateField.setText("");
        commField.setText("");
        compList.setSelectedIndex(0);
        pass.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phNumField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        commField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        compList = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        days = new javax.swing.JComboBox<>();
        months = new javax.swing.JComboBox<>();
        years = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(0, 0, 810, 700));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration Form");

        jLabel2.setText("Name:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Date of Birth:");

        jLabel4.setText("Gender:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Others");

        jLabel5.setText("Email:");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone Number:");

        jLabel7.setText("Address:");

        jLabel8.setText("Street:");

        jLabel9.setText("Community:");

        jLabel10.setText("City:");

        jLabel11.setText("State:");

        jLabel12.setText("Company Name:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jLabel13.setText("Password:");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel7))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField)
                                    .addComponent(emailField)
                                    .addComponent(phNumField)
                                    .addComponent(pass)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jRadioButton3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cityField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(commField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(streetField)
                            .addComponent(compList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(months, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(commField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(compList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String name = nameField.getText();
        String email = emailField.getText();
        long phNum = Long.parseLong(phNumField.getText());
        String street = streetField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String comm = commField.getText();
        int compId = companies.get(String.valueOf(compList.getSelectedItem()));
        
        String password = String.valueOf(pass.getPassword());
        String gender = Helper.getRadioButtonsValue(buttonGroup1);
        
        String day=String.valueOf(days.getSelectedItem());
        String month=String.valueOf(months.getSelectedItem());
        String year=String.valueOf(years.getSelectedItem());
        
        int companyId = companies.get(String.valueOf(compList.getSelectedItem()));
        
        switch(type) {
            case "management":
                ManagementCompanyAdmin mgtAdmin = new ManagementCompanyAdmin(name, Helper.getDate(day, month, year), gender, email, phNum, password, street, comm, city, state);
                mgtAdmin.setCompanyId(companyId);
                new ManagementCompanyAdminDirectory().createNewUser(mgtAdmin);
                break;
            case "gas":
                GasCompanyAdmin gasAdmin = new GasCompanyAdmin(name, Helper.getDate(day, month, year), gender, email, phNum, password, street, comm, city, state);
                gasAdmin.setCompanyId(companyId);
                new GasCompanyAdminDirectory().createNewUser(gasAdmin);
                break;
            case "electricity":
                ElectricityCompanyAdmin elecAdmin = new ElectricityCompanyAdmin(name, Helper.getDate(day, month, year), gender, email, phNum, password, street, comm, city, state);
                elecAdmin.setCompanyId(companyId);
                new ElectricityCompanyAdminDirectory().createNewUser(elecAdmin);
                break;
           case "water": 
                WaterCompanyAdmin waterAdmin = new WaterCompanyAdmin(name, Helper.getDate(day, month, year), gender, email, phNum, password, street, comm, city, state);
                waterAdmin.setCompanyId(companyId);
                new WaterCompanyAdminDirectory().createNewUser(waterAdmin);
                break;
            case "finance": 
                FinanceCompanyAdmin finAdmin = new FinanceCompanyAdmin(name, Helper.getDate(day, month, year), gender, email, phNum, password, street, comm, city, state);
                finAdmin.setCompanyId(companyId);
                new FinanceCompanyAdminDirectory().createNewUser(finAdmin);
                break;
            case "legal": 
                LegalCompanyAdmin legalAdmin = new LegalCompanyAdmin(name, Helper.getDate(day, month, year), gender, email, phNum, password, street, comm, city, state);
                legalAdmin.setCompanyId(companyId);
                new LegalCompanyAdminDirectory().createNewUser(legalAdmin);
                break;
        }   
        
        resetForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsActionPerformed
        // TODO add your handling code here:
        String[] monthsList;
        String selectedMonth = String.valueOf(months.getSelectedItem());
        if((int) years.getSelectedItem() == LocalDate.now().getYear()) {
            monthsList = Helper.getCurrentMonthsList();
        }else {
            monthsList = Helper.monthsList;
        }
        
        DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>(Helper.monthsList);
        months.setModel(cmbModel);
        
        if(Arrays.asList(monthsList).contains(selectedMonth)) {
                months.setSelectedItem((Object) selectedMonth);
        }
                
        updateDaysList();
    }//GEN-LAST:event_yearsActionPerformed

    private void monthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsActionPerformed
        // TODO add your handling code here:
        updateDaysList();
    }//GEN-LAST:event_monthsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AppSystem.workAreaPanel.setRightPanel(new SystemAdminMgmtJPanel());
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField commField;
    private javax.swing.JComboBox<String> compList;
    private javax.swing.JComboBox<Integer> days;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JComboBox<String> months;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phNumField;
    private javax.swing.JTextField stateField;
    private javax.swing.JTextField streetField;
    private javax.swing.JComboBox<Integer> years;
    // End of variables declaration//GEN-END:variables
}
