package com.payrollapplication.payroll;

public class EmployeeNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(Long id) {
		if(id == null || id <= 0) {
			throw new IllegalArgumentException("Invalid employee id");
		}
		super("Could not find employee: " + id);
	}

}