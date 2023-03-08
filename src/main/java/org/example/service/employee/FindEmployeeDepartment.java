package org.example.service.employee;


import org.example.application.employee.QueryEmployeeUseCase;
import org.example.service.mapper.EmployeeMapper;

public class FindEmployeeDepartment implements QueryEmployeeUseCase {

    private EmployeeMapper employeeMapper;

    private ReadEmployeeOutPort readEmployeeOutPort;

    public void findDepartment() {

    }
}
