package com.jasperreports.sprigboot.Reportes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Empleado {


    @Id
    @Generated
    private Long id;
    private String firstname;
    private String lastname;
    private Double salary;
    private Date doj;
    private String designation;

}
