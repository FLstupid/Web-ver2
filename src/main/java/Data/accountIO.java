package Data;

import Model.Account;
import com.mysql.cj.Session;


import javax.persistence.*;

public  class accountIO {
  public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
   public static final EntityManager em = emf.createEntityManager();

    public accountIO (){

    }
    public static long insert (Account account)
    {
         EntityTransaction transaction = em.getTransaction();
        long id;

        transaction.begin();
        try {
                em.persist(account);
                id = account.getId();
            transaction.commit();
            return id;
        }catch (Exception e){
            transaction.rollback();
        } finally
         {
            em.close();
        }
        return 1;
    }

    public long getID (Account a)
    {
        return a.getId();
    }
    public static void update (Account account)
    {
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.merge(account);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);
            transaction.rollback();
        } finally
        {
            em.close();
        }
    }
    public static void delete (Account account)
    {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(em.merge(account));
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        } finally {
            em.close();
        }
    }
    public static Account selectAcc (String username)
    {
        String query = "SELECT u FROM Account u " +
                "WHERE u.username = :username";
        TypedQuery<Account> q = em.createQuery(query,Account.class);
        q.setParameter("username",username);
        try {
            Account acc = q.getSingleResult();
            return acc;

        } catch (NoResultException e)
        {
            return null;
        }finally {
            em.close();
        }

    }
    public static boolean userExist(String username)
    {
        Account u = selectAcc(username);
        return u!= null;
    }
    public static Account getAccountById (long Id){


        try{
            Account acc = em.find(Account.class, Id);
            return  acc;
        }finally {
            em.close();
        }
    }
}
