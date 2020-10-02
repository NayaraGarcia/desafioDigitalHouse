package desafioDigitalHouse

import java.util.*

class Matricula(aluno: Aluno, curso: Curso) {

    var data = Date()

    init {
        println("Matrícula concluida com sucesso !!")
        println("Curso: ${curso.nome} ${aluno.sobrenome}")
        println("Código do aluno: ${aluno.codigoAluno}")
        println("Aluno matriculado: ${aluno.nome} ")
        println("Data de matrícula: $data ")
    }
}