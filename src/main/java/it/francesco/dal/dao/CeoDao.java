package it.francesco.dal.dao;

import it.francesco.dal.entity.Ceo;
import it.francesco.dal.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CeoDao {
    public Boolean isCeoValid(String ceoCF){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){ //autocloseable (try with resources)
            Ceo ceo = session.get(Ceo.class, ceoCF);
            return ceo != null;
        }
        catch (HibernateException e){
            e.printStackTrace(); // todo: replace with static logger
            return false;
        }

    }

}
