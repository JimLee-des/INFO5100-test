/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AirlineAdminRole;

import Business.Airline.RailLine;
import Business.Airline.Rail;
import Business.Airline.Train;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

//注意分配航班和飞机的时候，不同情况不同的提示，这个功能还未完善

/**
 *
 * @author 刘欣卓
 */
public class ManageAirplaneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirplaneJPanel
     */
    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;
    public ManageAirplaneJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.userAccount = userAccount;
        this.system = system;
        populatetblFlt();
        populatetblAp();
        System.out.println(userAccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        cbRepair = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFlt = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtAirplane_id = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCapacity = new javax.swing.JTextField();
        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAp = new javax.swing.JTable();

        setBackground(new java.awt.Color(104, 139, 241));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbRepair.setForeground(new java.awt.Color(255, 255, 255));
        cbRepair.setText("repair needed");

        tblFlt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight_id", "Original Place", "Destination Place", "Departure time", "Arriving time", "Airplane_id.", "Cost", "Airline Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblFlt);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Capacity:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Airplane_id:");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(108, 139, 241));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Airplane");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtAirplane_id.setBackground(new java.awt.Color(104, 139, 241));
        txtAirplane_id.setBorder(null);

        btnConfirm.setBackground(new java.awt.Color(108, 139, 241));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm Update");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AirlineCompany Info");

        txtCapacity.setBackground(new java.awt.Color(104, 139, 241));
        txtCapacity.setBorder(null);

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        tblAp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Airplane_id", "Cpacity", "needed repair", "Occupation Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnBack)
                .addContainerGap(683, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(114, 114, 114)
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(172, 172, 172)
                                    .addComponent(btnUpdate)
                                    .addGap(35, 35, 35)
                                    .addComponent(btnDelete))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbRepair)
                                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(jSeparator1)
                                                        .addComponent(txtAirplane_id, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(jSeparator2))))
                                            .addGap(46, 46, 46))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(56, 56, 56)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(171, 171, 171)
                            .addComponent(btnRefresh)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addContainerGap(717, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAirplane_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbRepair))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(btnCreate)
                            .addGap(18, 18, 18)
                            .addComponent(btnConfirm)
                            .addGap(61, 61, 61))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdate)
                                .addComponent(btnDelete))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefresh))
                    .addGap(85, 85, 85)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainScreen.remove(this);
        Component[] componentArray = mainScreen.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) mainScreen.getLayout();
        layout.previous(mainScreen);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populatetblFlt();
        populatetblAp();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String airplane_id = txtAirplane_id.getText();
        String capacity = txtCapacity.getText();
        boolean rs = cbRepair.isSelected();
        for (RailLine a1 : system.getRailLineDirectory().getRailLineList()) {
            if(a1.getName().equals(userAccount.getName())){
                if (a1.checkIfAirplaneIsUnique(airplane_id)==false) {
                    JOptionPane.showMessageDialog(this,"It is already existing ");
                }else{
                    Rail ap1 = new Rail(airplane_id, capacity, rs);
                    a1.addAirplane(ap1);
                    populatetblAp();
                    txtAirplane_id.setText("");
                    txtCapacity.setText("");
                    cbRepair.setSelected(false);
                }
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAp.getSelectedRow();
        if(selectedRow>=0){
            String airplane_id = (String) tblAp.getValueAt(selectedRow, 0);
            for (RailLine al : system.getRailLineDirectory().getRailLineList()) {
                if(al.getName().equals(userAccount.getName())){
                    for(int i = 0; i< al.getAirplaneList().size(); i++){
                        if(al.getAirplaneList().get(i).getId().equals(airplane_id)){
                            al.deleteAirplane(airplane_id);
                        }
                    }
                    //                    for(Airplane ap : al.getAirplaneList()){
                        //                        if(ap.getId().equals(airplane_id)){
                            //                            al.deleteAirplane(ap);
                            //                        }
                        //                    }
                }
            }
            populatetblAp();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String airplane_id = txtAirplane_id.getText();
        String capacity = txtCapacity.getText();
        boolean rs = cbRepair.isSelected();
        int selectRow = tblAp.getSelectedRow();
        String id = (String) tblAp.getValueAt(selectRow, 0);

        for (RailLine al : system.getRailLineDirectory().getRailLineList()) {
            if(al.getName().equals(userAccount.getName())){
                for(int i = 0; i< al.getAirplaneList().size(); i++){
                    if(al.getAirplaneList().get(i).getId().equals(id)){
                        if (al.getAirplaneList().get(i).getId().equals(airplane_id)) {
                            JOptionPane.showMessageDialog(null,"  Airplane ID already exists ");
                        }else{
                            al.getAirplaneList().get(i).setId(airplane_id);
                            al.getAirplaneList().get(i).setCapacity(capacity);
                            al.getAirplaneList().get(i).setRepairStatus(rs);
                            populatetblAp();
                            btnCreate.setEnabled(true);
                            btnDelete.setEnabled(true);
                            btnUpdate.setEnabled(true);
                            btnConfirm.setEnabled(false);
                            txtAirplane_id.setText("");
                            txtCapacity.setText("");
                            cbRepair.setSelected(false);
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblAp.getSelectedRow();

        if(selectRow>=0){
            String airplane_id = (String) tblAp.getValueAt(selectRow, 0);
            String capacity= (String) tblAp.getValueAt(selectRow, 1);
            String repairStatus= (String) tblAp.getValueAt(selectRow, 2);
            txtAirplane_id.setText(airplane_id+"");
            txtCapacity.setText(capacity+"");
            cbRepair.setSelected(repairStatus.equals("Yes"));
        }else {
            JOptionPane.showMessageDialog(this,"Please select a row");
        }
        btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlt.getSelectedRow();
        int selectedRow1 = tblAp.getSelectedRow();

        if(selectedRow>=0 && selectedRow1>=0){
            String id = (String) tblAp.getValueAt(selectedRow1,0);
            String fid = (String) tblFlt.getValueAt(selectedRow,0);
            for (RailLine al : system.getRailLineDirectory().getRailLineList()) {
                if(al.getName().equals(userAccount.getName())){
                    for(int i = 0; i< al.getAirplaneList().size(); i++){
                        for(int a = 0; a< al.getFlightList().size(); a++){
                            if(al.getAirplaneList().get(i).getId().equals(id) && al.getFlightList().get(a).getFlight_id().equals(fid) && al.getAirplaneList().get(i).isUsingStatus()==false && al.getFlightList().get(a).getAirplane_id() == null){
                                al.getAirplaneList().get(i).setUsingStatus(true);
                                al.getFlightList().get(a).setAirplane_id(al.getAirplaneList().get(i).getId());
                                JOptionPane.showMessageDialog(this,"Assign Successfully!");
                            }
                        }

                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please select a row on two Table.");
        }
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbRepair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblAp;
    private javax.swing.JTable tblFlt;
    private javax.swing.JTextField txtAirplane_id;
    private javax.swing.JTextField txtCapacity;
    // End of variables declaration//GEN-END:variables

    private void populatetblFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for (RailLine al : system.getRailLineDirectory().getRailLineList()) {
            if(al.getName().equals(userAccount.getName())){
                for(Train fl : al.getFlightList()){
                    if(fl.isStatus()==false){
                        Object[] row = new Object[8];
                        row[0] = fl.getFlight_id();
                        row[1] = fl.getOriginalplace();
                        row[2] = fl.getDestinationplace();
                        row[3] = fl.getDepartureTime();
                        row[4] = fl.getArrivingTime();
                        row[5] = (fl.getAirplane_id()==null)? "Not Assigned Yet" : fl.getAirplane_id();
                        row[6] = fl.getCost();
                        row[7] = al.getName();
                        model.addRow(row);
                    }
                }
            }
        }
    }

    private void populatetblAp() {
        DefaultTableModel model = (DefaultTableModel) tblAp.getModel();
        model.setRowCount(0);
        for (RailLine al : system.getRailLineDirectory().getRailLineList()){
            if(al.getName().equals(userAccount.getName())){
                for(Rail ap : al.getAirplaneList()){
                    Object[] row = new Object[4];
                    row[0] = ap.getId();
                    row[1] = ap.getCapacity();
                    row[2] = ap.isRepairStatus()? "Yes" : "No";
                    row[3] = ap.isUsingStatus()? "Occupied" : "Not Occupied";
                    model.addRow(row);
                }
            }
        }
    }
}
