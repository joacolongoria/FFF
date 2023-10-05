package com.neutrinosys.peopledbweb.biz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

    Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    private BigDecimal salary;

    public String getFormattedDOB(){
        return DateTimeFormatter.ofPattern("MMMM dd, yyyy").format(dob);

    }
}
