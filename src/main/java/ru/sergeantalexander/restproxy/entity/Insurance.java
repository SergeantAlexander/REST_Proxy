package ru.sergeantalexander.restproxy.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Insurance {

    BigDecimal buildingInsurance;
    BigDecimal carInsurance;
    BigDecimal personalInsurance;

    public BigDecimal getBuildingInsurance() {
        return buildingInsurance;
    }

    public void setBuildingInsurance(BigDecimal buildingInsurance) {
        this.buildingInsurance = buildingInsurance;
    }

    public BigDecimal getCarInsurance() {
        return carInsurance;
    }

    public void setCarInsurance(BigDecimal carInsurance) {
        this.carInsurance = carInsurance;
    }

    public BigDecimal getPersonalInsurance() {
        return personalInsurance;
    }

    public void setPersonalInsurance(BigDecimal personalInsurance) {
        this.personalInsurance = personalInsurance;
    }
}
