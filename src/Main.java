
import entity.Studentyi;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.NewHibernateUtil;

public class Main {
    public static void main(String[] args) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sq1 = "FROM Studentyi s";
        Query query = session.createQuery(sq1);
        
        List<Studentyi> rows = query.list();
        
        for(Studentyi row : rows) {
            System.out.println(row.getGruppyi().getNazvanie());
        }
        session.getTransaction().commit();
        }
}
