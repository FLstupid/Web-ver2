package Data;

import Model.Cart;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class cartIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
    public void insert (Cart cart)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(cart);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
    public void update (Cart cart)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(cart);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
    public void delete (Cart cart)
    {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(cart);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
        }
    }
    public static List selectCart (long ID)
    {
        EntityManager em = emf.createEntityManager();
        try {
            List acc = em.createQuery("SELECT g.amount, n.id,n.accountByAccountId.id, f.title, g.price," +
                    "f.discount, c.categoryName, n.delivery, " +
                    " n.content,g.productByProductId.id as productCode FROM Account p," +
                    " Cart n , CartItem g,Product f, Category c, CategoryProduct cp " +
                    "WHERE p.id= n.accountByAccountId.id " +
                    "AND n.id = g.cartByCartId.id " +
                    "AND  g.productByProductId.id = f.id " +
                    "AND f.id = cp.productByProductId.id " +
                    "AND cp.categoryByCategoryId.id = c.id " +
                    " AND p.id =?1").setParameter(1,ID).getResultList();
            return acc;

        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            em.close();
        }
    }
}
