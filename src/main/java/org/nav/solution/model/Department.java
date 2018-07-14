package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Table(name="nav_department")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department implements Serializable {
    public static  long serialVersionUID=12L;
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="department_Id")
    @NotNull
    private int departmentId;
  @NotNull
  @NotEmpty
  @Column (name="department_name")
private String departmentName;
    @NotEmpty
    @NotNull
    @Column(name = "department_location")
private String departmentLocation;

}
