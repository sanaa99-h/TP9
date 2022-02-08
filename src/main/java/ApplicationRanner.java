import ma.models.CarteFidelio;
import ma.models.Facture;
import ma.models.Promotion;
import ma.presentation.FactureController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import ma.models.Client;

import ma.presentation.ClientCONTROLLER;

import java.util.Arrays;
import java.util.List;


public class ApplicationRanner {

 /*  public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientCONTROLLER ctr= (ClientCONTROLLER) ctx.getBean("idctrl");
        Client client = new Client("OMAR");

        List<Facture> factures = Arrays.asList(new Facture(1500.0,"facture1"),new
                Facture(2000.0,"facture2"));
        client.setFactures(factures);
        ctr.save(client);
    }*/

  /*  public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientCONTROLLER ctr= (ClientCONTROLLER) ctx.getBean("ctrl1");
        Client client = new Client("OMAR");
        List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new
                Promotion("solde 40%"));
        client.setPromotions(promotions);
        ctr.save(client);
    }*/


        public static void main(String[] args) {
            ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
            ClientCONTROLLER ctr= (ClientCONTROLLER) ctx.getBean("ctrl1");
            Client client = new Client("OMAR");
            CarteFidelio carteFidelio = new CarteFidelio("A29930489");
            carteFidelio.setClient(client);
            client.setCarteFidelio(carteFidelio);
            ctr.save(client);
        }
    }








