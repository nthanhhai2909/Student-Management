/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Account;
import POJO.Studentofsubject;
import POJO.Subject;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nthan
 */
public class SubjectDAO {
    
    // get information subject
    public static Subject getInformationSubjectByID(String iD){
        Subject sub = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            sub = (Subject)session.get(Subject.class, iD);
        }
        catch(HibernateException ex){
            System.out.println("Add subject fail!!!");
        }
        finally{
            session.close();
        }
        return sub;
    }
    
    // get list Subject
    public static List<Subject> getListSubjet(){
        List<Subject> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "select sb from Subject sb";
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
    // add subject
    public static boolean addSubject(Subject subject){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(SubjectDAO.getInformationSubjectByID(subject.getId()) != null){
            return false;
        }
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(subject);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Add subject fail!!!");
            return false;
        }
        finally{
            session.close();
        }
        return true;
    } 
    
    // Update Subject
    public static boolean updateSubject(Subject subject){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(SubjectDAO.getInformationSubjectByID(subject.getId()) == null){
            return false;
        }
        
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.update(subject);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Update subject fail!!!");
            return false;
        }
        finally{
            session.close();
        }

        return true;
    }
    // Delete Subject
    public static boolean deleteSubjectByID(String id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Subject sb = SubjectDAO.getInformationSubjectByID(id);
        if(sb == null){
            return false;
        }
        //AccountDAO.removeInforAccount(user);
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.delete(sb);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("delete account fail!!!");
            return false;
        }
        finally{
            session.close();
        }
        return true;
    }
    
    
}
