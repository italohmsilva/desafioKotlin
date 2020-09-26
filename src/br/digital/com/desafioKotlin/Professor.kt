package br.digital.com.desafioKotlin

class Professor (
        var nome: String,
        var sobrenome: String,
        var tempoDeCasa: Int,
        var codigoProfessor: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Professor) return false

        other as Professor

        //if (nome != other.nome) return false
        //if (sobrenome != other.sobrenome) return false
        if (codigoProfessor != other.codigoProfessor) return false

        return true
    }
}