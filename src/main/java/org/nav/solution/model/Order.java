package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Table(name="Nav_Order")
@Controller
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable{
    private static long serialVersionUID=234L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nav_order_id")
    @NotNull
    private long orderID;


}
