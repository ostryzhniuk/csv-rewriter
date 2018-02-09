package com.sombrainc.dto.weclapp;

import com.univocity.parsers.annotations.Parsed;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    @Parsed(index = 0, field = "CUSTOMER COMPANY NAME")
    private String customerCompanyName;
    @Parsed(index = 1, field = "Customer Company name 2")
    private String companyName2;
    @Parsed(index = 2, field = "Old customernumber")
    private String customerNumber;
    @Parsed(index = 3, field = "Old customernumber")
    private String description;
    @Parsed(index = 4, field = "Address company")
    private String addressCompany;
    @Parsed(index = 5, field = "Address company line 2")
    private String addressCompanyLine2;
    @Parsed(index = 6, field = "Company street 1")
    private String companyStreet1;
    @Parsed(index = 7, field = "Company street 2")
    private String companyStreet2;
    @Parsed(index = 8, field = "Company zip code")
    private String companyZipCode;
    @Parsed(index = 9, field = "Company city")
    private String companyCity;
    @Parsed(index = 10, field = "Company state")
    private String companyState;
    @Parsed(index = 11, field = "COMPANY COUNTRY")
    private String companyCountry;
    @Parsed(index = 12, field = "Company prime address?")
    private String companyPrimeAddress;
    @Parsed(index = 13, field = "Company delivery address?")
    private String companyDeliveryAddress;
    @Parsed(index = 14, field = "Company invoice address?")
    private String companyInvoiceAddress;
    @Parsed(index = 15, field = "Global Location Number (GLN)")
    private String globalLocationNumber;
    @Parsed(index = 16, field = "Company pob number (Postfach)")
    private String companyPOBNumber;
    @Parsed(index = 17, field = "Company pob zip code")
    private String companyPobZipCode;
    @Parsed(index = 18, field = "Company pob city")
    private String companyPobCity;
    @Parsed(index = 19, field = "Origin (Ursprung)")
    private String origin;
    @Parsed(index = 20, field = "Reference")
    private String reference;
    @Parsed(index = 21, field = "Debtornumber")
    private String debtornumber;
    @Parsed(index = 22, field = "Salesrepresentative name")
    private String salesRepresentativeName;
    @Parsed(index = 23, field = "Commercial language")
    private String commercialLanguage;
    @Parsed(index = 24, field = "Customer category")
    private String customerCategory;
    @Parsed(index = 25, field = "Abc analysisclass")
    private String abcAnalysisclass;
    @Parsed(index = 26, field = "Customer active?")
    private String customerActive;
    @Parsed(index = 27, field = "Website account?")
    private String websiteAccount;
    @Parsed(index = 28, field = "Insured?")
    private String insured;
    @Parsed(index = 29, field = "Is credit checked?")
    private String isCreditChecked;
    @Parsed(index = 30, field = "Insured amount")
    private String insuredAmount;
    @Parsed(index = 31, field = "Credit limit")
    private String creditLimit;
    @Parsed(index = 32, field = "DISTRIBUTION CHANNEL")
    private String distributionChannel;
    @Parsed(index = 33, field = "Currency")
    private String currency;
    @Parsed(index = 34, field = "Sales tax id (USt-IdNr)")
    private String salesTaxId;
    @Parsed(index = 35, field = "Customer insolvent?")
    private String customerInsolvent;
    @Parsed(index = 36, field = "Company website")
    private String companyWebsite;
    @Parsed(index = 37, field = "Company info-email")
    private String companyInfoEmail;
    @Parsed(index = 38, field = "Company main phone")
    private String companyMainPhone;
    @Parsed(index = 39, field = "Company main fax")
    private String companyMainFax;
    @Parsed(index = 40, field = "Legal form")
    private String legalForm;
    @Parsed(index = 41, field = "Sector")
    private String sector;
    @Parsed(index = 42, field = "Topic")
    private String topic;
    @Parsed(index = 43, field = "Annual revenue")
    private String annualRevenue;
    @Parsed(index = 44, field = "Number of employees")
    private String numberOfEmployees;
    @Parsed(index = 45, field = "Additional invoice recipients")
    private String additionalInvoiceRecipients;
    @Parsed(index = 46, field = "Additional order recipients")
    private String additionalOrderRecipients;
    @Parsed(index = 47, field = "Additional shipment recipients")
    private String additionalShipmentRecipients;
    @Parsed(index = 48, field = "Order type")
    private String orderType;
    @Parsed(index = 49, field = "IBAN")
    private String iban;
    @Parsed(index = 50, field = "BIC")
    private String bic;
    @Parsed(index = 51, field = "Account owner")
    private String accountOwner;
    @Parsed(index = 52, field = "Credit institute")
    private String creditInstitute;
    @Parsed(index = 53, field = "Non standard tax")
    private String nonStandardTax;
    @Parsed(index = 54, field = "Term of payment")
    private String termOfPayment;
    @Parsed(index = 55, field = "Payment method type")
    private String paymentMethodType;
    @Parsed(index = 56, field = "Shipment method")
    private String shipmentMethod;
    @Parsed(index = 57, field = "Use customs tariff number")
    private String useCustomsTariffNumber;
    @Parsed(index = 58, field = "Debtor creditor code")
    private String debtorCreditorCode;
    @Parsed(index = 59, field = "Contact person foreign reference")
    private String contactPersonForeignReference;
    @Parsed(index = 60, field = "Contact person fix phone 1")
    private String contactPersonFixPhone1;
    @Parsed(index = 61, field = "Contact person fix phone 2")
    private String contactPersonFixPhone2;
    @Parsed(index = 62, field = "Contact person fax")
    private String contactPersonFax;
    @Parsed(index = 63, field = "Contact person email")
    private String contactPersonEmail;
    @Parsed(index = 64, field = "Contact person mobile phone 1")
    private String contactPersonMobilePhone1;
    @Parsed(index = 65, field = "Contact person mobile phone 2")
    private String contactPersonMobilePhone2;
    @Parsed(index = 66, field = "Contact person description")
    private String contactPersonDescription;
    @Parsed(index = 67, field = "Contact person phone number home")
    private String contactPersonPhoneNumberHome;
    @Parsed(index = 68, field = "Contact person website")
    private String contactPersonWebsite;
    @Parsed(index = 69, field = "Contact person preferred contact method")
    private String contactPersonPreferredContactMethod;
    @Parsed(index = 70, field = "Contact person salutation")
    private String contactPersonSalutation;
    @Parsed(index = 71, field = "Contact person title")
    private String contactPersonTitle;
    @Parsed(index = 72, field = "Contact person firstname")
    private String contactPersonFirstname;
    @Parsed(index = 73, field = "Contact person middlename")
    private String contactPersonMiddlename;
    @Parsed(index = 74, field = "Contact person lastname")
    private String contactPersonLastname;
    @Parsed(index = 75, field = "CONTACT PERSON IS PRIME CONTACT PERSON?")
    private String contactPersonIsPrimeContactPerson;
    @Parsed(index = 76, field = "Contact person is invoice contact person?")
    private String contactPersonIsInvoiceContactPerson;
    @Parsed(index = 77, field = "Contact person birthdate")
    private String contactPersonBirthdate;
    @Parsed(index = 78, field = "Contact person department")
    private String contactPersonDepartment;
    @Parsed(index = 79, field = "Contact person role")
    private String contactPersonRole;
    @Parsed(index = 80, field = "Contact person company")
    private String contactPersonCompany;
    @Parsed(index = 81, field = "Contact address company")
    private String contactAddressCompany;
    @Parsed(index = 82, field = "Contact address company line 2")
    private String contactAddressCompanyLine2;
    @Parsed(index = 83, field = "Contact person street 1")
    private String contactPersonStreet1;
    @Parsed(index = 84, field = "Contact person street 2")
    private String contactPersonStreet2;
    @Parsed(index = 85, field = "Contact person zip code")
    private String contactPersonZipCode;
    @Parsed(index = 86, field = "Contact person city")
    private String contactPersonCity;
    @Parsed(index = 87, field = "Contact person state")
    private String contactPersonState;
    @Parsed(index = 88, field = "CONTACT PERSON COUNTRY")
    private String contactPersonCountry;
    @Parsed(index = 89, field = "Contact person is prime address?")
    private String contactPersonIsPrimeAddress;
    @Parsed(index = 90, field = "Contact person is delivery address?")
    private String contactPersonIsDeliveryAddress;
    @Parsed(index = 91, field = "Contact person is invoice address?")
    private String contactPersonIsInvoiceAddress;
    @Parsed(index = 92, field = "Contact person pob number")
    private String contactPersonPobNumber;
    @Parsed(index = 93, field = "Contact person pob zip code")
    private String contactPersonPobZipCode;
    @Parsed(index = 94, field = "Contact person pob city")
    private String contactPersonPobCity;
    @Parsed(index = 95, field = "Type")
    private String type;

}
