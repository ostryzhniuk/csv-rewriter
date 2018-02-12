package com.sombrainc;

import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.utils.CSVHandler;

import java.io.File;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        File companiesCsv = new File("/home/sombra-48/Desktop/OCRDMAIN.csv");
        List<CompanyDTO> companies = CSVHandler.parseBeans(companiesCsv, CompanyDTO.class);

        CSVHandler.writeBeans(companies, new File("/home/sombra-48/Desktop/companies.csv"), CompanyDTO.class);

     }

}
