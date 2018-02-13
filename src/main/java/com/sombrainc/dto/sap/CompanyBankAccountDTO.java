package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;
import lombok.Data;

@Data
public class CompanyBankAccountDTO {

    @Parsed(index = 0)
    private String cardCode;
    @Parsed(index = 1)
    private String lineNum;
    @Parsed(index = 2)
    private String logInstance;
    @Parsed(index = 3)
    private String bpCode;
    @Parsed(index = 4)
    private String accountNo;
    @Parsed(index = 5)
    private String iban;
    @Parsed(index = 6)
    private String bankCode;
    @Parsed(index = 7)
    private String bik;

}
