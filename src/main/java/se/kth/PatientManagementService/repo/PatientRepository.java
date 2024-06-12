package se.kth.PatientManagementService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.kth.PatientManagementService.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
