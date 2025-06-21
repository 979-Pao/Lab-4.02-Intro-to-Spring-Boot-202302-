package com.hospital;

import com.hospital.model.Employee;
import com.hospital.model.Patient;
import com.hospital.repository.EmployeeRepository;
import com.hospital.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final PatientRepository patientRepository;

    public DataLoader(EmployeeRepository employeeRepository, PatientRepository patientRepository) {
        this.employeeRepository = employeeRepository;
        this.patientRepository = patientRepository;
    }

    @Override
    public void run(String... args) {
        // Crear empleados
        Employee e1 = new Employee(356712L, "cardiology", "Alonso Flores", "ON_CALL");
        Employee e2 = new Employee(564134L, "immunology", "Sam Ortega", "ON");
        Employee e3 = new Employee(761527L, "cardiology", "German Ruiz", "OFF");
        Employee e4 = new Employee(166552L, "pulmonary", "Maria Lin", "ON");
        Employee e5 = new Employee(156545L, "orthopaedic", "Paolo Rodriguez", "ON_CALL");
        Employee e6 = new Employee(172456L, "psychiatric", "John Paul Armes", "OFF");

        employeeRepository.save(e1);
        employeeRepository.save(e2);
        employeeRepository.save(e3);
        employeeRepository.save(e4);
        employeeRepository.save(e5);
        employeeRepository.save(e6);

        // Crear pacientes
        patientRepository.save(new Patient(null, "Jaime Jordan", LocalDate.of(1984, 3, 2), e2));
        patientRepository.save(new Patient(null, "Marian Garcia", LocalDate.of(1972, 1, 12), e2));
        patientRepository.save(new Patient(null, "Julia Dusterdieck", LocalDate.of(1954, 6, 11), e1));
        patientRepository.save(new Patient(null, "Steve McDuck", LocalDate.of(1931, 11, 10), e3));
        patientRepository.save(new Patient(null, "Marian Garcia", LocalDate.of(1999, 2, 15), e6));
    }
}
