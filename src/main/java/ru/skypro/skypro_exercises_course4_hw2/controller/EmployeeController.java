package ru.skypro.skypro_exercises_course4_hw2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.skypro_exercises_course4_hw2.pojo.Employee;
import ru.skypro.skypro_exercises_course4_hw2.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/count")
    public int getEmployeeCount() {
        return employeeService.getEmployeeCount();
    }
    @GetMapping("/salary/sum")
    public int getEmployeeSalarySum() {
        return employeeService.getEmployeeSalarySum();
    }

    @GetMapping("/salary/min")
    public Employee getEmployeeSalaryMin() {
        return employeeService.getEmployeeSalaryMin();
    }
    @GetMapping("/salary/max")
    public Employee getEmployeeSalaryMax() {
        return employeeService.getEmployeeSalaryMax();
    }

    @GetMapping("/high-salary")
    public List<Employee> getEmployeesWithSalaryMoreThen() {
        return employeeService.getEmployeesWithSalaryMoreThen();
    }
}
