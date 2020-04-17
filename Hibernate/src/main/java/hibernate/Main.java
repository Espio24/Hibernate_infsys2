package hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import hibernate.TesterEntity;
import hibernate.HibernateSessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    private String beforname;
    private String newName;

    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        //Добавление тестера
       // insertTester(session, "Nikolai Nikolaev");

        //Выбрать тестера по имени
       // selectTesterbyName(session, "Seva Potapov");

        //Обновить тестера по имени
      // updateTesterbyName(session, "Kokov", "Kekov");

        //Удалить тестера по имени
        //deleteTesterbyName(session, "Kekov");

        tx.commit();
        session.close();


    }


    public static void insertTester(Session session, String name) {
        System.out.println("Insert name");
        TesterEntity testerEntity = new TesterEntity();

        testerEntity.setNameTester(name);

        session.save(testerEntity);

    }

    public static void deleteTesterbyName(Session session, String name) {
        System.out.println("HQL DELETE: ");

        Query query =  session.createQuery("delete TesterEntity where nameTester = :param");
        query.setParameter("param", name);
        int result = query.executeUpdate();



        System.out.println("Result Delete: " + result);
    }

    public static void updateTesterbyName(Session session, String beforeName, String newName) {
        System.out.println("HQL UPDATE: ");


        Query query = session.createQuery("update TesterEntity set nameTester = :nameParam where nameTester = :NameCode");

        query.setParameter("NameCode", beforeName);
        query.setParameter("nameParam", newName);


        int result = query.executeUpdate();






        System.out.println("Result: " + result);
    }

    public static void selectTesterbyName(Session session, String name) {
        System.out.println("HQL SELECT: ");

        Query query = session.createQuery("from TesterEntity where nameTester = :paramName");
        query.setParameter("paramName", name);
        List list = query.list();

        printALL(list);

    }

    private static void printALL(List<Object> contactEntityList) {
        System.out.println("Print result:");

        for (Object contact : contactEntityList) {
            System.out.println(contact);
        }
    }
}