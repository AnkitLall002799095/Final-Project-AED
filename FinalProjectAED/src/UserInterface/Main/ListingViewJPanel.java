/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Main;

import Application.Utils.Apartment;
import Application.Utils.ApartmentDirectory;
import java.sql.*;
import Application.Utils.Helper;
import Application.Utils.Property;
import javax.swing.*;

/**
 *
 * @author hmitt
 */
public class ListingViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListingViewJPanel
     */
    
    ApartmentDirectory aptList;
    
    public static void main(String[] args) {
        
        
    }
    
    public ListingViewJPanel() {
        aptList = new ApartmentDirectory();
        initComponents();        
        getApartmentListFromDB();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel WelcomjLabel = new javax.swing.JLabel();
        AptListjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AptListjTable = new javax.swing.JTable();
        BookAptjButton = new javax.swing.JButton();
        ViewDetailsjButton = new javax.swing.JButton();

        WelcomjLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WelcomjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomjLabel.setText("Welcome to Apartment listing wizard!");

        AptListjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptListjLabel.setText("Apartment list:-");

        AptListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Apartment no.", "Building", "Type", "Management company", "Size", "Availability date", "Street", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AptListjTable);

        BookAptjButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BookAptjButton.setText("Book");
        BookAptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAptjButtonActionPerformed(evt);
            }
        });

        ViewDetailsjButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ViewDetailsjButton.setText("View details");
        ViewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WelcomjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addComponent(AptListjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookAptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(WelcomjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AptListjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ViewDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BookAptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(449, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void BookAptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAptjButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow[] = AptListjTable.getSelectedRows();
        
        if (selectedRow.length == 0) {
            JOptionPane.showMessageDialog(BookAptjButton, "Please select a row!");
            return;
        }

        else if (selectedRow.length>1) {
            JOptionPane.showMessageDialog(BookAptjButton, "Please select only 1 row!");
            return;
        }

        else {
            JOptionPane.showMessageDialog(BookAptjButton, "Apartment booking request placed!");
            //Send booking request to management company.
            return;
        }
        
    }//GEN-LAST:event_BookAptjButtonActionPerformed

    private void ViewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsjButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow[] = AptListjTable.getSelectedRows();
        
        if (selectedRow.length == 0) {
            JOptionPane.showMessageDialog(ViewDetailsjButton, "Please select a row to view!");
            return;
        }

        else if (selectedRow.length>1) {
            JOptionPane.showMessageDialog(ViewDetailsjButton, "Please select only 1 row to view!");
            return;
        }

        else {
            //Change right panel to apartment details panel.
        }
        
    }//GEN-LAST:event_ViewDetailsjButtonActionPerformed

    public void getApartmentListFromDB(){
        try{
            Connection conn = Helper.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM aedfinalproject.apartment_details");

            while (rs.next()){
                Apartment apt = aptList.addNewProfile();
                apt.setAptId(rs.getInt(1));
                apt.setTenantId(rs.getInt(2));
                apt.setSize(rs.getInt(3));
                apt.setBedroom(rs.getInt(4));
                apt.setBathroom(rs.getInt(5));
                apt.setType(rs.getString(6));
                apt.setAvlblDate(rs.getDate(7));
                apt.setRent(rs.getInt(8));
                apt.setDetails(rs.getString(9));
                apt.setLattitude(rs.getString(10));
                apt.setLongitude(rs.getString(11));
                apt.setIsLeased(rs.getBoolean(12));
                
                Property prop = new Property();
                prop.setPropId(rs.getInt(13));
                
                //for (Property p : propList.getpropList()){}
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public void populateTable(){
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) AptListjTable.getModel();
        model.setRowCount(0);
        
        for (Apartment a : aptList.getAptList()) {
            
            Object[] row = new Object[13];
            row[0] = a.getAptId();
            row[1] = a.getTenantId();
            row[2] = a.getSize();
            row[3] = a.getBedroom();
            row[4] = a.getBathroom();
            row[5] = a.getType();
            row[6] = a.getAvlblDate();
            row[7] = a.getRent();
            row[8] = a.getDetails();
            row[9] = a.getLattitude();
            row[10] = a.getLongitude();
            row[11] = a.isIsLeased();
            row[12] = a.getProp();
            
            model.addRow(row);
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AptListjLabel;
    private javax.swing.JTable AptListjTable;
    private javax.swing.JButton BookAptjButton;
    private javax.swing.JButton ViewDetailsjButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
