/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.AccountDAO;
import DAO.StudentDAO;
import DAO.SubjectDAO;
import POJO.Studentofsubject;
import POJO.StudentofsubjectId;
import POJO.Subject;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nthan
 */
public class GVView extends javax.swing.JPanel {

    /**
     * Creates new form GVView
     */
    public GVView() {
        initComponents();
        InitlistSubject();  
        setVisible(true);
    }

        // Init cbListSubject
    public void InitlistSubject(){
        List<Subject> list = SubjectDAO.getListSubjet();
        if(list.size() == 0){
            cb_Subject.setSelectedItem("No Subject");
            return;
        }
        for(int i = 0; i < list.size(); i++){
            cb_Subject.addItem(list.get(i).getId() + " - "  + list.get(i).getName());
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        pn_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_view = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cb_Subject = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        table_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_viewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_view);
        if (table_view.getColumnModel().getColumnCount() > 0) {
            table_view.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        javax.swing.GroupLayout pn_tableLayout = new javax.swing.GroupLayout(pn_table);
        pn_table.setLayout(pn_tableLayout);
        pn_tableLayout.setHorizontalGroup(
            pn_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        pn_tableLayout.setVerticalGroup(
            pn_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_tableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        jLabel1.setText("SUBJET");

        cb_Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cb_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cb_SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SubjectActionPerformed
        table_view.removeAll();
        DefaultTableModel model = (DefaultTableModel) table_view.getModel();
        model.getDataVector().removeAllElements();
        String[]Temp  = cb_Subject.getSelectedItem().toString().split(" ", 2);
        String iDSubject = Temp[0];
        Subject subject = SubjectDAO.getInformationSubjectByID(iDSubject);
        List<Studentofsubject> list = StudentDAO.getListStudentByIdSubject(iDSubject);
        if(list.size() == 0){
           model.addRow(new Object[]{"No Student",
                false,false,false,
                false,false,false,false,false,false,
                false,false,false,false,false,false}); 
        }
        for(int i = 0; i < list.size(); i++){
            boolean week1 = false;
            boolean week2 = false;
            boolean week3 = false;
            boolean week4 = false;
            boolean week5 = false;
            boolean week6 = false;
            boolean week7 = false;
            boolean week8 = false;
            boolean week9 = false;
            boolean week10 = false;
            boolean week11 = false;
            boolean week12 = false;
            boolean week13 = false;
            boolean week14 = false;
            boolean week15 = false;
            if(list.get(i).getIdtuan1() == 1){
                week1 = true;
            }
            if(list.get(i).getIdtuan2() == 1){
                week2 = true;
            }
            if(list.get(i).getIdtuan3() == 1){
                week3 = true;
            }
            if(list.get(i).getIdtuan4() == 1){
                week4 = true;
            }
            if(list.get(i).getIdtuan5() == 1){
                week5 = true;
            }
            if(list.get(i).getIdtuan6() == 1){
                week6 = true;
            }
            if(list.get(i).getIdtuan7() == 1){
                week7 = true;
            }
            if(list.get(i).getIdtuan8() == 1){
                week8 = true;
            }
            if(list.get(i).getIdtuan9() == 1){
                week9 = true;
            }
            if(list.get(i).getIdtuan10() == 1){
                week10 = true;
            }
            if(list.get(i).getIdtuan11() == 1){
                week11 = true;
            }
            if(list.get(i).getIdtuan12() == 1){
                week12 = true;
            }
            if(list.get(i).getIdtuan13() == 1){
                week13 = true;
            }
            if(list.get(i).getIdtuan14() == 1){
                week14 = true;
            }
            if(list.get(i).getIdtuan15() == 1){
                week15 = true;
            }
            
            
            model.addRow(new Object[]{list.get(i).getAccount().getUserName(),
                week1,week2,week3,
                week4,week5,week6,week7,week8,week9,week10,week11,week12,
                week13,week14,week15});
        }
        table_view.setVisible(true);
        
        
    }//GEN-LAST:event_cb_SubjectActionPerformed

    private void table_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_viewMouseClicked
        String[]Temp  = cb_Subject.getSelectedItem().toString().split(" ", 2);
        String iDSubject = Temp[0];
        Subject subject = SubjectDAO.getInformationSubjectByID(iDSubject);
        List<Studentofsubject> list = StudentDAO.getListStudentByIdSubject(iDSubject);
        int rowIndex = table_view.getSelectedRow();
        int week1 = 0;
        int week2 = 0;
        int week3 = 0;
        int week4 = 0;
        int week5 = 0;
        int week6 = 0;
        int week7 = 0;
        int week8 = 0;
        int week9 = 0;
        int week10 = 0;
        int week11 = 0;
        int week12 = 0;
        int week13 = 0;
        int week14 = 0;
        int week15 = 0;
        StudentofsubjectId sbId =  new StudentofsubjectId(subject.getId(),
                String.valueOf(table_view.getValueAt(rowIndex,0)));
        if((boolean)table_view.getValueAt(rowIndex, 1) == true)
            week1 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 2)==true)
            week2 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 3) == true)
            week3 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 4)== true)
            week4 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 5)==true)
            week5 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 6)==true)
            week6 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 7) == true)
            week7 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 8) == true)
            week8 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 9)==true)
            week9 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 10) == true)
            week10 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 11)==true)
            week11 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 12) == true)
            week12 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 13)==true)
            week13 = 1;
        if((boolean)table_view.getValueAt(rowIndex, 14)==true)
            week14 =1;
        if((boolean)table_view.getValueAt(rowIndex, 15)==true)
            week15 = 1;
        Studentofsubject studentOfSubject = new Studentofsubject(sbId,
                AccountDAO.getInformationAccount(String.valueOf(table_view.getValueAt(rowIndex,0))),
                subject,week1,week2,week3,week4,week5,week6,week7,week8,
                week9,week10,week11,week12,week13,week14,week15);
        StudentDAO.updateStudentOfSubject(studentOfSubject);
    }//GEN-LAST:event_table_viewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Subject;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_table;
    private javax.swing.JTable table_view;
    // End of variables declaration//GEN-END:variables
}