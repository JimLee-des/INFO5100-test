/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Airline.RailLine;
import Business.Airline.Train;
import Business.Customer.Passenger;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;
    private Order order;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
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

        btnView = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        cbInsurance = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFlt = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(217, 235, 248));

        btnView.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(62, 80, 170));
        btnView.setText("View History Order");
        btnView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(62, 80, 170));

        enterpriseLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Customer:");

        enterpriseLabel1.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Order Your Flight:");

        cbInsurance.setForeground(new java.awt.Color(255, 255, 255));
        cbInsurance.setText("Buy Insurance?");
        cbInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInsuranceActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineImages/icons8-ticket-80-2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(cbInsurance)
                        .addGap(283, 283, 283)))
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(cbInsurance)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        tblFlt.setBackground(new java.awt.Color(238, 238, 238));
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
                "Flight_id", "Original Place", "Destination Place", "Departure time", "Arriving time", "Airplane_id", "Cost", "Airline Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFlt);

        btnOrder.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(62, 80, 170));
        btnOrder.setText("Order");
        btnOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnOrder))
                .addGap(96, 96, 96))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        RequestLabTestJPanel rltjp = new RequestLabTestJPanel(mainScreen, userAccount, system);
        mainScreen.add("RequestLabTestJPanel", rltjp);
        CardLayout layout = (CardLayout) mainScreen.getLayout();
        layout.next(mainScreen);
    }//GEN-LAST:event_btnViewActionPerformed

    private void cbInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInsuranceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInsuranceActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlt.getSelectedRow();
        String fid = (String) tblFlt.getValueAt(selectedRow,0);
        String ori = (String) tblFlt.getValueAt(selectedRow,1);
        String des = (String) tblFlt.getValueAt(selectedRow,2);
        String dep = (String) tblFlt.getValueAt(selectedRow,3);
        String arr = (String) tblFlt.getValueAt(selectedRow,4);
        String aid = (String) tblFlt.getValueAt(selectedRow,5);
        String cos = (String) tblFlt.getValueAt(selectedRow,6);
        if(selectedRow>=0){
            for(int i = 0;i < system.getRailLineDirectory().getRailLineList().size(); i++){
                if(system.getRailLineDirectory().getRailLineList().get(i).getName().equals((String) tblFlt.getValueAt(selectedRow,7))){
                    RailLine al = system.getRailLineDirectory().getRailLineList().get(i);
                    Order order1 = new Order(userAccount.getName(),fid, ori, des, dep, arr, aid, cos, al.getName(), cbInsurance.isSelected());
                    System.out.println(al.getOrderList());
                    //                            al.getOrderList().add(order1);
                    for(Passenger cust : system.getCustomerDirectory().getCustList()){
                        if(cust.getName().equals(userAccount.getName())){
                            cust.addOrder(order1);
                        }
                    }
                    JOptionPane.showMessageDialog(this,"Your Order is placed, your order id is:"+order1.getOrder_id(),"Thank You",JOptionPane.WARNING_MESSAGE);
                    //                        if(cbInsurance.isSelected()==true){
                        //                            Order order = new Order(userAccount.getName(),fid, ori, des, dep, arr, aid, cos, al.getName(), true);
                        //                            al.getOrderList().add(order);
                        //                            for(Customer cust : system.getCustomerDirectory().getCustList()){
                            //                                if(cust.getName().equals(userAccount.getName())){
                                //                                    cust.addOrder(order);
                                //                                }
                            //                            }
                        //                            JOptionPane.showMessageDialog(this,"Your Order is placed, your order id is:"+order.getOrder_id(),"Thank You",JOptionPane.WARNING_MESSAGE);
                        //                        }else{
                        //                            Order order = new Order(userAccount.getName(),fid, ori, des, dep, arr, aid, cos, al.getName(), false);
                        //                            al.getOrderList().add(order);
                        //                            for(Customer cust : system.getCustomerDirectory().getCustList()){
                            //                                if(cust.getName().equals(userAccount.getName())){
                                //                                    cust.addOrder(order);
                                //                                }
                            //                            }
                        //                            JOptionPane.showMessageDialog(this,"Your Order is placed, your order id is:"+order.getOrder_id(),"Thank You",JOptionPane.WARNING_MESSAGE);
                        //                        }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        //        mainScreen.remove(this);
        //        Component[] componentArray = mainScreen.getComponents();
        //        Component component = componentArray[componentArray.length - 1];
        //        CardLayout layout = (CardLayout)mainScreen.getLayout();
        //        layout.previous(mainScreen);
    }//GEN-LAST:event_btnOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnView;
    private javax.swing.JCheckBox cbInsurance;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFlt;
    // End of variables declaration//GEN-END:variables

    private void populatetblFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for (RailLine al : system.getRailLineDirectory().getRailLineList()) {
            for(Train fl : al.getFlightList()){
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
