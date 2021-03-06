package BUS;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import DAO.AccountDAO;
import DAO.InformationaccountDAO;
import DAO.StudentDAO;
import DAO.SubjectDAO;
import DAO.TimetableOfSubjectDAO;
import java.util.List;
import POJO.Account;
import POJO.Informationaccount;
import POJO.Studentofsubject;
import POJO.StudentofsubjectId;
import POJO.Subject;
import POJO.Timetableofsubject;
import com.sun.corba.se.impl.ior.ObjectKeyFactoryImpl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nthan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static String userNamelocal;
    public static int Type = -1; // 0: SV 1 GV
    public Login() {
        initComponents();
        setTitle("Personal account");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_tittle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pn_areainput = new javax.swing.JPanel();
        pn_image = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pn_keyboard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_User = new javax.swing.JTextField();
        btn_Cancel = new javax.swing.JButton();
        text_Password = new javax.swing.JPasswordField();
        btn_Help = new javax.swing.JButton();
        btn_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        pn_tittle.setBackground(new java.awt.Color(0, 51, 51));
        pn_tittle.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jLabel2.setAlignmentX(0.5F);
        pn_tittle.add(jLabel2, java.awt.BorderLayout.CENTER);

        pn_areainput.setBackground(new java.awt.Color(255, 255, 255));
        pn_areainput.setLayout(new javax.swing.BoxLayout(pn_areainput, javax.swing.BoxLayout.LINE_AXIS));

        pn_image.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\SUBJECT\\JAVA\\BT3\\QuanLySinhVien\\image\\login.png")); // NOI18N

        javax.swing.GroupLayout pn_imageLayout = new javax.swing.GroupLayout(pn_image);
        pn_image.setLayout(pn_imageLayout);
        pn_imageLayout.setHorizontalGroup(
            pn_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_imageLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(39, 39, 39))
        );
        pn_imageLayout.setVerticalGroup(
            pn_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_imageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pn_areainput.add(pn_image);

        pn_keyboard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("User name");

        jLabel5.setText("Password");

        text_User.setText("1412147");

        btn_Cancel.setText("Cancel");
        btn_Cancel.setAlignmentX(0.5F);
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        text_Password.setText("missing123");
        text_Password.setToolTipText("");

        btn_Help.setText("Help");
        btn_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HelpActionPerformed(evt);
            }
        });

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_keyboardLayout = new javax.swing.GroupLayout(pn_keyboard);
        pn_keyboard.setLayout(pn_keyboardLayout);
        pn_keyboardLayout.setHorizontalGroup(
            pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_keyboardLayout.createSequentialGroup()
                .addGroup(pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_keyboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_User, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(text_Password)))
                    .addGroup(pn_keyboardLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btn_Cancel)
                        .addGap(42, 42, 42)
                        .addComponent(btn_Help)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        pn_keyboardLayout.setVerticalGroup(
            pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_keyboardLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(text_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(text_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pn_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancel)
                    .addComponent(btn_Help)
                    .addComponent(btn_OK))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pn_areainput.add(pn_keyboard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_tittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_areainput, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_areainput, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        String userName = null;
        String password = null;
        userNamelocal = text_User.getText();
        userName = text_User.getText();
        char[]temp  = text_Password.getPassword();
        password = new String(temp);
        if(AccountDAO.checkFirstLogin(userName, password) == true){  
            pn_areainput.removeAll();
            pn_tittle.removeAll();
            pn_areainput.add(new ChangePass());
            setVisible(true);
            return;
        }
        
        if(AccountDAO.login(userName, password) == true){
            Type = AccountDAO.checkTypeAccount(userName); // get Type of account
            JOptionPane.showMessageDialog(new JFrame(), "Login Successful",
                    "Notification",JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(new JFrame(), "Login Unsuccessful",
                    "Notification",JOptionPane.PLAIN_MESSAGE);
        }
        
        // Switch screen
        switch(Type){
            case 0:
            {
                setVisible(false);
                new SinhVien().setVisible(true);               
                break;
            }
            case 1:
            {
                setVisible(false);
                new GiaoVu().setVisible(true);
                break;
            }
             default:
                    break;
        }
    }//GEN-LAST:event_btn_OKActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        else {
            // code to coutinue
        }
    }//GEN-LAST:event_btn_CancelActionPerformed

    public void createChangePass(){
            pn_areainput.removeAll();
            pn_tittle.removeAll();
            pn_areainput.add(new ChangePass());
    }
    private void btn_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HelpActionPerformed
        JOptionPane.showMessageDialog(null, "Use your account to log into the program.\n"
                + "If you Don't have an account then.\n"
                + "The default Username and password are your student ID."
               ,
                    "Help",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btn_HelpActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true); 

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Help;
    private javax.swing.JButton btn_OK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pn_areainput;
    private javax.swing.JPanel pn_image;
    private javax.swing.JPanel pn_keyboard;
    private javax.swing.JPanel pn_tittle;
    private javax.swing.JPasswordField text_Password;
    private javax.swing.JTextField text_User;
    // End of variables declaration//GEN-END:variables
}
