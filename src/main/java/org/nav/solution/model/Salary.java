package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="emp_salary")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Salary implements Serializable {
    private static  long serialVersionUID=123L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="salary_id")
    private int sal_Id;
    private int sal_emp_id;
    private long sal_amount;
    private String sal_type;
    private String sal_desc;
}
