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
@Table(name="nav_employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable{
    private static long serialVersionUID=234L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nav_empoyee")
    @NotNull

    private int employeeId;
;    @NotNull(message = "Employee First name is requird")
    @NotEmpty
    @Size(min = 4,max = 250)
    private String employeeFname;
    @NotNull(message="Employee Last name is requird")
    @NotEmpty
    @Size(min = 4,max = 250)
    private String employeeLname;
    @NotNull(message = "Please select the employee Gender")
    @NotEmpty
    private String employeeGender;
    @NotEmpty
    @NotNull(message = "Please select the employe birth date")
    @DateTimeFormat
    private String employeeBdate;
    @NotEmpty
    @NotNull(message="Please enter the email")
    @Email
    private String employeeEmail;
    @NotEmpty
    @NotNull(message = "please enter the phone number")

    private String  employeePhone;
    @NotNull(message = "Please enter the Mobile no")
    @NotEmpty

    private String employeeMobile;
    @NotEmpty
    @NotNull(message = "please Select the Employee title")

    private String employeeTitle;
    @NotEmpty
    @NotNull(message = "please select the employee hire date")
    private String employeeHiredate;
    @NotEmpty
    @NotNull(message = "Please Select the Employee Country")
    private String employeeCountry;
    @NotEmpty
    @NotNull(message="please enter the state")

    private String employeeState;
    @NotEmpty
    @NotNull(message="please enter the employee city")

    private String employeeCity;
    @NotEmpty
    @NotNull(message = "please enter the employee Street name ")
    private String employeeStreet;
    @NotNull(message = "please enter the employee postal no")
    @NotEmpty
    private String employeePostal;
    @NotEmpty
    @NotNull(message = "please enter the employee temporary Country")
    private String employeeTempCountry;
    @NotEmpty
    @NotNull(message = "please enter the employee temporary state")
    private String employeeTempState;
    @NotEmpty
    @NotNull(message = "please enter the employee temporary  city ")
    private String employeeTempCity;
    @NotEmpty
    @NotNull(message = "please enter the employee temporary  Street ")
    private String employeeTempStreet;
    @NotEmpty
    @NotNull(message = "please enter temporary postal ")
    private String employeeTempPostal;
    @NotEmpty
    @NotNull(message = "please enter temporary postal ")
    private String employeeAbout;
    @NotEmpty

    private byte[] employeePhoto;
    @NotEmpty
    @NotNull
    private byte[] employeeDocument;


}
