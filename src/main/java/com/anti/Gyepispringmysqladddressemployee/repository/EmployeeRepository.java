package com.anti.Gyepispringmysqladddressemployee.repository;

import com.anti.Gyepispringmysqladddressemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findWritersByNameIgnoreCase(String name);
}
