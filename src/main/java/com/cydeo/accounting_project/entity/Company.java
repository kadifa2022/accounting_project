package com.cydeo.accounting_project.entity;

import com.cydeo.accounting_project.dto.AddressDTO;
import com.cydeo.accounting_project.entity.common.BaseEntity;
import com.cydeo.accounting_project.enums.CompanyStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "companies")
public class Company extends BaseEntity {
    @Column(unique = true)
    private String title;

    private String phone;
    private String website;

    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
    private Address address;




}
