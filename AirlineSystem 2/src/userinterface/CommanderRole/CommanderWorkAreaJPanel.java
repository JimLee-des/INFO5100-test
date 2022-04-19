/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CommanderRole;

import Business.Airline.RailLine;
import Business.Airline.Train;
import Business.Customer.Passenger;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 刘欣卓
 */
public class CommanderWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommanderWorkAreaJPanel
     */
    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;
    public CommanderWorkAreaJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.userAccount = userAccount;
        this.system = system;
        populatetblFlt();
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tblFlt = new javax.swing.JTable();
        btnSet = new javax.swing.JButton();

        setBackground(new java.awt.Color(104, 139, 241));

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

        btnSet.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        btnSet.setForeground(new java.awt.Color(104, 139, 241));
        btnSet.setText("Go");
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSet)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlt.getSelectedRow();
        
        for(RailLine al : system.getRailLineDirectory().getRailLineList()){
            for(Train fl : al.getFlightList()){
                if(fl.getFlight_id().equals((String) tblFlt.getValueAt(selectedRow, 0))){
                    fl.setStatus(true);
                    for(Passenger cus : fl.getCustomerList()){
                        for(Order order : cus.getOrderList()){
                            if(order.getRailNum_id().equals((String) tblFlt.getValueAt(selectedRow, 0))){
                                order.setStatus(true);
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(this,"The plane has taken off.");
                }
            }
        }
    }//GEN-LAST:event_btnSetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSet;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblFlt;
    // End of variables declaration//GEN-END:variables

    private void populatetblFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for (RailLine al : system.getRailLineDirectory().getRailLineList()) {
            for(Train fl : al.getFlightList()){
                if(fl.isCustomerStatus()){
                    Object[] row = new Object[8];
                    row[0] = fl.getFlight_id();
                    row[1] = fl.getOriginalplace();
                    row[2] = fl.getDestinationplace();
                    row[3] = fl.getDepartureTime();
                    row[4] = fl.getArrivingTime();
                    row[5] = fl.getAirplane_id();
                    row[6] = fl.getCost();
                    row[7] = al.getName();
                    model.addRow(row);
                }  
            }
        }
    }
}
