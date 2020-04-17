import hibernate.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SessionFactoryTest {



    public static void main(String[] args)
    {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        tx.commit();
        session.close();
    }
}

