package com.anti.Gyepispringmysqladddressemployee.Service;

import com.anti.Gyepispringmysqladddressemployee.entity.Employee;
import com.anti.Gyepispringmysqladddressemployee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {
     private final EmployeeRepository employeeRepository;
     public List<Employee> findAllEmployees() {
          return employeeRepository.findAll();
     }
}
