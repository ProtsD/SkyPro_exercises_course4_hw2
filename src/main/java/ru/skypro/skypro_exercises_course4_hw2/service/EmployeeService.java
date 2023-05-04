package ru.skypro.skypro_exercises_course4_hw2.service;

import ru.skypro.skypro_exercises_course4_hw2.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    int getEmployeeCount();

    int getEmployeeSalarySum();

    Employee getEmployeeSalaryMin();

    Employee getEmployeeSalaryMax();

    List<Employee> getEmployeesWithSalaryMoreThen();

}
