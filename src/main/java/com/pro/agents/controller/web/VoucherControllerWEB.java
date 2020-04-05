package com.pro.agents.controller.web;


import com.pro.agents.form.VoucherForm;
import com.pro.agents.model.Agency;
import com.pro.agents.model.Voucher;
import com.pro.agents.service.agency.impls.AgencyServiceImpl;
import com.pro.agents.service.voucher.impls.VoucherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/web/voucher")
public class VoucherControllerWEB {

    @Autowired
    VoucherServiceImpl service;


    @RequestMapping("/get/list")
    String getAll(Model model ){
        List<Voucher> list = service.getAll();
        model.addAttribute("vouchers", list);
        return "vouchers";
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editVoucher(Model model, @PathVariable(value = "id") String id){
        VoucherForm voucherForm = new VoucherForm();
        Voucher voucher = service.get(id);

        voucherForm.setId(voucher.getId());
       voucherForm.setFullName(voucher.getPerson().getFullName());
        voucherForm.setCellPhone(voucher.getPerson().getCellPhone());
        voucherForm.setTown(voucher.getPerson().getTown());
        voucherForm.setAddress(voucher.getPerson().getAddress());
        voucherForm.setGender(voucher.getPerson().isGender());
        voucherForm.setDateOfBirth(voucher.getPerson().getDateOfBirth().toString());
       // voucherForm.setDesc("Учасник АТО");

        voucherForm.setDesc(voucher.getPerson().getDesc());

        voucherForm.setAgency(voucher.getAgency().getName());
        voucherForm.setFrom(voucher.getFrom().toString());
        voucherForm.setTo(voucher.getTo().toString());
        voucherForm.setProcedures(voucher.isProcedures());
       voucherForm.setHotel(voucher.isHotel());
        voucherForm.setFood(voucher.getFood().toString());

        model.addAttribute("voucherForm", voucherForm);

        return "voucherEdit";
    }
    
}
