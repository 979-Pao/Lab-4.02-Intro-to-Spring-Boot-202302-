package com.hospital.model;

import jakarta.persistence.*;
import lombok.*;

@Entity  // Marca esta clase como una entidad de base de datos
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id  // Marca como clave primaria
    private Long employeeId;  // Sin @GeneratedValue porque nos das tú el ID

    private String department;

    private String name;

    private String status;
}
