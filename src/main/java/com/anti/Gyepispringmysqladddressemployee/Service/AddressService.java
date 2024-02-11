package com.anti.Gyepispringmysqladddressemployee.Service;

import com.anti.Gyepispringmysqladddressemployee.entity.Address;
import com.anti.Gyepispringmysqladddressemployee.repository.AddressRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class AddressService {

    @Autowired  // nem mukodik nelkule
    private AddressRepository addressRepository;

    public List<Address> findAllAddress() {
        return addressRepository.findAll();
    }
}
