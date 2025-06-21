package com.hospital.controller;

import com.hospital.model.Employee;
import com.hospital.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;
import com.hospital.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class EmployeeController {

    private final DoctorService doctorService;

    public EmployeeController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<Employee> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Employee getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @GetMapping("/status/{status}")
    public List<Employee> getDoctorsByStatus(@PathVariable String status) {
        return doctorService.getDoctorsByStatus(status);
    }

    @GetMapping("/department/{department}")
    public List<Employee> getDoctorsByDepartment(@PathVariable String department) {
        return doctorService.getDoctorsByDepartment(department);
    }
}
