package tn.esprit.testspring.entity;


import lombok.*;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode()
@Setter
@Getter
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormation;

    private String titre;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Temporal(TemporalType.DATE)
    private Date dateFin;

    private Integer nbrHeures;
    private Integer nbrMaxParticipants;
    private Integer frais;

    @ManyToOne
    private Formateur formateur;

    //@OneToMany(mappedBy = "formation", cascade = CascadeType.ALL)
    //private List<Apprenant> apprenants;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Apprenant> apprenants;


}