package br.com.example.expensemanagement.repository.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Expense(@Id
                @GeneratedValue
                @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
                   val id: Long = 0L,
                   val responsible: String = "",
                   val description: String = "",
                   val dateTime: LocalDateTime? = null,
                   val price: BigDecimal = BigDecimal.ZERO,
                   val tags: String = "")