package org.example.domain;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class DepartmentTest {

    private Department department = new Department(1, "Human Resource");
    @Test
    void canCreateDepartment(){
        Assert.assertNotNull(department);
    }

    @Test
    void canGetProperties(){
        Assert.assertEquals(1, department.getId());
        Assert.assertEquals(department.getName(), "Human Resource");
    }

}
