package com.damiandev.microappcustomer.controller

import com.damiandev.microappcustomer.model.Customer
import com.damiandev.microappcustomer.service.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customers")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping("/test")
    fun test(): String {
        return "Test2"
    }

    @GetMapping()
    fun getAllCustomers(): ResponseEntity<List<Customer>> {
        val customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers)
    }
    @GetMapping("/{id}")
    fun getCustomer(@PathVariable("id") id: String): ResponseEntity<Customer> {
        val customer = customerService.getCustomer(id)
        return ResponseEntity.ok(customer)
    }
}