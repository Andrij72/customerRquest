package com.akulynych.services;

import com.akulynych.handler.exception.NotFoundRuntimeException;
import com.akulynych.model.CustomerRequest;
import com.akulynych.repositories.CustomerRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerRequestServiceImp implements CustomerRequestService{

    @Autowired
    private CustomerRequestRepository customerRequestRepository;

    @Override
    public List<CustomerRequest> findAll() {
        return customerRequestRepository.findAll();
    }

    @Override
    public List<CustomerRequest> findAllByIds(List<Long> ids) {
        return customerRequestRepository.findAllById(ids);
    }

    @Override
    public CustomerRequest findByRequestName(String name) {
        return null;
    }

    @Override
    public CustomerRequest findById(Long id) {
        return customerRequestRepository.findById(id)
                .orElseThrow(() -> new NotFoundRuntimeException(id, "CustomerRequest can't be found!"));
    }

    @Override
    public void createCustomerRequest(CustomerRequest customerRequest) {
        customerRequestRepository.save(customerRequest);
    }
}
