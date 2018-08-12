package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Currency;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Table(name = "nav_stock")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock implements Serializable {
    private static long serialVersionUID=234L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    @NotNull
   private long productId;

    @Column(name="productname",unique = true)
    @NotNull(message = "these portion is required ")
    private String productName;
    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="categoryid",foreignKey = @ForeignKey(name="srock_category_id"))
    private Category category;
    @Column(name="productcompanyname")
    private String productCompanyName;
    @Column(name="productlocalname")
    private String productLocalName;
    @Column(name="productquantity")
    private long productQuantitiy;
    @Column(name="productcode")
    private long productCode;
    @Column(name="productrack")
    private long productRack;
    @Column(name="productrow")
    private long productRow;
    @Column(name="productallyname")
    private String productTallyName;

    @Column(name="productMaxPrice")
    private double productPriceMax;
    @Column(name="productprice")
    private double productPriceMin;
    @Column(name="productimages")
    private Byte[] productImages;

 //@Temporal(TemporalType.TIMESTAMP)
 @Column(name="productcreated",columnDefinition="TIMESTAMP")
 @CreationTimestamp
 private Date productCreated;
// @Temporal(TemporalType.TIMESTAMP)
@Column(name="productupdated",columnDefinition="TIMESTAMP")
@UpdateTimestamp
 private Date productUpdate;



}
