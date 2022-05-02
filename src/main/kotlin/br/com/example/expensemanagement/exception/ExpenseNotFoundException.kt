package br.com.example.expensemanagement.exception

import org.springframework.http.HttpStatus

class ExpenseNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()