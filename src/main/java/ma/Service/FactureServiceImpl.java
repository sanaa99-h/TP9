package ma.Service;

import ma.dao.FactureDao;
import ma.models.Facture;

public class FactureServiceImpl implements FacteureService{
    FactureDao dao;

    public FactureServiceImpl(FactureDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Facture facture) {

    }


}
