package ma.emsi.hospital.repositories;

import ma.emsi.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public Patient findByNom(String nom);
}
