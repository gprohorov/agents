package com.pro.agents.admin;

import com.pro.agents.repository.agency.AgencyRepositoryFakeImpl;
import com.pro.agents.repository.person.PersonRepositoryFakeImpl;
import com.pro.agents.repository.voucher.VoucherRepositoryFakeImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class DbGeneration {

    @Autowired
    PersonRepositoryFakeImpl personRepository;

    @Autowired
    AgencyRepositoryFakeImpl agencyRepository;

    @Autowired
    VoucherRepositoryFakeImpl voucherRepository;


    @PostConstruct
    void init(){



    }



}
