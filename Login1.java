package msc;


import javax.swing.JFrame;


public class Login1 extends javax.swing.JFrame {

    
    public Login1() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbpassword = new javax.swing.JLabel();
        lbusername = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        lbLogin = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mobile Service Center");
        setMinimumSize(new java.awt.Dimension(400, 350));
        getContentPane().setLayout(null);

        lbpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbpassword.setForeground(new java.awt.Color(255, 255, 255));
        lbpassword.setText("Password");
        getContentPane().add(lbpassword);
        lbpassword.setBounds(90, 140, 90, 20);

        lbusername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbusername.setForeground(new java.awt.Color(255, 255, 255));
        lbusername.setText("Username");
        getContentPane().add(lbusername);
        lbusername.setBounds(90, 110, 90, 20);
        getContentPane().add(PasswordField);
        PasswordField.setBounds(190, 140, 90, 26);
        getContentPane().add(username);
        username.setBounds(190, 110, 90, 26);

        submit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(190, 170, 90, 29);

        adminLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminLogin.setText("Admin Login");
        adminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginActionPerformed(evt);
            }
        });
        getContentPane().add(adminLogin);
        adminLogin.setBounds(270, 260, 110, 29);

        lbLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Login");
        getContentPane().add(lbLogin);
        lbLogin.setBounds(0, 30, 400, 30);

        lbError.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbError.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbError);
        lbError.setBounds(14, 210, 360, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/msc/msc.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -190, 960, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
		String user = username.getText();
                String pass = PasswordField.getText();
                if(pass.contains("12345") &&  user.contains("user")) {
                    //close();
                    lbError.setText(null);
                    loginHome lh = new loginHome();
                    setVisible(false);
                    lh.setVisible(true);
                    //setContentPane(admin);
                    
                    
                }
                else
                {
                    lbError.setText("Invald username/password");
                }
					
    }//GEN-LAST:event_submitActionPerformed

    private void adminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginActionPerformed
        // TODO add your handling code here:
                
                adminLogin admin = new adminLogin();
                setVisible(false);
                admin.setVisible(true);
                //close();
            
    }//GEN-LAST:event_adminLoginActionPerformed

   
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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton adminLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbpassword;
    private javax.swing.JLabel lbusername;
    private javax.swing.JButton submit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
