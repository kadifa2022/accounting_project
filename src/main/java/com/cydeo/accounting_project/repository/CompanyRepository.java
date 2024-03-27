package com.cydeo.accounting_project.repository;

import com.cydeo.accounting_project.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
