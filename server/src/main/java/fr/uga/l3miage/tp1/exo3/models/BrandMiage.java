package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table
public class BrandMiage {
    @Id
    private String company_name;
    @Column(name="siretNumber",length = 11)
    private String siretNumber;

    @Enumerated(EnumType.STRING)
    private BrandType type;

    //@OneToMany(mappedBy = "brand")
    //private Set<ProductEntity> product;

    @ManyToOne
    private ProductEntity product;

    //Je ne comprend pas avec le cours a revoir pourquoi on a inverser ManytoOne avec OneToMAny
}
