package br.com.example.expensemanagement

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ExpenseManagementApplication

fun main(args: Array<String>) {
    SpringApplication.run(ExpenseManagementApplication::class.java, *args)
}