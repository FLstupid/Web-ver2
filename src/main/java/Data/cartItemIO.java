package Data;

import Model.CartItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class cartItemIO {
    public static void insert(CartItem cartItem)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(cartItem);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }

    public static void update (CartItem cartItem)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(cartItem);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public static void delete (CartItem cartItem)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(cartItem);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public static List<?> selectItems ()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            em.getTransaction().begin();
            return em.createQuery("SELECT c.id as id, c.content as content FROM" +
                    " CartItem c ").getResultList();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }

    public static Object selectItem(long productCode, long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            em.getTransaction().begin();
            return em.createQuery("SELECT q FROM CartItem q WHERE q.productByProductId.id =?1 AND q.cartByCartId.id =?2").setParameter(1,productCode).setParameter(2,id).getSingleResult();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
}
