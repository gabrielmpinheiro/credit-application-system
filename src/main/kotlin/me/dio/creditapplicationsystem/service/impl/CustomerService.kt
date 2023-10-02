package me.dio.creditapplicationsystem.service.impl

import me.dio.creditapplicationsystem.entity.Customer
import me.dio.creditapplicationsystem.repository.CustomerRepository
import me.dio.creditapplicationsystem.service.ICustomerService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class CustomerService(
    //Preciso implementar o repositorio aqui para usar seus métodos.
    private val customerRepository: CustomerRepository

): ICustomerService {
    override fun save(customer: Customer): Customer {
        return this.customerRepository.save(customer);
    }

    override fun findById(id: Long ): Customer {
        return this.customerRepository.findById(id).orElseThrow {
            throw RuntimeException("Id $id not found")
        }
    }

    override fun delete(id: Long) {
        this.customerRepository.deleteById(id)
    }


}