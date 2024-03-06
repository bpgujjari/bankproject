package com.web.service;

import java.util.List;

import com.web.model.Bank;
import com.web.model.BankT;
import com.web.model.BankTemp;

public interface BankService {
public Bank customerReg(BankTemp banktemp);
public Bank customerDup(BankTemp banktemp);
public Bank	getCustmor(Bank bank);
public Bank depost(Bank bank);
public Bank withdrawAmount(Bank bank);
public List<Bank> transferAmt(BankT bank);
public void deleteAccount(Bank bank);
public Bank lowBalance(Bank bank);
}
