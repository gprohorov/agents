package com.pro.agents.controller.rest;


import com.pro.agents.model.Agency;
import com.pro.agents.model.Person;
import com.pro.agents.service.agency.impls.AgencyServiceImpl;
import com.pro.agents.service.person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonControllerREST {

    private final PersonServiceImpl service;

    @Autowired
    public PersonControllerREST(PersonServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/get/list")
    List<Person> getAll(){
        return service.getAll();
    }

}
