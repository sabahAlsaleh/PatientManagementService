package se.kth.PatientManagementService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.kth.PatientManagementService.model.MedicalRecord;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}
