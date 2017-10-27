/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Account;
import POJO.Informationaccount;
import POJO.Studentofsubject;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nthan
 */
public class InformationaccountDAO {
    
    // Get information
    public static Informationaccount getInformationAccountByID(String id){
        Informationaccount ac = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            ac = (Informationaccount) session.get(Informationaccount.class, id);
        }
        catch(HibernateException ex){
            System.out.println("Get information Account fail!!!");
        }
        finally{
            session.close();
        }
        return ac;
        
    }
    // get Information of account in User Name
    public static Informationaccount getInformationAccountByUserName(String userName){
        Informationaccount informatioAccount = null;
        Account ac = AccountDAO.getInformationAccount(userName);
        if(ac == null){
            return null;
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql="select s from Informationaccount s\n" +
                "where s.account=:account";
            Query query=session.createQuery(hql);
            query.setString("account", ac.getUserName());
            informatioAccount = (Informationaccount) query.uniqueResult();
        } catch (HibernateException ex) {
        System.err.println(ex);
        } finally { session.close();}
        return informatioAccount;
    }
    
    // Get List informationaccount
    public static List<Informationaccount> getListInforAccount(){
        List<Informationaccount> listInfor= null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "select inf from Informationaccount inf";
            Query query = session.createQuery(hql);
            listInfor = query.list();
        }
        catch(HibernateException ex){
            System.out.println("Get list infor fail!!!");
        }
        finally{
            session.close();
        }
        return listInfor;
    }
    // Get ID Max
    public static int getIDMax(String userName){
        List<Informationaccount> listInfor = InformationaccountDAO.getListInforAccount();
        return listInfor.size();
    }
    // add information account
    public static boolean addInformationAccount(Informationaccount informationacc){
        Session session = HibernateUtil.getSessionFactory().openSession();
        // No username
        if(InformationaccountDAO.getInformationAccountByID(informationacc.getId()) != null){
            return false;
        }
        
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(informationacc);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Add account fail!!!");
            return false;
        }
        finally{
            session.close();
        }
        return true;
    }
    
    // update information account
        public static boolean updateInformationAccount(Informationaccount inf){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(InformationaccountDAO.getInformationAccountByID(inf.getId())== null){
            return false;
        } 
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.update(inf);
            transaction.commit();
        }
        catch(HibernateException ex){
            transaction.rollback();
            System.out.println("Update account fail!!!");
            return false;
        }
        finally{
            session.close();
        }
        return true;
    }
        
    // Delete information account
    public static boolean deleteInformationAccount(String userName){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Informationaccount inf = null;
        inf = InformationaccountDAO.getInformationAccountByUserName(userName);
        if(inf == null){
            return false;
        }
        
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.delete(inf);
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


