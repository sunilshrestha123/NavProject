package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

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
    private String order_number;
    private Date transaction_date;
    private Customer customer_id;
    private double total_amount;



    



}
