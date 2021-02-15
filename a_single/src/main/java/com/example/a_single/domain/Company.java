package com.example.a_single.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company extends Client {

    //child class can not have ID (parent's ID will be used)

    @Column(name = "company_name", columnDefinition = "varchar(20)")
    private String companyName;

    @Column(name = "industry", columnDefinition = "varchar(30)")
    private String industry;

    public Company() {
    }

    //super constructor has to be called to fill the common columns
    public Company(String address, Character type, String companyName, String industry) {
        super(address, type);
        this.companyName = companyName;
        this.industry = industry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
