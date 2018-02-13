package com.sombrainc.builders;

import com.sombrainc.dto.sap.CompanyContactDTO;
import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.dto.weclapp.ContactDTO;

import java.util.Objects;

public class ContactBuilder {

    private ContactDTO contact;

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

    public ContactBuilder setContactPersonCompany(CompanyDTO company) {
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

}
