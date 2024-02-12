package com.anti.Gyepispringmysqladddressemployee.controller;

import com.anti.Gyepispringmysqladddressemployee.Service.EmployeeService;
import com.anti.Gyepispringmysqladddressemployee.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployeeById(@PathVariable Long id) {
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("/employees/name/{name}")
    public Employee findWritersByNameIgnoreCase(@PathVariable String name) {
        return employeeService.findWritersByNameIgnoreCase(name);
    }
}
