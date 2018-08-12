//package org.nav.solution.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name="emp_salary")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//public class Salary implements Serializable {
//    private static  long serialVersionUID=123L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="salary_id")
//    private long sal_Id;
//   // @OneToOne(cascade =CascadeType.ALL )
//    private long sal_emp_id;
//    @Column(name="salary_amount")
//    private double sal_amount;
//    private String sal_type;
//    private String sal_desc;
//    private boolean status;
//
//
//}
