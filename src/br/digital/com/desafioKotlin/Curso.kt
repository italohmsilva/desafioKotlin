package br.digital.com.desafioKotlin

class Curso(
        var nome: String,
        var codigoCursos: Int,
        //var profAdjunto: ProfAdjunto,
        //var profTitular: ProfTitular,
        val qtdeMaximaAlunos: Int,
        //var listaAlunosMatriculados: MutableList<Aluno>
) {

    var profAdjunto = ProfAdjunto(" ", " ", 0, 0, 0)
    var profTitular = ProfTitular(" ", " ", 0, 0, "")
    var listaAlunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false

        other as Curso

        //if (nome != other.nome) return false
        if (codigoCursos != other.codigoCursos) return false

        return true
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if (listaAlunosMatriculados.size < qtdeMaximaAlunos) {
            listaAlunosMatriculados.add(umAluno)
            true
        } else false
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoCursos=$codigoCursos, qtdeMaximaAlunos=$qtdeMaximaAlunos, profAdjunto=$profAdjunto, profTitular=$profTitular, listaAlunosMatriculados=$listaAlunosMatriculados)"
    }
}