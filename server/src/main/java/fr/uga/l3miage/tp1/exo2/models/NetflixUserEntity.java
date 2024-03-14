package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class NetflixUserEntity {
    @Id
    //@Column(name="id")
    private int id;
    //@Column(name="uuid")
    private String uuid;
    //@Column(name="lastname")
    private String lastname;
    //@Column(name="firstname")
    private String firstname;
    //@Column(name="sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;
    //@Column(name="birthDate")
    private LocalDate birthDate;

    @OneToOne(mappedBy = "netflixUser" )
    private NetflixAccountEntity NetflixAccount;
}
