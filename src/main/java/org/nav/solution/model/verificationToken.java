//package org.nav.solution.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.Calendar;
//import java.util.Date;
//@Data
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//public class verificationToken {
//    private static  final int EXIRATION=60*24;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long Id;
//    private String token;
//    @OneToOne(targetEntity =User.class,fetch = FetchType.EAGER)
//    @JoinColumn(nullable = false,name="user_id")
//    private User user;
//    private Date expiration;
//    private Date calculationExpiryDate(int expiryTimeInMinute){
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(new Timestamp(cal.getTime().getTime()));
//        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
//        return new Date(cal.getTime().getTime());
//    }
//
//}
