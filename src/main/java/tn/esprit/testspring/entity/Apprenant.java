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
public class Apprenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idApprenant;

    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    //@ManyToOne

    @ManyToMany(mappedBy="apprenants", cascade = CascadeType.ALL)
    private List<Formation> formations;
}