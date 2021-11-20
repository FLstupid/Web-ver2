package Data;

import Model.Product;

import javax.persistence.*;
import java.util.List;

public class productIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");


    public void insert (Product product)
    {EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(product);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }

    public void update (Product product)
    {EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(product);

            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public void delete (Product product)
    {EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            em.remove(product);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public static Object[] selectProduct(long ID)
    {
        EntityManager em = emf.createEntityManager();

        Product product = null;
        try {
            Object[] acc = em.createQuery("SELECT p.id, p.title as productname," +
                            " p.decription as decription" +
                            ",p.price as price ," +
                            " p.discount as discount ," +
                            "p.shopByShopId.id," +
                            "p.content FROM Product p where p.id =:id",Object[].class).setParameter("id",ID)
                    .getSingleResult();
            return acc;
        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            em.close();
        }

    }
    //xem lại
    public static List selectListProduct()
    {
        EntityManager em = emf.createEntityManager();
        try {
            List acc = em.createQuery("SELECT p.title as productname, " +
                    "p.decription as decription" +
                    ",p.price as price , p.shopByShopId.shopname ,p.id " +
                    "FROM Product p")
                    .getResultList();
            return acc;

        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            em.close();
        }
    }
    public static Product selectProductByid(long idproduct)
    {
        EntityManager em = emf.createEntityManager();
       TypedQuery<Product>  acc;
        try {
             acc = em.createQuery("SELECT p FROM Product p where p.id = :id"
                            ,Product.class);
             acc.setParameter("id",idproduct);
             Product pd = acc.getSingleResult();
            return pd;
        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            em.close();
        }

    }
}
