package com.akulynych.controllers;

import com.akulynych.dto.CustomerRequestDto;
import com.akulynych.model.CustomerRequest;
import com.akulynych.repositories.CustomerRequestRepository;
import com.akulynych.services.CustomerRequestService;
import com.akulynych.transformers.CustomerRequestTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CustomerRequestController {
    @Autowired
    private CustomerRequestTransformer customerRequestTransformer;

    @Autowired
    private CustomerRequestService customerRequestService;

    @Autowired
    private CustomerRequestRepository customerRequestRepository;

    @GetMapping
    public List<CustomerRequestDto> findAll() {
        return customerRequestTransformer.buildListCustomerRequestDto(customerRequestService.findAll());
    }

    @PostMapping("/api/customer")
    public void createCustomerRequest(@RequestBody CustomerRequestDto customerRequestDto) {
        customerRequestRepository.save(customerRequestTransformer.buildCustomerRequest(customerRequestDto));
    }


}
