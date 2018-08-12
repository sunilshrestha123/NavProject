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
import java.util.Date;

@Table(name="nav_sales")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sales implements Serializable{
    private static long serialVersionUID =234L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nav_sales_id")
    @NotNull
    @NotEmpty
    private long salesId;
    @Column(name="party_name")
    @NotEmpty
    @NotNull
    private String partyName;
    @Column(name="salesDate")
    @NotEmpty
    private Date salesDate;
    @Column(name="product_name")
    @NotEmpty
    private String productName;
    @Column(name="sales_invoice")
    @NotEmpty
    private long invoiceNo;
    @Column(name="goods_quantity")
    @NotEmpty
    @NotNull
    private int productQuantity;
    @NotEmpty
    @NotNull
    @Column(name="product_price")
    private double productPrice;
    @NotEmpty
    @NotNull
    @Column(name="total_amount")
    private double TotoalAmount;
    @Column(name="sales_remark")
    @NotNull
    @NotEmpty
    private Employee employeeSales;
    private String Remark;


}
