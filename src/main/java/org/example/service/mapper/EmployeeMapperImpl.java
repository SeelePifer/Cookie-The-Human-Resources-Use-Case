package org.example.service.mapper;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.example.service.department.FetchedEmployee;
import org.example.service.employee.NewEmployee;

import java.util.ArrayList;

public class EmployeeMapperImpl implements EmployeeMapper{
    public Employee newEmployeeToDomain(NewEmployee newEmployee) {
        Employee employee = new Employee();
        employee.setName(newEmployee.getName());
        employee.setLastName(newEmployee.getLastName());
        if (newEmployee.getDepartments() !=null && !newEmployee.getDepartments().isEmpty()){
            Department department = newEmployee.getDepartments().get(0);
            employee.setDepartment(department);
        }
        return employee;
    }

    public FetchedEmployee fromDomain(Employee employee) {
        FetchedEmployee fetchedEmployee = new FetchedEmployee();
        ArrayList<String> names = new ArrayList<String>();
        names.add(employee.getName() + " "+ employee.getLastName());
        fetchedEmployee.setNames(names);
        return fetchedEmployee;
    }
}
