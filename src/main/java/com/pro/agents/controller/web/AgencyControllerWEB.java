package com.pro.agents.controller.web;


import com.pro.agents.model.Agency;
import com.pro.agents.service.agency.impls.AgencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/web/agency")
public class AgencyControllerWEB {

    private final AgencyServiceImpl service;

    @Autowired
    public AgencyControllerWEB(AgencyServiceImpl service) {
        this.service = service;
    }

    @RequestMapping("/get/list")
    String getAll(Model model ){

        List<Agency> list = service.getAll();
        model.addAttribute("agencies", list);

        return "agencies";
    }

}
