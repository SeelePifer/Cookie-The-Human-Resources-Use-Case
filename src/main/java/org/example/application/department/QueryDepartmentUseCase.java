package org.example.application.department;

import org.example.service.department.FetchedEmployee;

import java.util.List;

public interface QueryDepartmentUseCase {
    List<FetchedEmployee> fetchAllEmployeesByDepartment(int departmentId);
}
