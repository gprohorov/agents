package com.pro.agents.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
// путека на отдых в мигово


public class Voucher {
    private String id;
    private Agency agency;
    private LocalDate from;
    private LocalDate to;
    private Person person;
    private boolean procedures;  // запланированы ли процедуры
    private boolean hotel;        //  будет ли отель или в частном секторе
    private Food food;       // какая харчовка  :  ЗАВТРАК,  ЗАВТРАК И УЖИН,   ВСЁ ВКЛЮЧЕНО
    private VoucherStatus status;   // предварительный заказ, принят, отклонен,  активен. погашен
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public Voucher() {
    }

    public Voucher(Agency agency, LocalDate from, LocalDate to, Person person, boolean procedures, boolean hotel, Food food, VoucherStatus status, String desc, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.agency = agency;
        this.from = from;
        this.to = to;
        this.person = person;
        this.procedures = procedures;
        this.hotel = hotel;
        this.food = food;
        this.status = status;
        this.desc = desc;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Voucher(String id, Agency agency, LocalDate from, LocalDate to, Person person, boolean procedures, boolean hotel, Food food, VoucherStatus status, String desc, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.agency = agency;
        this.from = from;
        this.to = to;
        this.person = person;
        this.procedures = procedures;
        this.hotel = hotel;
        this.food = food;
        this.status = status;
        this.desc = desc;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Voucher(String id, Agency agency, LocalDate from, LocalDate to, Person person, boolean procedures, boolean hotel, Food food, VoucherStatus status) {
        this.id = id;
        this.agency = agency;
        this.from = from;
        this.to = to;
        this.person = person;
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

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isProcedures() {
        return procedures;
    }

    public void setProcedures(boolean procedures) {
        this.procedures = procedures;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public VoucherStatus getStatus() {
        return status;
    }

    public void setStatus(VoucherStatus status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "id='" + id + '\'' +
                ", agency=" + agency +
                ", from=" + from +
                ", to=" + to +
                ", person=" + person +
                ", procedures=" + procedures +
                ", hotel=" + hotel +
                ", food=" + food +
                ", status=" + status +
                ", desc='" + desc + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return getId().equals(voucher.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
