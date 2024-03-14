package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table
public class UserEntity {
    @Id
    @Column(name="idUser")
    private Long idUser;

    @Column(name="SSO")
    private boolean SSO;

    @Column(name="lastConnexion")
    private OffsetDateTime lastConnexion;

    @OneToOne
    private SessionEntity session;
}
