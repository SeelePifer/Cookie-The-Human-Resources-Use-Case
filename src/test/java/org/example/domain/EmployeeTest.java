package org.example.domain;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class EmployeeTest {

    private Employee employee = new Employee(1,"Charlie", "Gamboa", Collections.emptyList());

    @Test
    void canCreateEmployee(){

        Assert.assertNotNull(employee);
    }

    @Test
    void canGetProperties(){
        assertEquals("Charlie", employee.getName());
        assertEquals("Gamboa", employee.getLastName());
        assertEquals(1, employee.getId());
        Assert.assertTrue(employee.getDepartment().isEmpty());
    }
}
