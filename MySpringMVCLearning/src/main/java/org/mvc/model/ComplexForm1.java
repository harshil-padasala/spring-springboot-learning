package org.mvc.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class ComplexForm1 {
    private String name;
    private String email;
    private Long userid;
    private Date dob;
    private List<String> courses;
    private String gender;
    private String type;

    private Address address;

    public ComplexForm1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ComplexForm1{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userid='" + userid + '\'' +
                ", dob=" + dob +
                ", courses=" + courses +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", address=" + address +
                '}';
    }
}
