package com.github.ovchingus.model;


import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Immutable
@Table(name = "IncomePerMonth")
public class IncomePerMonthView {


    @Column(name = "Income")
    private Double income;

    @Id
    @Column(name = "Date")
    private String date;

    public IncomePerMonthView() {
    }

    public IncomePerMonthView(Double name, String date) {
        this.income = name;
        this.date = date;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double name) {
        this.income = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
