package br.digital.com.desafioKotlin

class DigitalHouseManager() {
    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessorAdjunto = mutableListOf<ProfAdjunto>()
    var listaProfessorTitular = mutableListOf<ProfTitular>()
    var listaCursos = mutableListOf<Curso>()
    var listaMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(
            nome: String,
            codigoCurso: Int,
            quantidadeMaximaDeAlunos: Int) {
        listaCursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.forEach {
            if (it.codigoCurso == codigoCurso) {
                listaCursos.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHoras: Int) {
        listaProfessorAdjunto.add(ProfAdjunto(nome, sobrenome, codigoProfessor, 0, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            especialidade: String) {
        listaProfessorTitular.add(ProfTitular(nome, sobrenome, codigoProfessor, 0, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaProfessorAdjunto.forEach {
            if (it.codigoProfessor == codigoProfessor) {
                listaProfessorAdjunto.remove(it)
            }
        }
        listaProfessorTitular.forEach {
            if (it.codigoProfessor == codigoProfessor) {
                listaProfessorTitular.remove(it)
            }
        }
    }

    fun matricularAluno(
            nome: String,
            sobrenome: String,
            codigoAluno: Int,
    ) {
        listaAlunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(
            codigoAluno: Int,
            codigoCurso: Int,
    ) {
        val filtroCurso = listaCursos.filter { it.codigoCurso == codigoCurso }
        val filtroAluno = listaAlunos.filter { it.codigoAluno == codigoAluno }

        when {
            filtroAluno.isEmpty() -> println("Aluno não Registrado")
            filtroCurso.isEmpty() -> println("Curso não Registrado")
            filtroCurso[0].estaCheio() -> println("Não foi possível realizar a matrícula porque não há vagas.")
            else -> {
                filtroCurso[0].listaAlunosMatriculados.add(filtroAluno[0])
                listaMatriculas.add(Matricula(filtroAluno[0], filtroCurso[0]))
                println("Matricula realizada")
            }
        }
    }

    fun alocarProfessores(
            codigoCurso: Int,
            codigoprofTitular: Int,
            codigoprofAdjunto: Int) {

        val filtroProfTitular = listaProfessorTitular.filter { it.codigoProfessor == codigoprofTitular }
        val filtroProfAdjunto = listaProfessorAdjunto.filter { it.codigoProfessor == codigoprofAdjunto }
        val filtroCurso = listaCursos.filter { it.codigoCurso == codigoCurso }

        when {
            filtroProfTitular.isEmpty() -> println("Professor Titular não Registrado")
            filtroProfAdjunto.isEmpty() -> println("Professor Adjunto não Registrado")
            filtroCurso.isEmpty() -> println("Curso não Registrado")
            else -> {
                filtroCurso[0].profTitular = filtroProfTitular[0]
                filtroCurso[0].profAdjunto = filtroProfAdjunto[0]
            }
        }
    }

    fun consultarMatriculaAluno(codigoAluno: Int) {
        listaMatriculas.forEach {
            if (it.aluno.codigoAluno == codigoAluno) {
                println("O Aluno ${it.aluno.nome} está matriculado no curso ${it.curso.nome}")
            }
        }
    }

    override fun toString(): String {
        return "DigitalHouseManager(listaAlunos=$listaAlunos, listaProfessorAdjunto=$listaProfessorAdjunto, listaProfessorTitular=$listaProfessorTitular, listaCursos=$listaCursos, listaMatriculas=$listaMatriculas)"
    }
}