/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import Util.HibernateUtil;
import POJO.Subject;
import POJO.Timetableofsubject;
import java.util.List;
/**
 *
 * @author nthan
 */
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
public class TimetableOfSubjectDAO {
    // get information timedate by ID
    public static Timetableofsubject getInformationTimeTableByID(String iD){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Timetableofsubject timetable = null;
        try{
            timetable = (Timetableofsubject)session.get(TimetableOfSubjectDAO.class, iD);
        }
        catch(HibernateException ex){
            System.out.println("Get timetable fail");
        }
        finally{
            session.close();
        }
        return timetable;
    }
    // get information timetable by ID Subject
    public static Timetableofsubject getInformationTimeTableByIDSubject(String Id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Timetableofsubject timetable = null;
        Subject subject = SubjectDAO.getInformationSubjectByID(Id);
        if(subject == null){
            return null;
        }
        try{
            String hql="select tb from Timetableofsubject tb\n" +
                "where tb.subject=:subject";
            Query query=session.createQuery(hql);
            query.setString("subject", subject.getId());
            timetable = (Timetableofsubject) query.uniqueResult();
        }
        catch(HibernateException ex){
            System.out.println("get infor by ID Subject fail");
        }
        finally{
            session.close();
        }
        return timetable;
    }
    
    // Add TimeTable
    public static boolean addTimeTableOfSubject(Timetableofsubject tb){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(TimetableOfSubjectDAO.getInformationTimeTableByID(tb.getIdtimeDate()) != null){
            return false;
        }
        Transaction transacion = null;
        try{
            transacion = session.beginTransaction();
            session.save(tb);
            transacion.commit();
        }
        catch(HibernateException ex){
            transacion.rollback();
            System.out.println("Add timetable fail!!1");
            return false;
        }
        finally{
            session.close();
        }
        return true;
    }
    // udateTimeTable
    public static boolean updateTimeTableOfSubject(Timetableofsubject tb){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        if(TimetableOfSubjectDAO.getInformationTimeTableByID(tb.getIdtimeDate()) == null){
            return false;
        }
        Transaction transaction = null;
        try{
            transaction = sesion.beginTransaction();
            sesion.update(tb);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Update timetable fail!!!");
            return false;
        }
        finally{
            sesion.close();
        }
        return true;
    }
    public static boolean deleteTimeTableOfSubjectByID(String id){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Timetableofsubject tb = TimetableOfSubjectDAO.getInformationTimeTableByID(id);
        if(tb == null){
            return false;
        }
        Transaction transaction = null;
        try{
            transaction = sesion.beginTransaction();
            sesion.update(tb);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Update timetable fail!!!");
            return false;
        }
        finally{
            sesion.close();
        }
        return true;
    }
    // get list Timet
    public static List<Timetableofsubject> getListTimeTable(){
        List<Timetableofsubject> list= null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "select tb from Timetableofsubject tb";
            Query query = session.createQuery(hql);
            list = query.list();
        }
        catch(HibernateException ex){
            System.out.println("Get list infor fail!!!");
        }
        finally{
            session.close();
        }
        return list;
    }
    // Get ID max
    public static int getIDMax(){
        List<Timetableofsubject> list;
        list = TimetableOfSubjectDAO.getListTimeTable();
        return list.size();
    }
}
