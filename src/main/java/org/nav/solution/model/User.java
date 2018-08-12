package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="user_name")
public class User implements Serializable {
    private static long serialVersionUID=1L;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    private Boolean status;
    @OneToMany(mappedBy = "uuid")
    private List<UserRole> userRole;
}
