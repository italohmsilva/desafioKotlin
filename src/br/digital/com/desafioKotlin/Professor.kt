package br.digital.com.desafioKotlin

open class Professor(
        var nome: String,
        var sobrenome: String,
        val codigoProfessor: Int,
        var tempoDeCasa: Int
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

    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', codigoProfessor=$codigoProfessor, tempoDeCasa=$tempoDeCasa)"
    }
}