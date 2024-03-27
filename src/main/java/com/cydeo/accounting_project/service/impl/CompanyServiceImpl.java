package com.cydeo.accounting_project.service.impl;

import com.cydeo.accounting_project.dto.CompanyDTO;
import com.cydeo.accounting_project.entity.Company;
import com.cydeo.accounting_project.mapper.MapperUtil;
import com.cydeo.accounting_project.repository.CompanyRepository;
import com.cydeo.accounting_project.service.CompanyService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl  implements CompanyService {

    private final CompanyRepository companyRepository;
    private final MapperUtil mapperUtil;

    public CompanyServiceImpl(CompanyRepository companyRepository, MapperUtil mapperUtil) {
        this.companyRepository = companyRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<CompanyDTO> getAllCompanies() {
        List<Company> companyList = companyRepository.findAll(Sort.by("title"));
        return companyList.stream()
                .map(company ->mapperUtil.convert(company, new CompanyDTO()))
                .collect(Collectors.toList());

    }
}
