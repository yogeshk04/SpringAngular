package com.io.SpringAngular.Service;

import com.io.SpringAngular.CustomerRepo.CustomerRepo;
import com.io.SpringAngular.DTO.CustomerSaveDTO;
import com.io.SpringAngular.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {

        Customer customer = new Customer(
                customerSaveDTO.getCustomerName(),
                customerSaveDTO.getCustomerAddress(),
                customerSaveDTO.getMobile());
        customerRepo.save(customer);
        return customer.getCustomerName();
    }
}
