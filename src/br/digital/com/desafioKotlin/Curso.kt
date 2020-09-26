package br.digital.com.desafioKotlin

class Curso(
        var nome: String,
        var codigoCursos: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false

        other as Curso

        //if (nome != other.nome) return false
        if (codigoCursos != other.codigoCursos) return false

        return true
    }
}