package Data;

import Model.Account;

import javax.persistence.*;

public  class accountIO {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dhs");
    public static final EntityManager em = emf.createEntityManager();
    public static final EntityTransaction transaction = em.getTransaction();
    public accountIO (){

    }
    public static void insert (Account account)
    {
        transaction.begin();
        try {

                em.persist(account);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        } finally
         {
            em.close();
            emf.close();
        }
    }

    public static void update (Account account)
    {
        try {
            transaction.begin();

            em.merge(account);
            transaction.commit();
        }catch (Exception e){
            System.out.println(2);
            transaction.rollback();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
        }
    }
    public static void delete (Account account)
    {
        try {
            transaction.begin();
            em.remove(em.merge(account));

            transaction.commit();
        }catch (Exception e){
            System.out.println(3);
            transaction.rollback();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            em.close();
            emf.close();
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
}
