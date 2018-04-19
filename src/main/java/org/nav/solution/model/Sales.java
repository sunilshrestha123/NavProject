package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Table(name="nav_sales")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sales implements Serializable{
    private static long serialVersionUID =234L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nav_sales_id")
    @NotNull
    @NotEmpty
    private long salesId;
    @NotEmpty
    @NotNull
    @Size(min = 6,max = 250)
private String partyName;
    @NotNull
    @NotEmpty
    @DateTimeFormat(pattern ="yyyy-mm-dd")
private String salesDate;
    @NotEmpty
    @NotNull
    @Size(min=5,max =250)
private String goodsName;
    @NotNull
    @NotEmpty
private long receiptBillNo;
    @NotEmpty
    @NotNull
private int  goodsQuantitiy;
@NotEmpty
@NotNull
    private double goodsPrice;
@NotEmpty
@NotNull
private double goodsTotoalAmount;


}
