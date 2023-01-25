/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.ClothingstoreUtil;
import pojo.TblUser;

/**
 *
 * @author User
 */
public class DAOLogin {
    public List<TblUser> getby(String uName,String uPass)
    {
        Transaction trans = null;
        TblUser us = new TblUser();
        List<TblUser> user = new ArrayList();
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser where username=:uName AND pasword=:uPass");
            query.setString("uName", uName);
            query.setString("uPass", uPass);
            us = (TblUser) query.uniqueResult();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }
    public void add_user(TblUser user)
    {
        Transaction trans = null;
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.save(user);
            trans.commit();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<TblUser> getBy(String ussername, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

