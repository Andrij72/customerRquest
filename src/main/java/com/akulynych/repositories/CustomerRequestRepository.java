package com.akulynych.repositories;


import com.akulynych.model.CustomerRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRequestRepository extends JpaRepository<CustomerRequest, Long> {

}
