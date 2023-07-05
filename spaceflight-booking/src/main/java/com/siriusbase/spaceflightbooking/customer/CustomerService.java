package com.siriusbase.spaceflightbooking.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomer(Long customerId) {
        return customerRepository.findById(customerId).orElse(new Customer());
    }

    public Page<Customer> getCustomersFetchByLimit(Integer limit) {
        Pageable pageable = Pageable.ofSize(limit);
        return customerRepository.findAll(pageable);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void updateCustomer(Customer customer) {
        if (customerRepository.existsById(customer.getId())) {
            customerRepository.save(customer);
        }
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
