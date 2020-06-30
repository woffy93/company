package it.francesco.dal.dao;

import it.francesco.dal.entity.PM;
import it.francesco.dal.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class PMDao extends CrudDao<PM> {

    public List<PM> getPMs() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from PM ", PM.class).list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
