package com.anti.Gyepispringmysqladddressemployee.controller;


import com.anti.Gyepispringmysqladddressemployee.Service.AddressService;
import com.anti.Gyepispringmysqladddressemployee.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AddressController {

     private final AddressService addressService;

     @GetMapping("/address")
     public List<Address> renderAllBooks() {
         return addressService.findAllAddress();
     }
}
