package dao;

import model.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

/**
 * Created by employee on 11/17/16.
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {

            return new Configuration().configure().buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

    public static void setTask() throws SQLException {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Integer employeeID = null;
        tx = session.beginTransaction();
        Task task =  new Task();
        task.setTaskId(24);
        task.setTitle("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQq");
        task.setDetails("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWwwwww");
        task.setView(true);
        task.setLocalTime("1111111111111111111111111111111111111111");
        task.setCurrentDay("2222222222222222222222222222222222222222222");
        task.setList_id(1);
        tx.commit();
//        List<ListName> listLists = new ArrayList<>();
//        String sql = "SELECT * FROM `list`";
//        ResultSet rs = stmt.executeQuery(sql);
//        while (rs.next()) {
//            listLists.add(new ListName(rs.getInt("id")
//                    , rs.getString("name")));
//        }
//        conn.close();
//        return listLists;
    }
}
