package com.siriusbase.spaceflightbooking.customer;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @GetMapping("/customers")
    public Page<Customer> getCustomersFetchByLimit(@RequestAttribute("limit") Integer limit) {
        return customerService.getCustomersFetchByLimit(limit);
    }

    @PostMapping("/customers")
    public Customer postCustomer(@Valid @RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/customers")
    public void putCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customers")
    public void deleteCustomer(Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
