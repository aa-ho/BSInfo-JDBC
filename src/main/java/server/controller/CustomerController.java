package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import server.entities.Customer;
import server.repositories.CustomerRepository;

@RepositoryRestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        customerRepository.save(customer);
    }
}
