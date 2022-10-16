package dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Lib;
import util.FUtil;

/**
 *
 * @author Farhan
 */
public class DAOLib {
    // Untuk menampilkan data ke tabel
    public List<Lib> rtvBook() {
        List listLib = new ArrayList();
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Lib");
            listLib = query.list();
            transaction.commit();      
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return listLib;
    }
    
     // untuk mencari/seach data, manipulasi data seperti delete, edit, dan search
    public List<Lib> getbyID(String idLib) {
        Lib lib = new Lib();
        List<Lib> listLib = new ArrayList();
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Lib where id = :id");
            query.setString("id", idLib);
            lib = (Lib) query.uniqueResult();
            listLib = query.list();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return listLib;
    }
    
    // untuk add data
    public void addBook(Lib lib){
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(lib);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk delete berdcasarkan id
    public void deleteBook(Integer idLib) {
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            Lib usr = (Lib) session.load(Lib.class, new Integer(idLib));
            session.delete(usr);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
    
    // untuk edit
    public void editBook(Lib lib) {
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.update(lib);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
    }
}