package com.payrollapplication.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long>{
    // Add input validation logic here
    Employee findByEmployeeId(Long employeeId);

    default Employee findByEmployeeId(Long employeeId) {
        if (employeeId == null || employeeId <= 0) {
            throw new IllegalArgumentException("Invalid employeeId");
        }
        return findById(employeeId).orElse(null);
    }
}