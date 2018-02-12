package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;

import java.io.Serializable;

public class CompanyContactDTO implements Serializable {

    @Parsed(index = 0)
    private String cardCode;
    @Parsed(index = 1)
    private String lineNum;
    @Parsed(index = 2)
    private String gender;
    @Parsed(index = 3)
    private String firstName;
    @Parsed(index = 4)
    private String name;
    @Parsed(index = 5)
    private String lastName;
    @Parsed(index = 6)
    private String phone;
    @Parsed(index = 7)
    private String mobilePhone;
    @Parsed(index = 8)
    private String fax;
    @Parsed(index = 9)
    private String email;

    public CompanyContactDTO() {
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
