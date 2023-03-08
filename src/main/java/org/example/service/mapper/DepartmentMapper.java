package org.example.service.mapper;

import org.example.domain.Department;
import org.example.service.employee.FetchedDepartment;

public interface DepartmentMapper {
    FetchedDepartment fromDomainToApplication(Department department);
}
