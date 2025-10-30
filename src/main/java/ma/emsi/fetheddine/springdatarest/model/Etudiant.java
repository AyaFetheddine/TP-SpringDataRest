package ma.emsi.fetheddine.springdatarest.model;

import ma.emsi.fetheddine.springdatarest.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="etudiants")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="nom_etudiant", nullable=false)
    String nom;

    @Column(name="prenom_etudiant")
    String prenom;

    @Enumerated(EnumType.STRING)
    Genre genre;
}
