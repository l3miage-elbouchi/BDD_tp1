package fr.uga.l3miage.tp1.exo3.models;


import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class AssociationEntity {
    @Id
    private String name;
    private String presidentName;
    private String treasurerName;
    private String secretaryName;
    private AssociationType associationType;
// a revoir ca
    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "Fk_association_federation"))
    FederationEntity federation;

    @OneToMany(mappedBy = "association")
    Set<FederationEntity> federations;

}
