package com.hospital.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // El ID se genera automáticamente
    private Long patientId;

    private String name;

    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "admitted_by")  // FK en la tabla que apunta al empleado
    private Employee admittedBy;
}