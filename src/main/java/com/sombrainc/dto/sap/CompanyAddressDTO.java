package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;

import java.io.Serializable;

public class CompanyAddressDTO implements Serializable {

    @Parsed(index = 0)
    private String cardCode;
    @Parsed(index = 1)
    private String lineNum;
    @Parsed(index = 2)
    private String country;
    @Parsed(index = 3)
    private String street;
    @Parsed(index = 4)
    private String zipCode;
    @Parsed(index = 5)
    private String city;
    @Parsed(index = 6)
    private String addressName;
    @Parsed(index = 7)
    private String addressName2;
    @Parsed(index = 8)
    private String addressName3;
    @Parsed(index = 9)
    private String addressType;

    public CompanyAddressDTO() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressName2() {
        return addressName2;
    }

    public void setAddressName2(String addressName2) {
        this.addressName2 = addressName2;
    }

    public String getAddressName3() {
        return addressName3;
    }

    public void setAddressName3(String addressName3) {
        this.addressName3 = addressName3;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
}
