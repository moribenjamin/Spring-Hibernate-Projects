package com.moribenjamin.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moribenjamin.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
