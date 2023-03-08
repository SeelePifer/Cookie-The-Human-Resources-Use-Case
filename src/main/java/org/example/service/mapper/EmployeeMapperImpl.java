package org.example.service.mapper;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.example.service.department.FetchedEmployee;
import org.example.service.employee.NewEmployee;

import java.util.ArrayList;

public class EmployeeMapperImpl implements EmployeeMapper{
    public Employee newEmployeeToDomain(NewEmployee newEmployee) {
        Employee employee = new Employee(0, newEmployee.getName(), newEmployee.getLastName(), newEmployee.getDepartments());
        return employee;
    }

    public FetchedEmployee fromDomain(Employee employee) {
        FetchedEmployee fetchedEmployee = new FetchedEmployee(new StringBuilder(employee.getName()).append(employee.getLastName()).toString());
        return fetchedEmployee;
    }
}
