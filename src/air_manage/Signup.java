package air_manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.management.Query;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        UserTb = new javax.swing.JTextField();
        PassTb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        jPanel1.setBackground(new java.awt.Color(178, 136, 80));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("Sign-up Form");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setText("User Name :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel9.setText("Password : ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        UserTb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(UserTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 280, 44));

        PassTb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(PassTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 280, 43));

        jButton1.setBackground(new java.awt.Color(178, 136, 80));
        jButton1.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Sign Up");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        SubmitBtn.setBackground(new java.awt.Color(178, 136, 80));
        SubmitBtn.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, 40));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel12.setText("SAFE-TAKE AIR MANAGEMENT");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 471, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\Project\\toppng.com-gold-particles-1201x816.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 780, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(270, 270, 270))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sign sign = new Sign();
        sign.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void Clear()
    {
        UserTb.setText("");
        PassTb.setText("");
        
    }
    int UId = 0;
    private void CountUser()
    {
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(User) from userpass");
            Rs1.next();
            UId = Rs1.getInt(1)+1;
        }catch(Exception e)
        {            
        }
    }
    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
         if(UserTb.getText().isEmpty() || PassTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "MIssing Information");
        } 
        else 
        {
              try{
                   CountUser();
                   
                   Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                   PreparedStatement Add = Con.prepareStatement("insert into userpass values(?,?)");
                   
                   
                   Add.setString(1,UserTb.getText());
                   Add.setString(2, PassTb.getText());
               
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Account Submitted");
                   Con.close();
                   
                   Clear();
              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        } 
    }//GEN-LAST:event_SubmitBtnActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PassTb;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField UserTb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
