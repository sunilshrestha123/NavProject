package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="nav_customer")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor


public class Customer implements Serializable {
    private static long serialVersionUID=234L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    @Column(name="customer_code")
    private String customerCode;
    @Column(name="customer_name")
    private String customerName;
    @Column(name = "customer_companyname")
    private String customerCompanyName;
    @Column (name="customer_phone")
    private long customerPhone;
    @Column(name="customer_mobile")
    private long customerMobile;
    @Column(name="customer_country")
    private String customerCountry;
    @Column(name="customer_city")
    private String customerCity;
    @Column (name="customer_address")
    private String customerAddress;
    @Column(name="customer_streetname")
    private String customerStreetname;
    @Column(name="customer_zipcode")
    private String customerZipcode;
    @Column(name="custoemr_gender")
    private String customerGender;
    @Column(name="customer_bdate")
    private String customerBdate;
    @Column(name="customer_phott")
    private Byte[] customerPhoto;
    @Column(name="customer_type")
    private String customerType;
    @Column(name="customer_email")
    private String customerEmail;
    @Column(name="customer_password")
    private String customerPassword;
    private Date createdDate;
    private Date updatedDate;
    private boolean status;

}
