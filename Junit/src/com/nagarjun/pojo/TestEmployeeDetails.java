package com.nagarjun.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeDetails {

	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	@Test
	public void testCalcuateAppraisal(){
		employee.setName("Nagarjun");
		employee.setMonthlySalary(25000.00);
		employee.setAge(25);
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(1000, appraisal,0.0);
	}
	
	@Test
	public void testCalculateYearSalary(){
		employee.setName("Nagarjun");
		employee.setAge(25);
		employee.setMonthlySalary(25000.00);
		
		double yearSal = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(25000*12, yearSal,0.0);
	}
}
