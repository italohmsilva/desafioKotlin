package br.digital.com.desafioKotlin

class ProfTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoDeCasa: Int,
        var especialidade: String
) : Professor(nome, sobrenome, codigoProfessor, tempoDeCasa)

