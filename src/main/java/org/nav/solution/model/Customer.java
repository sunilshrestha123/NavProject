package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Table(name="nav_customer")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor


public class Customer implements Serializable {
    private static long serialVersionUID=234L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String customerName;
    private String customerCompany;
    private String customerPhone;
    private String customerMobile;
    private String customerfax;
    private String customerCountry;
    private String customerAddress;
    private String customerStreetname;
    private String cutomerZipcode;
    private String customerGender;
    private String customerBdate;
    private String customerPhoto;
    private String customerEmail;
    private String customerUsername;
    private String customerType;
    private String customerWebsite;
    private String customerPassword;



}
