package com.sombrainc.dto.weclapp;

import com.univocity.parsers.annotations.Parsed;

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
    @Parsed(index = 14, field = "Contact person firstname")
    private String firstname;
    @Parsed(index = 15, field = "Contact person middlename")
    private String middlename;
    @Parsed(index = 16, field = "CONTACT PERSON LASTNAME")
    private String lastname;
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

    public String getForeignReference() {
        return foreignReference;
    }

    public void setForeignReference(String foreignReference) {
        this.foreignReference = foreignReference;
    }

    public String getFixPhone1() {
        return fixPhone1;
    }

    public void setFixPhone1(String fixPhone1) {
        this.fixPhone1 = fixPhone1;
    }

    public String getFixPhone2() {
        return fixPhone2;
    }

    public void setFixPhone2(String fixPhone2) {
        this.fixPhone2 = fixPhone2;
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

    public String getMobilePhone1() {
        return mobilePhone1;
    }

    public void setMobilePhone1(String mobilePhone1) {
        this.mobilePhone1 = mobilePhone1;
    }

    public String getMobilePhone2() {
        return mobilePhone2;
    }

    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getEmailHome() {
        return emailHome;
    }

    public void setEmailHome(String emailHome) {
        this.emailHome = emailHome;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPreferredContactMethod() {
        return preferredContactMethod;
    }

    public void setPreferredContactMethod(String preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIsPrimeContactPerson() {
        return isPrimeContactPerson;
    }

    public void setIsPrimeContactPerson(String isPrimeContactPerson) {
        this.isPrimeContactPerson = isPrimeContactPerson;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    public String getAddressCompanyLine2() {
        return addressCompanyLine2;
    }

    public void setAddressCompanyLine2(String addressCompanyLine2) {
        this.addressCompanyLine2 = addressCompanyLine2;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIsPrimeAddress() {
        return isPrimeAddress;
    }

    public void setIsPrimeAddress(String isPrimeAddress) {
        this.isPrimeAddress = isPrimeAddress;
    }

    public String getIsDeliveryAddress() {
        return isDeliveryAddress;
    }

    public void setIsDeliveryAddress(String isDeliveryAddress) {
        this.isDeliveryAddress = isDeliveryAddress;
    }

    public String getIsInvoiceAddress() {
        return isInvoiceAddress;
    }

    public void setIsInvoiceAddress(String isInvoiceAddress) {
        this.isInvoiceAddress = isInvoiceAddress;
    }

    public String getPobNumber() {
        return pobNumber;
    }

    public void setPobNumber(String pobNumber) {
        this.pobNumber = pobNumber;
    }

    public String getPobZipCode() {
        return pobZipCode;
    }

    public void setPobZipCode(String pobZipCode) {
        this.pobZipCode = pobZipCode;
    }

    public String getPobCity() {
        return pobCity;
    }

    public void setPobCity(String pobCity) {
        this.pobCity = pobCity;
    }

    public String getLeadNumber() {
        return leadNumber;
    }

    public void setLeadNumber(String leadNumber) {
        this.leadNumber = leadNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
