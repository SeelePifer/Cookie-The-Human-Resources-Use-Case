package org.example.service.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.Department;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NewEmployee {
    private String name;
    private String lastName;
    private List<Department> departments;
}
