package com.sombrainc.mappers;

import com.sombrainc.dto.sap.CompanyDTO;
import com.sombrainc.dto.weclapp.CustomerDTO;

public class CustomerMapper {

    public static CustomerDTO map(CompanyDTO company) {
        CustomerDTO customer = new CustomerDTO();

        customer.setCustomerCompanyName(company.getCardName());
        customer.setCompanyName2(company.getCardForeignName());

        return customer;
    }

}
