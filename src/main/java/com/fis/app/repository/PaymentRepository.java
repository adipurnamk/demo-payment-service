package com.fis.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fis.app.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
