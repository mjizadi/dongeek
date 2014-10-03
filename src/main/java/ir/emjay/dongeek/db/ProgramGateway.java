package ir.emjay.dongeek.db;

import ir.emjay.dongeek.model.Program;
import org.hibernate.Session;

import java.util.List;

/**
 * @author: mj
 */
public class ProgramGateway {
    public static void save(Program entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        try {
            session.save(entity);
        } catch (Exception e) {
            System.out.println("Salam ");
            e.printStackTrace();
        }
        session.getTransaction().commit();
    }

    public static List<Program> getall() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(Program.class).list();
    }
}
