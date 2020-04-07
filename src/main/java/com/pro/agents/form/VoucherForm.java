package com.pro.agents.form;

import com.pro.agents.model.Agency;
import com.pro.agents.model.Food;
import com.pro.agents.model.Person;
import com.pro.agents.model.VoucherStatus;

import java.time.LocalDate;

public class VoucherForm {

    private String id;
    private String fullName;
    private String cellPhone;
    private String town;
    private String address;
    private String gender;
    private String dateOfBirth;
    private String desc;

    private String agency;
    private String from;
    private String to;
    private String procedures;  // запланированы ли процедуры
    private String hotel;        //  будет ли отель или в частном секторе
    private String food;       // какая харчовка  :  ЗАВТРАК,  ЗАВТРАК И УЖИН,   ВСЁ ВКЛЮЧЕНО
    private VoucherStatus status;

    public VoucherForm() {
    }

    public VoucherForm(String id, String fullName, String cellPhone, String town, String address, String gender, String dateOfBirth, String desc, String agency, String from, String to, String procedures, String hotel, String food, VoucherStatus status) {
        this.id = id;
        this.fullName = fullName;
        this.cellPhone = cellPhone;
        this.town = town;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.desc = desc;
        this.agency = agency;
        this.from = from;
        this.to = to;
        this.procedures = procedures;
        this.hotel = hotel;
        this.food = food;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getProcedures() {
        return procedures;
    }

    public void setProcedures(String procedures) {
        this.procedures = procedures;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public VoucherStatus getStatus() {
        return status;
    }

    public void setStatus(VoucherStatus status) {
        this.status = status;
    }




}
