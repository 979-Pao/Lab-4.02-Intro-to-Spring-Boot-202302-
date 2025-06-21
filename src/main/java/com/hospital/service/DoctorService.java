package com.hospital.service;

import com.hospital.model.Employee;
import com.hospital.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final EmployeeRepository employeeRepository;

    public DoctorService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllDoctors() {
        return employeeRepository.findAll();
    }

    public Employee getDoctorById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getDoctorsByStatus(String status) {
        return employeeRepository.findByStatus(status);
    }

    public List<Employee> getDoctorsByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }
}