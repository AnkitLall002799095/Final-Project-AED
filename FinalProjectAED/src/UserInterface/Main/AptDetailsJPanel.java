/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Main;

/**
 *
 * @author hmitt
 */
public class AptDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AptDetailsJPanel
     */
    public AptDetailsJPanel() {
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

        javax.swing.JLabel WelcomjLabel = new javax.swing.JLabel();
        AptDetailsHeadingjLabel = new javax.swing.JLabel();
        AptBuildingjLabel = new javax.swing.JLabel();
        AptSizejLabel = new javax.swing.JLabel();
        AptBedroomsjLabel = new javax.swing.JLabel();
        AptBathroomsjLabel = new javax.swing.JLabel();
        AptTypejLabel = new javax.swing.JLabel();
        AptAvlblDatejLabel = new javax.swing.JLabel();
        AptRentjLabel = new javax.swing.JLabel();
        AptNojLabel = new javax.swing.JLabel();
        AptAddressjLabel = new javax.swing.JLabel();
        AptDetailsjLabel = new javax.swing.JLabel();
        AptStreetjLabel1 = new javax.swing.JLabel();
        AptCommjLabel2 = new javax.swing.JLabel();
        AptCityjLabel3 = new javax.swing.JLabel();
        AptStatejLabel4 = new javax.swing.JLabel();
        AptBuildingTextField = new javax.swing.JTextField();
        AptSizeTextField = new javax.swing.JTextField();
        AptBedroomsTextField = new javax.swing.JTextField();
        AptBathroomsTextField = new javax.swing.JTextField();
        AptTypeTextField = new javax.swing.JTextField();
        AptAvlblDateTextField = new javax.swing.JTextField();
        AptRentTextField = new javax.swing.JTextField();
        AptDetailsTextField = new javax.swing.JTextField();
        AptStreetTextField = new javax.swing.JTextField();
        AptCommTextField = new javax.swing.JTextField();
        AptCityTextField = new javax.swing.JTextField();
        AptStateTextField = new javax.swing.JTextField();
        AptNoTextField = new javax.swing.JTextField();
        BookAptjButton = new javax.swing.JButton();
        GoBackjButton = new javax.swing.JButton();

        WelcomjLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WelcomjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomjLabel.setText("Welcome to Apartment details wizard!");

        AptDetailsHeadingjLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        AptDetailsHeadingjLabel.setText("Apartment details:-");

        AptBuildingjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptBuildingjLabel.setText("Building");

        AptSizejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptSizejLabel.setText("Apartment size");

        AptBedroomsjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptBedroomsjLabel.setText("No. of bedrooms");

        AptBathroomsjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptBathroomsjLabel.setText("No. of bathrooms");

        AptTypejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptTypejLabel.setText("Apartment type");

        AptAvlblDatejLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptAvlblDatejLabel.setText("Available date");

        AptRentjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptRentjLabel.setText("Apartment rent");

        AptNojLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptNojLabel.setText("Apartment no.");

        AptAddressjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptAddressjLabel.setText("Address:");

        AptDetailsjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptDetailsjLabel.setText("Details");

        AptStreetjLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptStreetjLabel1.setText("Street");

        AptCommjLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptCommjLabel2.setText("Community");

        AptCityjLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptCityjLabel3.setText("City");

        AptStatejLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AptStatejLabel4.setText("State");

        BookAptjButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BookAptjButton.setText("Book");
        BookAptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAptjButtonActionPerformed(evt);
            }
        });

        GoBackjButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GoBackjButton.setText("Go back");
        GoBackjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WelcomjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AptDetailsHeadingjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptNojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptBuildingjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptBedroomsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptSizejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptBathroomsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptAvlblDatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptRentjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptDetailsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptAddressjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptStreetjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptCommjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptCityjLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptStatejLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AptCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptCommTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptDetailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptRentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptAvlblDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptBathroomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptBedroomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptBuildingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AptNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookAptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoBackjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WelcomjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(AptDetailsHeadingjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(AptNojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AptNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(AptBuildingjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(AptBuildingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(AptSizejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(AptSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(AptBedroomsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(AptBedroomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(AptBathroomsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(AptTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(6, 6, 6))
                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(AptBathroomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(AptTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(AptAvlblDatejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6))
                                                            .addComponent(AptAvlblDateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(AptRentjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6))
                                                    .addComponent(AptRentTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AptDetailsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addComponent(AptDetailsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AptAddressjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(AptStreetjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(AptStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AptCommjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(AptCommTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AptCityjLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AptCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookAptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AptStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GoBackjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AptStatejLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BookAptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAptjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookAptjButtonActionPerformed

    private void GoBackjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoBackjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AptAddressjLabel;
    private javax.swing.JTextField AptAvlblDateTextField;
    private javax.swing.JLabel AptAvlblDatejLabel;
    private javax.swing.JTextField AptBathroomsTextField;
    private javax.swing.JLabel AptBathroomsjLabel;
    private javax.swing.JTextField AptBedroomsTextField;
    private javax.swing.JLabel AptBedroomsjLabel;
    private javax.swing.JTextField AptBuildingTextField;
    private javax.swing.JLabel AptBuildingjLabel;
    private javax.swing.JTextField AptCityTextField;
    private javax.swing.JLabel AptCityjLabel3;
    private javax.swing.JTextField AptCommTextField;
    private javax.swing.JLabel AptCommjLabel2;
    private javax.swing.JLabel AptDetailsHeadingjLabel;
    private javax.swing.JTextField AptDetailsTextField;
    private javax.swing.JLabel AptDetailsjLabel;
    private javax.swing.JTextField AptNoTextField;
    private javax.swing.JLabel AptNojLabel;
    private javax.swing.JTextField AptRentTextField;
    private javax.swing.JLabel AptRentjLabel;
    private javax.swing.JTextField AptSizeTextField;
    private javax.swing.JLabel AptSizejLabel;
    private javax.swing.JTextField AptStateTextField;
    private javax.swing.JLabel AptStatejLabel4;
    private javax.swing.JTextField AptStreetTextField;
    private javax.swing.JLabel AptStreetjLabel1;
    private javax.swing.JTextField AptTypeTextField;
    private javax.swing.JLabel AptTypejLabel;
    private javax.swing.JButton BookAptjButton;
    private javax.swing.JButton GoBackjButton;
    // End of variables declaration//GEN-END:variables
}
