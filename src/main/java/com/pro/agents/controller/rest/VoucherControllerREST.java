package com.pro.agents.controller.rest;


import com.pro.agents.model.Person;
import com.pro.agents.model.Voucher;
import com.pro.agents.service.person.impls.PersonServiceImpl;
import com.pro.agents.service.voucher.impls.VoucherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/voucher")
public class VoucherControllerREST {

    @Autowired
    VoucherServiceImpl service;

    @RequestMapping("/get/list")
    List<Voucher> getAll(){
        return service.getAll();
    }
/**/
}
