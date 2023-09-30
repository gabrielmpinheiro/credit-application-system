package me.dio.creditapplicationsystem.repository

import me.dio.creditapplicationsystem.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {
}

/*
* Essa interface permite que o modelo de customer possa acessar
* os métodos do JPA (Banco de dados)
* */