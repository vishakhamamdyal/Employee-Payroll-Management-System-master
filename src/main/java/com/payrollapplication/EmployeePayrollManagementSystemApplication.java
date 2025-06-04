package com.payrollapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class EmployeePayrollManagementSystemApplication {

    private static final Logger logger = LoggerFactory.getLogger(EmployeePayrollManagementSystemApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Employee Payroll Management System Application");
        SpringApplication.run(EmployeePayrollManagementSystemApplication.class, args);
    }

}