package com.pro.agents.model;


//  скорее всего то же самое что и персон для для пациентов
//  то есть из него потом делается Пациент для процедур и гость для готеля

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

//  персона
//

public class Person {

    private String id;

    private String fullName;
    private String cellPhone;
    private String town;
    private String address;
    private boolean gender;
    private LocalDate dateOfBirth;
    private String desc;
    private String desc2;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public Person() {
    }

    public Person(String fullName, String cellPhone, String town, String address, boolean gender, LocalDate dateOfBirth, String desc, String desc2, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.fullName = fullName;
        this.cellPhone = cellPhone;
        this.town = town;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.desc = desc;
        this.desc2 = desc2;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Person(String id, String fullName, String cellPhone, String town, String address, boolean gender, LocalDate dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.cellPhone = cellPhone;
        this.town = town;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String id, String fullName, String cellPhone, String town, String address, boolean gender, LocalDate dateOfBirth, String desc) {
        this.id = id;
        this.fullName = fullName;
        this.cellPhone = cellPhone;
        this.town = town;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.desc = desc;
    }

    public Person(String id, String fullName, String cellPhone, String town, String address, boolean gender, LocalDate dateOfBirth, String desc, String desc2, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.fullName = fullName;
        this.cellPhone = cellPhone;
        this.town = town;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.desc = desc;
        this.desc2 = desc2;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
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
        Person person = (Person) o;
        return getId().equals(person.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", town='" + town + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", desc='" + desc + '\'' +
                ", desc2='" + desc2 + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }
}
