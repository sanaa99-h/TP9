package ma.presentation;
import ma.Service.IclientSerice;
import ma.models.Client;

public class ClientCONTROLLER {
    IclientSerice service ;

    public IclientSerice getService() {

        return service;
    }
    public void setservice (IclientSerice service) {
        System.out.println("appel constrctor de classe client controller");
        this.service=service;
    }
    public ClientCONTROLLER() {

    }

    public void save (Client c) {
        System.out.println("presentation");
        service.save(c);

    }
}