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
import pojo.TblCustomer;
import pojo.TblUser;

/**
 *
 * @author 
 */
public class DAOCustomer {
    public List<TblCustomer> retrieveTbl() {
        List stud = new ArrayList();
        TblCustomer stud1 = new TblCustomer();
        Transaction trans = null;
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblCustomer");
            stud = query.list();
            stud.add(stud1.getIdCustomer());
            stud.add(stud1.getNamaCustomer());
            stud.add(stud1.getNoTlp());
            stud.add(stud1.getEmail());
            stud.add(stud1.getProduk());
            stud.add(stud1.getTotal());
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stud;
        
        
    }
    public List<TblCustomer> getbyID(String idU){
        TblCustomer usr = new TblCustomer();
        List <TblCustomer> iUsr = new ArrayList();
        
        Transaction trans = null;
        Session session = ClothingstoreUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from TblUser where id_user = :id");
            query.setString("id", idU);
            usr = (TblCustomer) query.uniqueResult();
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
            TblCustomer usr = (TblCustomer) session.load(TblCustomer.class, new Integer(idU));
            session.delete(usr);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void editUser(TblCustomer usr)
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
    

