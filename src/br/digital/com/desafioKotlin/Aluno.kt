package br.digital.com.desafioKotlin

class Aluno (
        var nome: String,
        var sobrenome: String,
        val codigoAluno: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aluno) return false

        other as Aluno

        if (codigoAluno != other.codigoAluno) return false

        return true
    }

    override fun toString(): String {
        return "Aluno(nome='$nome', sobrenome='$sobrenome', codigoAluno=$codigoAluno)"
    }
}