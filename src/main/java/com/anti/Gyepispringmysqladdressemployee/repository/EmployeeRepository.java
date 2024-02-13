package com.anti.Gyepispringmysqladdressemployee.repository;

import com.anti.Gyepispringmysqladdressemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findEmployeeByNameIgnoreCase(String name);
}
