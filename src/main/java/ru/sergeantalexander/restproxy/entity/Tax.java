package ru.sergeantalexander.restproxy.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Tax {

    BigDecimal buildingTax;
    BigDecimal carTax;
    BigDecimal salaryTax;

    public BigDecimal getBuildingTax() {
        return buildingTax;
    }

    public void setBuildingTax(BigDecimal buildingTax) {
        this.buildingTax = buildingTax;
    }

    public BigDecimal getCarTax() {
        return carTax;
    }

    public void setCarTax(BigDecimal carTax) {
        this.carTax = carTax;
    }

    public BigDecimal getSalaryTax() {
        return salaryTax;
    }

    public void setSalaryTax(BigDecimal salaryTax) {
        this.salaryTax = salaryTax;
    }
}
