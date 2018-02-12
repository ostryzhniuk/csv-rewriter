package com.sombrainc.mappers;

import com.sombrainc.dto.sap.CompanyAddressDTO;
import com.sombrainc.dto.sap.CompanyContactDTO;
import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.dto.weclapp.CustomerDTO;

public class CustomerMapper {

    public CustomerDTO map(CompanyDTO company, CompanyAddressDTO companyAddress) {
        CustomerDTO customer = new CustomerDTO();

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

        customer.setCompanyCountry(companyAddress.getCountry());
        customer.setCompanyStreet1(companyAddress.getStreet());
        customer.setCompanyZipCode(companyAddress.getZipCode());
        customer.setCompanyCity(companyAddress.getCity());
        customer.setAddressCompany(companyAddress.getAddressName2());
        customer.setAddressCompanyLine2(companyAddress.getAddressName3());



        return customer;
    }

    public CustomerDTO map(CompanyDTO company, CompanyAddressDTO companyAddress, CompanyContactDTO companyContact) {
        CustomerDTO customer = map(company, companyAddress);

        customer.setContactPersonFirstName(companyContact.getFirstName());
        customer.setContactPersonLastName(companyContact.getLastName());
        customer.setContactPersonFixPhone1(companyContact.getPhone());
        customer.setContactPersonFixPhone2(companyContact.getMobilePhone());
        customer.setContactPersonEmail(companyContact.getEmail());
        customer.setContactPersonFax(companyContact.getFax());
        customer.setContactPersonSalutation(generatePersonSalutation(companyContact));

        return customer;
    }

    private String generatePersonSalutation(CompanyContactDTO companyContact) {
        if (companyContact.getGender().equals("M") ) {
            return "Herr";
        } else if (companyContact.getGender().equals("F")) {
            return "Frau";
        }
        return null;
    }

}
