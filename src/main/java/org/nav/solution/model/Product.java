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
import java.util.Date;

@Entity
@Table(name="nav_product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product implements Serializable{
    private static long serialVersionUID=234L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nav_product")
    @NotNull

    private long ProductId;
    @NotNull
    @NotEmpty
    @Size(min = 4,max = 250)
    @Column(name="product_name")
    private String ProductName;

    @NotEmpty
    @NotNull
    @Email
    @Column(name="product_type")
    private String ProductType;
    @NotEmpty
    @NotNull
    @Column(name="product_company")
    private String ProductCompany;
    @Column(name="product_weight")
    private String ProductWeight;
    @Column(name="prooduct_description")
    private String ProductDescription;
    @Column(name="product_Price")
    private Long ProductPrice;
    private String ProductColor;
    @Column(name="product_entryDate")
    private String ProductEntryDate;
    @Column(name="product_mfgdate")
    private Date ProductMgfDate;
    @Column(name="product_expdate")
    private Date ProductExpDate;
    @Column(name="product_photo")
    private byte ProductPhoto;


}
