package ru.sergeantalexander.restproxy.entity;

import org.springframework.stereotype.Component;

@Component
public class ClientInfo {

    private PersonalData personalData;
    private Insurance insurance;
    private Tax tax;

    public ClientInfo(PersonalData personalData, Insurance insurance, Tax tax) {
        this.personalData = personalData;
        this.insurance = insurance;
        this.tax = tax;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }
}
