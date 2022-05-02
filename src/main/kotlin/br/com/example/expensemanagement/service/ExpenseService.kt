package br.com.example.expensemanagement.service

import br.com.example.expensemanagement.exception.ExpenseNotFoundException
import br.com.example.expensemanagement.repository.model.Expense
import br.com.example.expensemanagement.repository.ExpenseRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component

@Component
class ExpenseService(
        private val expenseRepository: ExpenseRepository) {

    fun save(expense: Expense): Expense = expenseRepository.save(expense)

    fun getAll(): List<Expense> = expenseRepository.findAll().toList()

    fun getById(id: Long): Expense = expenseRepository.findById(id)
        .orElseThrow{ ExpenseNotFoundException(HttpStatus.NOT_FOUND, "No matching expensive was found") }

}