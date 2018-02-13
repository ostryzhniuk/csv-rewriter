package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;
import lombok.Data;

import java.io.Serializable;

@Data
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

}
