package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.hibernate.boot.registry.selector.StrategyRegistrationProvider;

import javax.persistence.*;
@Table(name="nav_student")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="first_name")
    private String firstname;
    @Column(name="last_name")
    private String lastname;
@Column(name="email")
    private String email;


}