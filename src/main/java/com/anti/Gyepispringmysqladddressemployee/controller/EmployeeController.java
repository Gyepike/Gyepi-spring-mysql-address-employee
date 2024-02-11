package com.anti.Gyepispringmysqladddressemployee.controller;

import com.anti.Gyepispringmysqladddressemployee.Service.EmployeeService;
import com.anti.Gyepispringmysqladddressemployee.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> renderAllBooks() {
        return  employeeService.findAllEmployees();
    }
}
