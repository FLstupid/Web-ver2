package Data;

import Model.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class addressIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
    public static final EntityManager em = emf.createEntityManager();
    public static final EntityTransaction transaction = em.getTransaction();

    public static void insert (Address address)
    {
        transaction.begin();
        try {

            em.persist(address);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        } finally
        {
            em.close();
            emf.close();
        }
    }

    public void update (Address address)
    {
        try {
            transaction.begin();

            em.merge(address);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public void delete (Address address)
    {
        try {
            transaction.begin();

            em.remove(address);
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
