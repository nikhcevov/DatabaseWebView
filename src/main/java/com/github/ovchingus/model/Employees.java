package com.github.ovchingus.model;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
public class Employees {

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

    @Column(name = "Post")
    private String post;

    @Column(name = "Salary")
    private Double salary;

    @Column(name = "PriorSalary")
    private Double priorSalary;

    public Employees() {
    }

    public Employees(String fName, String mName, String lName,
                     String post, Double salary, Double priorSalary) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.post = post;
        this.salary = salary;
        this.priorSalary = priorSalary;
    }

    public Employees(int id, String fName, String mName, String lName,
                     String post, Double salary, Double priorSalary) {
        this.id = id;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.post = post;
        this.salary = salary;
        this.priorSalary = priorSalary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getPriorSalary() {
        return priorSalary;
    }

    public void setPriorSalary(Double priorSalary) {
        this.priorSalary = priorSalary;
    }
}

