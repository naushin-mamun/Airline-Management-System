package air_manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Flights extends javax.swing.JFrame {

    public Flights() {
        initComponents();
        DisplayFlight();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SeatsTb = new javax.swing.JTextField();
        FCodeTb = new javax.swing.JTextField();
        FDestCb = new javax.swing.JComboBox<>();
        FSourceCb = new javax.swing.JComboBox<>();
        FDate = new org.netbeans.modules.form.InvalidComponent();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(178, 136, 80));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("SAFE-TAKE AIR MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(619, 619, 619)
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, -1));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel2.setText("Manage Flights");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel3.setText("Flight Code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel4.setText("Source");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel5.setText("Destination");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel6.setText("Take of Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel7.setText("Number of Seats");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 253, -1));

        SeatsTb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        getContentPane().add(SeatsTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 250, 180, 45));

        FCodeTb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        FCodeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeTbActionPerformed(evt);
            }
        });
        getContentPane().add(FCodeTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, 45));

        FDestCb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        FDestCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladesh", "India", "Pakisthan", "Thailand", "Malaysia", "Korea", "Japan", "USA", "Englang", "Nepal", "Canada" }));
        getContentPane().add(FDestCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 170, 42));

        FSourceCb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        FSourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladesh", "India", "Pakisthan", "Thailand", "Malaysia", "Korea", "Japan", "USA", "Englang", "Nepal", "Canada" }));
        getContentPane().add(FSourceCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 160, 42));

        getContentPane().add(FDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 250, 190, 45));

        SaveBtn.setBackground(new java.awt.Color(102, 102, 0));
        SaveBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(240, 240, 240));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 880, 150, 60));

        EditBtn.setBackground(new java.awt.Color(102, 102, 0));
        EditBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(240, 240, 240));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        getContentPane().add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 880, 140, 60));

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
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 880, 140, 60));

        DeleteBtn.setBackground(new java.awt.Color(102, 102, 0));
        DeleteBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(240, 240, 240));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        getContentPane().add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 880, 140, 60));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel8.setText("Flight List");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        jPanel3.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 170, -1));

        FlightsTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FlightsTable.setRowHeight(25);
        FlightsTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        FlightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 1770, 340));

        jPanel4.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 290, 10));

        jPanel5.setBackground(new java.awt.Color(204, 153, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 180, -1));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FCodeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeTbActionPerformed
        
    }//GEN-LAST:event_FCodeTbActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        
    }//GEN-LAST:event_BackBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        MainFrame main = new MainFrame();
        main.show();
        
        dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    private void DisplayFlight()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from flights");
            FlightsTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            
        }
    }
   private void Clear()
    {
        FCodeTb.setText("");
        SeatsTb.setText("");
       
    } 
    
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
         if(FCodeTb.getText().isEmpty() || FSourceCb.getSelectedIndex()==-1 || FDestCb.getSelectedIndex()==-1 || SeatsTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "MIssing Information");
        } 
        else 
        {
              try{
                  
                   
                   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                   PreparedStatement Add = Con.prepareStatement("insert into flights values(?,?,?,?,?)");
                   Add.setString(1,FCodeTb.getText());
                   Add.setString(2, FSourceCb.getSelectedItem().toString());
                   Add.setString(3, FDestCb.getSelectedItem().toString());
                   Add.setString(4, FDate.getDate().toString());
                   Add.setInt(5, Integer.valueOf(SeatsTb.getText()));
                   
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Flight Added");
                   Con.close();
                   DisplayFlight();
                   Clear();
              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        }  
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (Key=="")
        {
            JOptionPane.showMessageDialog(this, "Select A Flight");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query="Delete from flights where FICode='"+Key+" ' ";
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Flight Deleted");
                DisplayFlight();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked
    String  Key= "";
    private void FlightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)FlightsTable.getModel();
        int MyIndex = FlightsTable.getSelectedRow();
        Key =model.getValueAt(MyIndex, 0).toString();
        
        FSourceCb.setSelectedItem(model.getValueAt(MyIndex,1).toString());
        FDestCb.setSelectedItem(model.getValueAt(MyIndex,2).toString());      
        SeatsTb.setText(model.getValueAt(MyIndex,4).toString());    
    }//GEN-LAST:event_FlightsTableMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
         if(Key=="")
        {
            JOptionPane.showMessageDialog(this, "Select A Flight");
        } 
        else 
        {
              try{
                  // CountPassengers();
                   
                   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                   String Query = "Update flights set FISource=?,FIDest=?,FIDate=?,FISeats=? where FICode=?";
                   
                   PreparedStatement Add = Con.prepareStatement(Query);
                   Add.setString(5,Key);
                   Add.setString(1, FSourceCb.getSelectedItem().toString());
                   Add.setString(2, FDestCb.getSelectedItem().toString());
                   Add.setString(3, FDate.getDate().toString());
                   Add.setString(4, SeatsTb.getText());
                   
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Flight Updated");
                   Con.close();
                   DisplayFlight();
                   Clear();
              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField FCodeTb;
    private org.netbeans.modules.form.InvalidComponent FDate;
    private javax.swing.JComboBox<String> FDestCb;
    private javax.swing.JComboBox<String> FSourceCb;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField SeatsTb;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
