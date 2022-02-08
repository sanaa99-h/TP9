package ma.dao;



import ma.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDaoIMPL implements IClientDAO {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em =emf.createEntityManager();


    public ClientDaoIMPL () {
    }
    public void save(Client c){

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

    }

}
