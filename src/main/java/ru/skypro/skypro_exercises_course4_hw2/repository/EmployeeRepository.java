package ru.skypro.skypro_exercises_course4_hw2.repository;

import ru.skypro.skypro_exercises_course4_hw2.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    int getEmployeeCount();

    int getEmployeeSalarySum();

    Employee getEmployeeSalaryMin();

    Employee getEmployeeSalaryMax();

    List<Employee> getEmployeesWithSalaryMoreThen();
}
