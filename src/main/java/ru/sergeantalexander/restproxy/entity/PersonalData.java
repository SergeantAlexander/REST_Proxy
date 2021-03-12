package ru.sergeantalexander.restproxy.entity;

import org.springframework.stereotype.Component;

@Component
public class PersonalData {

    Long id;
    String name;
    String surname;
    Long socialSecurityNumber;
    Integer inn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(Long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }
}
