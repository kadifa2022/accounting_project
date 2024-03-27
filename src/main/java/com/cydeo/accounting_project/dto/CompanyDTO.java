package com.cydeo.accounting_project.dto;

import com.cydeo.accounting_project.enums.CompanyStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDTO {
    private Long id;

//    @NotBlank(message = "Title is a required field.")
//    @Size(max = 100, min = 2, message = "Title should be 2-100 characters long.")
    private String title;

//    @NotBlank(message= "Phone Number is required field and may be in any valid phone number format.")
//    @Pattern(regexp = "^\\d{11}$|^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", message = "Phone is required field and may be in any valid phone number format." )
    private String phone;

//    @NotBlank(message= "Phone Number is required field and may be in any valid phone number format.")
//    @Pattern(regexp = "^\\d{11}$|^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", message = "Phone is required field and may be in any valid phone number format." )
    private String website;

//    @Valid
    private AddressDTO address;
    private CompanyStatus companyStatus;
}
