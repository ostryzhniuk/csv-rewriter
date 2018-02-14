package com.sombrainc;

import com.sombrainc.dto.weclapp.ContactDTO;
import com.sombrainc.utils.DTOConverter;
import com.sombrainc.dto.sap.CompanyAddressDTO;
import com.sombrainc.dto.sap.CompanyBankAccountDTO;
import com.sombrainc.dto.sap.CompanyContactDTO;
import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.dto.weclapp.CustomerDTO;
import com.sombrainc.utils.CSVHandler;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Application {

    public static void main(String[] args) {

        List<CompanyDTO> companies = CSVHandler.readSapBeans(
                new File("/home/sombra-48/Desktop/OCRDMAIN.csv"),
                CompanyDTO.class);

        List<CompanyContactDTO> companyContacts = CSVHandler.readSapBeans(
                new File("/home/sombra-48/Desktop/OCPR.csv"),
                CompanyContactDTO.class);

        List<CompanyAddressDTO> companyAddresses = CSVHandler.readSapBeans(
                new File("/home/sombra-48/Desktop/CRD1.csv"),
                CompanyAddressDTO.class);

        List<CompanyBankAccountDTO> companyBankAccounts = CSVHandler.readSapBeans(
                new File("/home/sombra-48/Desktop/OCRB.csv"),
                CompanyBankAccountDTO.class);


        List<CustomerDTO> customers =
                DTOConverter.convertToCustomerList(companies, companyContacts, companyAddresses, companyBankAccounts);

        List<ContactDTO> contacts = DTOConverter.convertToContactList(companyContacts, companies);


        removeExistingCustomers(customers);
        removeExistingContacts(contacts);


        CSVHandler.writeWeclappBeans(customers, new File("/home/sombra-48/Desktop/customers.csv"), CustomerDTO.class);
        CSVHandler.writeWeclappBeans(contacts, new File("/home/sombra-48/Desktop/contacts.csv"), ContactDTO.class);
    }

    private static List<CustomerDTO> removeExistingCustomers(List<CustomerDTO> customers) {

        List<CustomerDTO> exportedCustomers = CSVHandler.readWeclappBeans(
                new File("/home/sombra-48/Desktop/CustomersExport.csv"),
                CustomerDTO.class);

        customers.removeAll(exportedCustomers);

        return customers;
    }

    private static List<ContactDTO> removeExistingContacts(List<ContactDTO> contacts) {

        List<ContactDTO> exportedContacts = CSVHandler.readWeclappBeans(
                new File("/home/sombra-48/Desktop/ContactExport.csv"),
                ContactDTO.class);

        contacts.removeAll(exportedContacts);

        return contacts;
    }

}
