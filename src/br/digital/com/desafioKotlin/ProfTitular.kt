package br.digital.com.desafioKotlin

class ProfTitular(
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int,
        codigoProfessor:Int,
        var especialidade: String
): Professor(nome, sobrenome, tempoDeCasa, codigoProfessor)

