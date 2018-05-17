package com.spring.restfulwebservice.vo;

/**
 * @author : alif.razak@canang.com.my
 * @since : 5/18/2018 12:26 AM
 */
public class BankAccountVo {
    String accountNo;

    public BankAccountVo() {
    }

    public BankAccountVo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }
}
