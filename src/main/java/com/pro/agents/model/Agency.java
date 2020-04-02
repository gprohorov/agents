package com.pro.agents.model;

import java.time.LocalDateTime;
import java.util.Objects;


//  агенство, которое делает ваучер (заказ на лечение-отдых )
//  может быть фирмой, частным преппринимателем, частным лицом. PERSON, COMPANY, BUSSINESMAN;
//  если это представитель фирмы JoinUp  Иван Иванов,
//  то в поле name  пишут JoinUp,  а в поле contactPerson -  Иван Иванов
// в поле  Agent  будет написано   -  COMPANY

public class Agency {

    private int id;
    private String name;
    private Agent agent;
    private String address;
    private String telephone;
    private String contactPerson;
    private AgencyStatus status;   // High, low    статус агенство, от которого будет что-то зависить, возможно процент
    private double percent;       //  процент который берет агенство за каждого туриста
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public Agency() {}

    public Agency(String name, Agent agent, String address, String telephone, String contactPerson, AgencyStatus status, double percent, String desc, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.name = name;
        this.agent = agent;
        this.address = address;
        this.telephone = telephone;
        this.contactPerson = contactPerson;
        this.status = status;
        this.percent = percent;
        this.desc = desc;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Agency(int id, String name, Agent agent, String address, String telephone, String contactPerson, AgencyStatus status, double percent, String desc, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.agent = agent;
        this.address = address;
        this.telephone = telephone;
        this.contactPerson = contactPerson;
        this.status = status;
        this.percent = percent;
        this.desc = desc;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public AgencyStatus getStatus() {
        return status;
    }

    public void setStatus(AgencyStatus status) {
        this.status = status;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agency agency = (Agency) o;
        return getId() == agency.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Agency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", agent=" + agent +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", status=" + status +
                ", percent=" + percent +
                ", desc='" + desc + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
