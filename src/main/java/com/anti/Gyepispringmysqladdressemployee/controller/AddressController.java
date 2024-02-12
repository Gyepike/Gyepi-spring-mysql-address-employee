package com.anti.Gyepispringmysqladdressemployee.controller;

import com.anti.Gyepispringmysqladdressemployee.Service.AddressService;
import com.anti.Gyepispringmysqladdressemployee.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/address")
    public List<Address> renderAllAddress() {
        return addressService.findAllAddress();
    }

    @PostMapping("/address")
    public Address addNewBook(@RequestBody Address Address) {
        return addressService.saveAddress(Address);
    }
}
