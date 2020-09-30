package br.digital.com.desafioKotlin

fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorAdjunto("Vitoria", "Rodrigues", 10, 10)
    digitalHouseManager.registrarProfessorAdjunto("João", "Souza", 13, 4)
    digitalHouseManager.registrarProfessorTitular("Caio", "Santos", 17, "Professor Python")
    digitalHouseManager.registrarProfessorTitular("Julio", "Cesar", 20, "Professor Java")

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001,17,10)
    digitalHouseManager.alocarProfessores(20002,20,13)

    digitalHouseManager.registrarAluno("Italo","Machado", 30)
    digitalHouseManager.registrarAluno("Yago","Silva", 20)
    digitalHouseManager.registrarAluno("Nicole","Souza", 10)

    digitalHouseManager.matricularAluno(30,20001) //Matriculando Aluno no Curso Full Stack
    digitalHouseManager.matricularAluno(20,20001) //Matriculando Aluno no Curso Full Stack

    digitalHouseManager.matricularAluno(10,20002) //Matriculando Aluno no Curso Android
    digitalHouseManager.matricularAluno(20,20002) //Matriculando Aluno no Curso Android
    digitalHouseManager.matricularAluno(30,20002) //Matriculando Aluno no Curso Android

    digitalHouseManager.consultarMatriculaAluno(20)
}