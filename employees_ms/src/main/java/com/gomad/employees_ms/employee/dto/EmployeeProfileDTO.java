package com.gomad.employees_ms.employee.dto;

import java.time.LocalDate;

import com.gomad.employees_ms.employee.Gender;

import lombok.Data;

@Data
public class EmployeeProfileDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private String password;
}
