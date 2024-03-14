package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table
public class NetflixAccountEntity {
    @Id
    //@Column(name="id")
    private Long id;

    //@Column(name="nb_devices")
    private int nb_devices;

    //@Column(name="typeAccount")
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    //@Column(name="uuid_user")
    private String uuid_user;

    @OneToOne
    private NetflixUserEntity netflixUser;
}
