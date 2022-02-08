package ma.Service;


import ma.dao.IClientDAO;
import ma.models.Client;


public class ClientServiceIMPL implements IclientSerice{

    IClientDAO dao;
    public void setDao(IClientDAO dao) {
        this.dao = dao;
    }
    public ClientServiceIMPL() {
        System.out.println("constrtr de la classe clientserviceimpl");
    }

    @Override
    public void save(Client c) {
        System.out.println("service");
        dao.save(c);

    }

}

