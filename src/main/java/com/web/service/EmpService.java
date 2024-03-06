package com.web.service;

import java.util.List;

import com.web.model.Bank;
import com.web.model.EmpTemp;
import com.web.model.Employee;
public interface EmpService{
public Employee empReg(EmpTemp emptemp);
public Employee empLogin(Employee emp);
public List<Bank> getAllCust();


}
