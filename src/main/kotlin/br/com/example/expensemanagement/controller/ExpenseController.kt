package br.com.example.expensemanagement.controller

import br.com.example.expensemanagement.repository.model.Expense
import br.com.example.expensemanagement.service.ExpenseService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("expenses")
class ExpenseController(
        private val expenseService: ExpenseService
) {
    @PostMapping
    fun add(@RequestBody expense: Expense): Expense = expenseService.save(expense)

    @GetMapping
    fun listAll(): List<Expense> = expenseService.getAll()

    @GetMapping
    fun get(@RequestBody idExpense: Long): Expense = expenseService.getById(idExpense)
}