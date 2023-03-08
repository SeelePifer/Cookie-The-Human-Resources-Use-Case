package org.example.application.service.deparment;

import org.example.service.department.FetchEmployees;
import org.example.service.department.ReadDepartmentOutputPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.testng.AssertJUnit.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class FetchEmployeeTest {

    @Mock
    private ReadDepartmentOutputPort readDepartmentOutputPort;
    @InjectMocks
    private FetchEmployees queryDepartmentUseCase;

    @Test
    void canCreateFetchEmployeeService(){
        assertNotNull(queryDepartmentUseCase);
    }

    @Test
    void serviceNeedOutputPortToAccomplishItsTask(){
        Mockito.when(readDepartmentOutputPort.fetchEmployeesByDepartament(1)).thenReturn(Collections.emptyList());
        queryDepartmentUseCase.fetchAllEmployeesByDepartment(1);
        Mockito.verify(readDepartmentOutputPort, Mockito.times(1)).fetchEmployeesByDepartament(1);
    }
}
