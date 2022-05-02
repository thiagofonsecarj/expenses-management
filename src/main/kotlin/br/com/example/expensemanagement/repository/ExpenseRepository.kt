package br.com.example.expensemanagement.repository

import br.com.example.expensemanagement.repository.model.Expense
import org.springframework.data.repository.CrudRepository

interface ExpenseRepository : CrudRepository<Expense, Long>