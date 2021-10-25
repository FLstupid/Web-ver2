package Data;

import javax.persistence.*;

public class accountIO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    EntityTransaction transaction = em.getTransaction();

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
