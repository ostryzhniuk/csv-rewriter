package com.sombrainc.builders;

import com.sombrainc.dto.sap.CompanyContactDTO;
import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.dto.weclapp.ContactDTO;

import java.util.Objects;

public class ContactBuilder {

    private ContactDTO contact;
    private static final String DEFAULT_COUNTRY = "Germany";

    public ContactBuilder() {
        this.contact = new ContactDTO();
    }

    public ContactBuilder setCompanyContact(CompanyContactDTO companyContact) {
        contact.setFixPhone1(companyContact.getPhone());
        contact.setMobilePhone1(companyContact.getMobilePhone());
        contact.setFirstName(companyContact.getFirstName());
        contact.setLastName(companyContact.getLastName());
        contact.setSalutation(generatePersonSalutation(companyContact));
        contact.setEmail(companyContact.getEmail());
        contact.setFax(companyContact.getFax());

        return this;
    }

    public ContactBuilder setCompany(CompanyDTO company) {
        contact.setCompany(company.getCardName());
        return this;
    }

    private String generatePersonSalutation(CompanyContactDTO companyContact) {
        if (Objects.equals(companyContact.getGender(), "M")) {
            return "Herr";
        } else if (Objects.equals(companyContact.getGender(), "F")) {
            return "Frau";
        }
        return null;
    }

    private void validateCountry() {
        if (contact.getCountry() == null || contact.getCountry().isEmpty()) {
            contact.setCountry(DEFAULT_COUNTRY);
        }
    }

    public ContactDTO toContactDTO() {
        validateCountry();
        return this.contact;
    }

}
