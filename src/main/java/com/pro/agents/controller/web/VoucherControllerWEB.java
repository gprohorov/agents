package com.pro.agents.controller.web;


import com.pro.agents.form.VoucherForm;
import com.pro.agents.model.Agency;
import com.pro.agents.model.Food;
import com.pro.agents.model.Voucher;
import com.pro.agents.service.agency.impls.AgencyServiceImpl;
import com.pro.agents.service.voucher.impls.VoucherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        ArrayList<String> gender = new ArrayList<>();
        if(voucher.getPerson().isGender()){
            gender.add("Man");
            gender.add("Woman");
        }
        else{
            gender.add("Woman");
            gender.add("Man");
        }
        model.addAttribute("Gender", gender);
        String nullMonth = "", nullDay = "";
        if(voucher.getPerson().getDateOfBirth().getMonthValue() < 10)
        {
            nullMonth = "0";
        }
        if(voucher.getPerson().getDateOfBirth().getDayOfMonth() < 10){
            nullDay = "0";
        }
        voucherForm.setDateOfBirth(nullMonth +
                voucher.getPerson().getDateOfBirth().getMonthValue()
                + "/" + nullDay
                + voucher.getPerson().getDateOfBirth().getDayOfMonth()
                + "/" + voucher.getPerson().getDateOfBirth().getYear());
       // voucherForm.setDesc("Учасник АТО");

        voucherForm.setDesc(voucher.getPerson().getDesc());

        voucherForm.setAgency(voucher.getAgency().getName());

        nullMonth = "";
        nullDay = "";
        if(voucher.getFrom().getMonthValue() < 10){
            nullMonth = "0";
        }
        if (voucher.getFrom().getDayOfMonth() < 10){
            nullDay = "0";
        }

        voucherForm.setFrom( nullMonth + voucher.getFrom().getMonthValue() + "/"
                + nullDay + voucher.getFrom().getDayOfMonth() + "/"
                + voucher.getFrom().getYear());

        nullMonth = "";
        nullDay = "";
        if(voucher.getTo().getMonthValue() < 10){
            nullMonth = "0";
        }
        if (voucher.getTo().getDayOfMonth() < 10){
            nullDay = "0";
        }

        voucherForm.setTo(nullMonth + voucher.getTo().getMonthValue() + "/"
                + nullDay + voucher.getTo().getDayOfMonth() + "/"
                + voucher.getTo().getYear());
        ArrayList<String> procedures = new ArrayList<>();
        if(voucher.isProcedures()){
            procedures.add("Yes");
            procedures.add("No");
        }
        else{
            procedures.add("No");
            procedures.add("Yes");
        }
        model.addAttribute("Procedures", procedures);
        ArrayList<String> hotel = new ArrayList<>();
        if(voucher.isHotel()){
            hotel.add("Yes");
            hotel.add("No");
        }
        else{
            hotel.add("No");
            hotel.add("Yes");
        }
        model.addAttribute("Hotel", hotel);
        ArrayList<String> food = new ArrayList<>();
        food.add(voucher.getFood().toString());
        for (Food item :
                Food.values()) {
            food.add(item.toString());
        }
        model.addAttribute("Food", food);
        model.addAttribute("voucherForm", voucherForm);

        return "voucherEdit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("voucherForm") VoucherForm voucherForm){
        boolean gender, procedure, hotel;
        if(voucherForm.getGender().equals("Man")){
            gender = true;
        }
        else{
            gender = false;
        }
        if(voucherForm.getProcedures().equals("Yes")){
            procedure = true;
        }
        else{
            procedure = false;
        }
        if(voucherForm.getHotel().equals("Yes")){
            hotel = true;
        }
        else{
            hotel = false;
        }

        Voucher voucher = service.get(voucherForm.getId());
        voucher.getPerson().setFullName(voucherForm.getFullName());
        voucher.getPerson().setCellPhone(voucherForm.getCellPhone());
        voucher.getPerson().setTown(voucherForm.getTown());
        voucher.getPerson().setAddress(voucherForm.getAddress());
        voucher.getPerson().setGender(gender);
        System.out.println(voucherForm.getDateOfBirth());
        voucher.getPerson().setDateOfBirth(LocalDate.parse(voucherForm.getDateOfBirth(),
                DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        voucher.getPerson().setDesc(voucherForm.getDesc());
        voucher.getAgency().setName(voucherForm.getAgency());
        voucher.setFrom(LocalDate.parse(voucherForm.getFrom(),
                DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        voucher.setTo(LocalDate.parse(voucherForm.getTo(),
                DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        voucher.setProcedures(procedure);
        voucher.setHotel(hotel);
        for (Food item :
                Food.values()) {
            if(item.toString().equals(voucherForm.getFood()))
            {
                voucher.setFood(item);
                break;
            }
        }

        return "redirect:/web/voucher/get/list";
    }
    
}
