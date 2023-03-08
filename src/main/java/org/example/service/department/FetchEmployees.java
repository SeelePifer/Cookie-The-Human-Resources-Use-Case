package org.example.service.department;

import org.example.application.department.QueryDepartmentUseCase;
import org.example.service.mapper.EmployeeMapper;

public class FetchEmployees implements QueryDepartmentUseCase {
    private EmployeeMapper employeeMapper;
    private ReadDepartmentOutputPort readDepartmentOutputPort;

    public void fetchAllEmployeesByDepartment() {

    }
}
