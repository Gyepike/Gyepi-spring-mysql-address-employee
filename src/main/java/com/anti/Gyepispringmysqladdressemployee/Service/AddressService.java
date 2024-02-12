package com.anti.Gyepispringmysqladdressemployee.Service;

import com.anti.Gyepispringmysqladdressemployee.entity.Address;
import com.anti.Gyepispringmysqladdressemployee.entity.Employee;
import com.anti.Gyepispringmysqladdressemployee.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AddressService {

    private final AddressRepository addressRepository;
    private final EmployeeService employeeService;

    public List<Address> findAllAddress() {
        return addressRepository.findAll();
    }

    public Address saveAddress(Address address) {
        Employee existingEmployee = employeeService.findWritersByNameIgnoreCase(address.getEmployee().getName());
        if (existingEmployee != null) {
            address.setEmployee(existingEmployee);
        } else {
            Employee employee = new Employee();
            employee.setName(address.getEmployee().getName());
            employee.setAge(address.getEmployee().getAge());
            existingEmployee = employeeService.saveEmployee(employee);
            address.setEmployee(existingEmployee);
        }
        return addressRepository.save(address);
    }
}
