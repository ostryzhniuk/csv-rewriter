package com.sombrainc.mappers;

import com.sombrainc.dto.sap.CompanyAddressDTO;
import com.sombrainc.dto.sap.CompanyBankAccountDTO;
import com.sombrainc.dto.sap.CompanyContactDTO;
import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.dto.weclapp.CustomerDTO;

public class CustomerBuilder {

    private CustomerDTO customer;

    public CustomerBuilder() {
        customer = new CustomerDTO();
    }

    public CustomerBuilder setCompany(CompanyDTO company) {
        customer.setCompanyName(company.getCardName());
        customer.setCompanyName2(company.getCardForeignName());
        customer.setDescription(company.getNotes());
        customer.setCompanyMainPhone(company.getPhone1());
        customer.setCompanyMainFax(company.getFax());
        customer.setCompanyInfoEmail(company.getEmailAddress());
        customer.setCompanyWebsite(company.getWebsite());
        customer.setCustomerActive(company.getValid());
        customer.setContactPersonEmail(company.getuNagReMail());
        customer.setCreditLimit(company.getCreditLimit());

        return this;
    }

    public CustomerBuilder setCompanyAddress(CompanyAddressDTO companyAddress) {
        customer.setCompanyCountry(companyAddress.getCountry());
        customer.setCompanyStreet1(companyAddress.getStreet());
        customer.setCompanyZipCode(companyAddress.getZipCode());
        customer.setCompanyCity(companyAddress.getCity());
        customer.setAddressCompany(companyAddress.getAddressName2());
        customer.setAddressCompanyLine2(companyAddress.getAddressName3());

        return this;
    }

    public CustomerBuilder setCompanyContact(CompanyContactDTO companyContact) {
        customer.setContactPersonFirstName(companyContact.getFirstName());
        customer.setContactPersonLastName(companyContact.getLastName());
        customer.setContactPersonFixPhone1(companyContact.getPhone());
        customer.setContactPersonFixPhone2(companyContact.getMobilePhone());
        customer.setContactPersonEmail(companyContact.getEmail());
        customer.setContactPersonFax(companyContact.getFax());
        customer.setContactPersonSalutation(generatePersonSalutation(companyContact));

        return this;
    }

    public CustomerBuilder setCompanyBankAccount(CompanyBankAccountDTO companyBankAccount) {
        customer.setIban(companyBankAccount.getIban());
        customer.setBic(companyBankAccount.getBik());

        return this;
    }

    private String generatePersonSalutation(CompanyContactDTO companyContact) {
        if (companyContact.getGender().equals("M") ) {
            return "Herr";
        } else if (companyContact.getGender().equals("F")) {
            return "Frau";
        }
        return null;
    }

    public CustomerDTO toCustomerDTO() {
        return customer;
    }

}
