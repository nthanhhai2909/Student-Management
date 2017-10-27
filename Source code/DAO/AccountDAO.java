/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Account;
import Util.HibernateUtil;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Hibernate;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nthan
 */
public class AccountDAO {
    //get information of account with Username
    public static Account getInformationAccount(String userName){
        Account ac = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            ac = (Account) session.get(Account.class, userName);
        }
        catch(HibernateException ex){
            System.out.println("Get information Account fail!!!");
        }
        finally{
            session.close();
        }
        return ac;
    }
    // Add Account in database
    public static boolean AddAccount(Account ac){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(AccountDAO.getInformationAccount(ac.getUserName()) != null){
            return false;
        }
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(ac);
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
    
    // Update account 
    public static boolean updateAccount(Account ac){
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(AccountDAO.getInformationAccount(ac.getUserName()) == null){
            return false;
        }
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.update(ac);
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
    // Delete account
    public static boolean deleteAccountByUser(String user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Account ac = AccountDAO.getInformationAccount(user);
        if(ac == null){
            return false;
        }
        AccountDAO.removeInforAccount(user);
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.delete(ac);
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
    
    // Remove information account
    public static boolean removeInforAccount(String userName){
        return InformationaccountDAO.deleteInformationAccount(userName);
    }
    // check IDSV 
    // IDSV must be 7 character
    public static boolean checkIDSV(String iDSV){
        if(iDSV.length() != 7)
            return false;
        for(int i = 0; i < iDSV.length(); i++){
            if(iDSV.charAt(i) < '0' || iDSV.charAt(i) > '9')
                return false;
        }
        return true;
    }
    // check the first login
    public static boolean checkFirstLogin(String username, String password){
        if(checkIDSV(username) == false){
            return false;
        }
        Account ac = AccountDAO.getInformationAccount(username);
        if(ac == null){
            return false;
        }
        if(username.equals(password) != true){
            return false;
        }
        return true;
    }
    // LOGIN 
    public static boolean login(String userName, String password){
        Account ac = AccountDAO.getInformationAccount(userName);
        if(ac == null){
            return false;
        }
        try{
            if(password.equals(ac.getPassWord()) == true){
                return true;
            }
        }
        catch(HibernateException ex){
            System.out.println("Login fail!!!");
        }
        return false;
    }
    // Change password
    public static String changePassword(String username, String passold,
            String passnew, String confirm){
        String rerult="";
        Account ac = AccountDAO.getInformationAccount(username);
        if(ac == null){
            rerult = "Account Doesn't exit";
        }
        try{
            // password new must be different pass old
            if(passold.equals(ac.getPassWord()) == false){
                rerult = "Password false";
            }
            else{
                if(passnew.equals(confirm) == false){
                    rerult = "Incorrect confirmation";
                }
                
                else{
                    ac.setPassWord(passnew);
                    AccountDAO.updateAccount(ac);
                    rerult = "Change password successed";
                }
            }    
        }
        catch(HibernateException ex){
            System.out.println("Change password fail!!!");
        }
        return rerult;
    }
    // get List Account
    public static List<Account> getListAccount(){
        List<Account> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "select ac from Account ac";
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
    
    public static int checkTypeAccount(String userName){
        Account ac = AccountDAO.getInformationAccount(userName);
        if(ac == null)
            return -1;
        return ac.getType();
    }
}
