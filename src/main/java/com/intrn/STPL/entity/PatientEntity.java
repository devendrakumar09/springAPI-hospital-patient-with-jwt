package com.intrn.STPL.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "patient")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String contact;
    private String city;
    private String address;
    private int pincode;
    private boolean status;
    private Date createdAt;


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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public PatientEntity() {
        super();
    }

    public PatientEntity(String name, String contact, String city, String address, int pincode, boolean status, Date createdAt) {
        this.name = name;
        this.contact = contact;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
        this.status = status;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "PatientEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                ", status=" + status +
                ", createdAt=" + createdAt +
                '}';
    }
}
