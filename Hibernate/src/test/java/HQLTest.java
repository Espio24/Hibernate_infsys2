import hibernate.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static hibernate.Main.*;

public class HQLTest {


    public static void main(String[] args){

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();


        insertTester(session, "Test name");

        //Выбрать тестера по имени
        selectTesterbyName(session, "Test name");

        //Обновить тестера по имени
        updateTesterbyName(session, "Test name", "Name test");

        //Удалить тестера по имени
        deleteTesterbyName(session, "Name test");

        tx.commit();
        session.close();
        }


}