/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.AccountDAO;
import DAO.StudentDAO;
import DAO.SubjectDAO;
import POJO.Account;
import POJO.Studentofsubject;
import POJO.StudentofsubjectId;
import javax.security.auth.Subject;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nthan
 */
public class AddWrite extends javax.swing.JPanel {

    /**
     * Creates new form AddWrite
     */
    public AddWrite() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_IDSub = new javax.swing.JTextField();
        text_username = new javax.swing.JTextField();
        btn_OK = new javax.swing.JButton();

        jLabel1.setText("ID Subject");

        jLabel2.setText("User name");

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(text_IDSub)
                        .addComponent(text_username, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_IDSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_OK)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        String idSubject ="";
        String userName = "";
        idSubject = text_IDSub.getText();
        userName = text_username.getText();
        if(SubjectDAO.getInformationSubjectByID(idSubject) == null){
             JOptionPane.showMessageDialog(new JFrame(), "Invalid ID Subject",
                    "Error",JOptionPane.PLAIN_MESSAGE);
             return;
        }
        if(AccountDAO.getInformationAccount(userName) == null){
                         JOptionPane.showMessageDialog(new JFrame(), "Invalid User name",
                    "Error",JOptionPane.PLAIN_MESSAGE);
                         return;
        }
        POJO.Subject subject = SubjectDAO.getInformationSubjectByID(idSubject);
        if(subject == null)
            return;    
        Account account = null;
        StudentofsubjectId sbId = null;
        try{
            account = AccountDAO.getInformationAccount(userName);
            System.out.println(account.getUserName());    
            sbId =  new StudentofsubjectId(subject.getId(), account.getUserName());
        }
        catch(Exception e){
            System.out.println("fail");
        }
        Studentofsubject studentOfSubject = new Studentofsubject(sbId, account,subject,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        if(StudentDAO.addStudentOfSubject(studentOfSubject)== true){
           JOptionPane.showMessageDialog(new JFrame(), "Add success",
                    "Notification",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(new JFrame(), "Add fail",
                    "Notification",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btn_OKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField text_IDSub;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}
