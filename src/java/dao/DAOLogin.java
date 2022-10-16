package dao;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Librarians;
import util.FUtil;

public class DAOLogin {
        
        public List<Librarians> getBy(String uEmail, String uPass) {
        Transaction trans = null;
        Librarians us = new Librarians();
        List<Librarians> user = new ArrayList();
        Session session = FUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();
            Query query = session.createQuery("from Librarians where username =:uSername AND password=:uPass");
            query.setString("uSername", uEmail);
            query.setString("uPass", uPass);
            us = (Librarians) query.uniqueResult();
            user = query.list();
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return user;
    }
        
}