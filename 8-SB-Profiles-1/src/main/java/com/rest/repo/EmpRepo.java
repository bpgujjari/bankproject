package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
