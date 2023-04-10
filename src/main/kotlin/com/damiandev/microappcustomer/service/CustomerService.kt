package com.damiandev.microappcustomer.service

import com.damiandev.microappcustomer.model.Customer
import com.damiandev.microappcustomer.repository.CustomerRepository
import org.bson.types.ObjectId
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) {
    fun getCustomer(customerId: String): Customer {
        return customerRepository.findOneById(ObjectId(customerId))
    }

    fun getAllCustomers(): List<Customer> {
        return customerRepository.findAll();
    }
}
