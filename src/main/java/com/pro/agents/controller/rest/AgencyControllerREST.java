package com.pro.agents.controller.rest;


import com.pro.agents.model.Agency;
import com.pro.agents.service.agency.impls.AgencyServiceImpl;
import com.pro.agents.service.agency.interfaces.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/agency")
public class AgencyControllerREST {

    private final AgencyServiceImpl service;

    @Autowired
    public AgencyControllerREST(AgencyServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/get/list")
    List<Agency> getAll(){
        return service.getAll();
    }

}
