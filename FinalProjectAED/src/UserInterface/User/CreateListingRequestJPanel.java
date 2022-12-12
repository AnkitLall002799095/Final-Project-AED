/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.User;

import Application.Utils.AppSystem;
import static Application.Utils.AppSystem.currentUid;
import static Application.Utils.AppSystem.requestCounter;
import Application.Utils.DatabaseUtils;
import Application.Utils.Helper;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Request.UserRequest;
import Business.Request.UserRequestDirectory;
import Business.UtilityCompany.ElectricityCompany;
import Business.UtilityCompany.ElectricityCompanyDirectory;
import Business.UtilityCompany.GasCompany;
import Business.UtilityCompany.GasCompanyDirectory;
import Business.UtilityCompany.WaterCompany;
import Business.UtilityCompany.WaterCompanyDirectory;
import UserInterface.Main.WorkAreaContPanel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author hmitt
 */
public class CreateListingRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateListingJPanel
     */
    
    UserRequestDirectory reqList;
    PropertyDirectory createPropList;
    GasCompanyDirectory gasList;
    ElectricityCompanyDirectory elecList;
    WaterCompanyDirectory waterList;
    
    public CreateListingRequestJPanel() {
        reqList = DatabaseUtils.getRequestListFromDB();
        gasList = DatabaseUtils.getGasListFromDB();
        elecList = DatabaseUtils.getElecListFromDB();
        waterList = DatabaseUtils.getWaterListFromDB();
        createPropList = new PropertyDirectory();
        initComponents();
        populateRequestTable();
        populateMgmtCompCombo();
        populateGasCompCombo();
        populateElecCompCombo();
        populateWaterCompCombo();
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
        UserRequestjTable = new javax.swing.JTable();
        RequestListjLabel = new javax.swing.JLabel();
        SubHeadingjLabel = new javax.swing.JLabel();
        PropIdjLabel = new javax.swing.JLabel();
        MgmtCompjLabel = new javax.swing.JLabel();
        GasCompjLabel = new javax.swing.JLabel();
        ElecCompjLabel = new javax.swing.JLabel();
        WaterCompjLabel = new javax.swing.JLabel();
        StreetjLabel = new javax.swing.JLabel();
        CommunityjLabel = new javax.swing.JLabel();
        CityjLabel = new javax.swing.JLabel();
        StatejLabel = new javax.swing.JLabel();
        PropIdjTextField = new javax.swing.JTextField();
        StreetjTextField = new javax.swing.JTextField();
        CommunityjTextField = new javax.swing.JTextField();
        CityjTextField = new javax.swing.JTextField();
        StatejTextField = new javax.swing.JTextField();
        CreatejButton = new javax.swing.JButton();
        CanceljButton = new javax.swing.JButton();
        GasCompjComboBox = new javax.swing.JComboBox<>();
        WaterCompjComboBox = new javax.swing.JComboBox<>();
        ElecCompjComboBox = new javax.swing.JComboBox<>();
        MgmtCompjComboBox = new javax.swing.JComboBox<>();
        PropNamejLabel = new javax.swing.JLabel();
        PropNamejTextField = new javax.swing.JTextField();

        WelcomejLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WelcomejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomejLabel.setText("Welcome to Apartment listing wizard!");

        UserRequestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Building No.", "Apartment No.", "Management company", "Request type", "Request status", "Last updated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(UserRequestjTable);

        RequestListjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RequestListjLabel.setText("My requests:-");

        SubHeadingjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SubHeadingjLabel.setText("Create new property listing:-");

        PropIdjLabel.setText("Property ID");

        MgmtCompjLabel.setText("Management company");

        GasCompjLabel.setText("Gas company");

        ElecCompjLabel.setText("Electricity company");

        WaterCompjLabel.setText("Water company");

        StreetjLabel.setText("Street");

        CommunityjLabel.setText("Community");

        CityjLabel.setText("City");

        StatejLabel.setText("State");

        CreatejButton.setText("Create request");
        CreatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatejButtonActionPerformed(evt);
            }
        });

        CanceljButton.setText("Cancel request");
        CanceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceljButtonActionPerformed(evt);
            }
        });

        PropNamejLabel.setText("Property name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RequestListjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubHeadingjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(476, 476, 476))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(MgmtCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MgmtCompjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(GasCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(GasCompjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ElecCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(ElecCompjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(PropIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(PropIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(CommunityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(CommunityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(StreetjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(StreetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(PropNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(PropNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(CityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(WaterCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(WaterCompjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(StatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CreatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(CanceljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(147, 147, 147)))
                                .addGap(112, 112, 112))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(WelcomejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(WelcomejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubHeadingjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PropIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PropIdjTextField)
                    .addComponent(PropNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PropNamejTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MgmtCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(StreetjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(StreetjTextField))
                            .addComponent(MgmtCompjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CommunityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CommunityjTextField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GasCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GasCompjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CityjTextField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ElecCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ElecCompjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StatejTextField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(WaterCompjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WaterCompjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CanceljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(RequestListjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatejButtonActionPerformed
        // TODO add your handling code here:
        
        if ((PropIdjTextField.getText().equals("")) || (PropNamejTextField.getText().equals("")) || (StreetjTextField.getText().equals("")) || (CommunityjTextField.getText().equals("")) || (CityjTextField.getText().equals("")) || (StatejTextField.getText().equals(""))){
            JOptionPane.showMessageDialog(CreatejButton, "Please provide value for all fields!");
        }
        else{
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = new java.util.Date();
            String statusDate = formatter.format(date);

            Property createProp = createPropList.addNewProfile();
            createProp.setPropId(Integer.parseInt(PropIdjTextField.getText()));
            createProp.setOwnerId(currentUid);
            createProp.setMgtComp(Helper.getCompIDfromCombo(MgmtCompjComboBox));
            createProp.setStreet(StreetjTextField.getText());
            createProp.setCommunity(CommunityjTextField.getText());
            createProp.setCity(CityjTextField.getText());
            createProp.setState(StatejTextField.getText());
            createProp.setPropName(PropNamejTextField.getText());

            for (GasCompany g : gasList.getGasList()){
                if (g.getGasId()==Helper.getCompIDfromCombo(GasCompjComboBox))
                    createProp.setGas(g);
            }

            for (ElectricityCompany e : elecList.getElecList()){
                if (e.getElectricityId()==Helper.getCompIDfromCombo(ElecCompjComboBox))
                    createProp.setElectricity(e);
            }

            for (WaterCompany w : waterList.getWaterList()){
                if (w.getWaterId()==Helper.getCompIDfromCombo(WaterCompjComboBox))
                    createProp.setWater(w);
            }

            UserRequest newReq = reqList.addNewProfile();
            newReq.setRequestId(requestCounter++);
            newReq.setPropId(Integer.parseInt(PropIdjTextField.getText()));
            newReq.setMgmtId(Helper.getCompIDfromCombo(MgmtCompjComboBox));
            newReq.setRequestType("To-Lease");
            newReq.setStatus("Pending");
            newReq.setLastMdfdDate(statusDate);
            newReq.setUserId(currentUid);

            try{

                Connection conn= DatabaseUtils.getConnection();
                Statement st1 = conn.createStatement();
                st1.executeUpdate("INSERT INTO `aedfinalproject`.`property_details` (`prop_id`, `user_id`, `mgt_comp_id`, `street`, `community`, `city`, `state`, `prop_names`, `elec_comp_id`, `water_comp_id`, `gas_comp_id`) VALUES ('" + createProp.getPropId() + "','" + createProp.getOwnerId() + "','" + createProp.getMgtComp() + "','" + createProp.getStreet() + "','" + createProp.getCommunity() + "','" + createProp.getCity() + "','" + createProp.getState() + "','" + createProp.getPropName() + "','" + createProp.electricity.getElectricityId() + "','" + createProp.water.getWaterId() + "','" + createProp.gas.getGasId() + "')");

                Statement st2 = conn.createStatement();
                st2.executeUpdate("INSERT INTO `aedfinalproject`.`user_application_request` (`Request_Id`, `Prop_Id`, `Mgmt_Comp_Id`, `Request_Type`, `Status`, `Last_Mdfd_Date`, `User_Id`) VALUES ('" + newReq.getRequestId() + "','" + newReq.getPropId() + "','" + newReq.getMgmtId() + "','" + newReq.getRequestType() + "','" + newReq.getStatus() + "','" + newReq.getLastMdfdDate() + "','" + newReq.getUserId()+ "')");

                populateRequestTable();

            }
            catch(Exception e){
                System.out.println(e);
            }

            JOptionPane.showMessageDialog(CreatejButton, "Property lisitng request placed!");

            PropIdjTextField.setText("");
            PropNamejTextField.setText("");
            StreetjTextField.setText("");
            CommunityjTextField.setText("");
            CityjTextField.setText("");
            StatejTextField.setText("");

            return;
        }
        
    }//GEN-LAST:event_CreatejButtonActionPerformed

    private void CanceljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceljButtonActionPerformed
        // TODO add your handling code here:
        
        PropIdjTextField.setText("");
        PropNamejTextField.setText("");
        StreetjTextField.setText("");
        CommunityjTextField.setText("");
        CityjTextField.setText("");
        StatejTextField.setText("");
        
    }//GEN-LAST:event_CanceljButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanceljButton;
    private javax.swing.JLabel CityjLabel;
    private javax.swing.JTextField CityjTextField;
    private javax.swing.JLabel CommunityjLabel;
    private javax.swing.JTextField CommunityjTextField;
    private javax.swing.JButton CreatejButton;
    private javax.swing.JComboBox<String> ElecCompjComboBox;
    private javax.swing.JLabel ElecCompjLabel;
    private javax.swing.JComboBox<String> GasCompjComboBox;
    private javax.swing.JLabel GasCompjLabel;
    private javax.swing.JComboBox<String> MgmtCompjComboBox;
    private javax.swing.JLabel MgmtCompjLabel;
    private javax.swing.JLabel PropIdjLabel;
    private javax.swing.JTextField PropIdjTextField;
    private javax.swing.JLabel PropNamejLabel;
    private javax.swing.JTextField PropNamejTextField;
    private javax.swing.JLabel RequestListjLabel;
    private javax.swing.JLabel StatejLabel;
    private javax.swing.JTextField StatejTextField;
    private javax.swing.JLabel StreetjLabel;
    private javax.swing.JTextField StreetjTextField;
    private javax.swing.JLabel SubHeadingjLabel;
    private javax.swing.JTable UserRequestjTable;
    private javax.swing.JComboBox<String> WaterCompjComboBox;
    private javax.swing.JLabel WaterCompjLabel;
    private javax.swing.JLabel WelcomejLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void populateMgmtCompCombo(){
        
        try{
            
            ArrayList<String> mgmtCompList = new ArrayList<String>();
            
            Connection conn= DatabaseUtils.getConnection();
            Statement st = conn.createStatement();
            ResultSet mgmtRs = st.executeQuery("SELECT * FROM aedfinalproject.management_companies");
            while (mgmtRs.next()){
                String mgmtComp = mgmtRs.getString(1)+"-"+mgmtRs.getString(2);
                mgmtCompList.add(mgmtComp);
            }
            
            String [] mgmtCompNames = new String [mgmtCompList.size()];
            mgmtCompList.toArray(mgmtCompNames);
                        
            MgmtCompjComboBox.setModel(new DefaultComboBoxModel<String> (mgmtCompNames));
        }
        catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public void populateGasCompCombo(){
        
        try{
            
            ArrayList<String> gasCompList = new ArrayList<String>();
            
            Connection conn= DatabaseUtils.getConnection();
            Statement st = conn.createStatement();
            ResultSet gasRs = st.executeQuery("SELECT * FROM aedfinalproject.gas_companies");
            while (gasRs.next()){
                String gasComp = gasRs.getString(1)+"-"+gasRs.getString(2);
                gasCompList.add(gasComp);
            }
            
            String [] gasCompNames = new String [gasCompList.size()];
            gasCompList.toArray(gasCompNames);
                        
            GasCompjComboBox.setModel(new DefaultComboBoxModel<String> (gasCompNames));
        }
        catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public void populateElecCompCombo(){
        
        try{
            
            ArrayList<String> elecCompList = new ArrayList<String>();
            
            Connection conn= DatabaseUtils.getConnection();
            Statement st = conn.createStatement();
            ResultSet elecRs = st.executeQuery("SELECT * FROM aedfinalproject.electricity_companies");
            while (elecRs.next()){
                String elecComp = elecRs.getString(1)+"-"+elecRs.getString(2);
                elecCompList.add(elecComp);
            }
            
            String [] elecCompNames = new String [elecCompList.size()];
            elecCompList.toArray(elecCompNames);
                        
            ElecCompjComboBox.setModel(new DefaultComboBoxModel<String> (elecCompNames));
        }
        catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public void populateWaterCompCombo(){
        
        try{
            
            ArrayList<String> waterCompList = new ArrayList<String>();
            
            Connection conn= DatabaseUtils.getConnection();
            Statement st = conn.createStatement();
            ResultSet waterRs = st.executeQuery("SELECT * FROM aedfinalproject.water_companies");
            while (waterRs.next()){
                String waterComp = waterRs.getString(1)+"-"+waterRs.getString(2);
                waterCompList.add(waterComp);
            }
            
            String [] waterCompNames = new String [waterCompList.size()];
            waterCompList.toArray(waterCompNames);
                        
            WaterCompjComboBox.setModel(new DefaultComboBoxModel<String> (waterCompNames));
        }
        catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public void populateRequestTable(){
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) UserRequestjTable.getModel();
        model.setRowCount(0);
        
        for (UserRequest u : reqList.getReqList()){
            
            Object[] row = new Object[7];
            row[0] = u.getRequestId();
            row[1] = u.getPropId();
            row[2] = u.getAptId();
            row[3] = u.getMgmtId();
            row[4] = u.getRequestType();
            row[5] = u.getStatus();
            row[6] = u.getLastMdfdDate();
            
            model.addRow(row);
            
        }
        
    }

}
