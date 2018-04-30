package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="Employee_Attendence")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attendance implements Serializable {
    private static long serialVersionUID=1234L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int salaryId;

}
