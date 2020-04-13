package hibernate;

import org.hibernate.Session;
import hibernate.TesterEntity;
import hibernate.HibernateSessionFactory;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        TesterEntity testerEntity = new TesterEntity();


        testerEntity.setNameTester("Nickolai Nickolaev");

        session.save(testerEntity);
        session.getTransaction().commit();

        session.close();


    }
}
