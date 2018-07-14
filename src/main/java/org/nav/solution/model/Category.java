package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name ="product_category")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category implements Serializable {
    private static long serialVersionUID=234L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="categoryid")
    private int categoryid;
    @NotNull
    @NotEmpty
    @Size(min=3,max=200)
    private String categoryName;


}


