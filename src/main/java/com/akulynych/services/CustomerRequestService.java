package com.akulynych.services;

import com.akulynych.model.CustomerRequest;

import java.util.List;


public interface CustomerRequestService {

    List<CustomerRequest> findAll();

    CustomerRequest findById(Long id);

  List<CustomerRequest> findAllByIds(List<Long> ids);

    CustomerRequest findByRequestName(String name);

    void createCustomerRequest(CustomerRequest customerRequest);
}
