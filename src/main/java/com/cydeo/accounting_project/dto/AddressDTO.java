package com.cydeo.accounting_project.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder // Readability/ flexibility/ Immutability/ reduced Boilerplate
public class AddressDTO {

    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String zipCode;


}
