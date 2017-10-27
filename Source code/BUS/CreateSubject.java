/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DAO.AccountDAO;
import DAO.SubjectDAO;
import DAO.TimetableOfSubjectDAO;
import POJO.Subject;
import POJO.Timetableofsubject;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author nthan
 */
public class CreateSubject extends javax.swing.JPanel {

    /**
     * Creates new form CreateSubject
     */
    public CreateSubject() {
        initComponents();
        // set Day comboBox
        for(int i = 1; i <= 31; i++){
            cb_startday.addItem(String.valueOf(i));
            cb_endday.addItem(String.valueOf(i));
        }
        // Set month combobox
        for(int i = 1; i<=12; i++){
            cb_startmonth.addItem(String.valueOf(i));
            cb_endmonth.addItem(String.valueOf(i));
        }
        // Set Year comboBox
        for(int i = 2010; i <= 2050; i++){
            cb_startyear.addItem(String.valueOf(i));
            cb_endyear.addItem(String.valueOf(i));
        }
        
        // Set hour comboBox
        for(int i = 0; i <= 24; i++){
            cb_starthour.addItem(String.valueOf(i));
            cb_endhour.addItem(String.valueOf(i));
        }
        
        // Set minute comboBox
        for(int i = 0; i <= 60; i++){
            cb_startminute.addItem(String.valueOf(i));
            cb_endminute.addItem(String.valueOf(i));
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        text_IDSub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_nameSub = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cb_startday = new javax.swing.JComboBox<>();
        cb_startmonth = new javax.swing.JComboBox<>();
        cb_startyear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_endday = new javax.swing.JComboBox<>();
        cb_endmonth = new javax.swing.JComboBox<>();
        cb_endyear = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_weekdays = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cb_starthour = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_startminute = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cb_endhour = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cb_endminute = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cb_numberweek = new javax.swing.JComboBox<>();
        btn_OK = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        text_roonname = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(500, 371));
        setPreferredSize(new java.awt.Dimension(766, 410));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("ID subject");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 118, 0, 0);
        add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 468;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 0, 0);
        add(text_IDSub, gridBagConstraints);

        jLabel2.setText("Subject name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 118, 0, 0);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Time table");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.ipadx = 476;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 118, 0, 0);
        add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 468;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        add(text_nameSub, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 27;
        gridBagConstraints.ipadx = 734;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jPanel1, gridBagConstraints);

        jLabel5.setText("Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 118, 0, 0);
        add(jLabel5, gridBagConstraints);

        cb_startday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_startdayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 4, 0, 0);
        add(cb_startday, gridBagConstraints);

        cb_startmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_startmonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 0, 0, 0);
        add(cb_startmonth, gridBagConstraints);

        cb_startyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_startyearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 4, 0, 0);
        add(cb_startyear, gridBagConstraints);

        jLabel7.setText("come");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 29, 0, 0);
        add(jLabel7, gridBagConstraints);

        cb_endday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_enddayActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 18, 0, 0);
        add(cb_endday, gridBagConstraints);

        cb_endmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_endmonthActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 2, 0, 0);
        add(cb_endmonth, gridBagConstraints);

        cb_endyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_endyearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 12, 0, 0);
        add(cb_endyear, gridBagConstraints);

        jLabel6.setText("Number of week");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 118, 0, 0);
        add(jLabel6, gridBagConstraints);

        jLabel8.setText("Weekdays");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 118, 0, 0);
        add(jLabel8, gridBagConstraints);

        cb_weekdays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 426;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(cb_weekdays, gridBagConstraints);

        jLabel9.setText("Hour");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 118, 0, 0);
        add(jLabel9, gridBagConstraints);

        cb_starthour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_starthourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 4, 0, 0);
        add(cb_starthour, gridBagConstraints);

        jLabel10.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 4, 0, 0);
        add(jLabel10, gridBagConstraints);

        cb_startminute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_startminuteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 4, 0, 0);
        add(cb_startminute, gridBagConstraints);

        jLabel11.setText("come");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 29, 0, 0);
        add(jLabel11, gridBagConstraints);

        cb_endhour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_endhourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        add(cb_endhour, gridBagConstraints);

        jLabel12.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 4, 0, 0);
        add(jLabel12, gridBagConstraints);

        cb_endminute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_endminuteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        add(cb_endminute, gridBagConstraints);

        jLabel13.setText("Roon name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 118, 0, 0);
        add(jLabel13, gridBagConstraints);

        cb_numberweek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15" }));
        cb_numberweek.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 426;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(cb_numberweek, gridBagConstraints);

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 38, 8, 0);
        add(btn_OK, gridBagConstraints);

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 25, 8, 0);
        add(btn_cancel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 476;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        add(text_roonname, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        
        // Get ID SUBJECT AND SUBJECT NAME
        String idSubject = "";
        String nameSubject = "";
        idSubject = text_IDSub.getText();
        nameSubject = text_nameSub.getText();
        if(idSubject.equals("")){
           JOptionPane.showMessageDialog(new JFrame(), "Invalid ID subject!!!",
                    "Error",JOptionPane.PLAIN_MESSAGE);
           return;
        }
        if(nameSubject.equals("")){
           JOptionPane.showMessageDialog(new JFrame(), "Invalid name subject!!!",
                    "Error",JOptionPane.PLAIN_MESSAGE);
           return;
        }
        //---------------------------------------------------------------------
        // Get StartDay and EndDay
        int sDay = Integer.parseInt(cb_startday.getSelectedItem().toString());
        int sMonth = Integer.parseInt(cb_startmonth.getSelectedItem().toString());
        int sYear = Integer.parseInt(cb_startyear.getSelectedItem().toString());
        int eDay = Integer.parseInt(cb_endday.getSelectedItem().toString());
        int eMonth = Integer.parseInt(cb_endmonth.getSelectedItem().toString());
        int eYear = Integer.parseInt(cb_endyear.getSelectedItem().toString());
        if(checklogicDatetime(sDay,sMonth,sYear,eDay,eMonth,eYear) == false){
           JOptionPane.showMessageDialog(new JFrame(), "Invalid Date!!!",
                    "Error",JOptionPane.PLAIN_MESSAGE);
           return;
        }
        //---------------------------------------------------------------------
        //Get StartHour and EndHour
        int sHour = Integer.parseInt(cb_starthour.getSelectedItem().toString());
        int sMinute = Integer.parseInt(cb_startminute.getSelectedItem().toString());
        int eHour = Integer.parseInt(cb_endhour.getSelectedItem().toString());
        int eMinute = Integer.parseInt(cb_endminute.getSelectedItem().toString());
        if(checkLogicHourStudy(sHour, sMinute, eHour, eMinute) == false){
           JOptionPane.showMessageDialog(new JFrame(), "Invalid Time!!!",
                    "Error",JOptionPane.PLAIN_MESSAGE);
           return;
        }
        //---------------------------------------------------------------------
        // Get WeekDays
        String weekDays = cb_weekdays.getSelectedItem().toString();
        //----------------------------------------------------------------------
        // Get Number of week
        int numberWeeks = Integer.parseInt(cb_numberweek.getSelectedItem().toString());
        //----------------------------------------------------------------------
        // Get Roon name
        String roonName ="";
        roonName = text_roonname.getText();
        if(roonName.equals("")){
           JOptionPane.showMessageDialog(new JFrame(), "Invalid roon name!!!",
                    "Error",JOptionPane.PLAIN_MESSAGE);
           return;
        }
        //----------------------------------------------------------------------
        
        // ADD Subject in DATABASE
        POJO.Subject subject = new  POJO.Subject(idSubject,
                AccountDAO.getInformationAccount(Login.userNamelocal),nameSubject,
                    null, null);
        SubjectDAO.addSubject(subject);
        //----------------------------------------------------------------------
        // Add TimeTable in DATABASE
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, sYear);
        cal.set(Calendar.MONTH, sMonth - 1);  
        cal.set(Calendar.DAY_OF_MONTH, sDay);
        Date sDate = cal.getTime();
        cal.set(Calendar.YEAR, eYear);
        cal.set(Calendar.MONTH, eMonth - 1);
        cal.set(Calendar.DAY_OF_MONTH, eDay);
        Date eDate = cal.getTime();
        String hourStart = String.valueOf(sHour) + " : " + String.valueOf(sMinute);
        String hourEnd = String.valueOf(eHour) + " : " + String.valueOf(eMinute);
        
        Timetableofsubject timetable = new Timetableofsubject(String.valueOf(TimetableOfSubjectDAO.getIDMax()+1),
        subject, sDate, eDate, numberWeeks, weekDays, hourStart, hourEnd, roonName);
        if(TimetableOfSubjectDAO.addTimeTableOfSubject(timetable) == true){
            JOptionPane.showMessageDialog(new JFrame(), "Add Subject success!!!",
                    "Error",JOptionPane.PLAIN_MESSAGE);
        }
     //   ----------------------------------------------------------------------
    }//GEN-LAST:event_btn_OKActionPerformed


    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void cb_startdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_startdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_startdayActionPerformed

    private void cb_startmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_startmonthActionPerformed
        setDateStart();
    }//GEN-LAST:event_cb_startmonthActionPerformed

    private void cb_startyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_startyearActionPerformed
        setDateStart();
    }//GEN-LAST:event_cb_startyearActionPerformed

    private void cb_enddayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_enddayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_enddayActionPerformed

    private void cb_endmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_endmonthActionPerformed
        setDateEnd();
    }//GEN-LAST:event_cb_endmonthActionPerformed

    private void cb_endyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_endyearActionPerformed
        setDateEnd();
    }//GEN-LAST:event_cb_endyearActionPerformed

    private void cb_starthourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_starthourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_starthourActionPerformed

    private void cb_startminuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_startminuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_startminuteActionPerformed

    private void cb_endhourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_endhourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_endhourActionPerformed

    private void cb_endminuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_endminuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_endminuteActionPerformed

    // set Date Start
    public void setDateStart(){
        try{
            int Day = Integer.parseInt(cb_startday.getSelectedItem().toString());
            int Month = Integer.parseInt(cb_startmonth.getSelectedItem().toString());
            int year = Integer.parseInt(cb_startyear.getSelectedItem().toString());
            if(Day < MaxDayOfMonth(Month, year)){
                cb_startday.removeAllItems();
                SetStartDay();
                cb_startday.setSelectedItem(String.valueOf(Day));
            }
            if(Day > MaxDayOfMonth(Month, year)){
                cb_startday.removeAllItems();
                SetStartDay();
            }
        }
        catch(Exception ex)
        {

        }
    }
    
    // set Date End
    public void setDateEnd(){
               try{
            int Day = Integer.parseInt(cb_endday.getSelectedItem().toString());
            int Month = Integer.parseInt(cb_endmonth.getSelectedItem().toString());
            int year = Integer.parseInt(cb_endyear.getSelectedItem().toString());
            if(Day < MaxDayOfMonth(Month, year)){
                cb_endday.removeAllItems();
                SetEndDay();
                cb_endday.setSelectedItem(String.valueOf(Day));
            }
            if(Day > MaxDayOfMonth(Month, year)){
                cb_endday.removeAllItems();
                SetEndDay();
            }
           }
           catch(Exception ex)
           {

           }
    }
    
    
    // find MaxDay of Month
    public int MaxDayOfMonth(int month,int year){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }
        else if(month == 2){
            if(checkYearLeap(year) == true)
                return 29;
            else return 28;
        }
        return 32;
    }
    
        // CHECK YEAR LEAP
    public boolean checkYearLeap(int Year){
        if(((Year % 4 == 0) && (Year % 100 != 0)) || Year % 400 == 0 )
            return true;
        return false;
    }
    
    // Check logicDay
    public boolean checklogicDatetime(int dayB, int monthB, int yearB, int dayT, int monthT, int yearT){
        if(yearT > yearB)
            return true;
        if(yearB == yearT){
            if(monthT > monthB)
                return true;
            if(monthB == monthT){
                if(dayT > dayB)
                    return true;
            }
        }
            
        return false;
    }
    
    // Set Year START
    public void SetStartYear(){
        for(int i = 2010; i <= 2050; i++){
            cb_startyear.addItem(String.valueOf(i));
        }
    }
    
   // SET Month START 
    public void SetStartMonth(){
        for( int i = 1; i <= 12; i++){
            cb_startmonth.addItem(String.valueOf(i));
        }
    }
    
    public void SetStartDay(){
        int month = Integer.parseInt((String)cb_startmonth.getSelectedItem());
        if( month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 || month == 12) 
        {
            for(int i = 1; i<= 31; i++){
                cb_startday.addItem(String.valueOf(i));
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            for(int i = 1; i <= 30; i++){
                cb_startday.addItem(String.valueOf(i));
            }
        }
        else if(month == 2){
            if(checkYearLeap(Integer.parseInt((String)(cb_startyear.getSelectedItem()))) == true ){
                for(int i = 1; i <= 29; i++){
                   cb_startday.addItem(String.valueOf(i));
            }
            }
            else{
                 for(int i = 1; i <= 28; i++){
                     cb_startday.addItem(String.valueOf(i));
                  }
             }
        }
        else{
             for(int i = 1; i<= 31; i++){
                cb_startday.addItem(String.valueOf(i));
            }
        }
    }
            // Set Year end
    public void SetEndYear(){
        for(int i = 2001; i <= 2030; i++){
            cb_endyear.addItem(String.valueOf(i));
        }
    }
    // SET Month end 
    public void SetENDMonth(){
        for( int i = 2; i <= 12; i++){
            cb_endmonth.addItem(String.valueOf(i));
        }
    }
    
        // Set Year end
    public void SetEndDay(){
        int month = Integer.parseInt((String)cb_endmonth.getSelectedItem());
        if( month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 || month == 12) 
        {
            for(int i = 1; i<= 31; i++){
                cb_endday.addItem(String.valueOf(i));
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            for(int i = 1; i <= 30; i++){
                cb_endday.addItem(String.valueOf(i));
            }
        }
        else if(month == 2){
            if(checkYearLeap(Integer.parseInt((String)(cb_endyear.getSelectedItem()))) == true ){
                for(int i = 1; i <= 29; i++){
                   cb_endday.addItem(String.valueOf(i));
            }
            }
            else{
                 for(int i = 1; i <= 28; i++){
                     cb_endday.addItem(String.valueOf(i));
                  }
             }
        }
        else{
             for(int i = 2; i<= 31; i++){
                cb_endday.addItem(String.valueOf(i));
            }}
    }
    
    
    // check Logic Hour
    public boolean checkLogicHourStudy(int hourB, int minuteB, int hourT, int minuteT){
        if(hourT > hourB){
            return true;
        }
        if(hourT == hourB){
            if(minuteT > minuteB)
                return true;
        }
        return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_OK;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JComboBox<String> cb_endday;
    private javax.swing.JComboBox<String> cb_endhour;
    private javax.swing.JComboBox<String> cb_endminute;
    private javax.swing.JComboBox<String> cb_endmonth;
    private javax.swing.JComboBox<String> cb_endyear;
    private javax.swing.JComboBox<String> cb_numberweek;
    private javax.swing.JComboBox<String> cb_startday;
    private javax.swing.JComboBox<String> cb_starthour;
    private javax.swing.JComboBox<String> cb_startminute;
    private javax.swing.JComboBox<String> cb_startmonth;
    private javax.swing.JComboBox<String> cb_startyear;
    private javax.swing.JComboBox<String> cb_weekdays;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text_IDSub;
    private javax.swing.JTextField text_nameSub;
    private javax.swing.JTextField text_roonname;
    // End of variables declaration//GEN-END:variables
}
