package me.dio.creditapplicationsystem.entity

import java.math.BigDecimal

data class Customer(
    var firstName: String = "",
    var lastName: String = "",
    val cpf: Long,
    var email: String = "",
    var password: String = "",
    var address: Address = Address(),
    var income: BigDecimal,
    var credits: List<Credit> = mutableListOf(),
    val id: Long? = null
)
