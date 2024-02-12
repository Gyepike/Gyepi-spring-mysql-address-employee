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

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    public Employee findWritersByNameIgnoreCase(String name) {
        return employeeRepository.findWritersByNameIgnoreCase(name);
    }
}
