package com.damiandev.microappcustomer.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Customer(
        @Id
        val id: ObjectId = ObjectId.get(),
        val name: String,
        val surname: String,
        val createdDate: LocalDateTime = LocalDateTime.now(),
        val lastModified: LocalDateTime = LocalDateTime.now()
)