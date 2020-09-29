package br.digital.com.desafioKotlin

class ProfAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoDeCasa: Int,
        var qtdeHorasMonitoria: Int
) : Professor(nome, sobrenome, codigoProfessor, tempoDeCasa)