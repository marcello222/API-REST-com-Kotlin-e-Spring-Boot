package br.com.marcello.forum.dto

import org.jetbrains.annotations.NotNull
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class AtualizacaoTopicoForm(

    @field:NotNull
    val id: Long,

    @field:Size(min = 5, max = 10)
    @field:NotEmpty
    val titulo: String,

    @field:NotEmpty
    val mensagem: String
)


