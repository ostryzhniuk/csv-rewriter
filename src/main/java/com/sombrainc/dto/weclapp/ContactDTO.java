package com.sombrainc.dto.weclapp;

import com.univocity.parsers.annotations.Parsed;
import lombok.Data;

import java.util.Objects;

@Data
public class ContactDTO {

    @Parsed(index = 0, field = "Contact person foreign reference")
    private String foreignReference;
    @Parsed(index = 1, field = "Contact person fix phone 1")
    private String fixPhone1;
    @Parsed(index = 2, field = "Contact person fix phone 2")
    private String fixPhone2;
    @Parsed(index = 3, field = "Contact person fax")
    private String fax;
    @Parsed(index = 4, field = "Contact person email")
    private String email;
    @Parsed(index = 5, field = "Contact person mobile phone 1")
    private String mobilePhone1;
    @Parsed(index = 6, field = "Contact person mobile phone 2")
    private String mobilePhone2;
    @Parsed(index = 7, field = "Contact person description")
    private String description;
    @Parsed(index = 8, field = "Contact person phone number home")
    private String phoneNumberHome;
    @Parsed(index = 9, field = "Contact person email home")
    private String emailHome;
    @Parsed(index = 10, field = "Contact person website")
    private String website;
    @Parsed(index = 11, field = "Contact person preferred contact method")
    private String preferredContactMethod;
    @Parsed(index = 12, field = "Contact person salutation")
    private String salutation;
    @Parsed(index = 13, field = "Contact person title")
    private String title;
    @Parsed(index = 14, field = "Contact person firstName")
    private String firstName;
    @Parsed(index = 15, field = "Contact person middleName")
    private String middleName;
    @Parsed(index = 16, field = "CONTACT PERSON LASTNAME")
    private String lastName;
    @Parsed(index = 17, field = "Contact person is prime contact person?")
    private String isPrimeContactPerson;
    @Parsed(index = 18, field = "Contact person birthdate")
    private String birthdate;
    @Parsed(index = 19, field = "Contact person department")
    private String department;
    @Parsed(index = 20, field = "Contact person role")
    private String role;
    @Parsed(index = 21, field = "Contact person company")
    private String company;
    @Parsed(index = 22, field = "Contact address company")
    private String addressCompany;
    @Parsed(index = 23, field = "Contact address company line 2")
    private String addressCompanyLine2;
    @Parsed(index = 24, field = "Contact person street 1")
    private String street1;
    @Parsed(index = 25, field = "Contact person street 2")
    private String street2;
    @Parsed(index = 26, field = "Contact person zip code")
    private String zipCode;
    @Parsed(index = 27, field = "Contact person city")
    private String city;
    @Parsed(index = 28, field = "Contact person state")
    private String state;
    @Parsed(index = 29, field = "CONTACT PERSON COUNTRY")
    private String country;
    @Parsed(index = 30, field = "Contact person is prime address?")
    private String isPrimeAddress;
    @Parsed(index = 31, field = "Contact person is delivery address?")
    private String isDeliveryAddress;
    @Parsed(index = 32, field = "Contact person is invoice address?")
    private String isInvoiceAddress;
    @Parsed(index = 33, field = "Contact person pob number")
    private String pobNumber;
    @Parsed(index = 34, field = "Contact person pob zip code")
    private String pobZipCode;
    @Parsed(index = 35, field = "Contact person pob city")
    private String pobCity;
    @Parsed(index = 36, field = "Lead Number")
    private String leadNumber;
    @Parsed(index = 37, field = "Customer number")
    private String customerNumber;
    @Parsed(index = 38, field = "Type")
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDTO that = (ContactDTO) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, company);
    }
}
