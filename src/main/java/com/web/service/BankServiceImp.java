package com.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank;
import com.web.model.BankT;
import com.web.model.BankTemp;
import com.web.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {
	@Autowired
	private BankRepo repo;

	@Override
	public Bank customerReg(BankTemp banktemp) {		
		Bank bank=new Bank();
		bank.setAcno(banktemp.getAcno());	
		bank.setName(banktemp.getName());
		if(banktemp.getPassword().equals(banktemp.getConfirmpd()))
		{
			bank.setPassword(banktemp.getConfirmpd());
		
		bank.setAddress(banktemp.getAddress());
		bank.setAmount(banktemp.getAmount());
		bank.setMobile(banktemp.getMobile());
		repo.save(bank);
		}
		return bank;
		
		
	}

	@Override
	public Bank getCustmor(Bank bank) {	
		Bank b=null;
		try {
		b = repo.findById(bank.getAcno()).get();
		if(bank.getName().equalsIgnoreCase(b.getName())&&bank.getPassword().equals(b.getPassword()))
		return b;
		}
		catch (Exception e) {
			return b;
		}
		return b;
		
	}

	@Override
	public Bank depost(Bank bank) {

		Bank bank1=repo.findById(bank.getAcno()).get();
		
		if(bank.getName().equalsIgnoreCase(bank1.getName())&&bank.getPassword().equals(bank1.getPassword()))
		{
			bank1.setAmount(bank1.getAmount()+bank.getAmount());
			repo.save(bank1);

		return bank1;
		}
		else
		{
			return null;
		}		
	}

	@Override
	public Bank withdrawAmount(Bank bank) {
		
		Bank bank1=repo.findById(bank.getAcno()).get();
		
		if(bank.getName().equalsIgnoreCase(bank1.getName())&&bank.getPassword().equals(bank1.getPassword()))
		{			
			 bank1.setAmount(bank1.getAmount()-bank.getAmount());
			repo.save(bank1);	

		return bank1;
		}
		else
		{
			return null;
		}		

		
	}

	@Override
	public List<Bank> transferAmt(BankT bank) {
		Bank b1=repo.findById(bank.getAcno()).get();
		Bank b2= repo.findById(bank.getTacno()).get();
		
		
		if(b1.getName().equals(bank.getName())&&b1.getPassword().equals(bank.getPassword()))
		{
			
			b1.setAmount(b1.getAmount()-bank.getAmount());
			repo.save(b1);
			
			b2.setAmount(b2.getAmount()+bank.getAmount());
			repo.save(b2);
			
			List<Bank>list=List.of(b1,b2);
			return list;
		}	

		else
		return null;
	}

	@Override
	public void deleteAccount(Bank bank) {
		Bank b=repo.findById(bank.getAcno()).get();
		if(b.getName().equals(bank.getName())&&b.getPassword().equals(bank.getPassword()))
		{
			repo.deleteById(bank.getAcno());
		}
	}

	@Override
	public Bank customerDup(BankTemp banktemp) {
		Bank b=null;
		try {
		b = repo.findById(banktemp.getAcno()).get();
		return b;
		}
		catch (Exception e) {
				return b;
		}
	}

	@Override
	public Bank lowBalance(Bank bank) {
		
		Bank b1=repo.findById(bank.getAcno()).get();
		if(b1.getAmount()<bank.getAmount())
		{
			return null;
		}return b1;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
