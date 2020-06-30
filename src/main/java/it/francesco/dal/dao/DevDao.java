package it.francesco.dal.dao;

import it.francesco.dal.entity.Dev;
import it.francesco.dal.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class DevDao extends CrudDao<Dev> {

    public List<Dev> getDevs() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Devs ", Dev.class).list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
