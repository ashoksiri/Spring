package com.msr.springhbm.dao;

import java.util.List;

import com.msr.springhbm.dto.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);
    
    List<Employee> findAllEmployees();
     
    void deleteEmployeeBySsn(String ssn);
     
    Employee findBySsn(String ssn);
     
    void updateEmployee(Employee employee);
}
