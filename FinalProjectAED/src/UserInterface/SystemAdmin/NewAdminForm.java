/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdmin;

import Application.Utils.DatabaseUtils;
import Application.Utils.Helper;
import Business.ManagementCompany.ManagementCompanyDirectory;
import Business.ManagementCompany.ManagementCompany;
import Business.Users.Person;
import Business.UtilityCompany.ElectricityCompany;
import Business.UtilityCompany.ElectricityCompanyDirectory;
import Business.UtilityCompany.GasCompany;
import Business.UtilityCompany.GasCompanyDirectory;
import Business.UtilityCompany.WaterCompany;
import Business.UtilityCompany.WaterCompanyDirectory;
import UserInterface.Main.WorkAreaContPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
  

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class NewAdminForm extends javax.swing.JPanel {
    
     String type;
     
     
     

    /**
     * Creates new form NewAdminForm
     */
    public NewAdminForm(String type) {
        this.type=type;
          setBounds(0, 0, 810, 750);
          typeSet();
        initComponents();
        }
    

    

   
    
    private void typeSet(){
        
        switch(type) {
                      case "management":
                      compNameLabel.setText("Management Company");
                      ManagementCompanyDirectory mgmtListFromDB = DatabaseUtils.getMgmtListFromDB();
                      for(ManagementCompany com : mgmtListFromDB.getMgmtList()){
                      compList.addItem(com.getMgmtName());
                      }
                      break;
                      case "gas":
                      compNameLabel.setText("Gas Company");
                      GasCompanyDirectory gasListFromDB = DatabaseUtils.getGasListFromDB();
                      for(GasCompany com : gasListFromDB.getGasList()){
                      compList.addItem(com.getGasName());
                      }
                      break;
                      case "electricity":
                       compNameLabel.setText("Electricity Company");
                       ElectricityCompanyDirectory electricityListFromDB = DatabaseUtils.getElecListFromDB();
                      for(ElectricityCompany com : electricityListFromDB.getElecList()){
                      compList.addItem(com.getElectricityName());
                      }
                      break;
                     case "water": 
                      WaterCompanyDirectory waterListFromDB = DatabaseUtils.getWaterListFromDB();
                      for(WaterCompany com : waterListFromDB.getWaterList()){
                      compList.addItem(com.getWaterName());
                      }
                      break;
                 
//                  break;
//            case "gas":
//                  compNameLabel.setText("Gas Company");
//                  break;
//            case  "water":
//                  compNameLabel.setText("Water Company");
//                  break;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_email = new javax.swing.JTextField();
        communityErrLabel = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        streetErrLabel = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        passwordErrLabel = new javax.swing.JLabel();
        phoneNumberErrLabel = new javax.swing.JLabel();
        emailErrLabel = new javax.swing.JLabel();
        btnOthers = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        btnMale = new javax.swing.JRadioButton();
        genderErrLabel = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        dobErrLabel = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        nameErrLabel = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        txt_dob = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_state = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_registrationform = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        lbl_city = new javax.swing.JLabel();
        txt_community = new javax.swing.JTextField();
        txt_street = new javax.swing.JTextField();
        lbl_community = new javax.swing.JLabel();
        lbl_street = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lbl_password = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        stateErrLabel = new javax.swing.JLabel();
        lbl_phonenumber = new javax.swing.JLabel();
        cityErrLabel = new javax.swing.JLabel();
        compNameLabel = new javax.swing.JLabel();
        compList = new javax.swing.JComboBox<>();

        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_emailKeyReleased(evt);
            }
        });

        communityErrLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                communityErrLabelKeyPressed(evt);
            }
        });

        lbl_email.setText("Email:");

        lbl_dob.setText("D.O.B: ");

        btnOthers.setText("Others");

        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        lbl_gender.setText("Gender: ");

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        txt_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dobKeyPressed(evt);
            }
        });

        txt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nameMousePressed(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
        });

        txt_state.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_stateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stateKeyReleased(evt);
            }
        });

        lbl_name.setText("Name:");

        jLabel1.setText("State: ");

        lbl_registrationform.setText("Registration Form");

        txt_city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cityKeyReleased(evt);
            }
        });

        lbl_city.setText("City: ");

        txt_community.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_communityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_communityKeyReleased(evt);
            }
        });

        txt_street.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_streetKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_streetKeyReleased(evt);
            }
        });

        lbl_community.setText("Community: ");

        lbl_street.setText("Street:");

        lbl_address.setText("Address");

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        lbl_password.setText("Password: ");

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phoneKeyReleased(evt);
            }
        });

        lbl_phonenumber.setText("Phone Number:");

        cityErrLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityErrLabelKeyPressed(evt);
            }
        });

        compNameLabel.setText("Type: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lbl_registrationform, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_submit)
                        .addGap(134, 134, 134)
                        .addComponent(btn_reset))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_email)
                                        .addComponent(lbl_gender))
                                    .addGap(35, 35, 35))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_address)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_phonenumber)
                                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbl_street))
                                    .addGap(5, 5, 5)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(162, 162, 162)
                                    .addComponent(phoneNumberErrLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(170, 170, 170)
                                            .addComponent(passwordErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(btnMale)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnFemale)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnOthers))
                                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(169, 169, 169)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(genderErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nameErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dobErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(lbl_dob)
                                    .addGap(55, 55, 55))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_community)
                                    .addGap(51, 51, 51)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_street, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(158, 158, 158)
                                    .addComponent(streetErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_community, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_state, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(compList, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(158, 158, 158)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(communityErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(stateErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cityErrLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                        .addComponent(lbl_city))
                    .addComponent(compNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_registrationform)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_dob)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dobErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_gender)
                        .addComponent(btnMale)
                        .addComponent(btnFemale)
                        .addComponent(btnOthers))
                    .addComponent(genderErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_email)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_phonenumber)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_password)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(97, 97, 97)
                        .addComponent(lbl_address)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_street)
                        .addComponent(txt_street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(streetErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_community)
                            .addComponent(txt_community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_city)
                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(communityErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cityErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compNameLabel)
                            .addComponent(compList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_submit)
                            .addComponent(btn_reset))
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stateErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_emailKeyPressed

    private void txt_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyReleased
        // TODO add your handling code here:
        String email = txt_email.getText();
        String err = Helper.validateInput(email, "email");
        emailErrLabel.setText(err);
    }//GEN-LAST:event_txt_emailKeyReleased

    private void communityErrLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_communityErrLabelKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_communityErrLabelKeyPressed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnFemaleActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
        btnMale.setSelected(true);
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txt_name.setText("");

        txt_dob.setText("");
        txt_password.setText("");
        // .setText("")txt_confirmpassword;
        txt_email.setText("");
        txt_phone.setText("");
        txt_password.setText("");
        txt_street.setText("");
        txt_community.setText("");
        txt_city.setText("");
        txt_state.setText("");

    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
//       //Person person = userDirectory.addNewUser();
//        //person.setUid(3);
//        person.setUserRole("Consumer");
//        person.setName(txt_name.getText());
//        person.setDob(txt_dob.getText());
//        if(btnMale.isSelected()){
//            person.setGender("Male");
//        }
//        if(btnFemale.isSelected()){
//            person.setGender("Female");
//        }
//        else
//        {
//            person.setGender("Others");
//        }
//
//        person.setEmail(txt_email.getText());
//        person.setPhoneNumber(txt_phone.getText());
//        person.setPassword(txt_password.getText());
//        person.setStreet(txt_street.getText());
//        person.setCommunity(txt_community.getText());
//        person.setCity(txt_city.getText());
//        person.setState(txt_state.getText());
//
//        DatabaseUtils.createNewUser(person);

          String name= txt_name.getText();
          String dob = txt_dob.getText();
          
          if(btnMale.isSelected()){
              
            btnMale.getText();
          }
          if(btnFemale.isSelected())
          {
              btnFemale.getText();
          }
          
          if(btnOthers.isSelected())
          {
              btnOthers.getText();
          }
          
         
          String email = txt_email.getText();
          String phoneNumber = txt_phone.getText();
          String password = txt_password.getText();
          String street = txt_street.getText();
          String community = txt_community.getText();
          String city = txt_city.getText();
          String state = txt_state.getText();
          
          
          
          
          
          
          
          

       JOptionPane.showMessageDialog(btn_submit, "Admin Saved");
        //Send booking request to management company.

    }//GEN-LAST:event_btn_submitActionPerformed

    
    private void txt_dobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dobKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_dobKeyPressed

    private void txt_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_nameMousePressed

    private void txt_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyPressed

    }//GEN-LAST:event_txt_nameKeyPressed

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased
        // TODO add your handling code here:
        String name = txt_name.getText();
        String err = Helper.validateInput(name, "name");
        nameErrLabel.setText(err);
    }//GEN-LAST:event_txt_nameKeyReleased

    private void txt_stateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stateKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_stateKeyPressed

    private void txt_stateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stateKeyReleased
        // TODO add your handling code here:
        String state = txt_state.getText();
        String err = Helper.validateInput(state, "state");
        stateErrLabel.setText(err);
    }//GEN-LAST:event_txt_stateKeyReleased

    private void txt_cityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cityKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_cityKeyPressed

    private void txt_cityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cityKeyReleased
        // TODO add your handling code here:
        String city = txt_city.getText();
        String err = Helper.validateInput(city, "city");
        cityErrLabel.setText(err);
    }//GEN-LAST:event_txt_cityKeyReleased

    private void txt_communityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_communityKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_communityKeyPressed

    private void txt_communityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_communityKeyReleased
        // TODO add your handling code here:
        String community = txt_community.getText();
        String err = Helper.validateInput(community, "community");
        communityErrLabel.setText(err);
    }//GEN-LAST:event_txt_communityKeyReleased

    private void txt_streetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_streetKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_streetKeyPressed

    private void txt_streetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_streetKeyReleased
        // TODO add your handling code here:
        String street = txt_street.getText();
        String err = Helper.validateInput(street, "street");
        streetErrLabel.setText(err);
    }//GEN-LAST:event_txt_streetKeyReleased

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        // TODO add your handling code here:
        String password = txt_password.getText();
        String err = Helper.validateInput(password, "password");
        passwordErrLabel.setText(err);
    }//GEN-LAST:event_txt_passwordKeyReleased

    private void txt_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyPressed
        // TODO add your handling code here:
        // String phoneNumber = txt_phone.getText();
        // String err = Helper.validateInput(phoneNumber, "phNum");
        // phoneNumberErrLabel.setText(err);
    }//GEN-LAST:event_txt_phoneKeyPressed

    private void txt_phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyReleased
        // TODO add your handling code here:
        String phoneNumber = txt_phone.getText();
        String err = Helper.validateInput(phoneNumber, "phNum");
        phoneNumberErrLabel.setText(err);
    }//GEN-LAST:event_txt_phoneKeyReleased

    private void cityErrLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityErrLabelKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_cityErrLabelKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOthers;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cityErrLabel;
    private javax.swing.JLabel communityErrLabel;
    private javax.swing.JComboBox<String> compList;
    private javax.swing.JLabel compNameLabel;
    private javax.swing.JLabel dobErrLabel;
    private javax.swing.JLabel emailErrLabel;
    private javax.swing.JLabel genderErrLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_city;
    private javax.swing.JLabel lbl_community;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_phonenumber;
    private javax.swing.JLabel lbl_registrationform;
    private javax.swing.JLabel lbl_street;
    private javax.swing.JLabel nameErrLabel;
    private javax.swing.JLabel passwordErrLabel;
    private javax.swing.JLabel phoneNumberErrLabel;
    private javax.swing.JLabel stateErrLabel;
    private javax.swing.JLabel streetErrLabel;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_community;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_state;
    private javax.swing.JTextField txt_street;
    // End of variables declaration//GEN-END:variables
}
