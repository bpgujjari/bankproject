package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> {
}
