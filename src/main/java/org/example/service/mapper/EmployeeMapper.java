package org.example.service.mapper;

import org.example.domain.Employee;
import org.example.service.department.FetchedEmployee;
import org.example.service.employee.NewEmployee;

public interface EmployeeMapper {
    Employee newEmployeeToDomain(NewEmployee newEmployee);
    FetchedEmployee fromDomain(Employee employee);
}
