package com.github.ovchingus.model;

import javax.persistence.*;

@Entity
@Table(name = "EmployeesInfo")
public class EmployeesInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "MaritalStatus")
    private String maritalStatus;

    @Column(name = "BirthDate")
    private String birthDate;

    @Column(name = "Adress")
    private String address;

    @Column(name = "Phone")
    private String phone;

    public EmployeesInfo() {
    }

    public EmployeesInfo(String maritalStatus, String birthDate, String address, String prhone) {
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = prhone;
    }

    public EmployeesInfo(int id, String maritalStatus, String birthDate, String address, String prhone) {
        this.id = id;
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = prhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrhone() {
        return phone;
    }

    public void setPrhone(String prhone) {
        this.phone = prhone;
    }
}
