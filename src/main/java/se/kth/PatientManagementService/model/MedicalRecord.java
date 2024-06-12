package se.kth.PatientManagementService.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details; // General details or notes about the patient's condition
    private String diagnosis; // The diagnosis of the patient's condition
    private String treatmentPlan; // The planned treatment for the patient
    private LocalDate lastVisitDate; // The date of the last visit
    private String physicianName; // Name of the physician in charge
    private String medications; // Medications prescribed to the patient
    private String allergies; // Any known allergies the patient has
    private String testResults; // Results of any tests conducted
}
