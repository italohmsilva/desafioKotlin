package br.digital.com.desafioKotlin

class Aluno (
        var nome: String,
        var sobrenome: String,
        var codigoAluno: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aluno) return false

        other as Aluno

        //if (nome != other.nome) return false
        //if (sobrenome != other.sobrenome) return false
        if (codigoAluno != other.codigoAluno) return false

        return true
    }


}