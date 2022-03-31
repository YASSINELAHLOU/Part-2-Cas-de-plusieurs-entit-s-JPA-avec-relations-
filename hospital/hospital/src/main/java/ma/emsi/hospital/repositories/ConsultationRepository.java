package ma.emsi.hospital.repositories;

import ma.emsi.hospital.entities.Consultation;
import ma.emsi.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
