package air_manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Cancellation extends javax.swing.JFrame {

    public Cancellation() {
        initComponents();
        GetTicket();
        FCodeTb.setEditable(false);
        DisplayCan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TIdCb = new javax.swing.JComboBox<>();
        FCodeTb = new javax.swing.JTextField();
        CDate = new com.toedter.calendar.JDateChooser();
        CancelBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CancellationTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jTextField3.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 0));
        jButton2.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Reset");

        jButton5.setBackground(new java.awt.Color(102, 102, 0));
        jButton5.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setText("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(178, 136, 80));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("SAFE-TAKE AIR MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(307, 307, 307))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel11.setText("Ticket Cancellation");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 82, -1, -1));

        jPanel3.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 139, 317, -1));

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel12.setText("Ticket ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 191, -1, -1));

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel13.setText("Flight Code");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel14.setText("Date ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

        TIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIdCbActionPerformed(evt);
            }
        });
        getContentPane().add(TIdCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 186, 183, 45));

        FCodeTb.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        FCodeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeTbActionPerformed(evt);
            }
        });
        getContentPane().add(FCodeTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 256, 183, 45));

        CDate.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        getContentPane().add(CDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 183, 45));

        CancelBtn.setBackground(new java.awt.Color(102, 102, 0));
        CancelBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(240, 240, 240));
        CancelBtn.setText("Cancel");
        CancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelBtnMouseClicked(evt);
            }
        });
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        ResetBtn.setBackground(new java.awt.Color(102, 102, 0));
        ResetBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(240, 240, 240));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        BackBtn.setBackground(new java.awt.Color(102, 102, 0));
        BackBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(240, 240, 240));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, -1, -1));

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel15.setText("Cancellation List");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 464, -1, -1));

        jPanel4.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 506, 275, -1));

        CancellationTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CancellationTable.setModel(new javax.swing.table.DefaultTableModel(
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
        CancellationTable.setGridColor(new java.awt.Color(255, 153, 0));
        CancellationTable.setRowHeight(25);
        CancellationTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jScrollPane1.setViewportView(CancellationTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 527, 1140, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\Project\\New folder\\Inkedwave.jpg")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setInheritsPopupMenu(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        jPanel5.setBackground(new java.awt.Color(178, 136, 80));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1190, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 1190, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FCodeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeTbActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        MainFrame main = new MainFrame();
        main.show();       
        dispose();
        
        
    }//GEN-LAST:event_BackBtnActionPerformed
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    private void GetTicket()
    {
        try{
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
             St=Con.createStatement();
             String Query = "select * from bookings";
             Rs=St.executeQuery(Query);
             while(Rs.next())
             {
                 String T=Rs.getString("TicketId");
                 TIdCb.addItem(T);
             }
        }catch(Exception e){
            
        }
    }
    private void GetFCode()
    {
        String Query="select * from bookings where TicketId = "+TIdCb.getSelectedItem().toString();
        Statement St;
        ResultSet Rs;
        try{
          Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          St=Con.createStatement();
          Rs=St.executeQuery(Query);
          if(Rs.next())
          {
              FCodeTb.setText(Rs.getString("FICode"));
              
          }
        }catch(Exception e) {
            
        }
    }
      private void DisplayCan()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from cancellation");
            CancellationTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            
        }
    }
    int CId = 0;
    private void CountCanc()
    {
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(CancId) from cancellation");
            Rs1.next();
            CId = Rs1.getInt(1)+1;
        }catch(Exception e)
        {
            
        }
    }
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
       FCodeTb.setText("");
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void TIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIdCbActionPerformed
        GetFCode();
    }//GEN-LAST:event_TIdCbActionPerformed
    private void Cancel()
    {
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query="Delete from bookings where TicketId="+TIdCb.getSelectedItem();
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                //JOptionPane.showMessageDialog(this, "Flight Deleted");
                //DisplayFlight();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }
    private void CancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBtnMouseClicked
          if(FCodeTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "MIssing Information");
        } 
        else 
        {
              try{
                   CountCanc();
                   
                   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                   PreparedStatement Add = Con.prepareStatement("insert into cancellation values(?,?,?,?)");
                   Add.setInt(1,CId);
                   Add.setInt(2, Integer.valueOf(TIdCb.getSelectedItem().toString()));
                   Add.setString(3, FCodeTb.getText());
                   Add.setString(4, CDate.getDate().toString());
                   
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Ticket Cancelled");
                   Con.close();
                   Cancel();
                   DisplayCan();
                   GetTicket();
                   
;              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        }  
    }//GEN-LAST:event_CancelBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private com.toedter.calendar.JDateChooser CDate;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTable CancellationTable;
    private javax.swing.JTextField FCodeTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JComboBox<String> TIdCb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
