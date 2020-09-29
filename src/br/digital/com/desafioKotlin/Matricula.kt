package br.digital.com.desafioKotlin

import java.util.*

data class Matricula(
        var aluno: Aluno,
        var curso: Curso
) {
    val date = Date()

    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, date=$date)"
    }
}