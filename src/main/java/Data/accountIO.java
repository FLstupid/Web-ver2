package Data;

import Model.Account;

import javax.persistence.*;

public class accountIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    public static final EntityManager em = emf.createEntityManager();
    public static final EntityTransaction transaction = em.getTransaction();

    public void insert (Account account)
    {
        try {
            transaction.begin();

                em.persist(account);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }

    public void update (Account account)
    {
        try {
            transaction.begin();

            em.merge(account);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public void delete (Account account)
    {
        try {
            transaction.begin();
            em.remove(account);

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
