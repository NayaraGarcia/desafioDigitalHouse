package desafioDigitalHouse

class digitalHouseManager(var alunos: MutableMap<Int, Aluno>,
                          var professores: MutableMap<Int, Professor>,
                          var cursos: MutableMap<Int, Curso>,
                          var matriculas: MutableMap<Curso, Matricula>) {



    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaximaDeAlunos: Int) {
        cursos[codigoCurso] = Curso(nome, codigoCurso, qtdMaximaDeAlunos)
    }

    fun excluirCurso(codigoCurso: Int) {
        when{
            cursos.containsKey(codigoCurso) -> cursos.remove(codigoCurso)
            else -> println("Curso não encontrado")
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        professores[codigoProfessor] = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
    }



}