package com.payrollapplication.payroll;

public class EmployeeNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(Long id) {
		if(id == null) {
			throw new IllegalArgumentException("Employee id cannot be null");
		}
		super("Could not find employee: " + id);
	}

}