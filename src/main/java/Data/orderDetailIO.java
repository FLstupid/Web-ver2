package Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class orderDetailIO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    EntityTransaction transaction = em.getTransaction();

    public void insert (OrderDetail orderDetail)
    {
        try {
            transaction.begin();
            em.persist(orderDetail);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }

    public void update (OrderDetail orderDetail)
    {
        try {
            transaction.begin();

            em.merge(orderDetail);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public void delete (OrderDetail orderDetail)
    {
        try {
            transaction.begin();

            em.remove(orderDetail);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
}
