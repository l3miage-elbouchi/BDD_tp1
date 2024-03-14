package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
@Entity
@Table
public class BikeEntity {
    @Id
    @Column(name="immatriculation", length = 8)
    private String immatriculation;

    @Column(name="capacity")
    private Integer capacity;

    @Column(name="cylinder_Number")
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    @Column(name="automatic")
    private boolean automatic;

    @Column(name="shifter")
    private boolean shifter;

    @Column(name="shifter_Type")
    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;


    @Column(name="circulation_Date")
    private LocalDate circulationDate;


}
