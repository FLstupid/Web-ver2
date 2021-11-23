package Data;

import Model.Review;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class reviewIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");


    public void insert (Review review)
    {EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(review);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }

    public void update (Review review)
    {EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            em.merge(review);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public void delete (Review review)
    {EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
                em.remove(review);

            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public static List<?> selectReviewList(long masanpham){
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p.id, p.title as TieuDe" +
                    ",p.content as NhanXet, p.rating FROM Review p  WHERE p.productByProductId.id =?1").setParameter(1,masanpham).getResultList();

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }finally {
            em.close();
        }
    }
    public static List<?> selectOrderReviewList(long ID)
    {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p.productByProductId.id as MaDonHang, p.title as TieuDe" +
                    ",p.productByProductId.title as TenSP" +
                    ",p.accountByAccountId.id as TenKhachHang" +
                    ",  p.productByProductId.shopByShopId.shopname as shopname " +
                    ",p.content as NhanXet FROM Review p  WHERE p.id =?1").setParameter(1,ID).getResultList();

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }finally {
            em.close();
        }
    }
}
