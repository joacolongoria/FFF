package com.neutrinosys.peopledbweb.biz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor//creates constructor with args
@Data//this creates getters and setter ,constructor without args string method
@NoArgsConstructor
@Entity

public class Person {

    @Id
    @GeneratedValue

    private Long id;

    @NotEmpty(message = "First name can not be empty")
    private String firstName;

    @NotEmpty(message = "Last name can not be empty")

    private String lastName;

    @Past(message = "Date of birth must be in the past")
    @NotNull(message = "Dob can not be empty")
    private LocalDate dob;
    @Email(message = "Email must be valid")
    @NotEmpty(message = "Email can not be empty")
    private String email;

    @DecimalMin(value="1000.00", message = "Salary must be at least 1000.00")
    @NotNull(message = "Salary can not be empty")
    private BigDecimal salary;

    private String photoFilename;

    public String getFormattedDOB(){
        return DateTimeFormatter.ofPattern("MMMM dd, yyyy").format(dob);

    }
}
