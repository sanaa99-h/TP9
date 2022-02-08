package ma.dao;

import ma.models.Client;
import ma.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDaoImpl implements FactureDao{


    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em =emf.createEntityManager();
    @Override


    public void save(Facture facture){

        em.getTransaction().begin();
        em.persist(facture);
        em.getTransaction().commit();

    }


}
