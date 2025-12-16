package tn.esprit.testspring.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode()
@Setter
@Getter

public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFormateur;

    private String nom;
    private String prenom;
    private Integer tarifHoraire;
    private String email;

    @OneToMany(mappedBy = "formateur")
    private List<Formation> formations;

}

