package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Blob;

@Entity
@Table(name="nav_register")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable{
    private static long serialVersionUID=234L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nav_register_id")
    @NotNull

    private int employeeId;
;    @NotNull
    @NotEmpty
    @Size(min = 4,max = 250)
    private String employeeFname;
    @NotNull
    @NotEmpty
    @Size(min = 4,max = 250)
    private String employeeLname;
    @NotNull
    @NotEmpty
    private String employeeGrender;
@NotEmpty
@NotNull
@DateTimeFormat
    private String employeeBdate;
    @NotEmpty
    @NotNull
    @Email
    private String employeeEmail;
    @NotEmpty
    @NotNull
    @Size(min=4,max=20)
    private int  employeePhone;
    @NotNull
    @NotEmpty
    @Size(min = 8 ,max=20)
    private int  employeeMobile;
    @NotEmpty
    @NotNull
    private String employeeTitle;
    @NotEmpty
    @NotNull
    private String employeeHiredate;
    @NotEmpty
    @NotNull
    private String employeeAddress;
    @NotEmpty
    @NotNull
    private String employeeCity;
    @NotEmpty
    @NotNull
    private String employeeCountry;
    @NotEmpty
    @NotNull
    private String employeeRegion;
    @NotEmpty
    @NotNull
    private String employeePostal;
    @NotEmpty
    @NotNull
    private byte[] employeephoto;
    @NotEmpty
    @NotNull
    private float employeeSalary;


}
