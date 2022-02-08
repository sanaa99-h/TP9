package ma.presentation;

import ma.Service.FacteureService;
import ma.Service.IclientSerice;
import ma.models.Client;
import ma.models.Facture;

public class FactureController {



    private FacteureService service;

    public FactureController(IclientSerice service) {
        this.service = (FacteureService) service;
    }
   public void  save(Facture facture){
        service.save(facture);
    }
}



