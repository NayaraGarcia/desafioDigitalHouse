package desafioDigitalHouse

fun main(){

    val alunos = mutableMapOf<Int, Aluno>()
    val professores = mutableMapOf<Int, Professor>()
    val cursos = mutableMapOf<Int, Curso>()
    val matriculas = mutableMapOf<Curso, Matricula>()

    val manager = DigitalHouseManager(alunos, professores, cursos, matriculas)

    manager.registrarProfessorTitular("Ana", "Garcia", 1, "Artes")
    manager.registrarProfessorTitular("Marco", "Garcia", 2, "Geografia")
    manager.registrarProfessorAdjunto("Rosa", "Garcia", 3, 100)
    manager.registrarProfessorAdjunto("Thayane", "Garcia", 4, 150)

    manager.registrarCurso("Full Stack", 20001, 3)
    manager.registrarCurso("Android", 20002, 2)

    manager.alocarProfessores(20001, 1, 3)
    manager.alocarProfessores(20002, 2, 4)

    manager.registrarAluno("Gabriela", "Oliveira", 1)
    manager.registrarAluno("José", "Soares", 2)
    manager.matricularAluno(1, 20001)
    manager.matricularAluno(2, 20001)

    manager.registrarAluno("Laura", "Silva", 3)
    manager.registrarAluno("Maitê", "Yoo", 4)
    manager.registrarAluno("Marlene", "Silva",  5)
    manager.matricularAluno(3, 20002)
    manager.matricularAluno(4, 20002)
    manager.matricularAluno(5, 20002)

//Esta dando erro !!
// manager.cursos[20002]!!.excluirAluno(manager.alunos[3]!!)

    manager.matricularAluno(5, 20002)

    manager.professores.forEach {
        println(it.value.codigoProfessor)
    }

    manager.excluirProfessor(1)

    println()

    manager.professores.forEach {
        println(it.value.codigoProfessor)
    }

    println()

    manager.cursos.forEach {
        println(it.value.codigoCurso)
    }

    manager.excluirCurso(20001)

    println()

    manager.cursos.forEach {
        println(it.value.codigoCurso)
    }

    println()

    manager.registrarAluno("Aluno", "6", 6)
    manager.matricularAluno(6, 20002)
}