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

@Table(name="client_list")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client implements Serializable{
    private static long serialVersionUID=123L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="client_id")
        @NotNull

        private int clientId;
        @NotNull
        @NotEmpty
        @Size(min = 4,max = 250)
        private String clientName;
        @NotEmpty
        @NotNull
        @Email
        private String clientEmail;
        @NotEmpty
        @NotNull
        @Size(min=6,max = 250)
        private String clientPhone;
        @NotEmpty
        @NotNull
        @Size(min=4,max = 20)
        private String clientMobile;
    @NotEmpty
    @NotNull
    @Size(min=4,max = 20)
        private String clientAddress;
    @NotEmpty
    @NotNull
    @Size(min=4,max = 20)

        private String clientCity;
    @NotEmpty
    @NotNull
    @Size(min=4,max = 20)
        private String clientCountry;
    @NotNull
    @NotEmpty

        private String clientLocation;



    }
