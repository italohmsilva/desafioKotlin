package br.digital.com.desafioKotlin

import java.util.*

data class Matricula (
        var aluno: Aluno,
        var curso: Curso
) {
    val date = Date()
}