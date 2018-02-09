package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;

import java.io.Serializable;

public class CompaniesDTO implements Serializable {

    @Parsed(index = 0)
    private String cardCode;
    @Parsed(index = 1)
    private String cardType;
    @Parsed(index = 2)
    private String country;
    @Parsed(index = 3)
    private String cardName;
    @Parsed(index = 4)
    private String cardForeignName;
    @Parsed(index = 5)
    private String aliasname;
    @Parsed(index = 6)
    private String notes;
    @Parsed(index = 7)
    private String phone1;
    @Parsed(index = 8)
    private String phone2;
    @Parsed(index = 9)
    private String cellular;
    @Parsed(index = 10)
    private String fax;
    @Parsed(index = 11)
    private String emailAddress;
    @Parsed(index = 12)
    private String website;
    @Parsed(index = 13)
    private String federalTaxID;
    @Parsed(index = 14)
    private String additionalID;
    @Parsed(index = 15)
    private String frozen;
    @Parsed(index = 16)
    private String valid;
    @Parsed(index = 17)
    private String datev;
    @Parsed(index = 18)
    private String password;
    @Parsed(index = 19)
    private String channelBP;
    @Parsed(index = 20)
    private String uNagReMail;
    @Parsed(index = 21)
    private String creditLimit;
    @Parsed(index = 22)
    private String groupCode;
    @Parsed(index = 23)
    private String uNagRrVart;

    public CompaniesDTO() {
    }

    public CompaniesDTO(String cardCode, String cardType, String country, String cardName, String cardForeignName, String aliasname, String notes, String phone1, String phone2, String cellular, String fax, String emailAddress, String website, String federalTaxID, String additionalID, String frozen, String valid, String datev, String password, String channelBP, String uNagReMail, String creditLimit, String groupCode, String uNagRrVart) {
        this.cardCode = cardCode;
        this.cardType = cardType;
        this.country = country;
        this.cardName = cardName;
        this.cardForeignName = cardForeignName;
        this.aliasname = aliasname;
        this.notes = notes;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.cellular = cellular;
        this.fax = fax;
        this.emailAddress = emailAddress;
        this.website = website;
        this.federalTaxID = federalTaxID;
        this.additionalID = additionalID;
        this.frozen = frozen;
        this.valid = valid;
        this.datev = datev;
        this.password = password;
        this.channelBP = channelBP;
        this.uNagReMail = uNagReMail;
        this.creditLimit = creditLimit;
        this.groupCode = groupCode;
        this.uNagRrVart = uNagRrVart;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardForeignName() {
        return cardForeignName;
    }

    public void setCardForeignName(String cardForeignName) {
        this.cardForeignName = cardForeignName;
    }

    public String getAliasname() {
        return aliasname;
    }

    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getCellular() {
        return cellular;
    }

    public void setCellular(String cellular) {
        this.cellular = cellular;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFederalTaxID() {
        return federalTaxID;
    }

    public void setFederalTaxID(String federalTaxID) {
        this.federalTaxID = federalTaxID;
    }

    public String getAdditionalID() {
        return additionalID;
    }

    public void setAdditionalID(String additionalID) {
        this.additionalID = additionalID;
    }

    public String getFrozen() {
        return frozen;
    }

    public void setFrozen(String frozen) {
        this.frozen = frozen;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getDatev() {
        return datev;
    }

    public void setDatev(String datev) {
        this.datev = datev;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChannelBP() {
        return channelBP;
    }

    public void setChannelBP(String channelBP) {
        this.channelBP = channelBP;
    }

    public String getuNagReMail() {
        return uNagReMail;
    }

    public void setuNagReMail(String uNagReMail) {
        this.uNagReMail = uNagReMail;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getuNagRrVart() {
        return uNagRrVart;
    }

    public void setuNagRrVart(String uNagRrVart) {
        this.uNagRrVart = uNagRrVart;
    }
}
