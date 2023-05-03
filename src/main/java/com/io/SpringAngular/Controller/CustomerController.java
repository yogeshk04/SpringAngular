package com.io.SpringAngular.Controller;

import com.io.SpringAngular.DTO.CustomerSaveDTO;
import com.io.SpringAngular.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.io.SpringAngular.DTO.CustomerDTO;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }
}
