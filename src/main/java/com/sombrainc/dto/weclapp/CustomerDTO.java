package com.sombrainc.dto.weclapp;

import com.univocity.parsers.annotations.Parsed;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    @Parsed(index = 0, field = "CUSTOMER COMPANY NAME")
    private String companyName;
    @Parsed(index = 1, field = "Customer Company name 2")
    private String companyName2;
    @Parsed(index = 2, field = "Old customernumber")
    private String customerNumber;
    @Parsed(index = 3, field = "Customer description (Beschreibung)")
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

    public CustomerDTO() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName2() {
        return companyName2;
    }

    public void setCompanyName2(String companyName2) {
        this.companyName2 = companyName2;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getCompanyStreet1() {
        return companyStreet1;
    }

    public void setCompanyStreet1(String companyStreet1) {
        this.companyStreet1 = companyStreet1;
    }

    public String getCompanyStreet2() {
        return companyStreet2;
    }

    public void setCompanyStreet2(String companyStreet2) {
        this.companyStreet2 = companyStreet2;
    }

    public String getCompanyZipCode() {
        return companyZipCode;
    }

    public void setCompanyZipCode(String companyZipCode) {
        this.companyZipCode = companyZipCode;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    public String getCompanyPrimeAddress() {
        return companyPrimeAddress;
    }

    public void setCompanyPrimeAddress(String companyPrimeAddress) {
        this.companyPrimeAddress = companyPrimeAddress;
    }

    public String getCompanyDeliveryAddress() {
        return companyDeliveryAddress;
    }

    public void setCompanyDeliveryAddress(String companyDeliveryAddress) {
        this.companyDeliveryAddress = companyDeliveryAddress;
    }

    public String getCompanyInvoiceAddress() {
        return companyInvoiceAddress;
    }

    public void setCompanyInvoiceAddress(String companyInvoiceAddress) {
        this.companyInvoiceAddress = companyInvoiceAddress;
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    public String getCompanyPOBNumber() {
        return companyPOBNumber;
    }

    public void setCompanyPOBNumber(String companyPOBNumber) {
        this.companyPOBNumber = companyPOBNumber;
    }

    public String getCompanyPobZipCode() {
        return companyPobZipCode;
    }

    public void setCompanyPobZipCode(String companyPobZipCode) {
        this.companyPobZipCode = companyPobZipCode;
    }

    public String getCompanyPobCity() {
        return companyPobCity;
    }

    public void setCompanyPobCity(String companyPobCity) {
        this.companyPobCity = companyPobCity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDebtornumber() {
        return debtornumber;
    }

    public void setDebtornumber(String debtornumber) {
        this.debtornumber = debtornumber;
    }

    public String getSalesRepresentativeName() {
        return salesRepresentativeName;
    }

    public void setSalesRepresentativeName(String salesRepresentativeName) {
        this.salesRepresentativeName = salesRepresentativeName;
    }

    public String getCommercialLanguage() {
        return commercialLanguage;
    }

    public void setCommercialLanguage(String commercialLanguage) {
        this.commercialLanguage = commercialLanguage;
    }

    public String getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory;
    }

    public String getAbcAnalysisclass() {
        return abcAnalysisclass;
    }

    public void setAbcAnalysisclass(String abcAnalysisclass) {
        this.abcAnalysisclass = abcAnalysisclass;
    }

    public String getCustomerActive() {
        return customerActive;
    }

    public void setCustomerActive(String customerActive) {
        this.customerActive = customerActive;
    }

    public String getWebsiteAccount() {
        return websiteAccount;
    }

    public void setWebsiteAccount(String websiteAccount) {
        this.websiteAccount = websiteAccount;
    }

    public String getInsured() {
        return insured;
    }

    public void setInsured(String insured) {
        this.insured = insured;
    }

    public String getIsCreditChecked() {
        return isCreditChecked;
    }

    public void setIsCreditChecked(String isCreditChecked) {
        this.isCreditChecked = isCreditChecked;
    }

    public String getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getDistributionChannel() {
        return distributionChannel;
    }

    public void setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSalesTaxId() {
        return salesTaxId;
    }

    public void setSalesTaxId(String salesTaxId) {
        this.salesTaxId = salesTaxId;
    }

    public String getCustomerInsolvent() {
        return customerInsolvent;
    }

    public void setCustomerInsolvent(String customerInsolvent) {
        this.customerInsolvent = customerInsolvent;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyInfoEmail() {
        return companyInfoEmail;
    }

    public void setCompanyInfoEmail(String companyInfoEmail) {
        this.companyInfoEmail = companyInfoEmail;
    }

    public String getCompanyMainPhone() {
        return companyMainPhone;
    }

    public void setCompanyMainPhone(String companyMainPhone) {
        this.companyMainPhone = companyMainPhone;
    }

    public String getCompanyMainFax() {
        return companyMainFax;
    }

    public void setCompanyMainFax(String companyMainFax) {
        this.companyMainFax = companyMainFax;
    }

    public String getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getAdditionalInvoiceRecipients() {
        return additionalInvoiceRecipients;
    }

    public void setAdditionalInvoiceRecipients(String additionalInvoiceRecipients) {
        this.additionalInvoiceRecipients = additionalInvoiceRecipients;
    }

    public String getAdditionalOrderRecipients() {
        return additionalOrderRecipients;
    }

    public void setAdditionalOrderRecipients(String additionalOrderRecipients) {
        this.additionalOrderRecipients = additionalOrderRecipients;
    }

    public String getAdditionalShipmentRecipients() {
        return additionalShipmentRecipients;
    }

    public void setAdditionalShipmentRecipients(String additionalShipmentRecipients) {
        this.additionalShipmentRecipients = additionalShipmentRecipients;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getCreditInstitute() {
        return creditInstitute;
    }

    public void setCreditInstitute(String creditInstitute) {
        this.creditInstitute = creditInstitute;
    }

    public String getNonStandardTax() {
        return nonStandardTax;
    }

    public void setNonStandardTax(String nonStandardTax) {
        this.nonStandardTax = nonStandardTax;
    }

    public String getTermOfPayment() {
        return termOfPayment;
    }

    public void setTermOfPayment(String termOfPayment) {
        this.termOfPayment = termOfPayment;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public String getUseCustomsTariffNumber() {
        return useCustomsTariffNumber;
    }

    public void setUseCustomsTariffNumber(String useCustomsTariffNumber) {
        this.useCustomsTariffNumber = useCustomsTariffNumber;
    }

    public String getDebtorCreditorCode() {
        return debtorCreditorCode;
    }

    public void setDebtorCreditorCode(String debtorCreditorCode) {
        this.debtorCreditorCode = debtorCreditorCode;
    }

    public String getContactPersonForeignReference() {
        return contactPersonForeignReference;
    }

    public void setContactPersonForeignReference(String contactPersonForeignReference) {
        this.contactPersonForeignReference = contactPersonForeignReference;
    }

    public String getContactPersonFixPhone1() {
        return contactPersonFixPhone1;
    }

    public void setContactPersonFixPhone1(String contactPersonFixPhone1) {
        this.contactPersonFixPhone1 = contactPersonFixPhone1;
    }

    public String getContactPersonFixPhone2() {
        return contactPersonFixPhone2;
    }

    public void setContactPersonFixPhone2(String contactPersonFixPhone2) {
        this.contactPersonFixPhone2 = contactPersonFixPhone2;
    }

    public String getContactPersonFax() {
        return contactPersonFax;
    }

    public void setContactPersonFax(String contactPersonFax) {
        this.contactPersonFax = contactPersonFax;
    }

    public String getContactPersonEmail() {
        return contactPersonEmail;
    }

    public void setContactPersonEmail(String contactPersonEmail) {
        this.contactPersonEmail = contactPersonEmail;
    }

    public String getContactPersonMobilePhone1() {
        return contactPersonMobilePhone1;
    }

    public void setContactPersonMobilePhone1(String contactPersonMobilePhone1) {
        this.contactPersonMobilePhone1 = contactPersonMobilePhone1;
    }

    public String getContactPersonMobilePhone2() {
        return contactPersonMobilePhone2;
    }

    public void setContactPersonMobilePhone2(String contactPersonMobilePhone2) {
        this.contactPersonMobilePhone2 = contactPersonMobilePhone2;
    }

    public String getContactPersonDescription() {
        return contactPersonDescription;
    }

    public void setContactPersonDescription(String contactPersonDescription) {
        this.contactPersonDescription = contactPersonDescription;
    }

    public String getContactPersonPhoneNumberHome() {
        return contactPersonPhoneNumberHome;
    }

    public void setContactPersonPhoneNumberHome(String contactPersonPhoneNumberHome) {
        this.contactPersonPhoneNumberHome = contactPersonPhoneNumberHome;
    }

    public String getContactPersonWebsite() {
        return contactPersonWebsite;
    }

    public void setContactPersonWebsite(String contactPersonWebsite) {
        this.contactPersonWebsite = contactPersonWebsite;
    }

    public String getContactPersonPreferredContactMethod() {
        return contactPersonPreferredContactMethod;
    }

    public void setContactPersonPreferredContactMethod(String contactPersonPreferredContactMethod) {
        this.contactPersonPreferredContactMethod = contactPersonPreferredContactMethod;
    }

    public String getContactPersonSalutation() {
        return contactPersonSalutation;
    }

    public void setContactPersonSalutation(String contactPersonSalutation) {
        this.contactPersonSalutation = contactPersonSalutation;
    }

    public String getContactPersonTitle() {
        return contactPersonTitle;
    }

    public void setContactPersonTitle(String contactPersonTitle) {
        this.contactPersonTitle = contactPersonTitle;
    }

    public String getContactPersonFirstname() {
        return contactPersonFirstname;
    }

    public void setContactPersonFirstname(String contactPersonFirstname) {
        this.contactPersonFirstname = contactPersonFirstname;
    }

    public String getContactPersonMiddlename() {
        return contactPersonMiddlename;
    }

    public void setContactPersonMiddlename(String contactPersonMiddlename) {
        this.contactPersonMiddlename = contactPersonMiddlename;
    }

    public String getContactPersonLastname() {
        return contactPersonLastname;
    }

    public void setContactPersonLastname(String contactPersonLastname) {
        this.contactPersonLastname = contactPersonLastname;
    }

    public String getContactPersonIsPrimeContactPerson() {
        return contactPersonIsPrimeContactPerson;
    }

    public void setContactPersonIsPrimeContactPerson(String contactPersonIsPrimeContactPerson) {
        this.contactPersonIsPrimeContactPerson = contactPersonIsPrimeContactPerson;
    }

    public String getContactPersonIsInvoiceContactPerson() {
        return contactPersonIsInvoiceContactPerson;
    }

    public void setContactPersonIsInvoiceContactPerson(String contactPersonIsInvoiceContactPerson) {
        this.contactPersonIsInvoiceContactPerson = contactPersonIsInvoiceContactPerson;
    }

    public String getContactPersonBirthdate() {
        return contactPersonBirthdate;
    }

    public void setContactPersonBirthdate(String contactPersonBirthdate) {
        this.contactPersonBirthdate = contactPersonBirthdate;
    }

    public String getContactPersonDepartment() {
        return contactPersonDepartment;
    }

    public void setContactPersonDepartment(String contactPersonDepartment) {
        this.contactPersonDepartment = contactPersonDepartment;
    }

    public String getContactPersonRole() {
        return contactPersonRole;
    }

    public void setContactPersonRole(String contactPersonRole) {
        this.contactPersonRole = contactPersonRole;
    }

    public String getContactPersonCompany() {
        return contactPersonCompany;
    }

    public void setContactPersonCompany(String contactPersonCompany) {
        this.contactPersonCompany = contactPersonCompany;
    }

    public String getContactAddressCompany() {
        return contactAddressCompany;
    }

    public void setContactAddressCompany(String contactAddressCompany) {
        this.contactAddressCompany = contactAddressCompany;
    }

    public String getContactAddressCompanyLine2() {
        return contactAddressCompanyLine2;
    }

    public void setContactAddressCompanyLine2(String contactAddressCompanyLine2) {
        this.contactAddressCompanyLine2 = contactAddressCompanyLine2;
    }

    public String getContactPersonStreet1() {
        return contactPersonStreet1;
    }

    public void setContactPersonStreet1(String contactPersonStreet1) {
        this.contactPersonStreet1 = contactPersonStreet1;
    }

    public String getContactPersonStreet2() {
        return contactPersonStreet2;
    }

    public void setContactPersonStreet2(String contactPersonStreet2) {
        this.contactPersonStreet2 = contactPersonStreet2;
    }

    public String getContactPersonZipCode() {
        return contactPersonZipCode;
    }

    public void setContactPersonZipCode(String contactPersonZipCode) {
        this.contactPersonZipCode = contactPersonZipCode;
    }

    public String getContactPersonCity() {
        return contactPersonCity;
    }

    public void setContactPersonCity(String contactPersonCity) {
        this.contactPersonCity = contactPersonCity;
    }

    public String getContactPersonState() {
        return contactPersonState;
    }

    public void setContactPersonState(String contactPersonState) {
        this.contactPersonState = contactPersonState;
    }

    public String getContactPersonCountry() {
        return contactPersonCountry;
    }

    public void setContactPersonCountry(String contactPersonCountry) {
        this.contactPersonCountry = contactPersonCountry;
    }

    public String getContactPersonIsPrimeAddress() {
        return contactPersonIsPrimeAddress;
    }

    public void setContactPersonIsPrimeAddress(String contactPersonIsPrimeAddress) {
        this.contactPersonIsPrimeAddress = contactPersonIsPrimeAddress;
    }

    public String getContactPersonIsDeliveryAddress() {
        return contactPersonIsDeliveryAddress;
    }

    public void setContactPersonIsDeliveryAddress(String contactPersonIsDeliveryAddress) {
        this.contactPersonIsDeliveryAddress = contactPersonIsDeliveryAddress;
    }

    public String getContactPersonIsInvoiceAddress() {
        return contactPersonIsInvoiceAddress;
    }

    public void setContactPersonIsInvoiceAddress(String contactPersonIsInvoiceAddress) {
        this.contactPersonIsInvoiceAddress = contactPersonIsInvoiceAddress;
    }

    public String getContactPersonPobNumber() {
        return contactPersonPobNumber;
    }

    public void setContactPersonPobNumber(String contactPersonPobNumber) {
        this.contactPersonPobNumber = contactPersonPobNumber;
    }

    public String getContactPersonPobZipCode() {
        return contactPersonPobZipCode;
    }

    public void setContactPersonPobZipCode(String contactPersonPobZipCode) {
        this.contactPersonPobZipCode = contactPersonPobZipCode;
    }

    public String getContactPersonPobCity() {
        return contactPersonPobCity;
    }

    public void setContactPersonPobCity(String contactPersonPobCity) {
        this.contactPersonPobCity = contactPersonPobCity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
