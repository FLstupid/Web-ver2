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
    public static Product selectProduct(long ID)
    {
        EntityManager em = emf.createEntityManager();
        String q = "Select i from Product i " +
                        "Where i.id = :id";
        TypedQuery<Product> x = em.createQuery(q,Product.class);
        x.setParameter("id",ID);
        Product product = null;
        try {
            product = x.getSingleResult();
        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }finally {
            em.close();
        }
        return product;
    }
    //xem lại
    public static List selectListProduct()
    {
        EntityManager em = emf.createEntityManager();
        try {
            List acc = em.createQuery("SELECT p.title as productname, " +
                    "p.decription as decription" +
                    ",p.price as price , p.shopByShopId.shopname " +
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
    public static List selectProductByid(long idproduct)
    {
        EntityManager em = emf.createEntityManager();
        try {
            List acc = em.createQuery("SELECT p.id, p.title as productname, " +
                            "p.decription as decription" +
                            ",p.price as price ," +
                            " p.discount as discount," +
                                    "p.shopByShopId.shopname," +
                                    "p.reviewsById FROM Product p" +
                                    "  where p.id = ?1"
                            ).setParameter(1,idproduct)
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
}
