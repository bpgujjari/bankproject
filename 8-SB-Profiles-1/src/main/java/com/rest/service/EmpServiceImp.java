package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Employee;
import com.rest.repo.EmpRepo;
@Service
public class EmpServiceImp  implements EmpService {

	@Autowired
	private EmpRepo repo;
	@Override
	public Employee saveUser(Employee employee) {
		return repo.save(employee);
		}

}
