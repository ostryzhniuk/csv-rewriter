package com.sombrainc;

import com.sombrainc.dto.sap.CompaniesDTO;
import com.sombrainc.utils.CSVHandler;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        File companiesCsv = new File("/home/sombra-48/Desktop/OCRDMAIN.csv");
        List<CompaniesDTO> companies = CSVHandler.parseBeans(companiesCsv, CompaniesDTO.class);

        CSVHandler.writeBeans(companies, Paths.get("/home/sombra-48/Desktop/companies.csv"), CompaniesDTO.class);

     }

}
