package Data;

import Model.Cart;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class cartIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    public static final EntityManager em = emf.createEntityManager();
    public static final EntityTransaction transaction = em.getTransaction();

    public void insert (Cart cart)
    {
        try {
            transaction.begin();
            em.persist(cart);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }

    public void update (Cart cart)
    {
        try {
            transaction.begin();

            em.merge(cart);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public void delete (Cart cart)
    {
        try {
            transaction.begin();

            em.remove(cart);
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
