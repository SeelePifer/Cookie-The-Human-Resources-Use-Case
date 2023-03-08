package org.example.service.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.application.employee.AddEmployeesToDepartmentUseCase;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddEmployees implements AddEmployeesToDepartmentUseCase {
    private WriteEmployeeOutputPort writeEmployeeOutputPort;

    public void addOne() {

    }
}
