package org.nav.solution.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name="nav_shipper")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Shipper {
    private static long serialVersionUID =1234567L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="shipper_id")
    private long Id;
    @NotNull
    @Column(name="shipper_name")
    private String shipperName;
    @Column(name="shipper_registrationno")
    private long shipperRegistration;
    @NotNull
    @Column(name="shipper_email")
    private String shipperEmail;
    @NotNull
    @Column(name="shipper_phone")
    private String ShipperPhone;
    @Column(name="shipper_location")
    @NotNull
    private String shipperMobile;
    @NotNull
    @Column(name="shipper_website")
    private String shipperWebsite;
   @NotNull
    @Column(name="shipper_country")
    private String shipperCountry;
   @NotNull
   @Column(name="shipper_state")
    private String shipperState;
   @Column(name="shipper_district")
   @NotNull
   private String shipperDistrict;
   @NotNull
   @Column(name="shipper_city")
    private String shipperCity;
   @NotNull
   @Column(name="shipper_street")
    private String shipperStreet;
    @Column(name="shipper_postal")
    private String shipperPostal;



}
