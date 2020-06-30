package it.francesco.dal.util;

import it.francesco.dal.entity.Ceo;
import it.francesco.dal.entity.Dev;
import it.francesco.dal.entity.PM;
import it.francesco.dal.entity.Task;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {

            try {
                Configuration configuration = new Configuration();
                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=false");
                settings.put(Environment.USER, "root"); //bad way of doing it but it's a paper project
                settings.put(Environment.PASS, "admin");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                //settings.put(Environment.HBM2DDL_AUTO, "update");
                configuration.setProperties(settings);

                //mapped entities
                configuration.addAnnotatedClass(Ceo.class);
                configuration.addAnnotatedClass(Dev.class);
                configuration.addAnnotatedClass(PM.class);
                configuration.addAnnotatedClass(Task.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
