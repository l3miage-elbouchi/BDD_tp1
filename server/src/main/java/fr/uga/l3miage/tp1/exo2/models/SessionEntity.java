package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;
import java.util.UUID;

@Entity
@Table
public class SessionEntity {
    @Id
    private UUID idSession;
    private String lastCommand;
    private String currentDir;
    private boolean lock;

    @OneToOne(mappedBy = "User")
    private UserEntity user;

}
