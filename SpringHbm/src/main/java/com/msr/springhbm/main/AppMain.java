package com.msr.springhbm.main;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.msr.springhbm.configuration.AppConfig;
import com.msr.springhbm.dto.Employee;
import com.msr.springhbm.service.EmployeeService;

public class AppMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
				
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		
		Employee emp = new Employee();
		
		
		emp.setJoiningDate(new Date());
		emp.setName("Ashok");
		BigDecimal decimal = new BigDecimal(5264);
		emp.setSalary(decimal);
		emp.setSsn("sadf");
		
		service.saveEmployee(emp);
		
		 List<Employee> list = service.findAllEmployees();
		 
		 System.out.println(list.size());
		 
		 context.close();
	}
}
