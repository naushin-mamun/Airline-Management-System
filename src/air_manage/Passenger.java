package air_manage;

import java.sql.Connection;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Passenger extends javax.swing.JFrame {

    public Passenger() {
        initComponents();
        DisplayPassengers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PassNumTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PassengersTable = new javax.swing.JTable();
        PAddressTb = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        GenCb = new javax.swing.JComboBox<>();
        NatCb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PNameTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PPhoneTb = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel7.setText("Phone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 541, -1, -1));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel8.setText("Passenger List");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 87, -1, -1));

        jPanel2.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 127, -1, -1));

        jPanel3.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1385, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 127, -1, -1));

        PassNumTb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        getContentPane().add(PassNumTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 447, 277, 45));

        PassengersTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PassengersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PId", "PName", "PNat", "PGen", "PPass", "PAdd", "PPhone"
            }
        ));
        PassengersTable.setGridColor(new java.awt.Color(204, 102, 0));
        PassengersTable.setRowHeight(25);
        PassengersTable.setSelectionBackground(new java.awt.Color(204, 153, 0));
        PassengersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PassengersTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 148, 1310, 430));

        PAddressTb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        PAddressTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAddressTbActionPerformed(evt);
            }
        });
        getContentPane().add(PAddressTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 628, 277, 126));

        jPanel1.setBackground(new java.awt.Color(178, 136, 80));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("SAFE-TAKE AIR MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(668, 668, 668)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1957, -1));

        GenCb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        GenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        GenCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenCbActionPerformed(evt);
            }
        });
        getContentPane().add(GenCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 359, 179, 42));

        NatCb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        NatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladesh", "India", "Pakisthan", "Thailand", "Malaysia", "Korea", "Japan", "USA", "Englang", "Nepal", "Canada" }));
        getContentPane().add(NatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 273, 179, 42));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel2.setText("Manage Passengers");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 87, -1, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel3.setText("Passenger Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel4.setText("Nationality");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 276, -1, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 362, -1, -1));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel6.setText("Passport Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 451, -1, -1));

        PNameTb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        PNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNameTbActionPerformed(evt);
            }
        });
        getContentPane().add(PNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 196, 277, 45));

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 673, -1, -1));

        PPhoneTb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        getContentPane().add(PPhoneTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 537, 277, 45));

        jPanel5.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 127, -1, -1));

        SaveBtn.setBackground(new java.awt.Color(102, 102, 0));
        SaveBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(240, 240, 240));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 810, 144, 56));

        EditBtn.setBackground(new java.awt.Color(102, 102, 0));
        EditBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(240, 240, 240));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        getContentPane().add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 810, 142, 54));

        DeleteBtn.setBackground(new java.awt.Color(102, 102, 0));
        DeleteBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(240, 240, 240));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 800, -1, 56));

        BackBtn.setBackground(new java.awt.Color(102, 102, 0));
        BackBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(240, 240, 240));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 800, 121, 57));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\Project\\main wave.png")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -110, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PAddressTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAddressTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAddressTbActionPerformed

    private void PNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNameTbActionPerformed

    private void GenCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenCbActionPerformed

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    private void DisplayPassengers()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from passengers");
            PassengersTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            
        }
    }
    int PassId = 0;
    private void CountPassengers()
    {
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(PId) from passengers");
            Rs1.next();
            PassId = Rs1.getInt(1)+1;
        }catch(Exception e)
        {           
        }
    }
    private void Clear()
    {
        PNameTb.setText("");
        PassNumTb.setText("");
        PAddressTb.setText("");
        PPhoneTb.setText("");
    }
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(PNameTb.getText().isEmpty() || PassNumTb.getText().isEmpty() || PAddressTb.getText().isEmpty() || PPhoneTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "MIssing Information");
        } 
        else 
        {
              try{
                   CountPassengers();
                   
                   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                   PreparedStatement Add = Con.prepareStatement("insert into passengers values(?,?,?,?,?,?,?)");
                   Add.setInt(1,PassId);
                   Add.setString(2, PNameTb.getText());
                   Add.setString(3, NatCb.getSelectedItem().toString());
                   Add.setString(4, GenCb.getSelectedItem().toString());
                   Add.setString(5, PassNumTb.getText());
                   Add.setString(6, PAddressTb.getText());
                   Add.setString(7, PPhoneTb.getText());
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Passenger Added");
                   Con.close();
                   DisplayPassengers();
                   Clear();
              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        }  
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        
    }//GEN-LAST:event_BackBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void PassengersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)PassengersTable.getModel();
        int MyIndex = PassengersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        PNameTb.setText(model.getValueAt(MyIndex,1).toString());
        NatCb.setSelectedItem(model.getValueAt(MyIndex,2).toString());
        GenCb.setSelectedItem(model.getValueAt(MyIndex,3).toString());
        PassNumTb.setText(model.getValueAt(MyIndex,4).toString());
        PAddressTb.setText(model.getValueAt(MyIndex,5).toString());
        PPhoneTb.setText(model.getValueAt(MyIndex,6).toString());
        
    }//GEN-LAST:event_PassengersTableMouseClicked
    
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (Key==0)
        {
            JOptionPane.showMessageDialog(this, "Select A Passenger");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query="Delete from passengers where PId="+Key;
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Passenger Deleted");
                DisplayPassengers();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked
    int Key = 0;
    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
         if(Key==0)
        {
            JOptionPane.showMessageDialog(this, "Select A Passenger");
        } 
        else 
        {
              try{
                  // CountPassengers();
                   
                   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                   String Query = "Update passengers set PName=?,PNat=?,PGen=?,Ppass=?,PAdd=?,Pphone=? where PId=?";
                   
                   PreparedStatement Add = Con.prepareStatement(Query);
                   Add.setInt(7,Key);
                   Add.setString(1, PNameTb.getText());
                   Add.setString(2, NatCb.getSelectedItem().toString());
                   Add.setString(3, GenCb.getSelectedItem().toString());
                   Add.setString(4, PassNumTb.getText());
                   Add.setString(5, PAddressTb.getText());
                   Add.setString(6, PPhoneTb.getText());
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Passenger Updated");
                   Con.close();
                   DisplayPassengers();
                   Clear();
              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenCb;
    private javax.swing.JComboBox<String> NatCb;
    private javax.swing.JTextField PAddressTb;
    private javax.swing.JTextField PNameTb;
    private javax.swing.JTextField PPhoneTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JTable PassengersTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
