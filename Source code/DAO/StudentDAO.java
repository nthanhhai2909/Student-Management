/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import POJO.Studentofsubject;
import POJO.StudentofsubjectId;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author nthan
 */
public class StudentDAO {
    
    // Get infor Subject By SubjectID
    public static Studentofsubject getInforStudentOfSubjectBySubjectID(StudentofsubjectId id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Studentofsubject studentOfSub = null;
        Transaction transaction = null;
        try{
            studentOfSub = (Studentofsubject)session.get(Studentofsubject.class,id);
        }
        catch(HibernateException ex){
            System.out.println("");
        }
        finally{
            session.close();
        }
        return studentOfSub;
    }
    // Get information Subject BY User name and ID sub
    public static Studentofsubject getInforStudentOfSubjectByUserNameIdSubject(String iD, String userName){
        Session session = HibernateUtil.getSessionFactory().openSession();
        StudentofsubjectId stId = new StudentofsubjectId(iD, userName);
        Studentofsubject studentOfSub = null;
        try{
            studentOfSub = (Studentofsubject)session.get(Studentofsubject.class,stId);
        }
        catch(HibernateException ex){
            System.out.println("Get StudentID fail");
            System.out.println(ex.getMessage());
        }
        finally{
            session.close();
        }
        return studentOfSub;
    }
    

       
    // get list studentofsub
    public static List<Studentofsubject> getListStudent(){
        List<Studentofsubject> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "select st from Studentofsubject st";
            Query query = session.createQuery(hql);
            list = query.list();
            
        }
        catch(HibernateException ex){
            System.out.println("Load list account fail!!!");
            System.out.println(ex.getMessage());
        }
        finally{
            session.close();
        }
        return list;
    }
    
    // Add StudentOfSubject
    public static boolean addStudentOfSubject(Studentofsubject studentOfSubject){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(StudentDAO.getInforStudentOfSubjectBySubjectID(studentOfSubject.getId()) != null){
            return false;
        }
       Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(studentOfSubject);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Add Student Of subject fail!!!");
            return false;
        }
        finally{
            session.close();
        }
        return true;
    }
    
    //Update student of Subject
    public static boolean updateStudentOfSubject(Studentofsubject studentOfSub){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(StudentDAO.getInforStudentOfSubjectBySubjectID(studentOfSub.getId()) == null){
            return false;
        }
        
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.update(studentOfSub);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Update Student of subject fail!!!");
            return false;
        }
        finally{
            session.close();
        }
        return true;
    }
    
    // Detele Student of subject By 
    
    
    //-------------------------------------------------------------------------
    // Get list Student of subject By ID Subject
        public static List<Studentofsubject> getListStudentByIdSubject(String Idsub){
        List<Studentofsubject> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "select st from Studentofsubject st where st.subject like :idsub";
            Query query = session.createQuery(hql);
            query.setString("idsub", "%"+Idsub+"%");
            list = query.list();
            
        }
        catch(HibernateException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            session.close();
        }
        return list;
    }
    // Get list Subject By UserName
        public static List<Studentofsubject> getListStudentByUserName(String userName){
        List<Studentofsubject> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "select st from Studentofsubject st where st.account like :account";
            Query query = session.createQuery(hql);
            query.setString("account", "%"+userName+"%");
            list = query.list();
            
        }
        catch(HibernateException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            session.close();
        }
        return list;
    }
        
        
    
}
