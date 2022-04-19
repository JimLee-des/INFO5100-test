/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Railline.RailLine;
import Business.Railline.Train;
import Business.Customer.Passenger;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Role.PassengerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 刘欣卓
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    JPanel mainScreen;
    EcoSystem system;
    UserAccount userAccount;
    public ManageCustomerJPanel(JPanel mainScreen, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.system = system;
        populateTblCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        txtUsername = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPpn = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOption = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtTn = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(104, 139, 241));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User Name", "Password", "Name", "Passport Num", "Tel Num"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        btnCreate.setBackground(new java.awt.Color(108, 139, 241));
        btnCreate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        txtPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwdActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tel Number:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Passport Number:");

        txtOption.setFont(new java.awt.Font("Apple Chancery", 1, 24)); // NOI18N
        txtOption.setForeground(new java.awt.Color(255, 255, 255));
        txtOption.setText("——————Customer Info——————");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name:");

        btnUpdate.setBackground(new java.awt.Color(108, 139, 241));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(108, 139, 241));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(108, 139, 241));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm Update");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backJButton)
                .addGap(97, 97, 97)
                .addComponent(txtOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPpn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(80, 80, 80)
                        .addComponent(btnDelete)
                        .addGap(9, 9, 9)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOption)
                    .addComponent(backJButton))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)))
                .addComponent(btnConfirm)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String uname=txtUsername.getText();
        String password=txtPwd.getText();
        String name = txtName.getText();
        String ppn = txtPpn.getText();
        String tn = txtTn.getText();
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(this,"It is already existed.");
        }else{
            UserAccount ua1 =system.getUserAccountDirectory().createUserAccount(name, uname,password,new PassengerRole());
            Passenger cust= system.getCustomerDirectory().createCustomer(name, ppn, tn);
            populateTblCustomer();
            txtUsername.setText("");
            txtPwd.setText("");
            txtPpn.setText("");
            txtTn.setText("");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblCustomer.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblCustomer.getValueAt(selectRow, 0);
            String pwd= (String) tblCustomer.getValueAt(selectRow, 1);
            userAccount=system.getUserAccountDirectory().authenticateUser(username, pwd);
            txtUsername.setText(userAccount.getUsername()+"");
            txtPwd.setText(userAccount.getPassword()+"");
            txtName.setText(userAccount.getName()+"");
            for(int i = 0;i < system.getCustomerDirectory().getCustList().size(); i++){
                if(system.getCustomerDirectory().getCustList().get(i).getName().equals(userAccount.getName())){
                    txtPpn.setText(system.getCustomerDirectory().getCustList().get(i).getPassportNum()+"");
                    txtTn.setText(system.getCustomerDirectory().getCustList().get(i).getTelNum()+"");
                }
            }
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow>=0){
            String username= (String) tblCustomer.getValueAt(selectedRow, 0);
            String pwd= (String) tblCustomer.getValueAt(selectedRow, 1);
            UserAccount user=system.getUserAccountDirectory().authenticateUser(username, pwd);
            system.getUserAccountDirectory().deleteUserAccount(user);
            system.getCustomerDirectory().deleteCustomer((String) tblCustomer.getValueAt(selectedRow, 2));
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateTblCustomer();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:

        String uname=txtUsername.getText();
        String password=txtPwd.getText();
        String name = txtName.getText();
        String ppn = txtPpn.getText();
        String tn = txtTn.getText();
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{
            system.getUserAccountDirectory().updateUserAccount(userAccount,uname,password);
            for(UserAccount ua : system.getUserAccountDirectory().getUserAccountList()){
                System.out.println(ua.getUsername());
            }
            int selectedRow = tblCustomer.getSelectedRow();
            system.getCustomerDirectory().updateCustomer((String) tblCustomer.getValueAt(selectedRow,2),name, ppn, tn);
            populateTblCustomer();
            btnCreate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnConfirm.setEnabled(false);

            txtUsername.setText("");
            txtPwd.setText("");
            txtName.setText("");
            txtPpn.setText("");
            txtTn.setText("");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        mainScreen.remove(this);
        Component[] componentArray = mainScreen.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) mainScreen.getLayout();
        layout.previous(mainScreen);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtOption;
    private javax.swing.JTextField txtPpn;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtTn;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTblCustomer() {
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        model.setRowCount(0);
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
            if ("Business.Role.CustomerRole".equals(user.getRole().toString())) {
                Object[] row = new Object[5];
                row[0] = user.getUsername();
                row[1] = user.getPassword();
                for(int i = 0;i < system.getCustomerDirectory().getCustList().size(); i++){
                    if(system.getCustomerDirectory().getCustList().get(i).getName()==null){
                        continue;
                    }else if(system.getCustomerDirectory().getCustList().get(i).getName().equals(user.getName())){
                        row[2] = user.getName();
                        row[3] = system.getCustomerDirectory().getCustList().get(i).getPassportNum();
                        row[4] = system.getCustomerDirectory().getCustList().get(i).getTelNum();
                    }
                }
                model.addRow(row);
            }
        }
    }
}
