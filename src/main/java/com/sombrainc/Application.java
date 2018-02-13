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
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<CompanyDTO> companies = CSVHandler.readBeans(
                new File("/home/sombra-48/Desktop/OCRDMAIN.csv"),
                CompanyDTO.class);

        List<CompanyContactDTO> companyContacts = CSVHandler.readBeans(
                new File("/home/sombra-48/Desktop/OCPR.csv"),
                CompanyContactDTO.class);

        List<CompanyAddressDTO> companyAddresses = CSVHandler.readBeans(
                new File("/home/sombra-48/Desktop/CRD1.csv"),
                CompanyAddressDTO.class);

        List<CompanyBankAccountDTO> companyBankAccounts = CSVHandler.readBeans(
                new File("/home/sombra-48/Desktop/OCRB.csv"),
                CompanyBankAccountDTO.class);


        List<CustomerDTO> customers =
                DTOConverter.convertToCustomerList(companies, companyContacts, companyAddresses, companyBankAccounts);

        List<ContactDTO> contacts = DTOConverter.convertToContactList(companyContacts, companies);

        CSVHandler.writeBeans(customers, new File("/home/sombra-48/Desktop/customers.csv"), CustomerDTO.class);
        CSVHandler.writeBeans(contacts, new File("/home/sombra-48/Desktop/contacts.csv"), ContactDTO.class);

     }

}
