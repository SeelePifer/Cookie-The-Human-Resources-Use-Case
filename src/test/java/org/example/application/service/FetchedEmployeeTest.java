package org.example.application.service;

import org.example.service.department.FetchedEmployee;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FetchedEmployeeTest {

    @Test
    void fetchedEmployeeOnlyNeedTheCompleteEmployeeName(){
        FetchedEmployee fetchedEmployee = new FetchedEmployee("Charlie Gamboa");
        Assert.assertEquals(fetchedEmployee.getNames(), "Charlie Gamboa");

    }
}
