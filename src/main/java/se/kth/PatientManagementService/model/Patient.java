package se.kth.PatientManagementService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthdate;
    private String address;
    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_record_id", referencedColumnName = "id")
    private MedicalRecord medicalRecord;


}
