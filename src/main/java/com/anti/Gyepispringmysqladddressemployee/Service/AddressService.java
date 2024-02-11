package com.anti.Gyepispringmysqladddressemployee.Service;

import com.anti.Gyepispringmysqladddressemployee.entity.Address;
import com.anti.Gyepispringmysqladddressemployee.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AddressService {

    public final AddressRepository addressRepository;

    public List<Address> findAllAddress() {
        return addressRepository.findAll();
    }
}
