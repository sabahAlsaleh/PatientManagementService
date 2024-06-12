package se.kth.PatientManagementService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.kth.PatientManagementService.model.MedicalRecord;
import se.kth.PatientManagementService.repo.MedicalRecordRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    public Optional<MedicalRecord> getMedicalRecordById(Long id) {
        return medicalRecordRepository.findById(id);
    }

    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    public Optional<MedicalRecord> updateMedicalRecord(Long id, MedicalRecord medicalRecordDetails) {
        return medicalRecordRepository.findById(id).map(medicalRecord -> {
            medicalRecord.setDetails(medicalRecordDetails.getDetails());
            medicalRecord.setDiagnosis(medicalRecordDetails.getDiagnosis());
            medicalRecord.setTreatmentPlan(medicalRecordDetails.getTreatmentPlan());
            medicalRecord.setLastVisitDate(medicalRecordDetails.getLastVisitDate());
            medicalRecord.setPhysicianName(medicalRecordDetails.getPhysicianName());
            medicalRecord.setMedications(medicalRecordDetails.getMedications());
            medicalRecord.setAllergies(medicalRecordDetails.getAllergies());
            medicalRecord.setTestResults(medicalRecordDetails.getTestResults());
            return medicalRecordRepository.save(medicalRecord);
        });
    }

    public void deleteMedicalRecord(Long id) {
        medicalRecordRepository.deleteById(id);
    }
}
