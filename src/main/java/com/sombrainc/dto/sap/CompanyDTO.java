package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;
import lombok.Data;

import java.io.Serializable;

@Data
public class CompanyDTO implements Serializable {

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
    private String aliasName;
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

}
