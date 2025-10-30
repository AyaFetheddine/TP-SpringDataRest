package ma.emsi.fetheddine.springdatarest;

import ma.emsi.fetheddine.springdatarest.enums.Genre;
import ma.emsi.fetheddine.springdatarest.model.Etudiant;
import ma.emsi.fetheddine.springdatarest.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public void run(String... args) throws Exception {
        // Création des 4 étudiants
        Etudiant et1 = Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .build();

        Etudiant et2 = Etudiant.builder()
                .nom("Aznadi")
                .prenom("Salima")
                .genre(Genre.Femme)
                .build();

        Etudiant et3 = Etudiant.builder()
                .nom("Filali")
                .prenom("Youssef")
                .genre(Genre.Homme)
                .build();

        Etudiant et4 = Etudiant.builder()
                .nom("Alaoui")
                .prenom("Fatima")
                .genre(Genre.Femme)
                .build();

        etudiantRepository.saveAll(List.of(et1, et2, et3, et4));
    }
}
