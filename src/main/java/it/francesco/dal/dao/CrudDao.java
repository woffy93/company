package it.francesco.dal.dao;

import it.francesco.dal.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public abstract class CrudDao<T> {


    public void persist(T entity) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.save(entity);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public void update(T entity) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.update(entity);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public void saveOrUpdate(T entity) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.saveOrUpdate(entity);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
