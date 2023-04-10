package com.damiandev.microappcustomer.controller

import com.damiandev.microappcustomer.model.Customer
import com.damiandev.microappcustomer.repository.CustomerRepository
import org.bson.types.ObjectId
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.context.junit.jupiter.SpringExtension

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ExtendWith(SpringExtension::class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//class CustomerControllerIntTest @Autowired constructor(
//        private val customerRepository: CustomerRepository,
//        private val restTemplate: TestRestTemplate
//) {
//    private val defaultCustomerId = ObjectId.get()
//
//    @LocalServerPort
//    protected var port: Int = 0
//
//    @BeforeEach
//    fun setUp() {
//        customerRepository.deleteAll()
//    }
//
//    private fun getRootUrl(): String? = "http://localhost:$port/api/customers"
//
//    private fun saveOneTask() = customerRepository.save(Customer(defaultCustomerId, "Damian", "Dev"))
//
//    @Test
//    fun `should return all customers`() {
//        saveOneTask()
//
//        val response = restTemplate.getForEntity(
//                getRootUrl() + "/all",
//                List::class.java
//        )
//
//        assertEquals(200, response.statusCode.value())
//        assertNotNull(response.body)
//        assertEquals(1, response.body?.size)
//    }
//}