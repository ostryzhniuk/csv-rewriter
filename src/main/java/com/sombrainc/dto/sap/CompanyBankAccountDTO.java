package com.sombrainc.dto.sap;

import com.univocity.parsers.annotations.Parsed;

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

    public CompanyBankAccountDTO() {
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getLogInstance() {
        return logInstance;
    }

    public void setLogInstance(String logInstance) {
        this.logInstance = logInstance;
    }

    public String getBpCode() {
        return bpCode;
    }

    public void setBpCode(String bpCode) {
        this.bpCode = bpCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }
}
