package se.kth.PatientManagementService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.kth.PatientManagementService.model.Patient;
import se.kth.PatientManagementService.repo.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Optional<Patient> updatePatient(Long id, Patient patientDetails) {
        return patientRepository.findById(id).map(patient -> {
            patient.setName(patientDetails.getName());
            patient.setBirthdate(patientDetails.getBirthdate());
            patient.setAddress(patientDetails.getAddress());
            patient.setDepartment(patientDetails.getDepartment());
            patient.setMedicalRecord(patientDetails.getMedicalRecord());
            return patientRepository.save(patient);
        });
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
