package com.damiandev.microappcustomer.repository

import com.damiandev.microappcustomer.model.Customer
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository : MongoRepository<Customer, String> {
    fun findOneById(id: ObjectId): Customer
}