package ma.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import  java.util.List;
@ToString
@Setter
@Getter
@AllArgsConstructor
@Entity(name ="unit_clients" )
public class Client {



        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;
   /* public Client(long id) {
        this.id=id;

    }*/


    private String nom;




  //  @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    //private List<Facture> factures;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;

   /* @ManyToMany(cascade = {CascadeType.PERSIST})

    @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
            name = "client_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "promotion_fk",
                    referencedColumnName = "id"
            ))
    private List<Promotion> promotions;*/




    public Client(String nom) {

        this.nom=nom;
    }
    public Client() {
    }



    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom='" + nom + '\'' + '}';
    }
}
