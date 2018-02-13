package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;
import lombok.Data;

import java.io.Serializable;

@Data
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

}
