package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="nav_register")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product implements Serializable{
    private static long serialVersionUID=234L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nav_register_id")
    @NotNull

    private int registerId;
    @NotNull
    @NotEmpty
    @Size(min = 4,max = 250)
    private String registerName;
    @NotEmpty
    @NotNull
    @Email
    private String registeremail;
    @NotEmpty
    @NotNull
    @Size(min=6,max = 250)
    private String registerPassword;


}
