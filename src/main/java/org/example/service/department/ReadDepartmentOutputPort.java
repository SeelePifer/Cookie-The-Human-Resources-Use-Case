package org.example.service.department;

import java.util.List;

public interface ReadDepartmentOutputPort {
    List<FetchedEmployee> fetchEmployeeByDepartament(int departmentId);
}
