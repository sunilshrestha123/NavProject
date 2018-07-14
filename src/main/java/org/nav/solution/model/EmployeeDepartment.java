package org.nav.solution.model;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Table(name="emp_dep")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class EmployeeDepartment implements Serializable {
    private static long serialVersionUID=123L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long emp_dep;




}
