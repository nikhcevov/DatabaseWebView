package com.github.ovchingus.model;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FName")
    private String fName;

    @Column(name = "MName")
    private String mName;

    @Column(name = "LName")
    private String lName;

    @Column(name = "Address")
    private String address;

    @Column(name = "City")
    private String city;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "DateInSystem")
    private String dateInSystem;

    public Customers() {
    }

    public Customers(String fName, String mName, String lName,
                     String address, String city, String phone,
                     String dateInSystem) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.dateInSystem = dateInSystem;
    }

    public Customers(int id, String fName, String mName,
                     String lName, String address, String city,
                     String phone, String dateInSystem) {
        this.id = id;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.dateInSystem = dateInSystem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateInSystem() {
        return dateInSystem;
    }

    public void setDateInSystem(String dateInSystem) {
        this.dateInSystem = dateInSystem;
    }
}
