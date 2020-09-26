package br.digital.com.desafioKotlin

class ProfAdjunto(
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        codigoProfessor:Int,
        var qtdeHorasMonitoria: Int
): Professor(nome, sobrenome, tempoDeCasa, codigoProfessor)