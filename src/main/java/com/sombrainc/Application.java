package com.sombrainc;

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

        List<CompanyContactDTO> contacts = CSVHandler.readBeans(
                new File("/home/sombra-48/Desktop/OCPR.csv"),
                CompanyContactDTO.class);

        List<CompanyAddressDTO> addresses = CSVHandler.readBeans(
                new File("/home/sombra-48/Desktop/CRD1.csv"),
                CompanyAddressDTO.class);

        List<CompanyBankAccountDTO> bankAccounts = CSVHandler.readBeans(
                new File("/home/sombra-48/Desktop/OCRB.csv"),
                CompanyBankAccountDTO.class);

        List<CustomerDTO> customers = DTOConverter.convertToCustomerList(companies, contacts, addresses, bankAccounts);

        CSVHandler.writeBeans(customers, new File("/home/sombra-48/Desktop/customers.csv"), CustomerDTO.class);

     }

}
