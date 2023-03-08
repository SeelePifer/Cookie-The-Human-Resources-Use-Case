package org.example.service.department;

import lombok.RequiredArgsConstructor;
import org.example.application.department.QueryDepartmentUseCase;

import java.util.List;

@RequiredArgsConstructor
public class FetchEmployees implements QueryDepartmentUseCase {
    private final ReadDepartmentOutputPort readDepartmentOutputPort;

    public List<FetchedEmployee> fetchAllEmployeesByDepartment(int departmentId) {
        return readDepartmentOutputPort.fetchEmployeesByDepartament(departmentId);
    }
}
