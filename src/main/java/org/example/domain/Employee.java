package org.example.domain;

import lombok.*;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Employee{
    private final  int id;
    private final String name;
    private final String lastName;
    private final List<Department> department;
}
