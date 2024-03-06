package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank;
import com.web.model.EmpTemp;
import com.web.model.Employee;
import com.web.repo.BankRepo;
import com.web.repo.EmpRepo;
@Service
public class EmpServicesImp implements EmpService{
	
	@Autowired
	private EmpRepo repo;
	@Autowired
	private BankRepo rp;

	@Override
	public Employee empReg(EmpTemp emptemp) {
		
		Employee e=new Employee();
		
		if(emptemp.getPassword().equals(emptemp.getCpassword()))
		{
			e.setName(emptemp.getName());
			e.setPassword(emptemp.getPassword());
			e.setDesg(emptemp.getDesg());
			e.setId(emptemp.getId());
			e.setSalary(emptemp.getSalary());
			
			
			double d=0.0,t=0.0,hr=0.0,pf=0.0,gr=0.0,nt=0.0;
			
			if(emptemp.getSalary()<30000)
			{
				t=(emptemp.getSalary()*11)/100;
				d=(emptemp.getSalary()*12)/100;
				hr=(emptemp.getSalary()*13)/100;
				pf=(emptemp.getSalary()*15)/100;
			}
			else if(emptemp.getSalary()>=30000 && emptemp.getSalary()<50000)
			{
				t=(emptemp.getSalary()*14)/100;
				d=(emptemp.getSalary()*15)/100;
				hr=(emptemp.getSalary()*17)/100;
				pf=(emptemp.getSalary()*20)/100;
			}
			
			
			else if(emptemp.getSalary()>=50000)
			{
				t=(emptemp.getSalary()*17)/100;
				d=(emptemp.getSalary()*18)/100;
				hr=(emptemp.getSalary()*19)/100;
				pf=(emptemp.getSalary()*22)/100;
			}		
			gr=t+d+hr;
			nt=gr-pf;
			
			e.setDa(d);
			e.setTa(t);
			e.setHra(hr);
			e.setPf(pf);
			e.setGross(gr);
			e.setNet(nt);		
			repo.save(e);		
		}
		 
		
		return e;
	}

	@Override
	public Employee empLogin(Employee emp) {

		Employee e=repo.findById(emp.getId()).get();
		if(e.getName().equalsIgnoreCase(emp.getName())&&e.getPassword().equals(emp.getPassword()))
		{
			return e;
		}
		
		
		return null;
	}

	@Override
	public List<Bank> getAllCust() {

	List<Bank>cust=(List<Bank>) rp.findAll();
	return cust;
	}

}
