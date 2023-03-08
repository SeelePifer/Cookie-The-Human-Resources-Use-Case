package org.example.service.mapper;

import org.example.domain.Department;
import org.example.service.employee.FetchedDepartment;

public class DepartmentMapperImpl implements DepartmentMapper{
    public FetchedDepartment fromDomainToApplication(Department department) {
        FetchedDepartment fetchedDepartment = new FetchedDepartment();
        fetchedDepartment.setId(department.getId());
        fetchedDepartment.setName(department.getName());
        return  fetchedDepartment;
    }
}
