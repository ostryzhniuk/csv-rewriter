package com.sombrainc.utils;

import com.sombrainc.builders.CustomerBuilder;
import com.sombrainc.dto.sap.CompanyAddressDTO;
import com.sombrainc.dto.sap.CompanyBankAccountDTO;
import com.sombrainc.dto.sap.CompanyContactDTO;
import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.dto.weclapp.CustomerDTO;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class DTOConverter {

    private DTOConverter() {
    }

    public static List<CustomerDTO> convertToCustomerList(List<CompanyDTO> companies,
                                                          List<CompanyContactDTO> contacts,
                                                          List<CompanyAddressDTO> addresses,
                                                          List<CompanyBankAccountDTO> bankAccounts) {

        List<CustomerDTO> customers = new LinkedList<>();

        companies.forEach(company -> {
            CustomerBuilder customerBuilder = new CustomerBuilder();
            customerBuilder.setCompany(company);

            for (CompanyContactDTO contact : contacts) {
                if (Objects.equals(company.getCardCode(), contact.getCardCode()) &&
                        company.getuNagReMail() != null &&
                        Objects.equals(company.getuNagReMail(), contact.getEmail())) {
                    customerBuilder.setCompanyContact(contact);
                    break;
                }
            }

            for (CompanyAddressDTO address : addresses) {
                if (Objects.equals(company.getCardCode(), address.getCardCode())) {
                    customerBuilder.setCompanyAddress(address);
                    break;
                }
            }

            for (CompanyBankAccountDTO bankAccount : bankAccounts) {
                if (Objects.equals(company.getCardCode(), bankAccount.getCardCode())) {
                    customerBuilder.setCompanyBankAccount(bankAccount);
                    break;
                }
            }

            customers.add(customerBuilder.toCustomerDTO());
        });

        return customers;

    }

}
