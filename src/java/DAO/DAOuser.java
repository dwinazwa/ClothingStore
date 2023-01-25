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
 * @author 
 */
public class DAOuser {
    public List<TblUser> retrieveTblUser() {
        List stud = new ArrayList();
        TblUser stud1 = new TblUser();
        Transaction trans = null;
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser");
            stud = query.list();
            stud.add(stud1.getIdUser());
            stud.add(stud1.getUssername());
            stud.add(stud1.getPassword());
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stud;
        
        
    }
    public List<TblUser> getbyID(String idU){
        TblUser usr = new TblUser();
        List <TblUser> iUsr = new ArrayList();
        
        Transaction trans = null;
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser where id_user = :id");
            query.setString("id", idU);
            usr = (TblUser) query.uniqueResult();
            iUsr = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return iUsr;
    }
    
    public void deleteUser(Integer idU)
    {
        Transaction trans = null;
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            TblUser usr = (TblUser) session.load(TblUser.class, new Integer(idU));
            session.delete(usr);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void editUser(TblUser usr)
    {
        Transaction trans = null;
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            session.update(usr);
            trans.commit();
                    
        } catch (Exception e) {
            System.out.println(e);
        }
    }

     //To change body of generated methods, choose Tools | Templates.
    }
    
