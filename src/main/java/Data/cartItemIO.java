package Data;

import Model.CartItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class cartItemIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
    public static void insert(CartItem cartItem)
    {

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
        }
    }

    public static void update (CartItem cartItem)
    {
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
        }
    }
    public static void delete (CartItem cartItem)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(em.merge(cartItem));
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
    public static List<?> selectItems (long cartId)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            em.getTransaction().begin();
            return em.createQuery("SELECT c.amount,c.productByProductId.id" +
                    ",c.cartByCartId.accountByAccountId.id," +
                        "c.productByProductId.title,c.price," +
                    "c.discount,c.content,c.id, c.productByProductId.id FROM" +
                    " CartItem c WHERE c.cartByCartId.id =?1").setParameter(1,cartId).getResultList();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
    public static List<?> selectItemsforseller (long Id)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            em.getTransaction().begin();
            return em.createQuery("SELECT c.productByProductId.id,c.productByProductId.title, c.cartByCartId.accountByAccountId.phone" +
                    ",c.productByProductId.updatedAt,c.price, c.productByProductId.status,c.amount FROM" +
                    " CartItem c WHERE c.productByProductId.shopByShopId.accountByAccountId.id =?1").setParameter(1,Id).getResultList();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
    public static Object selectItem(long productCode, long id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            em.getTransaction().begin();
            return em.createQuery("SELECT q FROM CartItem q WHERE q.productByProductId.id =?1 AND q.id =?2").setParameter(1,productCode).setParameter(2,id).getSingleResult();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
    public static Object selectItemincart(long productCode, long id) {
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
        }
    }
    public static int CountIteminCart(long id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            em.getTransaction().begin();
            return (int) em.createQuery("SELECT COUNT(q) FROM CartItem q WHERE q.productByProductId.id =?1").setParameter(1,id).getSingleResult();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return 0;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
}
