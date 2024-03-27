package com.cydeo.accounting_project.controller;

import com.cydeo.accounting_project.dto.CompanyDTO;
import com.cydeo.accounting_project.entity.Company;
import com.cydeo.accounting_project.model.ResponseWrapper;
import com.cydeo.accounting_project.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> listAllCompanies(){
        List<CompanyDTO> companyList = companyService.getAllCompanies();
        ResponseWrapper response;
        if(companyList.isEmpty()){
            response = new ResponseWrapper("Not companies found", HttpStatus.NOT_FOUND);
        }else{
            response = new ResponseWrapper("Companies retrieved successfully", companyList, HttpStatus.OK);
        }
        return ResponseEntity.status(response.getCode()).body(response);
    }

//    @GetMapping("/create")
//    public ResponseEntity<ResponseWrapper> createCompany(){
//
//        return ResponseEntity( new ResponseWrapper("Company is created successfully", companyService.createCompany(), HttpStatus.OK))
//    }


}
